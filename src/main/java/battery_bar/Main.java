package battery_bar;

import static battery_bar.BatteryBar.batteryBar;

public class Main {
    static void main() {
        System.out.println(batteryBar(100));
        System.out.println(batteryBar(70));
        System.out.println(batteryBar(20));
        System.out.println(batteryBar(19));
        System.out.println(batteryBar(0));
    }
}
