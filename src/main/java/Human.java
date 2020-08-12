public class Human implements RunningAndJumping{
    String name;
    double maxJump;
    int maxRun;

    Human (String name, double maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public void run (ToeCam toeCam) {
        if (toeCam.distance<maxRun) {
            System.out.println("Человек " + name + " пробежал " + toeCam.distance + " метров");
        } else {
            System.out.println("Человек " +name + " не смог пробежать такое расстояние");
        }
    }

    @Override
    public void jump (Wall wall) {
        if (wall.height<maxJump) {
            System.out.println("Человек " + name + " перепрыгнул через стену в " + wall.height + " метров");
        } else {
            System.out.println("Человек " +name + " не смог перепрыгнуть такую высокую стену");
        }
    }
}
