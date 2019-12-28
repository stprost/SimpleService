package response;

public class Respone {
    int errorCode;
    String year;

    public Respone(String year) {
        if (year.matches("^\\d{4}$")){
            errorCode = 200;
            int intYear = Integer.parseInt(year);
            if ((intYear % 4 == 0 && intYear % 100 != 0) || intYear % 400 == 0) {
                this.year = String.format("12/09/" + year);
            } else this.year = String.format("13/09/" + year);
        } else {
         errorCode = 1;
         this.year = "WRONG_FORMAT";
        }
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getYear() {
        return year;
    }
}
