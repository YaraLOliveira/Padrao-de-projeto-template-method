/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docentes;

/**
 *
 * @author Yara
 */
public class Docentes {


    private String matricula;
    private String nome;
    private String departamento;
    private String titulacao;
    private String tipoContrato;
    private String cgDefinida;
    private String cgAtual;

    public Docentes(String matricula, String nome, String departamento, String titulacao, String tipoContrato, String cgDefinida, String cgAtual) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.titulacao = titulacao;
        this.tipoContrato = tipoContrato;
        this.cgDefinida = cgDefinida;
        this.cgAtual = cgAtual;
    }
    public Docentes(String str){
     String[] vetor = str.split(";");
        this.matricula = vetor[0];
        this.nome = vetor[1];
        this.departamento = vetor[2];
        this.titulacao = vetor[3];
        this.tipoContrato = vetor[4];
        this.cgDefinida = vetor [5];
        this.cgAtual = vetor [6];
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getCgDefinida() {
        return cgDefinida;
    }

    public void setCgDefinida(String cgDefinida) {
        this.cgDefinida = cgDefinida;
    }

    public String getCgAtual() {
        return cgAtual;
    }

    public void setCgAtual(String cgAtual) {
        this.cgAtual = cgAtual;
    }
}
