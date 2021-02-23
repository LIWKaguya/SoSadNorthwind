package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventory_transactions {
   @Id
   int id;
   int transaction_type, product_id, quantity, purchase_order_id, customer_order_id;
   String transaction_created_date, transaction_modified_date, comments;
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTransaction_type() {
        return this.transaction_type;
    }
    public void setTransaction_type(int transaction_type) {
        this.transaction_type = transaction_type;
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
    public int getPurchase_order_id() {
        return this.purchase_order_id;
    }
    public void setPurchase_order_id(int purchase_order_id) {
        this.purchase_order_id = purchase_order_id;
    }
    public int getCustomer_order_id() {
        return this.customer_order_id;
    }
    public void setCustomer_order_id(int customer_order_id) {
        this.customer_order_id = customer_order_id;
    }
    public String getTransaction_created_date() {
        return this.transaction_created_date;
    }
    public void setTransaction_created_date(String transaction_created_date) {
        this.transaction_created_date = transaction_created_date;
    }

    public String getTransaction_modified_date() {
        return this.transaction_modified_date;
    }

    public void setTransaction_modified_date(String transaction_modified_date) {
        this.transaction_modified_date = transaction_modified_date;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}
