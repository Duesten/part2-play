package models

case class Person(name:String,email:String,twitterHandle:String){
    override def toString = s"$name   |     $email      |       $twitterHandle"

}

object Person{
  val employees =
    Vector(
    Person("forrest", "gump", "@lightningbolt"),
    Person("tony", "stark", "@ironman"),
    Person("bill", "cosby", "@touchyguy")
  )

   def showEmployees = {
     var res = ""
      for(employee <- employees){
        res = res + (employee.toString)
      }
        res
  }

}

