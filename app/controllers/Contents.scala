package controllers

import models.Bible
import play.api.mvc.{Action, Controller}

object Contents extends Controller {
  def books = Action {
    implicit request =>

    Ok(views.html.books(Bible.books))
  }
}
