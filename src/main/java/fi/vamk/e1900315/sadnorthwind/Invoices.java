package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Invoices {
   @Id
   int id;
   int order_id, tax, shipping, amount_due;
   String invoice_date, due_date; 

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

    public int getTax() {
        return this.tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getShipping() {
        return this.shipping;
    }

    public void setShipping(int shipping) {
        this.shipping = shipping;
    }

    public int getAmount_due() {
        return this.amount_due;
    }

    public void setAmount_due(int amount_due) {
        this.amount_due = amount_due;
    }

    public String getInvoice_date() {
        return this.invoice_date;
    }

    public void setInvoice_date(String invoice_date) {
        this.invoice_date = invoice_date;
    }

    public String getDue_date() {
        return this.due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

}
