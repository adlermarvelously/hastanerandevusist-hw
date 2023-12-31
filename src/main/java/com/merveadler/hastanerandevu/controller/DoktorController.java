package com.merveadler.hastanerandevu.controller;

import com.merveadler.hastanerandevu.repository.entity.Doktor;
import com.merveadler.hastanerandevu.repository.view.VwDoktor;
import com.merveadler.hastanerandevu.dto.request.DoktorSaveRequestDto;
import com.merveadler.hastanerandevu.dto.response.DoktorResponseDto;
import com.merveadler.hastanerandevu.service.DoktorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.merveadler.hastanerandevu.constants.RestApiList.*;

@RestController
@RequestMapping(DOKTOR)
@RequiredArgsConstructor
public class DoktorController {
    private final DoktorService doktorService;

    @Value("${myapplication.name}")
    private String uygyulamaAdi;

    @GetMapping("/uygulamaadi")
    public String getActiveApplicationFile(){
        return uygyulamaAdi;
    }

    @PostMapping(SAVE)
    public Doktor save(@RequestBody @Valid DoktorSaveRequestDto dto){
        return doktorService.save(dto);
    }

    @GetMapping(FINDBYAD)
    public List<Doktor> findByAd(String ad){
        return doktorService.findByAd(ad);
    }

    /**
     * ÖDEV - Doktorların bilgilerini RESPONSE DTO ve VIEW olarak
     * dönüş yapan 2 method yazınız.
     * 1. method da doktorları çekip DTO ya dönüştürüp listeleyiniz.
     * 2. direkt DB den alınan kayıtları View olarak alıp dönüş yapınız.
     *
     */

    public List<DoktorResponseDto> findAllResponse(){
        return null;
    }

    public List<VwDoktor> findAllView(){
        return null;
    }

    @GetMapping(FINDALL)
    public List<Doktor> findAll(){
        return doktorService.findAll();

    }

}
