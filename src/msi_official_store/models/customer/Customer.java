/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package msi_official_store.models.customer;

/**
 *
 * @author mariq
 */
public class Customer {
    private String Name,Address;
    private Double Total_Price;
    private boolean Member;

    
    //Getter Name
    public String getName() {
        return Name;
    }

    //Setter Name
    public void setName(String Name) {
        this.Name = Name;
    }

    //Getter Addrress
    public String getAddress() {
        return Address;
    }

    //Setter Adress
    public void setAddress(String Address) {
        this.Address = Address;
    }

    //Getter Total Price
    public Double getTotal_Price() {
        return Total_Price;
    }

    //Setter Total Price
    public void setTotal_Price(Double Total_Price) {
        this.Total_Price = Total_Price;
    }

    //Getter Member
    public boolean isMember() {
        return Member;
    }

    //Setter Member
    public void setMember(boolean Member) {
        this.Member = Member;
    }
    
    
    
    
}
