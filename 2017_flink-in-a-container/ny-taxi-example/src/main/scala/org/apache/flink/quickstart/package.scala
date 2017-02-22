// package org.apache.flink

// /**
//   * Created by nkreiling on 24/01/2017.
//   */
// object meetupAnalyse {
//   def main(args: Array[String]) {

//     val env = StreamExecutionEnvironment.getExecutionEnvironment
//     val text = env.socketTextStream("ws://stream.meetup.com/2/rsvps", 80)

//     val counts = text.flatMap { _.toLowerCase.split("\\W+") filter { _.nonEmpty } }
//       .map { (_, 1) }
//       .groupBy(0)
//       .sum(1)

//     counts.print

//     env.execute("Scala Socket Stream WordCount")
//   }
// }