package com.ecomerce.zhad.dto;

import lombok.Getter;
import lombok.Setter;

/*
 *  ResponseApiDto  Clase encargada de enmascarar el response 
 * de los microservicios
 *  @author John Jairo Arteaga Sanchez
 *  @fecha 31/07/2022
 *  Derechos reservados por Zhad
 * 
 * MODIFICACIONES A LA CLASE
 * @fecha
 * @author
 * @cambios
 */

@Getter
@Setter
public class ResponseApiDto {
    private int codeResponse;
    private String codeName;
    private Object data;
}
