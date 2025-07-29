package au.com.telstra.simcardactivator.controllers;


import au.com.telstra.simcardactivator.dto.SimCardDto;
import au.com.telstra.simcardactivator.entities.SimCard;
import au.com.telstra.simcardactivator.services.ActivateSIMCard;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/actuate")
@RequiredArgsConstructor
public class PostController {
    private final ActivateSIMCard activateSIMCard ;

    @PostMapping
    public SimCardDto activate(@RequestBody SimCard simCard){
        return new SimCardDto(activateSIMCard.activate(simCard)) ;
    }
}
