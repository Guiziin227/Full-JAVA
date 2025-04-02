package aula01_interfaces.model.entities;

public class Vehicles {
    private String model;

    public Vehicles(){

    }

    public Vehicles(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
