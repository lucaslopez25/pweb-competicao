/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aluno
 */
public class Nadador {
    private String nome;
    private float tempo;
    
    public Nadador () {
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setTempo(float segundos) {
        this.tempo = segundos;
    }
    
    public void setTempo(String segundos) {
        this.tempo = (float) Float.parseFloat(segundos);
    }
    
    public float getTempo() {
        return this.tempo;
    }
    
    public String getNome() {
        return this.nome;
    }

}
