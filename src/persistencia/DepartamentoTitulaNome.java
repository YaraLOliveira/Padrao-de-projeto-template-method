/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;


import docentes.Docentes;

/**
 *
 * @author Yara
 */
public class DepartamentoTitulaNome extends Template {

    public DepartamentoTitulaNome(String temp) {
        super(temp);
    }

    @Override
    public boolean ePrimeiro(Docentes doc1, Docentes doc2) {
        Docentes concatena = doc1 = doc2;
        String c = concatena.getDepartamento() + concatena.getTitulacao() + concatena.getNome();
        if (c.compareToIgnoreCase(c) <= 0) {
            return true;
        } else {
            return false;
        }
    }

}
