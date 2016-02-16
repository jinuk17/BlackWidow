package controllers

import play.api.mvc.{Controller, Action}

object Application2 extends Controller{
  def hello(name: String) = Action {
    val num = 1;
    Ok(views.html.hello(name, num))
  }
}