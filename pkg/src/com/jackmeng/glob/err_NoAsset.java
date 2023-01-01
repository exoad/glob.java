package com.jackmeng.glob;

public class err_NoAsset
    extends Exception
{
  public err_NoAsset(String asset)
  {
    super("Could not find the desired asset: " + asset);
  }
}
