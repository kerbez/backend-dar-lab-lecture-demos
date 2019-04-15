package lab1.task1

class Director(val firstName: String, val lastName: String, val yearOfBirth: Int){
  def name:String = s"$firstName $lastName";
  def getYearOfBirth: Int = yearOfBirth;
}
