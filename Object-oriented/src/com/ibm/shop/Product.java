package com.ibm.shop;

/**
 * this class represents generalized bank account
 * @author 002UOK744
 *
 */
public class Product {
  private String name;
  private double price;
  private double stock;
  /**Default Constructor*/
  public Product() {
  }
  /**Parameterised constructor for creating account
   * @param name
   * @param price
   */
  public void print()
  {
	  System.out.println(+price);
	  System.out.println(+stock);
  }
  /**
   * print
   * @param price
   */
public void setPrice(double price) {
	this.price = price;
}
public String getName() {
	return name;
}


public double getPrice() {
	return price;
}

public double getStock() {
	return stock;
} 
}

