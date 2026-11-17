package com.banco.asincronico.auth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    private String idUsuario;
    private String nombre;
    private String correo;
    private String pass;
    private String telefono;
    private Integer edad;
    private Double saldo;

}
