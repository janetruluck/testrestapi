package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  import models.User

  def index = Action {
    Ok(views.html.index(User.all()))
  }

  def users = Action {
    import play.api.libs.json._

    implicit val userWrites = new Writes[User] {
      def writes(c:  User): JsValue = {
        Json.obj(
          "id" -> c.id, 
          "name" -> c.email, 
          "encrypted_password" -> c.encrypted_password
        )
      }
    }

    val users = User.all()
    val usersJson = Json.toJson(users)

    Ok(usersJson)
  }
}
