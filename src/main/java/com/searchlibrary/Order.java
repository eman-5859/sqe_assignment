package com.searchlibrary;

/**
 * Represents an order with order ID, customer name, and amount.
 */
public class Order {
    private int orderId;
    private String customerName;
    private double amount;

    /**
     * Constructor for Order.
     * @param orderId the order ID
     * @param customerName the customer name
     * @param amount the order amount
     */
    public Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    /**
     * Gets the order ID.
     * @return the order ID
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Gets the customer name.
     * @return the customer name
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Gets the amount.
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }
}