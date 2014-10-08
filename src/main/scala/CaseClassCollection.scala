/**
 * Created by Oleg on 08.10.2014.
 */

import reflect.runtime.universe._

case class CaseClassCollection[+T](items: Seq[T])(implicit tag: TypeTag[T]) {
  val terms = tag.tpe.typeSymbol.typeSignature.members filter (_.isTerm) map (_.asTerm) filter (t => t.isVal)
  val names = (terms map (_.name.toString)).toSeq
  val rm = runtimeMirror (getClass.getClassLoader)
  val values = items map (rm reflect) map (i => (terms map (term => (term.name.toString, (i reflectField term).get.toString))).toMap)
}
