package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventory_transaction_types {
   @Id
   int id;
   int type_name;
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getType_name() {
        return this.type_name;
    }
    public void setType_name(int type_name) {
        this.type_name = type_name;
    }
}
