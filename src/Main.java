import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBob = new Dev();
        devBob.setNome("Bob");
        devBob.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bob" + devBob.getConteudosInscritos());
        devBob.progredir();
        devBob.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bob" + devBob.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bob" + devBob.getConteudosConcluidos());
        System.out.println("XP: " + devBob.calcularTotalXp());

        System.out.println("---------");

        Dev devBelle = new Dev();
        devBelle.setNome("Belle");
        devBelle.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Belle" + devBelle.getConteudosInscritos());
        devBelle.progredir();
        devBelle.progredir();
        devBelle.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Belle" + devBelle.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Belle" + devBelle.getConteudosConcluidos());
        System.out.println("XP: " + devBelle.calcularTotalXp());



    }
}