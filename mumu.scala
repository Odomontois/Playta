/**
 * Created by Oleg on 07.10.2014.
 */
val phraze = "я пойду тусить сегодня один"
val lines = ((phraze split " ").toList.permutations map (_ mkString " ")).toList
LinesWiever.delayedInit { LinesWiever.lines ++= lines }
LinesWiever.main (Array ())
