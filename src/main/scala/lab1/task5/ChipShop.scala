package lab1.task5

object ChipShop {
  def willServe(cat:Cat):Boolean={
    cat match {
      case Cat(_, _, "Chips") => true // instead of Infinity
      case _ => false
    }
  }
}
