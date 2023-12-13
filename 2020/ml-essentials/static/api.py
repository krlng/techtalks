
import cloudpickle
from fastapi import FastAPI
from pydantic import BaseModel
#from model_preperation import ModelPreperation
#import autoapi.model_preperation
import joblib
from sklearn.pipeline import FeatureUnion, Pipeline 

app = FastAPI()

import numpy as np 
import pandas as pd
from sklearn.ensemble import GradientBoostingClassifier

class Passenger(BaseModel):
    PassengerId: float = 1
    Pclass: str = 3
    Name: str = 'Nico, Rare. Kreiling'
    Sex: str = 'F'
    Age: int = 30
    SibSp: float = 0
    Parch: float = 3
    Ticket: str = ''
    Fare: float = 100
    Cabin: str = ''
    Embarked: str = 'C'
        
@app.get("/")
async def root():
    return {"message": "Hello World"}

@app.get("/survived/passanger_id/{user_id}")
async def read_item(user_id):
    return {"item_id": user_id}

@app.post("/survived/custom")
async def root(input_data: Passenger):
    with open("./../autoapi/model.pkl", "rb") as f:
        pipe = cloudpickle.load(f)
    input_data = pd.Series(dict(input_data)).to_frame().transpose()
    print(input_data)
    prediction = pipe.predict(input_data)
    if prediction[0] == 0:
        return {"message": "Sorry, you die!"}
    else:
        return {"message": "Yeaaah, you will survive :)"}
    
