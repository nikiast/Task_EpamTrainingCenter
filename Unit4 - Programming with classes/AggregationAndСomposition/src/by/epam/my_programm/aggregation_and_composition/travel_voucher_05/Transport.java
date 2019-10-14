package by.epam.my_programm.aggregation_and_composition.travel_voucher_05;

public enum Transport {
    PLANE, BUS, TRAIN, SHIP, CAR;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}