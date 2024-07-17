package com.challenguealura.foroHub.domain.topico.respuesta.validaciones;

import com.challenguealura.foroHub.domain.topico.respuesta.DatosCrearRespuesta;
import com.challenguealura.foroHub.domain.usuario.UsuarioRepository;
import com.challenguealura.foroHub.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutorValido implements ValidadorRespuesta {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.idAutor() == null || !usuarioRepository.existsById(datos.idAutor())) {
            throw new ValidacionDeIntegridad("Autor no encontrado");
        }
    }
}
