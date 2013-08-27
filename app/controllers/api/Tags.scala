package controllers.api

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.libs.json._
import play.api.libs.json.Json._
import play.api.libs.json.Reads._
import play.api.libs.json.Writes._
import play.api.libs.functional.syntax._

import models._
import json.ProductJson._
import json.TagJson._

object Tags extends Controller with Api { 
  /** Get all the tags. */
  def all() = ApiCall {
    SuccessWithData(toJson(Tag.all()))
  }

  /** Get one tag */
  def get(id: Long) = ApiCall {
    SuccessWithData(toJson(Tag.find(id)))
  }

  /** Get all the products associated with a tag */
  def getProducts(id: Long) = ApiCall {
    SuccessWithData(toJson(Tag.getProducts(id)))
  }
}
