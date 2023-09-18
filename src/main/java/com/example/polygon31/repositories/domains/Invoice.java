package com.example.polygon31.repositories.domains;

import lombok.Builder;

import java.time.LocalDateTime;

@lombok.Data
@lombok.Builder(toBuilder = true)
public class Invoice {
    private Long id;
    @Builder.ObtainVia(method = "now")
    @Builder.Default
    private LocalDateTime tlm = now();


    public static LocalDateTime now(){
        return LocalDateTime.now();
    }

    public static void main(String[] args) throws InterruptedException {
        Invoice invoice = Invoice.builder().id(1L).build();
        System.out.println(invoice);

        Thread.sleep(1_000);

        System.out.println(invoice.toBuilder().build());
    }
}
