TaskKey[Unit]("changeValueClass") := {
  IO.copyFile(file("A-value-class"), file("A.scala"))
}
