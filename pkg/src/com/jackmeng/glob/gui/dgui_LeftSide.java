package com.jackmeng.glob.gui;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;

import com.jackmeng.glob.const_Consts;
import com.jackmeng.glob.util.use_AssetFetcher;

import java.awt.*;

public class dgui_LeftSide
    extends dgui_MasterComp
{

  static class leftside_ButtonsTop
      extends dgui_MasterComp
  {
    public leftside_ButtonsTop()
    {
      setOpaque(true);
      setBackground(Color.BLACK);
      setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
      setPreferredSize(new Dimension(const_Consts.MASTER_DIVIDER_LOCALE, const_Consts.LEFT_DIVIDER_LOCALE));
      dgui_ButtonDef jb = new dgui_ButtonDef() {
        @Override public void paintComponent(Graphics g)
        {
          super.paintComponent(g);
          Graphics2D g2 = (Graphics2D) g;
          g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
          g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
          g2.setStroke(new BasicStroke(2));
          g2.setColor(Color.WHITE);

          g2.drawLine(getWidth() / 2, const_Consts.BUTTONS_ICON_OFFSET, getWidth() / 2,
              getHeight() - const_Consts.BUTTONS_ICON_OFFSET);
          g2.drawLine(const_Consts.BUTTONS_ICON_OFFSET, getHeight() / 2, getWidth() - const_Consts.BUTTONS_ICON_OFFSET,
              getHeight() / 2);
          g2.dispose();
        }
      };
      jb.setIcon(use_AssetFetcher.fetcher.getFromAsImageIcon(const_Consts.LEFT_DIVIDER_LOCALE - 2,
          const_Consts.LEFT_DIVIDER_LOCALE - 2,
          "assets/btns/blue2green/" + (const_Consts.RNG.nextInt(10) + 1) + ".png"));

      dgui_ButtonDef jb2 = new dgui_ButtonDef() {
        @Override public void paintComponent(Graphics g)
        {
          super.paintComponent(g);
          Graphics2D g2 = (Graphics2D) g;
          g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
          g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
          g2.setStroke(new BasicStroke(2));
          g2.setColor(Color.WHITE);
          g2.drawOval(const_Consts.BUTTONS_ICON_OFFSET, const_Consts.BUTTONS_ICON_OFFSET, getWidth() / 3,
              getHeight() / 3);
          g2.drawLine(getWidth() / 3, getHeight() /3, getWidth() - const_Consts.BUTTONS_ICON_OFFSET, getHeight() - const_Consts.BUTTONS_ICON_OFFSET);
          g2.dispose();
        }
      };
      jb2.setIcon(use_AssetFetcher.fetcher.getFromAsImageIcon(const_Consts.LEFT_DIVIDER_LOCALE - 2,
          const_Consts.LEFT_DIVIDER_LOCALE - 2,
          "assets/btns/blue2green/" + (const_Consts.RNG.nextInt(10) + 1) + ".png"));
      add(jb);
      add(jb2);
      add(Box.createVerticalGlue());
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
    JSplitPane jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    jsp.setDividerSize(0);
    jsp.setTopComponent(new leftside_ButtonsTop());
    jsp.setBottomComponent(new leftside_Explorer());
    add(jsp);
  }
}
