import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Personagem heroi = new Personagem("Patolino", 20, 100, 70, 100, 1.80, "Mago");
        Personagem monstro = new Personagem("PernaLonga", 50, 150, 80, 500, 3.0, "Ogro");

        System.out.println("----------------------- HERÓI --------------------------------");
        System.out.println(heroi.nome);
        System.out.println(heroi.vida);
        System.out.println(heroi.classePersonagem);
        System.out.println("----------------------- MONSTRO --------------------------------");
        System.out.println(monstro.nome);
        System.out.println(monstro.vida);
        System.out.println(monstro.classePersonagem);
        System.out.println("----------------------------------------------------------------");
    }

}