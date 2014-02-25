package com.acme.jpa;

import java.util.HashSet;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.ejb.Singleton;

/* @Stateless */
@Startup
@Singleton
public class ABean {

  @EJB
  BBeanRemote bBean;
 
  @PostConstruct
  public void worksOK() {
HashSet<String> set =new HashSet<String>();
    // this would work!
//     set.add("this will wait on jdk 1.7.0_u45");
  
    // this won't, due to corba serialization in between
    bBean.wontWork(set);
  }
}
