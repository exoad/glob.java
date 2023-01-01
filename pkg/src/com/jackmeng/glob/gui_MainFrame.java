package com.jackmeng.glob;

import javax.swing.JFrame;

public class gui_MainFrame
    extends JFrame
    implements
    Runnable
{

  @Override public void run()
  {
    setIconImage(use_AssetFetcher.fetcher.getFromAsImage("assets/icon.png"));
    pack();
    setVisible(true);
  }
}
