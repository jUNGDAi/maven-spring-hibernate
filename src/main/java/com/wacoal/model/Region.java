/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wacoal.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author wien
 */
@Entity
@Table(name = "REGIONS")
public class Region implements Serializable {

  public static final String ID = "id";
  public static final String NAME = "name";
  private static final long serialVersionUID = 6765632738709865182L;

  @Id
  @Column(name = "REGION_ID")
  private Integer id;

  @Column(name = "REGION_NAME")
  private String name;

  public Region() {

  }

  public Region(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Region{" + "id=" + id + ", name=" + name + '}';
  }

}
