package com.company.traslados.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Table(name = "TRASLADOS_PUERTOS")
@Entity(name = "traslados_Puertos")
@NamePattern("%s|name")
public class Puertos extends StandardEntity {
    private static final long serialVersionUID = -5168283111597496120L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true, length = 100)
    @NotBlank(message = "El nombre del puerto no puede quedar vacio")
    @NotEmpty(message = "El nombre del puerto no puede quedar vacio")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}