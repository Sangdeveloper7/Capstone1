package com.thc.fallsprbasic.controller;

import com.thc.fallsprbasic.dto.DefaultDto;
import com.thc.fallsprbasic.dto.TbpaperDto;
import com.thc.fallsprbasic.service.TbpaperService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/tbpaper")
@RestController
@Slf4j
public class TbpaperRestController {

    private final TbpaperService tbpaperService;
    public TbpaperRestController(
            TbpaperService tbpaperService
    ) {
        this.tbpaperService = tbpaperService;
    }

    /**/
    @PostMapping("")
    public ResponseEntity<DefaultDto.CreateResDto> create(@RequestBody TbpaperDto.CreateReqDto param){
        return ResponseEntity.ok(tbpaperService.create(param));
    }
    @PutMapping("")
    public ResponseEntity<String> update(@RequestBody TbpaperDto.UpdateReqDto param){
        tbpaperService.update(param);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("")
    public ResponseEntity<String> delete(@RequestBody TbpaperDto.UpdateReqDto param){
        tbpaperService.delete(param.getId());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/detail")
    public ResponseEntity<TbpaperDto.DetailResDto> detail(@RequestParam Long id){
        return ResponseEntity.ok(tbpaperService.detail(id));
    }
    @GetMapping("/list")
    public ResponseEntity<List<TbpaperDto.DetailResDto>> list(TbpaperDto.ListReqDto param){
        log.debug("Received ListReqDto: {}", param);
        return ResponseEntity.ok(tbpaperService.list(param));
    }
    @GetMapping("/plist")
    public ResponseEntity<DefaultDto.PagedListResDto> plist(TbpaperDto.PagedListReqDto param){
        return ResponseEntity.ok(tbpaperService.pagedList(param));
    }
    @GetMapping("/mlist")
    public ResponseEntity<List<TbpaperDto.DetailResDto>> mlist(TbpaperDto.ScrollListReqDto param){
        return ResponseEntity.ok(tbpaperService.scrollList(param));
    }
}
