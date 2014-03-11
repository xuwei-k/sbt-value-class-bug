sbt value class bug

https://travis-ci.org/xuwei-k/sbt-value-class-bug/builds/20517362#L156

```
[info] [error] (run-main-0) java.lang.NoSuchMethodError: B$.foo()LA;
[info] java.lang.NoSuchMethodError: B$.foo()LA;
[info] 	at C$delayedInit$body.apply(C.scala:3)
[info] 	at scala.Function0$class.apply$mcV$sp(Function0.scala:40)
[info] 	at scala.runtime.AbstractFunction0.apply$mcV$sp(AbstractFunction0.scala:12)
[info] 	at scala.App$$anonfun$main$1.apply(App.scala:71)
[info] 	at scala.App$$anonfun$main$1.apply(App.scala:71)
[info] 	at scala.collection.immutable.List.foreach(List.scala:318)
[info] 	at scala.collection.generic.TraversableForwarder$class.foreach(TraversableForwarder.scala:32)
[info] 	at scala.App$class.main(App.scala:71)
[info] 	at C$.main(C.scala:1)
[info] 	at C.main(C.scala)
[info] 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[info] 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
[info] 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[info] 	at java.lang.reflect.Method.invoke(Method.java:606)
[info] [trace] Stack trace suppressed: run last compile:run for the full output.
[info] java.lang.RuntimeException: Nonzero exit code: 1
[info] 	at scala.sys.package$.error(package.scala:27)
[info] [trace] Stack trace suppressed: run last compile:run for the full output.
[info] [error] (compile:run) Nonzero exit code: 1
[info] [error] Total time: 4 s, completed Mar 11, 2014 9:32:49 AM
[error] x value-class-bug / simple
```
