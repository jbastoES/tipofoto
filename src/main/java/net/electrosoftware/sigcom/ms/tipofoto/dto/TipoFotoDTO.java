package net.electrosoftware.sigcom.ms.tipofoto.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Data
@NoArgsConstructor
public class TipoFotoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long codtipofoto;
    private String nombretipofoto;
}
