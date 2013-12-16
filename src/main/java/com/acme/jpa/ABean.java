package com.acme.jpa;

import java.util.HashSet;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ABean {

  @EJB
  BBeanRemote bBean;
  
  public void worksOK(HashSet<String> set) {
    // this would work!
//     set.add("this will wait on jdk 1.7.0_u45");
  
    // this won't, due to corba serialization in between
    bBean.wontWork(set);
  }
}
