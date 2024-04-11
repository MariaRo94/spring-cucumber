package com.baeldung.cucumberoptions;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@RestController
public class FruitsController {
    HashMap<String, Fruit> bucket = new HashMap<>();

    @PostMapping("/fruits/add")
    public List<Fruit> putFruitToBucket(@RequestBody Fruit fruit) {
        bucket.put(fruit.getName(), fruit);
        return new ArrayList<>(bucket.values());
    }

    @GetMapping("/fruits/delete")
    public HttpStatusCode clearAll() {
        bucket.clear();
        return ResponseEntity.ok().build().getStatusCode();
    }

    @GetMapping("/fruits/get/{fruit}")
    public Fruit getFruit(@PathVariable String fruit) {
        return bucket.get(fruit);
    }
}
