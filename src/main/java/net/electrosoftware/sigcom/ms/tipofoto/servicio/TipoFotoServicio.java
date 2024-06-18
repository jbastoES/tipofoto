package net.electrosoftware.sigcom.ms.tipofoto.servicio;

import jakarta.transaction.Transactional;
import net.electrosoftware.sigcom.ms.tipofoto.convertidor.TipoFotoConvertidor;
import net.electrosoftware.sigcom.ms.tipofoto.dto.TipoFotoDTO;
import net.electrosoftware.sigcom.ms.tipofoto.modelo.Tipofoto;
import net.electrosoftware.sigcom.ms.tipofoto.repositorio.TipoFotoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoFotoServicio {
    private final TipoFotoRepositorio tipoFotoRepositorio;

    @Autowired
    private TipoFotoConvertidor tipoFotoConvertidor;

    public TipoFotoServicio(TipoFotoRepositorio tipoFotoRepositorio) {
        this.tipoFotoRepositorio = tipoFotoRepositorio;
    }

    public List<Tipofoto> findAll() {
        return tipoFotoRepositorio.findAll();
    }

    public Optional<Tipofoto> findById(Long codtipofoto) {
        return tipoFotoRepositorio.findById(codtipofoto);
    }

    public Tipofoto save(Tipofoto tipoFoto) {
        return tipoFotoRepositorio.save(tipoFoto);
    }

    public void deleteById(Long codtipofoto) {
        tipoFotoRepositorio.deleteById(codtipofoto);
    }

    public List<Tipofoto> findByCodtipofoto(Long codtipofoto) {
        return tipoFotoRepositorio.findByCodtipofoto(codtipofoto);
    }
}