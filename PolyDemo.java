class Ant {
    public void  action(){
        System.out.println("Crawls");
    }
}

class BlackAnt extends Ant{
    public void action(){
        System.out.println("Climb");
    }
}

class RedAnt extends Ant{
    public void action(){
        System.out.println("Bites");
    }
}

public class Main {
    public static void main(String[] args) {
        Ant a = new Ant();
        a.action();
        BlackAnt b = new BlackAnt();
        b.action();
        RedAnt r = new RedAnt();
        r.action();
    }
}
