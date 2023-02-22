package com.fatjon.inventoryservice.controller;

import com.fatjon.inventoryservice.dto.InventoryResponse;
import com.fatjon.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode ) throws InterruptedException {

        return inventoryService.isInStock(skuCode);
    }
}
