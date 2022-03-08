package com.example.qoutes.qoutescontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QoutesController {

   @GetMapping("/qoutes/{id}")
    public String getQoutes(@PathVariable int id) throws IOException {

        InputStream inputStream = getClass()
                .getClassLoader().getResourceAsStream("data.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        String line ;
        int count =1;
        while ((line = br.readLine()) != null) {
           if(count == id){
             return line;
           }
           count++;
        }

        return "Not found";
    }
}
