package com.aibasis

import org.scalajs.dom.document
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js.annotation.JSExport

object App {

  @JSExport
  def main(args: Array[String]): Unit = {
    val component = <.div("hello scala react!,let's go!")
    component.renderIntoDOM(document.getElementById("app"))
  }

}
