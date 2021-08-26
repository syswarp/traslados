package com.company.traslados.entity;

import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Table(name = "TRASLADOS_EMPRESAS")
@Entity(name = "traslados_Empresas")
public class Empresas extends StandardEntity {
    private static final long serialVersionUID = 5997397764802225051L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    @Length(message = "La Razon Social no cumple con los umbrales establecidos (Minmo 3 - Maximo 255)", min = 3, max = 255)
    @NotEmpty(message = "La Razon Social no puede quedar vacia.")
    private String name;

    @NotNull
    @Column(name = "DOMICILIO", nullable = false)
    private String domicilio;

    @NumberFormat(pattern = "99999999999", decimalSeparator = "0", groupingSeparator = "0")
    @NotNull
    @Column(name = "CUIT", nullable = false)
    private Long cuit;

    @Column(name = "TELEFONO", length = 50)
    private String telefono;

    @Column(name = "EMAIL", length = 100)
    @Email(message = "email invalido")
    private String email;

    @Column(name = "LOGO")
    private byte[] logo;

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}