package com.bot.telegram.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alert")
public class WebController {

    private final WebService webService;


    public WebController(WebService webService) {
        this.webService = webService;
    }

    @GetMapping("/{number}")
    public String sendAlert1(@PathVariable Integer number){
        webService.sendAlert("Alerta número " + number);
        return "Mensaje enviado correctamente";
    }

}
