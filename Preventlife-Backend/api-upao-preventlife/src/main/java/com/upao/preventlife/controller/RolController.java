package com.upao.preventlife.controller;

import com.upao.preventlife.WrapperResponse;
import com.upao.preventlife.domain.Rol;
import com.upao.preventlife.service.RolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolController {

    private final RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @PostMapping
    public ResponseEntity<WrapperResponse<Rol>> crearRol(@RequestBody Rol rol) {
        Rol rolNew = rolService.crearRol(rol);
        return new WrapperResponse<>(true, "success", rolNew).createResponse();
    }

    @PutMapping
    public ResponseEntity<WrapperResponse<Rol>> modificarCompuesto(@RequestBody Rol rol) {
        Rol rolUpdate = rolService.modificarRol(rol);
        return new WrapperResponse<>(true, "success", rolUpdate).createResponse();
    }

    @DeleteMapping("/{idRol}")
    public ResponseEntity<WrapperResponse<Void>> eliminarCompuesto(@PathVariable("idRol") Integer idRol) {
        rolService.eliminarRol(idRol);
        return new WrapperResponse<Void>(true, "success", null).createResponse(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{idRol}")
    public ResponseEntity<WrapperResponse<Rol>> obtenerRolPorIdRol(@PathVariable("idRol") Integer idRol) {
        Rol rol = rolService.obtenerRolPorIdRol(idRol);
        return new WrapperResponse<>(true, "success", rol).createResponse();
    }

    @GetMapping
    public ResponseEntity<WrapperResponse<List<Rol>>> listarRol() {
        List<Rol> roles = rolService.listarRol();
        return new WrapperResponse<>(true, "success", roles).createResponse();
    }
}



