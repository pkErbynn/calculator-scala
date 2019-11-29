package io.turntabl.calculator

import java.util.Scanner

import io.turntabl.calculator.Operator.scanner

object Calc extends App{

  val scanner = new Scanner(System.in)

  Operator.showMenu()
  print("enter option: ")
  scanner.nextLine().toInt match {
    case 1 => {
      val res = Operator.add()
      println(s"result: " + res)
    }
  }

//  println(s"you entered $option")
//  val option = scanner.nextLine()
//  option match {
//    case 1 => Operator.input();
//  }





}

