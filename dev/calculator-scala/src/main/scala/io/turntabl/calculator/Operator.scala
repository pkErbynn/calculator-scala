package io.turntabl.calculator

import java.util.Scanner

object Operator {

  val scanner = new Scanner(System.in)

  def showMenu(): Unit = {
    println("1. add")
    println("2. subtract")
    println("3. multiply")
  }

  def add(): Int = {
    print("enter 1st value: ")
    print("enter 2nd value: ")
    val x = scanner.nextLine().toInt
    val y = scanner.nextLine().toInt
    x + y
  }

  def subtract(x: Int, y: Int) = {
    print("enter 1st value: ")
    print("enter 2nd value: ")
    val x = scanner.nextLine().toInt
    val y = scanner.nextLine().toInt
    x - y
  }
  def multiply(x: Int, y: Int) = {
    print("enter 1st value: ")
    print("enter 2nd value: ")
    val x = scanner.nextLine().toInt
    val y = scanner.nextLine().toInt
    x * y
  }
  def divide(x: Int, y: Int) = {
    print("enter 1st value: ")
    print("enter 2nd value: ")
    val x = scanner.nextLine().toInt
    val y = scanner.nextLine().toInt
    x / y
  }

}
