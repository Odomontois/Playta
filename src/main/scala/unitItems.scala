/**
 * Created by Oleg on 08.10.2014.
 */
object unitItems {
  case class ItemUnit(name: String) {
    override def toString = name
  }
  case class Rel(to: ItemUnit, count: Double, from: ItemUnit)

  val kg = new ItemUnit ("KG")
  val hour = new ItemUnit ("Hour")
  val minute = new ItemUnit("Minute")
  val tonn = new ItemUnit("Tonn")
  val pound = new ItemUnit("Pound")

}
