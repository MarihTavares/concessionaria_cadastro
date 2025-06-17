package main.models;

public class Client {

    private String name;
    private String cpf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void personalFile(){
        System.out.println("""
                Nome: %s,
                CPF: %s,
                Veículo
                """.formatted(getName(), getCpf()));
    }
}
