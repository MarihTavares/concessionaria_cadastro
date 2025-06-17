package main.models;

import main.functions.TechnicalSheet;

public class Motorcycle extends Vehicle implements TechnicalSheet {
    private double engineCapacity; //Potência do motor

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void showSheet(){
        System.out.printf("""
                Modelo: %s,
                Marca: %s,
                Ano: %d,
                Preço: %.2f,
                Está disponível: %s,
                Potência do motor: %.2f
                """, getModel(), getBrand(), getYear(), getPrice(), getAvailable() ? "Sim" : "Não", getEngineCapacity());
    }
}
