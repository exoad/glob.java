package com.jackmeng.glob;

import java.awt.Color;

import javax.swing.BorderFactory;

import java.awt.*;

public class dgui_RightSide
    extends dgui_MasterComp
{
  public dgui_RightSide()
  {
    setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY),
        BorderFactory.createTitledBorder("Editor")));
    setPreferredSize(new Dimension(const_Consts.TOP_MASTER_DIM.width - const_Consts.MASTER_DIVIDER_LOCALE,
        const_Consts.TOP_MASTER_DIM.height));
  }
}
