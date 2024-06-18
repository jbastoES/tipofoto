package net.electrosoftware.sigcom.ms.tipofoto.repositorio;

import net.electrosoftware.sigcom.ms.tipofoto.modelo.Tipofoto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface TipoFotoRepositorio extends JpaRepository<Tipofoto, Long >, JpaSpecificationExecutor<Tipofoto> {
    Page<Tipofoto> findAll(Pageable pageable);

    List<Tipofoto> findByCodtipofoto(Long codtipofoto);


    //@Query("SELECT MAX(t.CODTIPOFOTO) FROM SGC_TIPOFOTO t")
    //Long  findMaxCodigoTipoFoto();

    //@Query("SELECT s FROM SGC_TIPOFOTO s WHERE s.CODTIPOFOTO = :codtipofoto")
    //List<Tipofoto> findBycodtipofoto(double codtipofoto);

}