package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
   @Id
   int id;
   int customer_id, employee_id;
   String order_date, shipped_date, shipper_id, ship_name, ship_address, ship_city, ship_state_province, ship_zip_postal_code;
   String ship_country_region;
   int shipping_fee, taxes;
   String payment_type, paid_date, notes;
   double tax_rate;
   Integer tax_status_id, status_id; 

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return this.customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getEmployee_id() {
        return this.employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getOrder_date() {
        return this.order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getShipped_date() {
        return this.shipped_date;
    }

    public void setShipped_date(String shipped_date) {
        this.shipped_date = shipped_date;
    }

    public String getShipper_id() {
        return this.shipper_id;
    }

    public void setShipper_id(String shipper_id) {
        this.shipper_id = shipper_id;
    }

    public String getShip_name() {
        return this.ship_name;
    }

    public void setShip_name(String ship_name) {
        this.ship_name = ship_name;
    }

    public String getShip_address() {
        return this.ship_address;
    }

    public void setShip_address(String ship_address) {
        this.ship_address = ship_address;
    }

    public String getShip_city() {
        return this.ship_city;
    }

    public void setShip_city(String ship_city) {
        this.ship_city = ship_city;
    }

    public String getShip_state_province() {
        return this.ship_state_province;
    }

    public void setShip_state_province(String ship_state_province) {
        this.ship_state_province = ship_state_province;
    }

    public String getShip_zip_postal_code() {
        return this.ship_zip_postal_code;
    }

    public void setShip_zip_postal_code(String ship_zip_postal_code) {
        this.ship_zip_postal_code = ship_zip_postal_code;
    }

    public String getShip_country_region() {
        return this.ship_country_region;
    }

    public void setShip_country_region(String ship_country_region) {
        this.ship_country_region = ship_country_region;
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

    public String getPayment_type() {
        return this.payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getPaid_date() {
        return this.paid_date;
    }

    public void setPaid_date(String paid_date) {
        this.paid_date = paid_date;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public double getTax_rate() {
        return this.tax_rate;
    }

    public void setTax_rate(double tax_rate) {
        this.tax_rate = tax_rate;
    }

    public int getTax_status_id() {
        return this.tax_status_id;
    }

    public void setTax_status_id(int tax_status_id) {
        this.tax_status_id = tax_status_id;
    }

    public int getStatus_id() {
        return this.status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

}
