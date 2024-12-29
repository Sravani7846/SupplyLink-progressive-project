package com.wecp.progressive.entity;

public class Warehouse {
    private int warehouseId;
    private int supplierId;
    private String name;
    private String location;
    private int capacity;
    
    public Warehouse() {
    }
    public Warehouse(int warehouseId, int supplierId, String name, String location, int capacity) {
        this.warehouseId = warehouseId;
        this.supplierId = supplierId;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }
    public int getWarehouseId() {
        return warehouseId;
    }
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
    public int getSupplierId() {
        return supplierId;
    }
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    
}