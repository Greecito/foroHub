package com.challenguealura.foroHub.domain.topico;

import com.challenguealura.foroHub.domain.topico.respuesta.DatosRespuesta;
import org.springframework.data.domain.Page;

public record DatosTopicoRespuestas(DatosTopico topico, Page<DatosRespuesta> respuestas) {
}
