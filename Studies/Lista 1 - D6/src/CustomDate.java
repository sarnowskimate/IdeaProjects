public class CustomDate {
    int year;
    int month;
    int day;

    public CustomDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void tommorow() {
        this.setDay(true);
    }

    public void yesterday() {
        this.setDay(false);
    }

    private int getNumberOfDays(boolean thisMonth) {
        int numberOfDays;
        int month = thisMonth ? this.month : this.month - 1;

        int daysInFebruary = this.isLeapYear() ? 29 : 28;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: { numberOfDays = 31; break; }
            case 2: { numberOfDays = daysInFebruary; break; }
            case 4: case 6: case 9: case 11: { numberOfDays = 30; break; }
            default: { numberOfDays = 0; break; }
        }

        return numberOfDays;
    }

    public boolean isLeapYear() {
        int year = this.year;

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    private void setDay(boolean add) {
        int day = this.day;
        int numberOfDays = this.getNumberOfDays(true);

        if (add) {
            if (day == numberOfDays) {
                this.setMonth(add);
                this.day = 1;
            } else {
                this.day ++;
            }
        } else {
            if (day == 1) {
                this.setMonth(add);
                this.day = this.getNumberOfDays(false);
            } else {
                this.day --;
            }
        }

    }

    private void setMonth(boolean add) {
        int month = this.month;

        if (add) {
            if (month == 12) {
                this.setYear(add);
                this.month = 1;
            } else {
                this.month ++;
            }
        } else {
            if (month == 1) {
                this.setYear(add);
                this.month = 12;
            } else {
                this.month --;
            }
        }
    }

    private void setYear(boolean add) {
        if (add) {
            this.year ++;
        } else {
            this.year --;
        }
    }

    public String toString() {
        return "Y: " + year + ", M: " + month + ", D: " + day;
    }

}
