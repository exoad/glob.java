package com.jackmeng.glob.gui;

import javax.swing.JPanel;
import java.awt.*;

import java.awt.event.*;

public class dgui_MasterComp
    extends JPanel
{

  @Override public void paintComponent(Graphics g)
  {
    ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
    super.paintComponent(g);
  }

  public void addClickListener(Runnable callback)
  {
    addMouseListener(new MouseAdapter() {
      @Override public void mouseClicked(MouseEvent e)
      {
        callback.run();
      }
    });
  }
}
