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
public class OrdenaMatricula extends Template {

    public OrdenaMatricula(String temp) {
        super(temp);
    }

    @Override
    public boolean ePrimeiro(Docentes doc1, Docentes doc2) {
        if (doc1.getMatricula().compareToIgnoreCase(doc2.getMatricula()) <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
