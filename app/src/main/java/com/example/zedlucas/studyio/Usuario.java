package com.example.zedlucas.studyio;


public class Usuario {

    private String id;
    private String nome;
    private String login;
    private String senha;
    private int notificações = 0;
    private boolean aluno;
    private boolean professor;
    private boolean admim;


    public Usuario(String id,String nome, String login, String senha){
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNotificações() {
        return notificações;
    }

    public void setNotificações(int notificações) {
        this.notificações = notificações;
    }

    public boolean isAluno() {
        return aluno;
    }

    public void setAluno(boolean aluno) {
        this.aluno = aluno;
    }

    public boolean isProfessor() {
        return professor;
    }

    public void setProfessor(boolean professor) {
        this.professor = professor;
    }

    public boolean isAdmim() {
        return admim;
    }

    public void setAdmim(boolean admim) {
        this.admim = admim;
    }
}

