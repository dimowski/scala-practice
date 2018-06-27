val map1 = Map("Book about JVM" -> 20, "Test" -> 100)
map1.mapValues(_ * 0.9)
for ((k, v) <- map1) yield {(k, 0.9 * v)}


System.getProperty("java.runtime.name")