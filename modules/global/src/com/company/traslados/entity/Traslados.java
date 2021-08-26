package com.company.traslados.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "TRASLADOS")
@Entity(name = "traslados_Traslados")
public class Traslados extends StandardEntity {
    private static final long serialVersionUID = -8563111105676921716L;

    @Column(name = "FECHA", nullable = false)
    @NotNull(message = "La fecha /hora  no puede quedar vacia")
    private LocalDateTime fecha;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LANCHA_ID")
    private Lanchas lancha;

    @JoinColumn(name = "PUERTO")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    private Puertos puerto;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRACTICO_ID")
    private Practicos practico;

    @Column(name = "BUQUE", length = 50)
    @NotNull(message = "El nombre del Buque no puede quedar vacio")
    @Length(message = "El nombre del buque no puede ser menor a 3 ni mayor de 50 caracteres", min = 3, max = 50)
    private String buque;

    public String getBuque() {
        return buque;
    }

    public void setBuque(String buque) {
        this.buque = buque;
    }

    public void setPuerto(Puertos puerto) {
        this.puerto = puerto;
    }

    public Puertos getPuerto() {
        return puerto;
    }

    public Practicos getPractico() {
        return practico;
    }

    public void setPractico(Practicos practico) {
        this.practico = practico;
    }

    public Lanchas getLancha() {
        return lancha;
    }

    public void setLancha(Lanchas lancha) {
        this.lancha = lancha;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}