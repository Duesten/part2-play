package controllers

import models.Person
import play.api._
import play.api.mvc._


object Application extends Controller {

  //  def index = Action {
  //    Ok(views.html.index("Your new application is ready."))
  //  }
  def showEmployees = Action {
    Ok(views.html.employees(models.Person.employees))
  }

  def showEmployeeDetails(id: Int) = Action { implicit request => Person.findById(id).map { person => Ok(views.html.persondetails(person))}.getOrElse(NotFound)
  }
}