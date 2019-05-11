package lab3

object Boot extends App{
  def divOps(op1: Int, op2: Int) ={
    op2 match {
      case 0 => None
      case _ :Int => Some(op1/op2)
    }
  }

  println("--------task1------")
  println(divOps(4, 2))
  println(divOps(4, 0))
  println(divOps(-10, 3))


  println()
  println("--------task2--------")

  def isInt(op1: String, op: String, op2: String): Option[Int] =
    if((op1 matches "\\d+") && (op1 matches "\\d+")) Some(op1.toInt) else None


  def readStr(str: String): Option[String] ={
    str match{
      case "/" => Some("/")
      case "+" => Some("+")
      case "-" => Some("-")
      case "*" => Some("*")
      case _ => None
    }
  }

  def readInt(str: String): Option[Int] =
    if(str matches "\\d+") Some(str.toInt) else None

  def res(op1: Int, op: String, op2: Int): Option[Int] ={
    if(op == "/" && op2 == 0) {
      println("here")
      None
    }
    else
    op match {
      case "/" => Some(op1/op2)
      case "+" => Some(op1+op2)
      case "*" => Some(op1*op2)
      case "-" => Some(op1-op2)
    }
  }

  def calculator(op1: String, op: String, op2: String): Unit ={
    if((readInt(op1) != None) && (readInt(op2) != None)){
      if(readStr(op) != None){
        println(res(readhow to insInt(op1).get, readStr(op).get, readInt(op2).get))
      }
    }
  }

  calculator("4", "+", "2")
  calculator("4", "/", "0")
  calculator("4", "*", "2")
  calculator("4", "-", "2")
  calculator("4", "/", "2")


}
