package scala.jdk

object CollectionConverters {

  implicit class RichConcurrentHashMap[K, V](val javaMap: java.util.concurrent.ConcurrentHashMap[K, V]) extends AnyVal {
    def asScala = scala.collection.convert.Wrappers.JConcurrentMapWrapper(javaMap)
  }
}