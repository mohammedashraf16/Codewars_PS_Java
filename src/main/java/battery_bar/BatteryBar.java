package battery_bar;

public class BatteryBar {
    public static String batteryBar(int percent){
        int litBar = percent/20;
        int emptyBar = 5-litBar;
        String lit ="#".repeat(litBar);
        String empty = ".".repeat(emptyBar);
        return "["+lit+empty+"]";
    }
}
