/*
 * Copyright 2015 data Artisans GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dataartisans.flinktraining.exercises.datastream_scala.basics

import com.dataartisans.flinktraining.exercises.datastream_java.sources.TaxiRideSource
import com.dataartisans.flinktraining.exercises.datastream_java.utils.GeoUtils
import org.apache.flink.api.java.utils.ParameterTool
import org.apache.flink.streaming.api.TimeCharacteristic
import org.apache.flink.streaming.api.scala._

/**
  * Scala reference implementation for the "Ride Cleansing" exercise of the Flink training
  * (http://dataartisans.github.io/flink-training).
  *
  * The task of the exercise is to filter a data stream of taxi ride records to keep only rides that
  * start and end within New York City. The resulting stream should be printed to the
  * standard out.
  *
  * Parameters:
  * -input path-to-input-file
  *
  */
object RideCleansing {

  def main(args: Array[String]) {

    // parse parameters
    val params = ParameterTool.fromArgs(args)
    val input = params.getRequired("input")
    // val input = "/Users/nkreiling/Downloads/nycTaxiRides.gz"

    val maxDelay = 60 // events are out of order by max 60 seconds
    val speed = 10   // events of 10 minutes are served in 1 second

    // set up the execution environment
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime)

    // get the taxi ride data stream
    val rides = env.addSource(new TaxiRideSource(input, maxDelay, speed))

    val filteredRides = rides
      // filter out rides that do not start and end in NYC
      .filter(r => GeoUtils.isInNYC(r.startLon, r.startLat) && GeoUtils.isInNYC(r.endLon, r.endLat))

    // print the filtered stream
    filteredRides.print()

    // run the cleansing pipeline
    env.execute("Taxi Ride Cleansing")
  }

}