package com.atharva.jobtrack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.LinkedHashMap;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public Map<String, String> SayHello(){

        Map<String, String> data=new LinkedHashMap<>();

                data.put("Ganapati Bappa Moraya", "Pudhchya varshi lavkar yaa");
                data.put("company", "AMAZON");
                data.put("Role", "DEVELOPER");
                data.put("Status", "SOFT. ENGINEER");

                        data.put("Goal 1", "Me and my family living in our self big lavish home");
                        data.put("Goal 2", "I'm driving my own mercedes c 220 d 1616");
                        data.put("Goal 3", "I'm riding on my royal enfield meteor 1616");
                        data.put("Goal 4", "I'm riding on my sports bike gixxer 1616");
                        data.put("Goal 5", "My every family member are using iPhone");
                        data.put("Goal 6", "We're using all highly recommended brands and equipments in home");
                        data.put("Goal 7", "We're buying all these things without any financial problem");

                return data;
    }
}
