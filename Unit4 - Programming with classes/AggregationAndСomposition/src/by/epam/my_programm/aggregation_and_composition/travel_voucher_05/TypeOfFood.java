package by.epam.my_programm.aggregation_and_composition.travel_voucher_05;

public enum TypeOfFood {
    NOT_INCLUDET, BREAKFAST, LUNCH, DINNER, ALL_INCLUSIVE;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}