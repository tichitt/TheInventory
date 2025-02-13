The problem:

A company needs a system to manage its product inventory. You will design a Product class and an Inventory class to help store and retrieve product information.
Part A: The Product Class

Write a class Product that has the following:

    Two instance variables:
        name (a String) that stores the name of the product.
        quantity (an int) that stores the number of units in stock.
    A constructor that initializes both instance variables.
    A method getName that returns the name of the product.
    A method getQuantity that returns the quantity of the product.
    A method addStock(int amount) that increases the quantity by amount.
    A method reduceStock(int amount) that decreases the quantity by amount, but only if amount is less than or equal to quantity. If amount is greater than quantity, it should set quantity to 0.

Part B: The Inventory Class

Write a class Inventory that has the following:

    An instance variable products, which is an ArrayList<Product> storing the products in inventory.
    A constructor that initializes products as an empty list.
    A method addProduct(Product p) that adds the given Product to the inventory.
    A method findProduct(String name) that searches for a product by name and returns the Product object if found, or null if not found.
    A method totalStock() that returns the total quantity of all products in inventory.

Example Usage

Inventory store = new Inventory();
store.addProduct...
