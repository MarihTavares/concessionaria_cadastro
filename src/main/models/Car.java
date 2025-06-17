package main.models;

import main.functions.TechnicalSheet;

public class Car extends Vehicle implements TechnicalSheet {

    private String fuel; // Tipo de combustível

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public void showSheet(){
        System.out.printf("""
                Modelo: %s,
                Marca: %s,
                Ano: %d,
                Preço: %.2f
                Está disponível: %s,
                Tipo de combustível: %s,
                %n""", getModel(), getBrand(), getYear(), getPrice(), getAvailable() ? "Sim" : "Não", getFuel());
    }
}
