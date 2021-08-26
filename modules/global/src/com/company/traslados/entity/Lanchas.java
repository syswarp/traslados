package com.company.traslados.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Table(name = "TRASLADOS_LANCHAS")
@Entity(name = "traslados_Lanchas")
@NamePattern("%s|name")
public class Lanchas extends StandardEntity {
    private static final long serialVersionUID = 6286136577906498351L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true, length = 50)
    @Length(message = "El nombre no puede ser menor a 2 ni mayor a 50", min = 2, max = 50)
    @NotEmpty(message = "El nombre no puede quedar vacio")
    @NotBlank(message = "El nombre no puede quedar en blanco")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}