public class Main {
    public static void main(String[] args) {

        String HeroName = "Rick";
        int XP = 1200;

        System.out.println("A XP atual de " + HeroName + " é: " + XP);

        // níveis array
        String[] nivel = {"Ferro", "Bronze", "Prata", "Ouro", "Platina",
                "Ascendente", "Imortal", "Radiante"};

        if (XP < 1000) {
            System.out.println("O Herói " + HeroName + " está no nível de " + nivel[0]);
        } else if (XP >= 1001 && XP <= 2000) {
            System.out.println("O Herói " + HeroName + " está no nível de " + nivel[1]);
        } else if (XP >= 2001 && XP <= 5000) {
            System.out.println("O Herói " + HeroName + " está no nível de " + nivel[2]);
        } else if (XP >= 6001 && XP <= 7000) {
            System.out.println("O Herói " + HeroName + " está no nível de " + nivel[3]);
        } else if (XP >= 7001 && XP <= 8000) {
            System.out.println("O Herói " + HeroName + " está no nível de " + nivel[4]);
        } else if (XP >= 8001 && XP <= 9000) {
            System.out.println("O Herói " + HeroName + " está no nível de " + nivel[5]);
        } else if (XP >= 9001 && XP <= 10000) {
            System.out.println("O Herói " + HeroName + " está no nível de " + nivel[6]);
        } else {
            System.out.println("O Herói " + HeroName + " está no nível de " + nivel[7]);
        }

    }
}

