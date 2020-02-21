/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import docentes.Docentes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author Yara Sereia do Cerrado
 */
public abstract class Template {

    private String temp;

    public Template(String temp) {
        temp = temp;
    }

    public abstract boolean ePrimeiro( Docentes doc1, Docentes doc2);

    public Iterator<Docentes> listagem() throws Exception {
        try {
            ArrayList<Docentes> array = new ArrayList<Docentes>();
            FileReader fr = new FileReader(temp);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while((linha=br.readLine())!=null){
                Docentes aux = new Docentes(linha);
                array.add(aux);
                pos++;
            }
            br.close();

            for (int i = 0; i < array.size(); i++) {
                for (int j = i; j < array.size(); j++) {

                    if (!ePrimeiro(array.get(i), array.get(j))) {
                        Docentes temp = array.get(j);
                        array.set(j, array.get(i));
                        array.set(i, temp);
                    }
                }
            }
            return array.iterator();
        } catch (Exception erro) {
            throw erro;
        }
    }

}
