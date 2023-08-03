package com.example;

import java.util.ArrayList;
import java.util.Comparator;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    //textField e TextArea são objetos/classes
    @FXML TextArea txtAlunos;
    @FXML TextField txtNome;

    //collections em java - ArrayList
    // <String> - generics
    //inner class x class
    //(classe com metodos de uso interno usaria ele aqui dentro)
    private ArrayList<String> nomes = new ArrayList<>();

    public void adicionarAluno(){
        nomes.add(txtNome.getText());
        //txtAlunos.appendText(txtNome.getText() + "\n");
        txtNome.clear();

        atualizarAluno();
    }

    public void atualizarAluno(){
        nomes.sort(  //lambda expression (metodo arrow function)
            (o1, o2) -> o1.compareToIgnoreCase(o2)
            
        //utilizar metodos de comparator (forçando erro)
        //esse método virou método anônimo
        ///new Comparator<String>() {
        // @Override
        // public int compare(String o1, String o2){
        //      return o1.compareToIgnoreCase(o2);
        //    }}
        );


        txtAlunos.clear();  //limpa o quadro de alunos
        for (String aluno : nomes){               //forEach do java
            txtAlunos.appendText(aluno + "\n");
        }
    }
}
