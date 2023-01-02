package com.jackmeng.glob.gui;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JProgressBar;
import java.util.TimerTask;

import java.awt.event.*;

import com.jackmeng.glob.const_Consts;
import com.jackmeng.glob.util.use_Sys;

public class dgui_BottomBar
    extends dgui_MasterComp
{

  public dgui_BottomBar()
  {
    setPreferredSize(new Dimension(const_Consts.CURRENT_DIM.width, const_Consts.BOTTOM_BAR_HEIGHT));
    setBorder(BorderFactory.createLineBorder(Color.GRAY));
    setLayout(new FlowLayout());

    JProgressBar jpb = new JProgressBar(0, 100);
    jpb.setStringPainted(true);
    jpb.setString((int) ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1e+6) + "/"
        + (int) (Runtime.getRuntime().totalMemory() / 1e+6) + " Mb");
    use_Sys.LOOP.schedule(new TimerTask() {
      @Override public void run()
      {
        jpb.setMaximum((int) (Runtime.getRuntime().totalMemory() / 1e+6));
        jpb.setValue((int) ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1e+6));
        jpb.setString((int) ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1e+6) + "/"
            + (int) (Runtime.getRuntime().totalMemory() / 1e+6) + " Mb");
      }

    }, 3000L, 2000L);
    jpb.addMouseListener(new MouseAdapter() {
      @Override public void mouseClicked(MouseEvent e)
      {
        Runtime.getRuntime().gc();
      }
    });

    add(jpb);

  }
}
