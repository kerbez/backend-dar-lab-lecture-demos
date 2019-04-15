package lab1.task5

object Dad {
  def rate(film:Film):Double={
    film.director.name match{
      case "Clint Eastwood" => 10.0
      case "John McTiernan" => 7.0
      case _ => 3.0
    }
  }
}
