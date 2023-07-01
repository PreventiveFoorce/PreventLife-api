package com.upao.preventlife.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "organizaciones")
public class Organizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrganizacion;

    @Column(name = "nombre_organizacion", nullable = false)
    private String nombreOrganizacion;

    @Column(name = "descripcion_organizacion", nullable = false)
    private String descripcionOrganizacion;

    @Column(name = "saldo_recaudado")
    private Float saldoRecaudado;

    public Organizacion() {
    }

    public Integer getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(Integer idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    public String getNombreOrganizacion() {
        return nombreOrganizacion;
    }

    public void setNombreOrganizacion(String nombreOrganizacion) {
        this.nombreOrganizacion = nombreOrganizacion;
    }

    public String getDescripcionOrganizacion() {
        return descripcionOrganizacion;
    }

    public void setDescripcionOrganizacion(String descripcionOrganizacion) {
        this.descripcionOrganizacion = descripcionOrganizacion;
    }

    public Float getSaldoRecaudado() {
        return saldoRecaudado;
    }

    public void setSaldoRecaudado(Float saldoRecaudado) {
        this.saldoRecaudado = saldoRecaudado;
    }
}
