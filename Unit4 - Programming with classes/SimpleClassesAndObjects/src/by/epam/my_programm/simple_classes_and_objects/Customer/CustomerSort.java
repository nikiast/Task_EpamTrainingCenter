package by.epam.my_programm.simple_classes_and_objects;

import java.util.Arrays;

public class CustomerSort {

    private static Customer [] cust = new Customer [5];
    private String customersGroup;



    CustomerSort(Customer [] cust, String customersGroup) {
        this.customersGroup = customersGroup;
        this.cust = cust;
    }

    Customer[] getCust(){
        return cust;
    }
    String getCustomersGroup(){
        return customersGroup;
    }


    void setCust(Customer [] cust){
        this.cust = cust;
    }
    void setCustomersGroup(String customersGroup){
        this.customersGroup = customersGroup;
    }


    public static void main(String[] args) {
        cust[0] = new Customer("aaa", "aaa", "aaa", "aaa", 111, 111);
        cust[1] = new Customer("eee", "eee", "eee", "eee", 555, 555);
        cust[2] = new Customer("bbb", "bbb", "bbb", "bbb", 222, 222);
        cust[3] = new Customer("ddd", "ddd", "ddd", "ddd", 444, 444);
        cust[4] = new Customer("ccc", "ccc", "ccc", "ccc", 333, 333);
        System.out.println(Arrays.toString(cust));
    }
}
