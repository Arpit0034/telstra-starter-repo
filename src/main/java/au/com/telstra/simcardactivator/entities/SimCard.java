package au.com.telstra.simcardactivator.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimCard {
    private String iccid ;
    private String email ;
}
