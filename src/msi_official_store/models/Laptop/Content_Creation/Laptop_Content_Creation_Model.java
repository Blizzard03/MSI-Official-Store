/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package msi_official_store.models.Laptop.Content_Creation;

/**
 *
 * @author mariq
 */
public class Laptop_Content_Creation_Model {

   private String Name, CPU, GPU;
    private Double Price;

    public String getName() {
        return Name;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public Double getPrice() {
        return Price;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }
    
    

}
