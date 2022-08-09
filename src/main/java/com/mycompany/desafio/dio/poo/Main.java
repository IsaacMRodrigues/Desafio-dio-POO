
package com.mycompany.desafio.dio.poo;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

/**
 *
 * @author isaac
 */
public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
        
        curso.setTitulo("Bootcamp");
        curso.setDescricao("curso de spring");
        curso.setCargaHoraria(8);
 
        
        
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("ela mesma");
        mentoria.setData(LocalDate.now());
 
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java POO");
        bootcamp.setDescricao("Descrição teste123");
        bootcamp.getConteudos()
                .add(curso);
        bootcamp.getConteudos()
                .add(mentoria);
        
        Dev dev = new Dev();
        dev.setNome("Isaac");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + dev.getConteudosInscritos());
        System.out.println("--------------");
        dev.progredir();
        
        
        System.out.println("Conteudos Inscritos" + dev.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + dev.getConteudosConcluidos());
        
    }
}
