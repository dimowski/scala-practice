package random

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

object ActorSample extends App {

  case class Count(n: Int, sendTo: ActorRef)

  class CounterActor extends Actor {
    override def receive: Receive = {
      case Count(n, sendTo) =>
        if (n >= 0) {
          println(s"$self start counting down from $n")
          sendTo ! Count(n - 1, self)
        } else {
          println(s"$self start counting up from $n")
          sendTo ! Count(n + 10, self)
        }
    }
  }

  val system = ActorSystem.create("counter_system")
  val actor1 = system.actorOf(Props[CounterActor], "Actor1")
  val actor2 = system.actorOf(Props[CounterActor], "Actor2")

  actor1 ! Count(10, actor2)

}
