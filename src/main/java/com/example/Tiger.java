package com.example;

import jakarta.persistence.Entity;
// import jakarta.persistence.PrimaryKeyJoinColumn;
// import jakarta.persistence.DiscriminatorValue;

@Entity
// @DiscriminatorValue(value = "TG") Single_table
// @PrimaryKeyJoinColumn(referencedColumnName = "id") JOINED
public class Tiger extends Animal {
  private String zooName;

  public Tiger() {}

  public Tiger(int id, String name, String zooName) {
    super(id, name);
    this.zooName = zooName;
  }

  public String getZooName() {
    return zooName;
  }

  public void setZooName(String zooName) {
    this.zooName = zooName;
  }

  @Override
  public String toString() {
    return "Tiger [zooName=" + zooName + "]";
  }
}
