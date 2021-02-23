package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
   @Id
   int id; 
   String supplier_ids, product_code, product_name, description,quantity_per_unit,category,attachments;
   int standard_cost, list_price, reorder_level, target_level, discontinued;
   Integer minimum_reorder_quantity; 

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupplier_ids() {
        return this.supplier_ids;
    }

    public void setSupplier_ids(String supplier_ids) {
        this.supplier_ids = supplier_ids;
    }

    public String getProduct_code() {
        return this.product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return this.product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity_per_unit() {
        return this.quantity_per_unit;
    }

    public void setQuantity_per_unit(String quantity_per_unit) {
        this.quantity_per_unit = quantity_per_unit;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAttachments() {
        return this.attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public int getStandard_cost() {
        return this.standard_cost;
    }

    public void setStandard_cost(int standard_cost) {
        this.standard_cost = standard_cost;
    }

    public int getList_price() {
        return this.list_price;
    }

    public void setList_price(int list_price) {
        this.list_price = list_price;
    }

    public int getReorder_level() {
        return this.reorder_level;
    }

    public void setReorder_level(int reorder_level) {
        this.reorder_level = reorder_level;
    }

    public int getTarget_level() {
        return this.target_level;
    }

    public void setTarget_level(int target_level) {
        this.target_level = target_level;
    }

    public int getDiscontinued() {
        return this.discontinued;
    }

    public void setDiscontinued(int discontinued) {
        this.discontinued = discontinued;
    }

    public int getMinimum_reorder_quantity() {
        return this.minimum_reorder_quantity;
    }

    public void setMinimum_reorder_quantity(int minimum_reorder_quantity) {
        this.minimum_reorder_quantity = minimum_reorder_quantity;
    }
}
