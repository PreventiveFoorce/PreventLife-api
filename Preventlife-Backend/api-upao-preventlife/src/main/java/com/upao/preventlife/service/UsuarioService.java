package com.upao.preventlife.service;

import com.upao.preventlife.domain.Usuario;
import java.util.List;

public interface UsuarioService {

    Usuario crearUsuario(Usuario usuario);
    Usuario modificarUsuario(Usuario usuario);
    void eliminarUsuario(Integer idUsuario);
    List<Usuario> listarUsuario();
    Usuario obtenerUsuarioPorIdUsuario(Integer idUsuario);
    Usuario fetchUserByCorreoyContra(String correoUsuario, String contrasenaUsuario);

}

