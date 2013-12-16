package com.acme.jpa;

import java.util.HashSet;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class CorbaSerializationTest {

  @Deployment
  public static Archive<?> createDeployment() {
    return ShrinkWrap.create(WebArchive.class, "test.war").addPackage(ABean.class.getPackage());
  }

  @EJB
  ABean service;

  @Test
  public void test() {
    try {
      service.worksOK(new HashSet<String>());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
