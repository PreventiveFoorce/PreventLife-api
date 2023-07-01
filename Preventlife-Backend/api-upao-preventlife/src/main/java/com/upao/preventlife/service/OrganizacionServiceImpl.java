package com.upao.preventlife.service;

import com.upao.preventlife.domain.Organizacion;
import com.upao.preventlife.repository.OrganizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizacionServiceImpl implements OrganizacionService {

    @Autowired
    private OrganizacionRepository organizacionRepository;

    @Override
    public Organizacion crearOrganizacion(Organizacion organizacion) {
        return organizacionRepository.save(organizacion);
    }

    @Override
    public List<Organizacion> listarOrganizaciones() {
        return organizacionRepository.findAll();
    }

    @Override
    public Organizacion obtenerOrganizacionPorId(Integer id) {
        return organizacionRepository.findById(id).orElse(null);
    }

    @Override
    public Organizacion actualizarOrganizacion(Integer id, Organizacion organizacion) {
        Organizacion organizacionExistente = obtenerOrganizacionPorId(id);
        if (organizacionExistente != null) {
            organizacionExistente.setNombreOrganizacion(organizacion.getNombreOrganizacion());
            organizacionExistente.setDescripcionOrganizacion(organizacion.getDescripcionOrganizacion());
            return organizacionRepository.save(organizacionExistente);
        }
        return null;
    }

    @Override
    public void eliminarOrganizacion(Integer id) {
        organizacionRepository.deleteById(id);
    }
}