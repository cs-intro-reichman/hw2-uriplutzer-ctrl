public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String HHMM = args[0];
        String hourStr = "" + HHMM.charAt(0) + HHMM.charAt(1);
        String minuteStr = "" + HHMM.charAt(3) + HHMM.charAt(4);
        int hourCount = Integer.parseInt(hourStr);
        int minuteCount = Integer.parseInt(minuteStr);
        int minuteToAdd = Integer.parseInt(args[1]);
        int totalMinutes = (hourCount * 60) + minuteCount + minuteToAdd;
        int totalHours = totalMinutes / 60;
        int newHour = totalHours % 24;
        int newMinute = totalMinutes - (totalHours * 60);
        if (newHour < 10 && newMinute < 10) {
            System.out.println("0" + newHour + ":" + "0" + newMinute);
        } else if (newHour < 10 && newMinute >= 10) {
            System.out.println("0" + newHour + ":" + newMinute);
        } else if (newHour >= 10 && newMinute < 10) {
            System.out.println(newHour + ":" + "0" + newMinute);
        } else
            System.out.println(newHour + ":" + newMinute);

    }
}
