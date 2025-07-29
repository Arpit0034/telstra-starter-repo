package au.com.telstra.simcardactivator.services;


import au.com.telstra.simcardactivator.entities.SimCard;

public interface ActivateSIMCard {
    boolean activate(SimCard simCard) ;
}
