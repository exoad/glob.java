package com.jackmeng.glob;

import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;


import java.awt.*;

public final class Glob
{

  static
  {
    System.setProperty("sun.java2d.opengl", "True");
    System.setProperty("sun.java2d.xrender", "True");
    System.setProperty("darklaf.decorations", "false");
  }

  public gui_MainFrame g;

  public Glob()
  {
    g = new gui_MainFrame();
    g.setTitle("SmolEditor " + const_Consts.VERSION_STR + "(" + const_Consts.VERSION_NUMBER + ")");
    g.setPreferredSize(const_Consts.CURRENT_DIM);
    g.setState(Frame.MAXIMIZED_BOTH);
    g.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    JSplitPane masterPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    masterPane.setPreferredSize(
        const_Consts.TOP_MASTER_DIM);

    dgui_LeftSide left = new dgui_LeftSide();
    dgui_RightSide right = new dgui_RightSide();

    left.setPreferredSize(new Dimension(g.getPreferredSize().width / 6, masterPane.getPreferredSize().height));
    right.setPreferredSize(
        new Dimension(g.getPreferredSize().width - left.getPreferredSize().width,
            masterPane.getPreferredSize().height));

    masterPane.setDividerLocation(g.getPreferredSize().width / 6);

    masterPane.setLeftComponent(left);
    masterPane.setRightComponent(right);

    g.getContentPane().setLayout(new BorderLayout());
    g.getContentPane().add(masterPane, BorderLayout.NORTH);
    g.getContentPane().add(new dgui_BottomBar(), BorderLayout.SOUTH);
  }

  public static void main(String[] args)
      throws Exception
  {
    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    SwingUtilities.invokeLater(new Glob().g);
  }
}