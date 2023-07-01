package com.upao.preventlife.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @NotNull
    @Column(name = "nombre_usuario", nullable = false)
    private String nombreUsuario;

    @NotNull
    @Column(name = "contrasena_usuario", nullable = false, length = 25)
    private String contrasenaUsuario;

    @NotNull
    @Column(name = "correo_usuario", nullable = false, unique = true)
    private String correoUsuario;

    @Column(name = "direccion_usuario", length = 100)
    private String direccionUsuario;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false,
            foreignKey = @ForeignKey(name = "FK_id_rol"))

    private Rol rol;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
