/**
 * Created by Oleg on 08.10.2014.
 */
object unitItems {
  val kg = new ItemUnit ("KG")
  val hour = new ItemUnit ("Hour")
  val minute = new ItemUnit ("Minute")
  val tonn = new ItemUnit ("Tonn")
  val pound = new ItemUnit ("Pound")

  trait RelBuilder {
    def by(count: Double): Rel
  }

  case class ItemUnit(name: String) {
    override def toString = name

    def from(unit: ItemUnit) = new RelBuilder {
      override def by(count: Double) = Rel (ItemUnit.this, count, unit)
    }
  }

  case class Rel(to: ItemUnit, count: Double, from: ItemUnit)

}
