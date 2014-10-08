/**
 * Created by Oleg on 08.10.2014.
 */

import unitItems._

val items = Seq (
  Rel (tonn, 1000, kg),
  Rel (pound, .72, kg),
  Rel (hour, 60, minute)
)

val ccc = CaseClassCollection (items)

LinesWiever.delayedInit {
  LinesWiever.names = ccc.names
  LinesWiever.lines.setAll (ccc.values: _*)
  println( LinesWiever.names )
  println( LinesWiever.lines)
}

LinesWiever.main(Array())
