package com.jackmeng.glob;

import java.awt.Color;

import javax.swing.BorderFactory;

public class dgui_RightSide
    extends dgui_MasterComp
{
  public dgui_RightSide()
  {
    setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY),
        BorderFactory.createTitledBorder("Editor")));
  }
}
