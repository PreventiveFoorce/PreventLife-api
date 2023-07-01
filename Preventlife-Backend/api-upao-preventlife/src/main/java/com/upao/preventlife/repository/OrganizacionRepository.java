package com.upao.preventlife.repository;

import com.upao.preventlife.domain.Organizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizacionRepository extends JpaRepository<Organizacion, Integer> {

    // Buscar organizaciones por nombre que contenga una palabra clave
    List<Organizacion> findByNombreOrganizacionContaining(String keyword);

    // Buscar organizaciones por descripción que contenga una palabra clave
    List<Organizacion> findByDescripcionOrganizacionContaining(String keyword);

    // Buscar organizaciones por nombre o descripción que contenga una palabra clave
    @Query("SELECT o FROM Organizacion o WHERE o.nombreOrganizacion LIKE %:keyword% OR o.descripcionOrganizacion LIKE %:keyword%")
    List<Organizacion> findByNombreOrDescripcionContaining(String keyword);
}

