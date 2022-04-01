package mares.webshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("tooted") //localhost 8080/tooted
    public String saaTooted() {
        return "Said tooded kätte";
    }
    @GetMapping("prindi-logidesse") //localhost:8080/prindi-logidesse
    public String prindilogidesse() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Logi nr " + i);
        }
        return "Logidesse edukalt prinditud";
    }
    @GetMapping("liida/{arv1}/{arv2}") //localhost:8080/liida/4/6
    public int liidaKokku(@PathVariable int arv1, @PathVariable int arv2) {
        return arv1 + arv2;
    }
    List<String> s6nad = new ArrayList<>();
    //String[] s6nad = {};

    @GetMapping("saa-sonad") //localhost:8080/saa-sonad
    public List<String> saaSonad() {
        return  s6nad;     // []
    }
    @GetMapping("lisa-sona/{sona}") //localhost:8080/lisa-sona/Mares
    public List<String> saaSonad(@PathVariable String sona) {
        s6nad.add(sona);
        return s6nad;  //[]
    }
    @GetMapping("saa-yks-s6na/{index}") //localhost:8080/saa-yks-s6na/1
    public String saaYksSona(@PathVariable int index) {
        return s6nad.get(index);
    }
}


