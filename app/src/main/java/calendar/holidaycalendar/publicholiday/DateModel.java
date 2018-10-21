package calendar.holidaycalendar.publicholiday;

/**
 * Created by H.P on 13-10-2018.
 */

public class DateModel {
    String monthNameEng;
    String monthNameHindi;

    String top;
    String bottomLeft;
    String bottomRight;

    String mainDate;
    String dateLeft;
    String dateRight;
    String dateBottom;

    String timeLeft;
    String timeRight;

    String txtLeft;
    String txtRight;

    boolean isDayName;

    public DateModel(boolean isDayName,String monthNameEng, String monthNameHindi, String top, String bottomLeft, String bottomRight,
                     String mainDate, String dateLeft, String dateRight, String dateBottom, String timeLeft,
                     String timeRight, String txtLeft, String txtRight){
        this.isDayName = isDayName;
        this.monthNameEng = monthNameEng;
        this.monthNameHindi = monthNameHindi;
        this.top = top;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
        this.dateLeft = dateLeft;
        this.dateRight = dateRight;
        this.dateBottom = dateBottom;
        this.mainDate = mainDate;
        this.timeLeft = timeLeft;
        this.timeRight = timeRight;
        this.txtLeft = txtLeft;
        this.txtRight = txtRight;
    }

    public String getMonthNameEng() {
        return monthNameEng;
    }

    public void setMonthNameEng(String monthNameEng) {
        this.monthNameEng = monthNameEng;
    }

    public String getMonthNameHindi() {
        return monthNameHindi;
    }

    public void setMonthNameHindi(String monthNameHindi) {
        this.monthNameHindi = monthNameHindi;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(String bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public String getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(String bottomRight) {
        this.bottomRight = bottomRight;
    }

    public String getMainDate() {
        return mainDate;
    }

    public void setMainDate(String mainDate) {
        this.mainDate = mainDate;
    }

    public String getDateLeft() {
        return dateLeft;
    }

    public void setDateLeft(String dateLeft) {
        this.dateLeft = dateLeft;
    }

    public String getDateRight() {
        return dateRight;
    }

    public void setDateRight(String dateRight) {
        this.dateRight = dateRight;
    }

    public String getDateBottom() {
        return dateBottom;
    }

    public void setDateBottom(String dateBottom) {
        this.dateBottom = dateBottom;
    }

    public String getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(String timeLeft) {
        this.timeLeft = timeLeft;
    }

    public String getTimeRight() {
        return timeRight;
    }

    public void setTimeRight(String timeRight) {
        this.timeRight = timeRight;
    }

    public String getTxtLeft() {
        return txtLeft;
    }

    public void setTxtLeft(String txtLeft) {
        this.txtLeft = txtLeft;
    }

    public String getTxtRight() {
        return txtRight;
    }

    public void setTxtRight(String txtRight) {
        this.txtRight = txtRight;
    }
}
