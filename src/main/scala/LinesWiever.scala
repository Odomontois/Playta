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
  var lines = ObservableBuffer[String]()

  stage = new PrimaryStage {
    title = "Hello World!"
    scene = new Scene {
      fill = Black
      content = new TableView[String](lines) {
        columns += new TableColumn[String, String] {
          text = "phraze"
          cellValueFactory = { s => new StringProperty (s.value) }
          prefWidth = 1000
        }
      }
    }
  }
}
