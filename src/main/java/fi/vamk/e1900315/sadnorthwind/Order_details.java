package fi.vamk.e1900315.sadnorthwind;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order_details {
   @Id
   int id;
   int order_id, product_id, quality, unit_price, status_id,purchase_order_id, inventory_id;
   double discount;
   String date_allocated;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return this.order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return this.product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuality() {
        return this.quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getUnit_price() {
        return this.unit_price;
    }

    public void setUnit_price(int unit_price) {
        this.unit_price = unit_price;
    }

    public int getStatus_id() {
        return this.status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public int getPurchase_order_id() {
        return this.purchase_order_id;
    }

    public void setPurchase_order_id(int purchase_order_id) {
        this.purchase_order_id = purchase_order_id;
    }

    public int getInventory_id() {
        return this.inventory_id;
    }

    public void setInventory_id(int inventory_id) {
        this.inventory_id = inventory_id;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDate_allocated() {
        return this.date_allocated;
    }

    public void setDate_allocated(String date_allocated) {
        this.date_allocated = date_allocated;
    }
}
