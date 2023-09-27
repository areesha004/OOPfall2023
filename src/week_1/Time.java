package week_1;


    public class Time {
        int hours;
        int minutes;
        int seconds;

        Time(int hours,int minutes,int seconds){

            this.hours=hours;
            this.minutes=minutes;
            this.seconds=seconds;

        }
        public String displayTime(){
            return String.format("%02d:%02d:%02d",hours,minutes,seconds);
        }


    }


