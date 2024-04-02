package com.ust.swiggy.model;

import java.io.Serializable;
/**
 *
 */
public class Address implements Serializable {
    /**
     *
     */

    private static final long serialVersionUID = 1L ;
    private int streetId;
    private String firstName;
    private String lastName;
    private  long pinCode;

    public Address() {
    }

    public Address(String number, String mainStreet, String john, String doe, String california, String usa, long l) {
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetId=" + streetId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pin code=" + pinCode +
                '}';
    }

    /**
     *
     * @param streetId
     * @param firstName
     * @param lastName
     * @param pinCode
     */
    public Address (int streetId, String firstName, String lastName, long pinCode){
        super();
        this.streetId = streetId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pinCode = pinCode;
    }

    /**
     *
     * @return the streeId
     */
    public int getStreetId() {
        return streetId;
    }

    /**
     *
     * @return the firstname
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return lastname
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return pinCode
     */
    public long getPincode() {
        return pinCode;
    }

    @Override
    public int hashCode() {
        System.out.println("from overridden hashcode method");
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + (int) (pinCode ^ (pinCode >>> 32));
        result = prime * result + streetId;
        return result;
    }

    @Override
    public boolean equals(Object o) {
//        System.out.println("From overridden equals method");
        if (this == o) {
            return true;
        }
        if (!(o instanceof Address other)) {
            return false;
        }
        if (firstName == null) {
            if (other.firstName != null) {
                return false;
            }
        } else if (!firstName.equals(other.firstName)) {
            return false;
        }
        if (lastName == null) {
            if (other.lastName != null) {
                return false;
            }
        } else if (!lastName.equals(other.lastName)) {
            return false;
        }
        if (pinCode != other.pinCode) {
            return false;
        }
        if (streetId != other.streetId) {
            return false;
        }
        return true;
    }

}
