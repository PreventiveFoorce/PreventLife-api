package com.upao.preventlife.service;

import com.upao.preventlife.domain.Organizacion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrganizacionService {

    // Crear una nueva organización
    Organizacion crearOrganizacion(Organizacion organizacion);

    // Listar todas las organizaciones
    List<Organizacion> listarOrganizaciones();

    // Obtener una organización por su id
    Organizacion obtenerOrganizacionPorId(Integer id);

    // Actualizar una organización por su id
    Organizacion actualizarOrganizacion(Integer id, Organizacion organizacion);

    // Eliminar una organización por su id
    void eliminarOrganizacion(Integer id);
}