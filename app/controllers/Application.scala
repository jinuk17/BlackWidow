package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("안녕 뱀미??"))
  }

  def hello(name: String) = Action {
    Ok("Hello " + name)
  }
}