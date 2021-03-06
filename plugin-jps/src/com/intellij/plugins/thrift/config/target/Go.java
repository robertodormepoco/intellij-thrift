package com.intellij.plugins.thrift.config.target;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 24.06.2014 12:09
 *
 * @author xBlackCat
 */ //Go
public class Go extends Generator {
  /**
   * Package prefix for generated files.
   */
  private String packagePrefix;
  /**
   * Override thrift package import path (default:git.apache.org/thrift.git/lib/go/thrift)
   */
  private String thriftImport;

  protected Go() {
    super(GeneratorType.Go);
  }

  public void setPackagePrefix(String packagePrefix) {
    this.packagePrefix = packagePrefix;
  }

  public void setThriftImport(String thriftImport) {
    this.thriftImport = thriftImport;
  }

  public String getPackagePrefix() {
    return packagePrefix;
  }

  public String getThriftImport() {
    return thriftImport;
  }

  @Override
  protected Collection<String> getOptions() {
    ArrayList<String> line = new ArrayList<String>();
    if (packagePrefix != null) {
      line.add("package_prefix=" + packagePrefix);
    }
    if (thriftImport != null) {
      line.add("thrift_import=" + thriftImport);
    }
    return line;
  }
}
