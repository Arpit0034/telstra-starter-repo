package au.com.telstra.simcardactivator.services;

import au.com.telstra.simcardactivator.entities.SimCard;
import org.springframework.stereotype.Service;

@Service
public class ActivateSimCardImpl implements ActivateSIMCard{
    @Override
    public boolean activate(SimCard simCard){
        return simCard.getIccid().equals("ShatakshiDon") ;
    }
}
