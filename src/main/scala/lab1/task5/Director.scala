package lab1.task5

case class Director(val firstName: String, val lastName: String, val yearOfBirth: Int){
  def name:String = s"$firstName $lastName";
}
