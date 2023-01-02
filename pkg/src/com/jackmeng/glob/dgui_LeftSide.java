package com.jackmeng.glob;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.awt.*;

public class dgui_LeftSide
    extends dgui_MasterComp
{

  static class leftside_ButtonsTop
      extends dgui_MasterComp
  {
    public leftside_ButtonsTop()
    {
      setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
      setPreferredSize(new Dimension(const_Consts.MASTER_DIVIDER_LOCALE, const_Consts.LEFT_DIVIDER_LOCALE));
      JButton jb = new JButton();
      jb.setIcon(use_AssetFetcher.fetcher.getFromAsImageIcon(16, 16,
          "assets/btns/blue2green/" + (const_Consts.RNG.nextInt(10) + 1) + ".png"));

    }
  }

  static class leftside_Explorer
      extends dgui_MasterComp
  {
    public leftside_Explorer()
    {
      setOpaque(true);

    }
  }

  public dgui_LeftSide()
  {
    setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY),
        BorderFactory.createTitledBorder("Explorer")));
    setLayout(new BorderLayout());
    add(new leftside_ButtonsTop(), BorderLayout.NORTH);
    add(new leftside_Explorer(), BorderLayout.SOUTH);
  }
}
