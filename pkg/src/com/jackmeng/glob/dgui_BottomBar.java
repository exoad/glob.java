package com.jackmeng.glob;

import java.awt.*;

import javax.swing.BorderFactory;

public class dgui_BottomBar
    extends dgui_MasterComp
{
  public dgui_BottomBar() {
    setPreferredSize(new Dimension(getPreferredSize().width, const_Consts.BOTTOM_BAR_HEIGHT));
    setMinimumSize(new Dimension(1, const_Consts.BOTTOM_BAR_HEIGHT));
    setMaximumSize(new Dimension(Integer.MAX_VALUE, const_Consts.BOTTOM_BAR_HEIGHT));
    setBorder(BorderFactory.createLineBorder(Color.GRAY));
  }
}
