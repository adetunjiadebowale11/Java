/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author Adebowale
 */
public class Car {
    private String ownerFirstName;
    private String ownerSurName;
    private String carName;
    private String carModel;

    /**
     * @return the ownerFirstName
     */
    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    /**
     * @param ownerFirstName the ownerFirstName to set
     */
    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    /**
     * @return the ownerSurName
     */
    public String getOwnerSurName() {
        return ownerSurName;
    }

    /**
     * @param ownerSurName the ownerSurName to set
     */
    public void setOwnerSurName(String ownerSurName) {
        this.ownerSurName = ownerSurName;
    }

    /**
     * @return the carName
     */
    public String getCarName() {
        return carName;
    }

    /**
     * @param carName the carName to set
     */
    public void setCarName(String carName) {
        this.carName = carName;
    }

    /**
     * @return the carModel
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * @param carModel the carModel to set
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void printPropertiesOfCar(){
        
        System.out.printf("%s with Model- %s belongs to %s,%s\n",getCarName(),getCarModel(),getOwnerFirstName(),getOwnerSurName());
    }
    
    
    public static void main(String[] args){
        
        Car myCar = new Car();
        myCar.setCarName("Benz");
        myCar.setCarModel("X-class");
        myCar.setOwnerFirstName("Debo");
        myCar.setOwnerSurName("Tunji");
        
        myCar.printPropertiesOfCar();
        
    }
}
