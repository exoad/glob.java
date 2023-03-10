package com.jackmeng.glob.util;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.awt.image.*;

public class use_AssetFetcher
{

  public static final use_AssetFetcher fetcher = new use_AssetFetcher();

  private use_AssetFetcher()
  {
  }

  private final Map< String, Object > lazyResource_cache = new HashMap<>();

  /**
   * @param path
   * @return ImageIcon
   */
  public ImageIcon getFromAsImageIcon(String path)
  {
    if (lazyResource_cache.containsKey(path) && lazyResource_cache.get(path) instanceof ImageIcon)
      return (ImageIcon) lazyResource_cache.get(path);
    ImageIcon i = null;
    try
    {

      i = new ImageIcon(
          java.util.Objects.requireNonNull(getClass().getResource(path)));
    } catch (NullPointerException e)
    {
      return new ImageIcon(path);
    }
    lazyResource_cache.put(path, i);
    return i;
  }

  public ImageIcon getFromAsImageIcon(int w, int h, String path)
  {
    return use_Image.imageicon_resize(w, h, getFromAsImageIcon(path));
  }

  public BufferedImage getFromAsImage(String path)
  {
    if (lazyResource_cache.containsKey(path) && lazyResource_cache.get(path) instanceof BufferedImage)
      return (BufferedImage) lazyResource_cache.get(path);
    BufferedImage i = null;
    try
    {
      i = ImageIO.read(java.util.Objects.requireNonNull(getClass().getResource(path)));
    } catch (Exception e)
    {
      try
      {
        i = ImageIO.read(new File(path));
      } catch (IOException e1)
      {
        return use_Image.NO_TEXTURE;
      }
    }
    lazyResource_cache.put(path, i);
    return i;
  }

  /**
   * @param path
   * @return File
   */
  public File getFromAsFile(String path)
  {
    if (lazyResource_cache.containsKey(path))
      return (File) lazyResource_cache.get(path);
    File i;
    try
    {
      i = new File(
          java.util.Objects.requireNonNull(getClass().getResource(path)).getFile());
    } catch (NullPointerException e)
    {
      i = new File(path);
    }
    lazyResource_cache.put(path, i);
    return i;
  }
}
