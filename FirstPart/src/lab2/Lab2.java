package lab2;


import lab2.human.Human;

public class Lab2 {
    public static void main(String[] args) {
        Human h1 = new Human("Даня");
        Human h2 = new Human("Сергей");
        h2.lookAtHuman(h1);
        h2.step();
        h1.touch(h2);
        h2.die();
    }
}

