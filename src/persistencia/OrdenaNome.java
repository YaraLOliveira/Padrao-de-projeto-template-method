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
public class OrdenaNome extends Template {

    public OrdenaNome(String temp) {
        super(temp);
    }

    @Override
    public boolean ePrimeiro(Docentes doc1, Docentes doc2) {
        if (doc1.getNome().compareToIgnoreCase(doc2.getNome()) <= 0) {
            return true;
        } else {
            return false;
        }
    }

}
