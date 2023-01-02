package com.jackmeng.glob.gui.lnf;

import javax.swing.JComponent;

import java.awt.Color;

import mdlaf.animation.MaterialUIMovement;
import mdlaf.components.button.MaterialButtonUI;

public class laf_BtnUI
    extends MaterialButtonUI
{
  @Override public void installUI(JComponent c)
  {
    mouseHoverEnabled = false;
    super.installUI(c);
    colorMouseHoverDefaultButton = new Color(0, 0, 0, 0);
    background = new Color(0, 0, 0, 0);
    c.setBackground(background);
    borderEnabled = false;
  }

}
