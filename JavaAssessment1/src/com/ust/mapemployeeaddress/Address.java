package com.ust.mapemployeeaddress;

import java.util.*;

public class Address {
    private int houseNo;
    private String street;
    private String city;
    private int pincode;

    public Address(int houseNo, String street, String city, int pincode) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Rose John");
        Employee employee2 = new Employee(2, "Farzana Salim");
        Employee employee3 = new Employee(3, "Ashly Prasad");
        Employee newEmployee = new Employee(2, "Ashly Prasad");

        Address address1 = new Address(123, "ABC Street", "Kochi", 56789);
        Address address2 = new Address(456, "XYZ Street", "TVM", 87654);
        Address address3 = new Address(789, "LMN Street", "Bangalore", 54321);

        Map<Employee, Address> employeeAddressMap = new HashMap<>();
        employeeAddressMap.put(employee1, address1);
        employeeAddressMap.put(employee2, address2);
        employeeAddressMap.put(employee3, address3);

        if (employeeAddressMap.containsKey(newEmployee)) {
            Address newEmployeeAddress = employeeAddressMap.get(newEmployee);
            System.out.println("Employee exists. Address: " + newEmployeeAddress.getHouseNo() + ", " +
                    newEmployeeAddress.getStreet() + ", " + newEmployeeAddress.getCity() + ", " +
                    newEmployeeAddress.getPincode());
        } else {
            System.out.println("Employee does not exist.");
        }

        List<String> distinctCities = new ArrayList<>();
        for (Address address : employeeAddressMap.values()) {
            if (!distinctCities.contains(address.getCity())) {
                distinctCities.add(address.getCity());
            }
        }
        Collections.sort(distinctCities);
        System.out.println("Distinct cities in ascending order: " + distinctCities);
    }
}

class Employee {
    private int empId;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return empId == employee.empId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }
}
