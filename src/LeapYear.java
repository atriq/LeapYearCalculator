public class LeapYear {
    public boolean isLeapYear(int year){
        if(year <= 1 || year >= 9999) return false;

        boolean divisibleByFour = year % 4 == 0;
        boolean divisibleByHundred = year % 100 != 0;
        boolean divisibleByFourHundred = year % 400 == 0;

        return divisibleByFour && divisibleByHundred || divisibleByFourHundred;
    }
}
