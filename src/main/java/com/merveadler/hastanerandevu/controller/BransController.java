package com.merveadler.hastanerandevu.controller;

import com.merveadler.hastanerandevu.repository.entity.Brans;
import com.merveadler.hastanerandevu.dto.request.BransSaveRequestDto;
import com.merveadler.hastanerandevu.service.BransService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.merveadler.hastanerandevu.constants.RestApiList.*;
@RestController
@RequestMapping(BRANS)
@RequiredArgsConstructor
public class BransController {
    private final BransService bransService;

    @PostMapping(SAVE)
    public Brans save(@RequestBody @Valid BransSaveRequestDto dto){
        return bransService.save(dto);
    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<Brans>> findAll(){
        return ResponseEntity.ok(bransService.findAll());
    }
}
