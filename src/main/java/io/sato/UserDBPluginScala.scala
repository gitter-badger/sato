package io.sato

import java.util

import io.sato.plugin.Plugin

import scala.collection.JavaConversions._
import scala.collection.immutable.HashMap

class UserDBPluginScala extends Plugin {
  def findLecturesOfUser(name: String, number: Long): util.Map[String, Int] = {
    println("Scala Hello " + name + ", " + number)
    mapAsJavaMap(HashMap("Calculus" -> 4, "Physics" -> 3, "Chemistry" -> 3, "Biology" -> 3))
  }

  override def documentation(): String = "Scala UserDBPluginScala"

  override def execute(objects: AnyRef*): String = "{}";

}
