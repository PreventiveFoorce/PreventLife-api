package com.upao.preventlife.service;
import com.upao.preventlife.domain.Rol;
import com.upao.preventlife.repository.RolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;

    public RolServiceImpl(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public Rol crearRol(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public Rol modificarRol(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public void eliminarRol(Integer idRol) {
        rolRepository.deleteById(idRol);
    }

    @Override
    public List<Rol> listarRol() {
        return rolRepository.findAll();
    }

    @Override
    public Rol obtenerRolPorIdRol(Integer idRol) {
        return rolRepository.findById(idRol).orElse(new Rol());
    }

}