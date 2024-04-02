package com.ust.swiggy.service;

import java.util.Set;
import com.ust.swiggy.exception.DuplicateAddressException;
import com.ust.swiggy.exception.ErrorConstants;
import com.ust.swiggy.exception.NoEntriesException;
import com.ust.swiggy.exception.NoEntryException;
import com.ust.swiggy.model.Address;

/**
 * Service Interface
 */

public interface IAddressBook {
    /**
     * @param address
     * @return boolean true/false
     * *@throws DuplicateAddressException
     * *@throws NullRointerException
     */

    public abstract boolean addAddress(final Address address) throws DuplicateAddressException, NullPointerException;
/**
 * @param firstName
 * *@return boolean true/false
 * *@throws NoEntriesException
 *@throws NoEntryException
 * @throws NullPointerException
 */

    public abstract boolean removeAddress(final String firstName) throws NoEntriesException, NoEntryException, NullPointerException;

    default public Set<Address> getAllAddressEntries() throws NoEntriesException {
        System.out.println(ErrorConstants.NO_ENTRIES_ERROR);
        return null;
    }
}
