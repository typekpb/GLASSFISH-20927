package com.acme.jpa;

import java.util.HashSet;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote(BBeanRemote.class)
@Stateless
public class BBean {

  public void wontWork(HashSet<String> set) {
    // preconditions
//    if (set == null || !set.isEmpty()) {
//      throw new IllegalArgumentException("test precondition failed!");
//    }
    set.add("this will wait on jdk 1.7.0_u45");
  }

}
