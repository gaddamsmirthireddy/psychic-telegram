
public class Date {
    private int month, day, year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void display() {
        System.out.printf("%02d/%02d/%04d%n", month, day, year);
    }

    public void displayComponents() {
        System.out.printf("Month: %d%nDay: %d%nYear: %d%n", month, day, year);
    }

    public static void main(String[] args) {
        Date date1 = new Date(1, 2, 2014);

        date1.display();
        date1.displayComponents();
    }
}
