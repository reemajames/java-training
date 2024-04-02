package com.ust.swiggy;
import com.ust.swiggy.model.Address;
import com.ust.swiggy.exception.DuplicateAddressException;
import com.ust.swiggy.exception.NoEntriesException;
import com.ust.swiggy.exception.NoEntryException;
import com.ust.swiggy.service.IAddressBook;
import com.ust.swiggy.service.AddressBookImp;


public class Main {
    public static void main(String[] args) {
        IAddressBook addressBookService = new AddressBookImp();

        try {
            addressBookService.addAddress(new Address(1, "Reema", "S", 570023));
            addressBookService.addAddress(new Address(2, "Gomathi", "S", 560054));
            addressBookService.addAddress(new Address(3, "Reema", "S", 570023));
            addressBookService.removeAddress("Reema");
            addressBookService.removeAddress("Kavana");

            System.out.println("Address Book:");

            for (Address address : ((AddressBookImp) addressBookService).getAddressBook()) {
                System.out.println(address);
            }
        }

        catch (DuplicateAddressException | NoEntriesException | NoEntryException | NullPointerException e) {
            System.err.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Cleaning up resources...");
        }
    }}