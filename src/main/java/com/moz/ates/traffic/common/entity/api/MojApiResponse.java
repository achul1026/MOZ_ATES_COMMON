package com.moz.ates.traffic.common.entity.api;

import lombok.Data;

@Data
public class MojApiResponse {
    private String nome;						//이름
    private String datadenascimento;			//생일
    private String tipodedocumento;				//문서유형
    private String numerododocumento;			//문서번호
    private String domicilio;					//거주지
    private String provincia;					//주
    private String distrito;					//구역
    private String contacto;					//연락하다
}



