package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order_details_status {
   @Id
   int id;
   String status_name;
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStatus_name() {
        return this.status_name;
    }
    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }
}
