package com.jackmeng.glob;

import javax.swing.JPanel;
import java.awt.*;

public class dgui_MasterComp
    extends JPanel
{

  @Override public void paintComponent(Graphics g)
  {
    ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
    super.paintComponent(g);
  }
}
