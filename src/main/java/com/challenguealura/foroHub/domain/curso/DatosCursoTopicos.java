package com.challenguealura.foroHub.domain.curso;

import com.challenguealura.foroHub.domain.topico.DatosTopico;
import org.springframework.data.domain.Page;

public record DatosCursoTopicos(DatosCurso curso, Page<DatosTopico> topicos) {

}
