package controllers

import models.Bible
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index(Bible.books))
  }

}