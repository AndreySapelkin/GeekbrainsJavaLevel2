package lection01.offline;

public class Treadmill implements Trap{

    public final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean obstaclePassing(Participant participant) {
        if(participant.bounce(this.length)){
            System.out.println("Участник с именем: " + participant.getName() +
                    ". Успешно пробежал расстояние: " + length);
            return true;
        }
        System.out.println("Участник с именем: " + participant.getName() +
                ". Пробежал расстояние: " + length);
        return false;
    }
}
