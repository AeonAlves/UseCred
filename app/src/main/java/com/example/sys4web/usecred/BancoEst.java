package com.example.sys4web.usecred;

import java.io.Serializable;

/**
 * Created by SYS4WEB on 26/11/2017.
 */

public class BancoEst implements Serializable{

    private int EST_ID;
    private String CATEGORIA;
    private String EST_DESC ;
    private String EST_END;
    private String BAIRRO;
    private String CIDADE;
    private String UF;
    private String EST_CEP;
    private String EST_TEL1;
    private String EST_TEL2;

    public BancoEst(int id, String categoria, String estabelecimento, String endereco, String bairro, String cidade, String uf, String cep, String telefone_1, String telefone_2) {
        this.EST_ID = EST_ID;
        this.CATEGORIA = CATEGORIA;
        this.EST_DESC = EST_DESC;
        this.EST_END = EST_END;
        this.BAIRRO = BAIRRO;
        this.CIDADE = CIDADE;
        this.UF = UF;
        this.EST_CEP = EST_CEP;
        this.EST_TEL1 = EST_TEL1;
        this.EST_TEL2 = EST_TEL2;
    }

    public int getEST_ID() {
        return EST_ID;
    }

    public String getCATEGORIA() {
        return CATEGORIA;
    }

    public String getEST_DESC() {
        return EST_DESC;
    }

    public String getEST_END() {
        return EST_END;
    }

    public String getBAIRRO() {
        return BAIRRO;
    }

    public String getCIDADE() {
        return CIDADE;
    }

    public String getUF() {
        return UF;
    }

    public String getEST_CEP() {
        return EST_CEP;
    }

    public String getEST_TEL1() {
        return EST_TEL1;
    }

    public String getEST_TEL2() {
        return EST_TEL2;
    }


}
