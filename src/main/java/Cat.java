public class Cat implements RunningAndJumping{
    String name;
    double maxJump;
    int maxRun;

    Cat (String name, double maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public void jump (Wall wall) {
        if (wall.height<maxJump) {
            System.out.println("Кот " + name + " перепрыгнул через стену в " + wall.height + " метров");
        } else {
            System.out.println("Кот " +name + " не смог перепрыгнуть такую высокую стену");
        }
    }
    @Override
    public void run(ToeCam toeCam) {
        if (toeCam.distance<maxRun) {
            System.out.println("Кот " + name + " пробежал " + toeCam.distance + " метров");
        } else {
            System.out.println("Кот " +name + " не смог пробежать такое расстояние");
        }
    }



}
