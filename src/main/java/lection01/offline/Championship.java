package lection01.offline;

public class Championship {
    public static void main(String[] args) {

        Participant[] participants = {
                new Robot("1", 10, 16),
                new Robot("2", 15, 3),
                new Cat("3", 17, 16),
                new Cat("4", 22, 0),
                new Human("5", 5, 12),
                new Human("6", 11, 16)
        };

        Trap[] traps = {
                new Treadmill(14),
                new Wall(19),
                new Treadmill(11),
                new Wall(5),
                new Treadmill(4),
                new Wall(12),
                new Treadmill(16),
                new Wall(11),
        };

        for(Participant p : participants){
            for (Trap t : traps){
                if(!t.obstaclePassing(p)) break;
            }
        }

    }
}
