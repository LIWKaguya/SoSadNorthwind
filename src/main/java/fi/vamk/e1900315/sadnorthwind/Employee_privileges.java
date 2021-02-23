package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee_privileges {
   @Id
   int employee_id;
   int privileges_id;

    public int getEmployee_id() {
        return this.employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getPrivileges_id() {
        return this.privileges_id;
    }

    public void setPrivileges_id(int privileges_id) {
        this.privileges_id = privileges_id;
    }

   

}
