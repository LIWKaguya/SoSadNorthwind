package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Privileges {
   @Id
   int id;
   String privilege_name;
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPrivilege_name() {
        return this.privilege_name;
    }
    public void setPrivilege_name(String privilege_name) {
        this.privilege_name = privilege_name;
    }

}
