package com.merveadler.hastanerandevu.controller;
import com.merveadler.hastanerandevu.repository.entity.Hasta;
import com.merveadler.hastanerandevu.dto.request.HastaSaveRequestDto;
import com.merveadler.hastanerandevu.service.HastaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.merveadler.hastanerandevu.constants.RestApiList.*;

@RestController
@RequestMapping(HASTA)
@RequiredArgsConstructor
public class HastaController {
    private final HastaService hastaService;

    @PostMapping(SAVE)
    public Hasta save(@RequestBody @Valid HastaSaveRequestDto dto){
       return hastaService.save(dto);
    }

    @GetMapping(FINDALL)
    public List<Hasta> findAll(){
      return  hastaService.findAll();
    }

}
