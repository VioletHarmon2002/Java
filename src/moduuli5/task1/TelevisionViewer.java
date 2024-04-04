package moduuli5.task1;

import moduuli5.task1.Television;

public class TelevisionViewer {
    public static void main(String[] args) {
        Television tv = new Television();


        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            tv.turnOn();

            for (int channel = 1; channel <= 10; channel++) {
                System.out.println("Watching channel " + tv.getChannel());
                tv.setChannel(tv.getChannel() % 10 + 1);
            }

            tv.turnOff();

            System.out.println("Falling asleep");
        }
    }
}
