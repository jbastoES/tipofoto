package net.electrosoftware.sigcom.ms.tipofoto.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * $table.getTableComment()
 */
@Data
@Entity
@Table(name = "SGC_TIPOFOTO")
@NoArgsConstructor
public class Tipofoto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODTIPOFOTO", nullable = false)
    private Long codtipofoto;

    @Column(name = "NOMBRETIPOFOTO")
    private String  nombretipofoto;

}