package com.example.Spring.Controller;

import com.example.Spring.Service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class StoreController {
    private final StoreService storeServiceImpl;

    public StoreController(StoreService storeServiceImpl) {
        this.storeServiceImpl = storeServiceImpl;
    }

    //http://localhost:8090/store/order/add?ID=
    @GetMapping(path = "/add")
    public List<Integer> add(@RequestParam(value = "ID", required = false) String id) {
        return storeServiceImpl.add(id);
    }

    //http://localhost:8090/store/order/get
    @GetMapping(path = "/get")
    public String get() {
        return storeServiceImpl.getItemId().toString();
    }
}