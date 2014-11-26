package models

case class Person(name:String,email:String,twitterHandle:String,id:Int){
    override def toString = s"$name   |     $email      |       $twitterHandle"

}

object Person{
  def employees =
    Vector(
    Person("not","a","valid id",0),
    Person("forrest", "gump", "@lightningbolt",1),
    Person("tony", "stark", "@ironman",2),
    Person("bill", "cosby", "@touchyguy",3)
  )

//   def showEmployees = {
//     val res = for(employee <- employees) yield employee.toString
//
//  } not needed anymore

  def findById(idd:Int) = employees.find(_.id == idd)

}

