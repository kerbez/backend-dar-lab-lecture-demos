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

  def readInt(str: String): Option[Int] =
    if(str matches "\\d+") Some(str.toInt) else None

//  def calculator(op1: String, op: String, op2: String){
//    readInt(op1).flatMap(readInt(op2))
//  }

}
