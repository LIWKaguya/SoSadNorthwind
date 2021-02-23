package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Strings {
   @Id
   int string_id;
   String string_data;

    public int getString_id() {
        return this.string_id;
    }

    public void setString_id(int string_id) {
        this.string_id = string_id;
    }

    public String getString_data() {
        return this.string_data;
    }

    public void setString_data(String string_data) {
        this.string_data = string_data;
    }
   
}
