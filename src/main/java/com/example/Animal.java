package com.example;

// import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table
// @DiscriminatorColumn(name = "type") // Single_table
// @Inheritance(strategy = InheritanceType.SINGLE_TABLE) //Single_table

// @Inheritance(strategy = InheritanceType.JOINED) JOINED

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Animal {
  @Id
  private int id;
  private String name;

  public Animal() {}

  public Animal(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
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
    return "Animal [id=" + id + ", name=" + name + "]";
  }
}
