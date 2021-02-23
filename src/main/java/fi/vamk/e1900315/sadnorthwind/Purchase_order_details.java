package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Purchase_order_details {
   @Id
   int id;
   int purchase_order_id, product_id, quantity, unit_cost, posted_to_inventory, inventory_id; 
   String date_recieved;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPurchase_order_id() {
        return this.purchase_order_id;
    }

    public void setPurchase_order_id(int purchase_order_id) {
        this.purchase_order_id = purchase_order_id;
    }

    public int getProduct_id() {
        return this.product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnit_cost() {
        return this.unit_cost;
    }

    public void setUnit_cost(int unit_cost) {
        this.unit_cost = unit_cost;
    }

    public int getPosted_to_inventory() {
        return this.posted_to_inventory;
    }

    public void setPosted_to_inventory(int posted_to_inventory) {
        this.posted_to_inventory = posted_to_inventory;
    }

    public int getInventory_id() {
        return this.inventory_id;
    }

    public void setInventory_id(int inventory_id) {
        this.inventory_id = inventory_id;
    }

    public String getDate_recieved() {
        return this.date_recieved;
    }

    public void setDate_recieved(String date_recieved) {
        this.date_recieved = date_recieved;
    }
}
