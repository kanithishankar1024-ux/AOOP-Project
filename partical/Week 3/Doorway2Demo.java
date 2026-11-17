
public static void main(String[] args) {

    System.out.println("--- Broken Booking ---");

    Date start = new Date(100000);
    Date end = new Date(200000);

    BadBooking bad = new BadBooking(start, end);

    bad.getEndTime().setTime(0);

    System.out.println("Bad booking end time: "
            + bad.getEndTime());

    System.out.println("--- Safe Booking ---");

    // Create separate dates for SafeBooking
    Date safeStart = new Date(100000);
    Date safeEnd = new Date(200000);

    SafeBooking safe = new SafeBooking(safeStart, safeEnd);

    safe.getEndTime().setTime(0);

    System.out.println("Safe booking end time: "
            + safe.getEndTime());
}
