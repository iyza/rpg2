import armes.*;
import personnages.*;

import java.util.Scanner;

/**
 * Created by BajLu1731402 on 01/02/2018.
 */
public class Jeux {
    public static void main(String[] args) {

        Personnage personnage1 = null;
        Personnage personnage2 = null;
        int choix;
        boolean choisi = true;
        boolean choisi2 = true;
        boolean game = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenue dans RPG Simulator!");
        System.out.println("");

        while (choisi) {
            System.out.println("Veuillez choisir le premier personnage");
            System.out.println("1. Barbare\n" +
                    "2. Paladin\n" +
                    "3. Magicien noir\n" +
                    "4. Magicien rouge");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            if (choix < 5 && choix > 0) {
                choisi = false;
            }
            switch (choix) {
                case 1:
                    while (choisi2) {
                        System.out.println("Quelle arme voulez-vous lui assigner ?\n" +
                                "1. Masse\n" +
                                "2. Épée Lourde\n" +
                                "3. Sceptre\n" +
                                "4. Masamune");
                        choix = sc.nextInt();
                        if (choix < 5 && choix > 0) {
                            choisi2 = false;
                        }
                        switch (choix) {
                            case 1:
                                personnage1 = new Barbare(new Masse());
                                break;
                            case 2:
                                personnage1 = new Barbare(new EpeeLourde());
                                break;
                            case 3:
                                personnage1 = new Barbare(new Sceptre());
                                break;
                            case 4:
                                personnage1 = new Barbare(new Masamune());
                                break;
                        }
                    }
                    break;
                case 2:
                    while (choisi2) {
                        System.out.println("Quelle arme voulez-vous lui assigner ?\n" +
                                "1. Épée\n" +
                                "2. Épée Magique\n" +
                                "3. Épée Lourde\n" +
                                "4. Masamune");
                        choix = sc.nextInt();
                        if (choix < 5 && choix > 0) {
                            choisi2 = false;
                        }
                        switch (choix) {
                            case 1:
                                personnage1 = new Paladin(new Epee());
                                break;
                            case 2:
                                personnage1 = new Paladin(new EpeeMagique());
                                break;
                            case 3:
                                personnage1 = new Paladin(new EpeeLourde());
                                break;
                            case 4:
                                personnage1 = new Paladin(new Masamune());
                                break;
                        }
                    }
                    break;
                case 3:
                    while (choisi2) {
                        System.out.println("Quelle arme voulez-vous lui assigner ?\n" +
                                "1. Baguette\n" +
                                "2. Épée Magique\n" +
                                "3. Sceptre\n" +
                                "4. Masamune");
                        choix = sc.nextInt();
                        if (choix < 5 && choix > 0) {
                            choisi2 = false;
                        }
                        switch (choix) {
                            case 1:
                                personnage1 = new MagicienNoir(new Baguette());
                                break;
                            case 2:
                                personnage1 = new MagicienNoir(new EpeeMagique());
                                break;
                            case 3:
                                personnage1 = new MagicienNoir(new Sceptre());
                                break;
                            case 4:
                                personnage1 = new MagicienNoir(new Masamune());
                                break;
                        }
                    }
                    break;
                case 4:
                    while (choisi2) {
                        System.out.println("Quelle arme voulez-vous lui assigner ?\n" +
                                "1. Baguette\n" +
                                "2. Épée Magique\n" +
                                "3. Sceptre\n" +
                                "4. Masamune");
                        choix = sc.nextInt();
                        if (choix < 5 && choix > 0) {
                            choisi2 = false;
                        }
                        switch (choix) {
                            case 1:
                                personnage1 = new MagicienRouge(new Baguette());
                                break;
                            case 2:
                                personnage1 = new MagicienRouge(new EpeeMagique());
                                break;
                            case 3:
                                personnage1 = new MagicienRouge(new Sceptre());
                                break;
                            case 4:
                                personnage1 = new MagicienRouge(new Masamune());
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        }
        System.out.println("");
        System.out.println("");
        choisi = true;
        while (choisi) {
            choisi2 = true;
            System.out.println("Veuillez choisir le deuxieme personnage");
            System.out.println("1. Barbare\n" +
                    "2. Paladin\n" +
                    "3. Magicien noir\n" +
                    "4. Magicien rouge");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            if (choix < 5 && choix > 0) {
                choisi = false;
            }
            switch (choix) {
                case 1:
                    while (choisi2) {
                        System.out.println("Quelle arme voulez-vous lui assigner ?\n" +
                                "1. Masse\n" +
                                "2. Épée Lourde\n" +
                                "3. Sceptre\n" +
                                "4. Masamune");
                        choix = sc.nextInt();
                        if (choix < 5 && choix > 0) {
                            choisi2 = false;
                        }
                        switch (choix) {
                            case 1:
                                personnage2 = new Barbare(new Masse());
                                break;
                            case 2:
                                personnage2 = new Barbare(new EpeeLourde());
                                break;
                            case 3:
                                personnage2 = new Barbare(new Sceptre());
                                break;
                            case 4:
                                personnage2 = new Barbare(new Masamune());
                                break;
                        }
                    }
                    break;
                case 2:
                    while (choisi2) {
                        System.out.println("Quelle arme voulez-vous lui assigner ?\n" +
                                "1. Épée\n" +
                                "2. Épée Magique\n" +
                                "3. Épée Lourde\n" +
                                "4. Masamune");
                        choix = sc.nextInt();
                        if (choix < 5 && choix > 0) {
                            choisi2 = false;
                        }
                        switch (choix) {
                            case 1:
                                personnage2 = new Paladin(new Epee());
                                break;
                            case 2:
                                personnage2 = new Paladin(new EpeeMagique());
                                break;
                            case 3:
                                personnage2 = new Paladin(new EpeeLourde());
                                break;
                            case 4:
                                personnage2 = new Paladin(new Masamune());
                                break;
                        }
                    }
                    break;
                case 3:
                    while (choisi2) {
                        System.out.println("Quelle arme voulez-vous lui assigner ?\n" +
                                "1. Baguette\n" +
                                "2. Épée Magique\n" +
                                "3. Sceptre\n" +
                                "4. Masamune");
                        choix = sc.nextInt();
                        if (choix < 5 && choix > 0) {
                            choisi2 = false;
                        }
                        switch (choix) {
                            case 1:
                                personnage2 = new MagicienNoir(new Baguette());
                                break;
                            case 2:
                                personnage2 = new MagicienNoir(new EpeeMagique());
                                break;
                            case 3:
                                personnage2 = new MagicienNoir(new Sceptre());
                                break;
                            case 4:
                                personnage2 = new MagicienNoir(new Masamune());
                                break;
                        }
                    }
                    break;
                case 4:
                    while (choisi2) {
                        System.out.println("Quelle arme voulez-vous lui assigner ?\n" +
                                "1. Baguette\n" +
                                "2. Épée Magique\n" +
                                "3. Sceptre\n" +
                                "4. Masamune");
                        choix = sc.nextInt();
                        if (choix < 5 && choix > 0) {
                            choisi2 = false;
                        }
                        switch (choix) {
                            case 1:
                                personnage2 = new MagicienRouge(new Baguette());
                                break;
                            case 2:
                                personnage2 = new MagicienRouge(new EpeeMagique());
                                break;
                            case 3:
                                personnage2 = new MagicienRouge(new Sceptre());
                                break;
                            case 4:
                                personnage2 = new MagicienRouge(new Masamune());
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        }
        System.out.println("");
        System.out.println("");
        while (game) {

            stop();
            System.out.println("");
            System.out.println(personnage1.getNom() + " : " + personnage1.getHP() + "HP");
            System.out.println(personnage2.getNom() + " : " + personnage2.getHP() + "HP");
            stop();
            if (personnage2.getHP() > 0) {
                personnage1.attaquer(personnage2);
                stop();
                System.out.println("");
                if (personnage2.getHP() <= 0) {
                    System.out.println(personnage2.getNom() + " est mort! Le joueur un a gagne, bien joue " + personnage1.getNom());
                    game = false;
                }
                else {
                    personnage2.attaquer(personnage1);
                    stop();
                    System.out.println("");
                    if (personnage1.getHP() <= 0) {
                        System.out.println(personnage1.getNom() + " est mort! Le joueur un a gagne, bien joue " + personnage2.getNom());
                        game = false;
                    }
                }
            }

            if (personnage1 instanceof Magicien && personnage2 instanceof Magicien && ((Magicien) personnage1).getMagie() <= 0 && ((Magicien) personnage2).getMagie() <= 0) {
                System.out.println("");
                System.out.println("Ah bordel! Les deux magiciens n'ont pu de magie...");
                game = false;
            }
        }
    }

    private static void stop() {
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}

