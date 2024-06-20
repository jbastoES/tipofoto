package net.electrosoftware.sigcom.ms.tipofoto.controlador;


import io.swagger.v3.oas.annotations.Operation;
import net.electrosoftware.sigcom.ms.tipofoto.modelo.Tipofoto;
import net.electrosoftware.sigcom.ms.tipofoto.repositorio.TipoFotoRepositorio;
import net.electrosoftware.sigcom.ms.tipofoto.servicio.TipoFotoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
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
    @Operation(summary = "EndPoint que retorna todos los tipoFoto existentes.")
    public List<Tipofoto> getAllTipoFotos() {
        return tipoFotoServicio.findAll();
    }

    @GetMapping("/{codtipofoto}")
    @Operation(summary = "EndPoint que retorna los datos de un tipoFoto por su llave o id.")
    public Optional<Tipofoto> getTipoFotoById(@PathVariable Long codtipofoto) {
        return tipoFotoServicio.findById(codtipofoto);
    }

    @PostMapping
    @Operation(summary = "EndPoint que permite registrar un tipoFoto.")
    public Tipofoto createTipoFoto(@RequestBody Tipofoto tipoFoto) {
        return tipoFotoServicio.save(tipoFoto);
    }

    @PutMapping("/{codtipofoto}")
    @Operation(summary = "EndPoint que permite actualizar un tipoFoto existente.")
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
    @Operation(summary = "EndPoint que elimina un tipoFoto por su id o llave.")
    public void deleteTipoFoto(@PathVariable Long codtipofoto) {
        tipoFotoServicio.deleteById(codtipofoto);
    }

    @GetMapping("/nombreTipoFoto/{codtipofoto}")
    @Operation(summary = "EndPoint que retorna el nombre de un tipoFoto por su código.")
    public List<String> getNombreByCodtipofoto(@PathVariable Long codtipofoto) {
        return tipoFotoServicio.findNombreByCodtipofoto(codtipofoto);
    }
}