import controller.ProfessorController;
import model.Professor;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProfessorController professorController = new ProfessorController();
        Professor p = new Professor();

        System.out.println("Digite o nome do professor");
        p.setNome(Scanner.next());
        System.out.println("Digite a idade do professor");
        p.setIdade(Scanner.nextInt());
        System.out.println("Digite a especializacao do professor");
        p.setEspecializacao(Scanner.next());



    }
}
