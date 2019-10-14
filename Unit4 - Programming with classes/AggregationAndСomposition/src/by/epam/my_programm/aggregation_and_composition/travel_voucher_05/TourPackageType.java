package by.epam.my_programm.aggregation_and_composition.travel_voucher_05;

public enum TourPackageType {
    RECREATION, EXCURSION, TREATMENT, SHOPPING, CRUISE;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
