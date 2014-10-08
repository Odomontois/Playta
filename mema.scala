/**
 * Created by Oleg on 08.10.2014.
 */

import unitItems._

val items = Seq (
  tonn from kg by 1000,
  pound from kg by .72,
  hour from minute by 60
)

val ccc = CaseClassCollection (items)

LinesWiever.delayedInit {
  LinesWiever.names = ccc.names
  LinesWiever.lines.setAll (ccc.values: _*)
  println (LinesWiever.names)
  println (LinesWiever.lines)
}

LinesWiever.main (Array ())
