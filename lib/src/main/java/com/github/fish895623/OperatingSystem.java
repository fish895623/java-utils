package com.github.fish895623;

public class OperatingSystem {

  /**
   * Get os type of java running system
   *
   * @return String windows, linux
   */
  public String getOsType() {
    String osVal = System.getProperty("os.name").toLowerCase();

    if (osVal.contains("linux")) {
      return "linux";
    } else {
      return "something wrong?";
    }
  }
}
