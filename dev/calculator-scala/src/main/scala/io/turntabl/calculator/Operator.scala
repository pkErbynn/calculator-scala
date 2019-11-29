package io.turntabl.calculator

import java.util.Scanner

object Operator {

  val scanner = new Scanner(System.in)

  def showMenu(): Unit = {
    println("1. add")
    println("2. subtract")
    println("3. multiply")
    println("4. divide")
  }

  def add(): Double = {
    print("enter 1st value: ")
    print("enter 2nd value: ")
    val x = scanner.nextLine().toDouble
    val y = scanner.nextLine().toDouble
    x + y
  }

  def subtract():Double = {
    print("enter 1st value: ")
    print("enter 2nd value: ")
    val x = scanner.nextLine().toDouble
    val y = scanner.nextLine().toDouble
    x - y
  }

  def multiply(): Double = {
    print("enter 1st value: ")
    print("enter 2nd value: ")
    val x = scanner.nextLine().toDouble
    val y = scanner.nextLine().toDouble
    x * y
  }

  def divide() = {
    print("enter 1st value: ")
    val x = scanner.nextLine().toDouble
    print("enter 2nd value: ")
    val y = scanner.nextLine().toDouble
    x / y
  }

}
