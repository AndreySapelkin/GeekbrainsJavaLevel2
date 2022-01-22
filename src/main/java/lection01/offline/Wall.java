package lection01.offline;

public class Wall implements Trap{
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean obstaclePassing(Participant participant) {
        if(participant.bounce(this.height)){
            System.out.println("Участник с именем: " + participant.getName() +
                    ". Успешно перепрыгнул препятствие высотой: " + height);
            return true;
        }
        System.out.println("Участник с именем: " + participant.getName() +
                ". Не смог перепрыгнуть препятствие высотой: " + height);
        return false;
    }
}
