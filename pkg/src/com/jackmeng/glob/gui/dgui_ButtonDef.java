package com.jackmeng.glob.gui;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;

import com.jackmeng.glob.gui.lnf.laf_BtnUI;

import java.awt.*;

public class dgui_ButtonDef
    extends JButton
{
  public static final laf_BtnUI DEFAULT_BTNUI = new laf_BtnUI();

  public dgui_ButtonDef()
  {
    setUI(DEFAULT_BTNUI);
    setBorder(BorderFactory.createEmptyBorder());
    setBorderPainted(false);
    setRolloverEnabled(true);
    setRequestFocusEnabled(false);
    setFocusPainted(false);
  }

  @Override public void setIcon(Icon e)
  {
    super.setIcon(e);
    setRolloverIcon(e);
  }

  @Override public void paintComponent(Graphics g)
  {
    ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    super.paintComponent(g);
  }
}
