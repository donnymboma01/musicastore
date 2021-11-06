package be.henallux.java.website.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

    @NotNull
    @Min(value = 1)
    private Integer customer_id;

    @NotNull
    @Size(min = 10, max = 50)
    private String email;

    @NotNull
    @Size(min = 8, max = 50)
    private String password;

    @NotNull
    @Size(min = 5, max = 50)
    private String lastname;

    @NotNull
    @Size(min = 5, max = 50)
    private String firstname;

    @Max(value = 10)
    private String phone_number;

    @NotNull
    @Size(min = 5, max = 50)
    private String address;

    //-----At least one empty constructor---------------

    public Customer(Integer customer_id, String email,String password, String lastname,String firstname,String phone_number,String address){
        this.address = address;
        this.customer_id = customer_id;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone_number = phone_number;
        this.address = address;
    }
    public Customer(){}

    //-----------Getters----------
    public Integer getCustomer_id(){
        return this.customer_id;
    }
    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }
    public String getLastname(){
        return this.lastname;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public String getPhone_number(){
        return this.phone_number;
    }
    public String getAddress(){
        return this.address;
    }

    //----------------Setters-------
    public void setCustomer_id(Integer customer_id){
        this.customer_id = customer_id;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }
    public void setAddress(String address){
        this.address = address;
    }

}
