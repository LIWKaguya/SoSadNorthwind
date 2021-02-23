package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Purchase_order_status {
   @Id
  int id;
  String order_status;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrder_status() {
        return this.order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

}
