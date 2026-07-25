package com.cognizant.inventory;

public class InventoryTest {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Laptop", 10, 75000));

        manager.addProduct(new Product(102, "Mouse", 50, 800));

        manager.addProduct(new Product(103, "Keyboard", 30, 1500));

        manager.displayInventory();

        manager.updateProduct(102, 75, 850);

        manager.displayInventory();

        manager.deleteProduct(101);

        manager.displayInventory();
    }
}