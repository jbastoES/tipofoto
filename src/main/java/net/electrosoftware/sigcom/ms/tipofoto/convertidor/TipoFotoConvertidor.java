package net.electrosoftware.sigcom.ms.tipofoto.convertidor;

import net.electrosoftware.sigcom.ms.tipofoto.dto.TipoFotoDTO;
import net.electrosoftware.sigcom.ms.tipofoto.modelo.Tipofoto;
import net.electrosoftware.sigcom.ms.tipofoto.repositorio.TipoFotoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TipoFotoConvertidor implements Converter<TipoFotoDTO, Tipofoto> {

    @Autowired
    private TipoFotoRepositorio tipoFotoRepositorio;

    @Override
    public Tipofoto convert(TipoFotoDTO tipoFotoDTO) {
        Tipofoto tipofoto = new Tipofoto();
        tipofoto.setCodtipofoto(tipoFotoDTO.getCodtipofoto());
        tipofoto.setNombretipofoto(tipoFotoDTO.getNombretipofoto());
        return tipofoto;
    }

    public TipoFotoDTO reverse(Tipofoto tipofoto) {
        TipoFotoDTO tipoFotoDTO = new TipoFotoDTO();
        tipoFotoDTO.setCodtipofoto(tipofoto.getCodtipofoto());
        tipoFotoDTO.setNombretipofoto(tipofoto.getNombretipofoto());
        return tipoFotoDTO;
    }

}