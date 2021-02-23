package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Purchase_orders {
   @Id
   int id;
   int supplier_id, created_by, status_id, shipping_fee, taxes, payment_amount, approved_by, submitted_by;
   String submitted_date, creation_date, expected_date, payment_date, payment_method, notes, approved_date; 

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSupplier_id() {
        return this.supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public int getCreated_by() {
        return this.created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getStatus_id() {
        return this.status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public int getShipping_fee() {
        return this.shipping_fee;
    }

    public void setShipping_fee(int shipping_fee) {
        this.shipping_fee = shipping_fee;
    }

    public int getTaxes() {
        return this.taxes;
    }

    public void setTaxes(int taxes) {
        this.taxes = taxes;
    }

    public int getPayment_amount() {
        return this.payment_amount;
    }

    public void setPayment_amount(int payment_amount) {
        this.payment_amount = payment_amount;
    }

    public int getApproved_by() {
        return this.approved_by;
    }

    public void setApproved_by(int approved_by) {
        this.approved_by = approved_by;
    }

    public int getSubmitted_by() {
        return this.submitted_by;
    }

    public void setSubmitted_by(int submitted_by) {
        this.submitted_by = submitted_by;
    }

    public String getSubmitted_date() {
        return this.submitted_date;
    }

    public void setSubmitted_date(String submitted_date) {
        this.submitted_date = submitted_date;
    }

    public String getCreation_date() {
        return this.creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getExpected_date() {
        return this.expected_date;
    }

    public void setExpected_date(String expected_date) {
        this.expected_date = expected_date;
    }

    public String getPayment_date() {
        return this.payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public String getPayment_method() {
        return this.payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getApproved_date() {
        return this.approved_date;
    }

    public void setApproved_date(String approved_date) {
        this.approved_date = approved_date;
    }
}
