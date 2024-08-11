package aula175.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {}
    public Reservation(int number, Date checkIn, Date checkOut) {
        this.roomNumber = number;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration() {
        long millisecondsDifference = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(millisecondsDifference, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();

        if (checkIn.before(now) || checkOut.before(now)) {
            return "Error in reservation: Reservation dates for update must be future dates.";
        }

        if (!checkOut.after(checkIn)) {
            return "Error in reservation: Check-out date must be after check-in date.";
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Room ").append(this.roomNumber).append(", ");
        sb.append("check-in ").append(sdf.format(this.checkIn)).append(", ");
        sb.append("check-out ").append(sdf.format(this.checkOut)).append(", ");
        sb.append(this.duration()).append(" nights");

        return sb.toString();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Date getCheckIn() {
        return checkIn;
    }

}