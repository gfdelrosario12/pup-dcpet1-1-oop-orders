/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph.orders.model;

/**
 *
 * @author ACER
 */
public class OrdersModel {
    private int orNo;
    private String items;
    private double price;
    private int noOrder;
    private String date;
    
    public OrdersModel() {
    }

    public OrdersModel(String items, double price, int noOrder, String date) {
        this.items = items;
        this.price = price;
        this.noOrder = noOrder;
        this.date = date;
    }
    
    public OrdersModel(int orNo, String items, double price, int noOrder, String date) {
        this.orNo = orNo;
        this.items = items;
        this.price = price;
        this.noOrder = noOrder;
        this.date = date;
    }

    public int getOrNo() {
        return orNo;
    }

    public void setOrNo(int orNo) {
        this.orNo = orNo;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOrder() {
        return noOrder;
    }

    public void setNoOrder(int noOrder) {
        this.noOrder = noOrder;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
