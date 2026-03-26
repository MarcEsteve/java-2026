package com.akkodis.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity  // Indica que es una entidad JPA mapeada a una tabla
@Table(name = "empleado")  // opcional: nombre de la tabla si difiere
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // id autogenerado (auto_increment)
    private int id;
    
    private String nombre;
    private String departamento;
    private double salario;
    
    // Constructores, getters y setters...
    public Empleado() {}
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }
  
}
