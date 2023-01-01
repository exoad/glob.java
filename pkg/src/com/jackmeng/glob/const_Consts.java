package com.jackmeng.glob;

import java.util.Random;

import java.awt.*;

public class const_Consts
{
  public static final Random RNG = new Random();

  public static final String VERSION_STR = "v1.0";
  public static final long VERSION_NUMBER = 202301L;

  public static final int BOTTOM_BAR_HEIGHT = 25;

  public static Dimension CURRENT_DIM = Toolkit.getDefaultToolkit().getScreenSize();
  public static final int MASTER_DIVIDER_LOCALE = CURRENT_DIM.width / 6;
  public static final int LEFT_DIVIDER_LOCALE = (CURRENT_DIM.width - BOTTOM_BAR_HEIGHT) / 8;
  public static final Dimension TOP_MASTER_DIM = new Dimension(CURRENT_DIM.width,
      CURRENT_DIM.height - BOTTOM_BAR_HEIGHT);

}
