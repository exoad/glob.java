package com.jackmeng.glob.gui;

import javax.swing.JFrame;

import com.jackmeng.glob.util.use_AssetFetcher;

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
