package models
import anorm._
import anorm.SqlParser._
import play.api.db._
import play.api.Play.current

case class User(id: Long, email: String, encrypted_password: String)

object User {
  val user = {
    get[Long]("id") ~ 
    get[String]("email") ~
    get[String]("encrypted_password")map {
      case id~email~encrypted_password => User(id, email, encrypted_password)
    }
  }

  def all(): List[User] = DB.withConnection { implicit connection => 
    SQL("select * from users limit 1000").as(user *)
  }
}

