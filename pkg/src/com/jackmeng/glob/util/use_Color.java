package com.jackmeng.glob.util;

import java.awt.Color;

public final class use_Color
{
  public static String colorToHex(Color r)
  {
    return String.format("#%02x%02x%02x", r.getRed(), r.getGreen(), r.getBlue());
  }

  public static Color hexToRGB(String hex)
  {
    if (!hex.startsWith("#"))
      hex = "#" + hex;
    return new Color(
        Integer.valueOf(hex.substring(1, 3), 16),
        Integer.valueOf(hex.substring(3, 5), 16),
        Integer.valueOf(hex.substring(5, 7), 16));
  }

}
