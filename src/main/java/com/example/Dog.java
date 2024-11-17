package com.example;

// import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
// import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
// @DiscriminatorValue(value = "DG") Single_table
// @PrimaryKeyJoinColumn(referencedColumnName = "id") Joined
// Table_Per_Class
public class Dog extends Animal {
  private String owner;

  public Dog() {}

  public Dog(int id, String name, String owner) {
    super(id, name);
    this.owner = owner;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  @Override
  public String toString() {
    return "Dog [owner=" + owner + "]";
  }
}
