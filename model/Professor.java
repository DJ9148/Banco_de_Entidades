package org.banco_de_entidades.model;

public class Professor extends Pessoa {
    public String departamento;

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    @Override
    public String toString() {
        return "Professor [ ID: " + getId() + ", Nome: " + getNome() + ", Email: " + getEmail() + ", Departamento: " + departamento + " ]";
    }
}
