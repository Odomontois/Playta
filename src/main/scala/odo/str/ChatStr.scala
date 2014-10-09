package odo.str

/**
 * Created by Oleg on 09.10.2014.
 */
object ChatStr {

  implicit class ChatStrImpl(s: String) {
    def ladder(sep:String) = s zip (0 to s.length - 1 map (i => (sep * i, sep * (s.length - 1 - i)))) map { case (c, (pref, post)) => s"$pref$c$post" } mkString "\n"
  }

}
