package org.scalajs.junit

import org.junit._
import org.scalajs.junit.utils.JUnitTest

class MultiIgnore1Test {
  @Ignore @Test def multiTest1(): Unit = ()
  @Test def multiTest2(): Unit = ()
  @Test def multiTest3(): Unit = ()
  @Test def multiTest4(): Unit = ()
  @Test def multiTest5(): Unit = ()
}

class MultiIgnore1TestAssertions extends JUnitTest {
  protected def expectedOutput(builder: OutputBuilder): OutputBuilder = {
    builder
      .ignored("multiTest1")
      .success("multiTest2")
      .success("multiTest3")
      .success("multiTest4")
      .success("multiTest5")
  }
}
