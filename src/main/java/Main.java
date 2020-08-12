import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall(1);
        ToeCam toeCam1 = new ToeCam(6000);

        List<RunningAndJumping> objects = new ArrayList<>();
        objects.add(new Cat("Барсик", 2, 800));
        objects.add(new Cat("Муся", 1.4, 1500));
        objects.add(new Cat("Васька", 2.5, 1200));
        objects.add(new Human("Александр", 1.9, 12000));
        objects.add(new Human("Григорий", 2, 8000));
        objects.add(new Human("Алексей", 1.8, 6000));
        objects.add(new Robots("SC77", 4, 20000));
        objects.add(new Robots("r2b2", 0.9, 26000));
        objects.add(new Robots("DHCP4", 3.1, 36000));

        for (RunningAndJumping runningAndJumping: objects) {
            runningAndJumping.jump(wall1);
            runningAndJumping.run(toeCam1);
            System.out.println("--------------------");
        }




    }
}
