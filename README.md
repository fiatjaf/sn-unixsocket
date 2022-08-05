unixsocket
==========

### Installation

```scala
libraryDependencies += "com.fiatjaf" %%% "sn-unixsocket" % "0.1.0"
```

### Simple usage

```scala
import unixsocket.UnixSocket

UnixSocket
  .call(socketPath, payload)
  .future
  .onComplete {
    case Success(str) => println(s"got response from socket: $str")
    case Failure(exc) => println("oh no!")
  }
```
