package com.company.traslados.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Table(name = "TRASLADOS_TRIPULACION")
@Entity(name = "traslados_Tripulacion")
@NamePattern("%s|name")
public class Tripulacion extends StandardEntity {
    private static final long serialVersionUID = 8185469596845042343L;

    @Column(name = "NAME", unique = true, length = 100)
    @NotBlank(message = "El campo no puede quedar vacio")
    @NotEmpty(message = "El campo no puede quedar vacio")
    private String name;

    @Column(name = "CARGO", length = 50)
    @NotEmpty(message = "El Cargo no puede quedar vacio")
    @NotBlank(message = "El cargo no puede quedar en blanco")
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}