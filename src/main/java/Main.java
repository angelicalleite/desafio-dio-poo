import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = Curso.builder()
                .titulo("curso java")
                .descricao("descrição curso java")
                .cargaHoraria(8)
                .build();

        Curso curso2 = Curso.builder()
                .titulo("curso js")
                .descricao("descrição curso jsava")
                .cargaHoraria(4)
                .build();

        Mentoria mentoria = Mentoria.builder()
                .titulo("mentoria de java")
                .descricao("descrição mentoria java")
                .data(LocalDate.now())
                .build();

        Bootcamp bootcamp = Bootcamp.builder()
                .nome("Bootcamp Java Developer")
                .descricao("Descrição Bootcamp Java Developer")
                .build();

        bootcamp.getConteudos().addAll(Arrays.asList(curso1,curso2,mentoria));

        Dev devCamila = Dev.builder().nome("Camila").build();
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = Dev.builder().nome("Joao").build();
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
