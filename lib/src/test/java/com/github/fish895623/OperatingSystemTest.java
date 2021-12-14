package com.github.fish895623;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OperatingSystemTest {
  @Test
  void getOsTypeTest() {
    assertEquals("linux", new OperatingSystem().getOsType());
  }
}
