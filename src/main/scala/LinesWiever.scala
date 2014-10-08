import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.beans.property.StringProperty
import scalafx.collections.ObservableBuffer
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.control.{TableColumn, TableView}

import scalafx.scene.effect.DropShadow
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color._
import scalafx.scene.control.TableColumn._
import scalafx.scene.paint.{Stops, LinearGradient}
import scalafx.scene.text.Text

/**
 * Created by Oleg on 07.10.2014.
 */
object LinesWiever extends JFXApp {
  val lines = ObservableBuffer[Map[String, String]]()
  val table = new TableView[Map[String, String]](lines)
  private var _names: Seq[String] = Seq.empty

  def names = _names

  def names_=(names: Seq[String]) {
    _names = names
    val cols = names map (name => new TableColumn[Map[String, String], String](name) {
      cellValueFactory = c => new StringProperty (c.value get name get)
    })
    table.columns.clear()
    cols foreach { table.columns += _}
  }

  stage = new PrimaryStage {
    title = "Hello World!"
    scene = new Scene {
      fill = Black
      content = table
    }
  }
}
