package com.example.fundmanagement.fund;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funds")
public class FundController {
    private final FundService fundService;

    @Autowired
    public FundController(FundService fundService) {
        this.fundService = fundService;
    }


    @GetMapping
    public List<Fund> getFunds(){
        return fundService.getFunds();
    }

    @GetMapping(path="{fundId}")
    public Fund getFund(@PathVariable("fundId") Integer id){
        return fundService.getFund(id);
    }

    @PostMapping
    public void registerNewFund(@RequestBody Fund fund){
        fundService.addFund(fund);
    }

    @DeleteMapping(path="{fundId}")
    public void deleteFund(@PathVariable("fundId") Integer id){
        fundService.deleteFund(id);
    }

    @PutMapping(path = "{fundId}")
    public void updateFund(@PathVariable Integer fundId, @RequestBody Fund newFund){
        fundService.updateFund(fundId, newFund);
    }









}
