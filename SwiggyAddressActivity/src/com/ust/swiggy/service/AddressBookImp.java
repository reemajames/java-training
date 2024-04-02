package com.ust.swiggy.service;


import com.ust.swiggy.exception.DuplicateAddressException;
import com.ust.swiggy.exception.ErrorConstants;
import com.ust.swiggy.exception.NoEntriesException;
import com.ust.swiggy.exception.NoEntryException;
import com.ust.swiggy.model.Address;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 *
 */
public class AddressBookImp implements IAddressBook {


    private final Set<Address> addressBook;

    public AddressBookImp() {
        // Using CopyOnWriteArraySet to avoid ConcurrentModificationException
        this.addressBook = new CopyOnWriteArraySet<>();
    }

    @Override
    public boolean addAddress(Address address) throws DuplicateAddressException, NullPointerException {
        if (address == null) {
            throw new NullPointerException(ErrorConstants.ADDRESS_NULL_ERROR);
        }

        boolean added = addressBook.add(address);
        if (!added) {
            throw new DuplicateAddressException(ErrorConstants.DUPLICATE_ADDRESS_ERROR);
        }

        return true;
    }

    @Override
    public boolean removeAddress(String firstName) throws NoEntriesException, NoEntryException, NullPointerException {
        if (firstName == null || firstName.isEmpty() || firstName.isBlank()) {
            throw new NullPointerException(ErrorConstants.FIRST_NAME_NULL_OR_EMPTY_ERROR);
        }

        if (addressBook.isEmpty()) {
            throw new NoEntriesException(ErrorConstants.NO_ENTRIES_ERROR);
        }

        boolean removed = addressBook.removeIf(address -> firstName.equals(address.getFirstName()));
        if (!removed) {
            throw new NoEntryException(ErrorConstants.NO_ENTRIES_ERROR + firstName);
        }

        return true;
    }

    // Method to retrieve the address book
    public Set<Address> getAddressBook() {
        return addressBook;
    }
}


