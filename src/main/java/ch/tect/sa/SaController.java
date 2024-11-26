package ch.tect.sa;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="sa" ,produces= MediaType.APPLICATION_JSON_VALUE)
public class SaController {

    @GetMapping(value = "")
    public List<Object> search(){

        return List.of(new Sa(1,"Belle Formation",1));

    }
}
