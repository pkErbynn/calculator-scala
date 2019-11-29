package io.turntabl.calculator

import java.util.Scanner

import io.turntabl.calculator.Operator.scanner

object SimpleCalculator extends App{

  val scanner = new Scanner(System.in)

  Operator.showMenu()
  print("enter option: ")
  scanner.nextLine().toInt match {
    case 1 => {
      val res = Operator.add()
      println(s"result: $res" )
    }
    case 2 => {
      val res = Operator.subtract()
      println(s"result: $res" )
    }
    case 3 => {
      val res = Operator.multiply()
      println(s"result: $res" )
    }
    case 4 => {
      val res = Operator.divide()
      println(s"result: $res" )
    }
    case _ => print("sorry...invalid :(")
  }


}

