package com.company.traslados.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Table(name = "TRASLADOS_PRACTICOS")
@Entity(name = "traslados_Practicos")
@NamePattern("%s|name")
//@NamePattern("#getEmpresa|empresa,name")
public class Practicos extends StandardEntity {
    private static final long serialVersionUID = 768300054913182698L;

    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.DENY)

    /*
    @JoinColumn(name = "EMPRESA_ID", columnDefinition = "name")
    @ManyToOne(fetch = FetchType.LAZY)
    @Lookup(type = LookupType.SCREEN, actions = {})
    private
    Empresas empresa;
    */


    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EMPRESA_ID")
    private Empresas empresa;


    @Column(name = "NAME", unique = true)
    @NotEmpty(message = "El Nombre no puede quedar vacio")
    @NotBlank(message = "El nombre no puede quedar en blanco")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CELULAR")
    private String celular;

    public void setEmpresa(Empresas empresa) {
        this.empresa = empresa;
    }

    public Empresas getEmpresa() {
        return empresa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}