package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order_tax_status {
   @Id
   int id;
   String tax_status_name;
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTax_status_name() {
        return this.tax_status_name;
    }
    public void setTax_status_name(String tax_status_name) {
        this.tax_status_name = tax_status_name;
    }


   

}
