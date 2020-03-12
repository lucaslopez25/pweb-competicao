/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 *
 * @author Aluno
 */
public class Competicao {
    private List<Nadador> nadadores;
    private int iCont = 0;
    String tempId;
    String tempNome;
    float tempTempo;
    
    public Competicao() {
        nadadores = new ArrayList<Nadador>();
    }
    
    public void addNadador (Nadador novo) {
        iCont++; //conta a partir de 1
        if (iCont <= 7) {
            nadadores.add(novo);
        }
    }
    
    public String getNadadorMaisRapido () {
        /** 
         Retorna a ID do nadador mais rapido
         **/
        Nadador maisRapido = null;
        float iTempo = nadadores.get(0).getTempo();
        for (Nadador n : this.nadadores) {
            if (n.getTempo() <= iTempo) {
                iTempo = n.getTempo();
                maisRapido = n;
            }
        }
        
        if (maisRapido != null) return maisRapido.getNome();
        else return "";
    }
            
    public String getNadadorMaisLento () {
        /** 
         Retorna a ID do nadador mais lento
         **/
        Nadador maisLento = null;
        float iTempo = nadadores.get(0).getTempo();
        for (Nadador n : this.nadadores) {
            if (n.getTempo() >= iTempo) {
                iTempo = n.getTempo();
                maisLento = n;
            }
        }
        
        if (maisLento != null) return maisLento.getNome();
        else return "";
    }
    
    public String getTempoMedio () {
        float media = 0;
        for (Nadador n : this.nadadores) {
            media += n.getTempo();
        }
        
        media /= this.nadadores.size();
        
        return "Tempo medio eh " + media;
    }
    
}
