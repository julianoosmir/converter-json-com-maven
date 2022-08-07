package com.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class frameOne {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            FileReader fr = new FileReader("./src/main/resources/test.json");
            Scanner entrada = new Scanner(fr);
            String ler = entrada.next().lines().reduce("",String::concat);
            ClasseA a = objectMapper.readValue(ler, ClasseA.class);

            System.out.println(a.nome);
            a.classes.forEach(b -> System.out.println(b.nome));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }   
}
touch
class ClasseA {
    String nome;
    List<ClasseB> classes;

    public ClasseA(String nome, List<ClasseB> classes) {
        this.nome = nome;
        this.classes = classes;
    }

    public ClasseA() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ClasseB> getClasses() {
        return classes;
    }

    public void setClasses(List<ClasseB> classes) {
        this.classes = classes;
    }
}

class ClasseB {
    String nome;

    public ClasseB(String nome) {
        this.nome = nome;
    }

    public ClasseB() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}