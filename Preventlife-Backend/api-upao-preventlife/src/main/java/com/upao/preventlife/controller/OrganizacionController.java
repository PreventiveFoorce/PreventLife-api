package com.upao.preventlife.controller;

import com.upao.preventlife.domain.Organizacion;
import com.upao.preventlife.service.OrganizacionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organizaciones")
public class OrganizacionController {

    @Autowired
    private OrganizacionService organizacionService;

    @PostMapping
    public ResponseEntity<Organizacion> crearOrganizacion(@Valid @RequestBody Organizacion organizacion) {
        Organizacion nuevaOrganizacion = organizacionService.crearOrganizacion(organizacion);
        return new ResponseEntity<>(nuevaOrganizacion, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Organizacion>> listarOrganizaciones() {
        List<Organizacion> organizaciones = organizacionService.listarOrganizaciones();
        return new ResponseEntity<>(organizaciones, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Organizacion> obtenerOrganizacionPorId(@PathVariable Integer id) {
        Organizacion organizacion = organizacionService.obtenerOrganizacionPorId(id);
        return new ResponseEntity<>(organizacion, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Organizacion> actualizarOrganizacion(@PathVariable Integer id, @Valid @RequestBody Organizacion organizacion) {
        Organizacion organizacionActualizada = organizacionService.actualizarOrganizacion(id, organizacion);
        return new ResponseEntity<>(organizacionActualizada, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarOrganizacion(@PathVariable Integer id) {
        organizacionService.eliminarOrganizacion(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}