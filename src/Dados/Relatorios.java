/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.Date;

/**
 *
 * @author Victor
 */
public class Relatorios {
    private String tituloRelatorio;
    private Date dtGeracaoRelatorio;
 
    
    public String getTituloRelatorio() {
        return tituloRelatorio;
    }


    public void setTituloRelatorio(String tituloRelatorio) {
        this.tituloRelatorio = tituloRelatorio;
    }

    public Date getDtGeracaoRelatorio() {
        return dtGeracaoRelatorio;
    }


    public void setDtGeracaoRelatorio(Date dtGeracaoRelatorio) {
        this.dtGeracaoRelatorio = dtGeracaoRelatorio;
    }
}
