package Assignment_1;

public class Time {
    int minutes;
    int hours;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return String.format("%2d:%2d",hours,minutes);
    }
}
