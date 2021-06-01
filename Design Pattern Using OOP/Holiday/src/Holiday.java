import java.util.ArrayList;

public class Holiday {

    private String name;
    private int day;
    private String month;

    public Holiday() {
    }

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday holidayOne, Holiday holidayTwo) {
        return (holidayOne.month.equals(holidayTwo.month));
    }

    public double avgDate(ArrayList<Holiday> holidayArray) {
        double sum = 0;

        for (int i = 0; i < holidayArray.size(); i++) {
            sum += holidayArray.get(i).day;
        }

        return (double) (sum / holidayArray.size());
    }

    public static void main(String[] args) {
        ArrayList<Holiday> holidayArray = new ArrayList<>();

        Holiday holidayOne = new Holiday("Independence day", 4, "July");
        holidayArray.add(holidayOne);

        Holiday holidayTwo = new Holiday("Republic day", 26, "July");
        holidayArray.add(holidayTwo);

        Holiday holiday = new Holiday();

        System.out.println(holiday.inSameMonth(holidayOne, holidayTwo));
        System.out.println(holiday.avgDate(holidayArray));
    }
}
