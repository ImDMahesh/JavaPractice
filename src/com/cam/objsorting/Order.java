package com.cam.objsorting;

import java.util.Comparator;

public class Order  implements Comparable<Order> {
    private int orderId;
    private int amount;
    private String customer;

    /*
     * Comparator implementation to Sort Order object based on Amount
     */
    public static class OrderByAmount implements Comparator<Order> {

        @Override
        public int compare(Order o1, Order o2) {
            return o1.amount > o2.amount ? 1 : (o1.amount < o2.amount ? -1 : 0);
        }
    }

    /*
     * Another implementation or Comparator interface
     * to sort the list of the Order object
     * based upon customer name.
     */
    public static class OrderByCustomer implements Comparator<Order> {

        @Override
        public int compare(Order o1, Order o2) {
            return o1.customer.compareTo(o2.customer);
        }
    }

    public Order(int orderId, int amount, String customer) {
        this.orderId = orderId;
        this.amount = amount;
        this.customer = customer;
    }


    public int getAmount() {return amount; }
    public void setAmount(int amount) {this.amount = amount;}

    public String getCustomer() {return customer;}
    public void setCustomer(String customer) {this.customer = customer;}

    public int getOrderId() {return orderId;}
    public void setOrderId(int orderId) {this.orderId = orderId;}

    /*
     * Sorting on orderId is natural sorting for Order.
     */
    @Override
    public int compareTo(Order o) {
        return this.orderId > o.orderId ? 1 : (this.orderId < o.orderId ? -1 : 0);
    }

    /*
     * implementing toString method to print orderId of Order
     */
    @Override
    public String toString(){
        return String.valueOf(orderId);
    }

    //Read more: https://www.java67.com/2012/10/how-to-sort-object-in-java-comparator-comparable-example.html#ixzz7sQprfRSh
}
