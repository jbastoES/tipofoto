package net.electrosoftware.sigcom.ms.tipofoto.controlador;


import net.electrosoftware.sigcom.ms.tipofoto.modelo.Tipofoto;
import net.electrosoftware.sigcom.ms.tipofoto.repositorio.TipoFotoRepositorio;
import net.electrosoftware.sigcom.ms.tipofoto.servicio.TipoFotoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/tipoFoto")
public class TipoFotoControlador {

    @Autowired
    private TipoFotoServicio tipoFotoServicio;

    @Autowired
    private TipoFotoRepositorio tipoFotoRepositorio;

    @GetMapping
    public List<Tipofoto> getAllTipoFotos() {
        return tipoFotoServicio.findAll();
    }

    @GetMapping("/{codtipofoto}")
    public Optional<Tipofoto> getTipoFotoById(@PathVariable Long codtipofoto) {
        return tipoFotoServicio.findById(codtipofoto);
    }

    @PostMapping
    public Tipofoto createTipoFoto(@RequestBody Tipofoto tipoFoto) {
        return tipoFotoServicio.save(tipoFoto);
    }

    @PutMapping("/{codtipofoto}")
    public Tipofoto updateTipoFoto(@PathVariable Long codtipofoto, @PathVariable String nombretipofoto, @RequestBody Tipofoto tipoFoto) {
        if (tipoFotoServicio.findById(codtipofoto).isPresent()) {
            tipoFoto.setCodtipofoto(codtipofoto);
            tipoFoto.setNombretipofoto(nombretipofoto);
            return tipoFotoServicio.save(tipoFoto);
        } else {
            throw new RuntimeException("TipoFoto no encontrado");
        }
    }

    @DeleteMapping("/{codtipofoto}")
    public void deleteTipoFoto(@PathVariable Long codtipofoto) {
        tipoFotoServicio.deleteById(codtipofoto);
    }
}