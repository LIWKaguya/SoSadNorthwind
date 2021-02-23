package fi.vamk.e1900315.sadnorthwind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Suppliers {
   @Id
   int id;
   String company, first_name, last_name,  email_adress, job_title, business_phone, home_phone, mobile_phone;
   String fax_number, address, city, state_province, zip_postal_code, country_region, web_page, notes, attachments;
   public int getId() {
        return this.id;
   }
    public void setId(int id) {
        this.id = id;
    }
    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail_adress() {
        return this.email_adress;
    }

    public void setEmail_adress(String email_adress) {
        this.email_adress = email_adress;
    }

    public String getJob_title() {
        return this.job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getBusiness_phone() {
        return this.business_phone;
    }

    public void setBusiness_phone(String business_phone) {
        this.business_phone = business_phone;
    }

    public String getHome_phone() {
        return this.home_phone;
    }

    public void setHome_phone(String home_phone) {
        this.home_phone = home_phone;
    }

    public String getMobile_phone() {
        return this.mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getFax_number() {
        return this.fax_number;
    }

    public void setFax_number(String fax_number) {
        this.fax_number = fax_number;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState_province() {
        return this.state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public String getZip_postal_code() {
        return this.zip_postal_code;
    }

    public void setZip_postal_code(String zip_postal_code) {
        this.zip_postal_code = zip_postal_code;
    }

    public String getCountry_region() {
        return this.country_region;
    }

    public void setCountry_region(String country_region) {
        this.country_region = country_region;
    }

    public String getWeb_page() {
        return this.web_page;
    }

    public void setWeb_page(String web_page) {
        this.web_page = web_page;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAttachments() {
        return this.attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

}
