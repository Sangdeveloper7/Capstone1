//package com.thc.fallsprbasic.controller;
//
//import com.thc.fallsprbasic.dto.DefaultDto;
//import com.thc.fallsprbasic.dto.TbpapertypeDto;
//import com.thc.fallsprbasic.service.TbpapertypeService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RequestMapping("/api/tbpapertype")
//@RestController
//public class TbpapertypeRestController {
//
//    private final TbpapertypeService tbpapertypeService;
//    public TbpapertypeRestController(
//            TbpapertypeService tbpapertypeService
//    ) {
//        this.tbpapertypeService = tbpapertypeService;
//    }
//
//    /**/
//    @PostMapping("")
//    public ResponseEntity<DefaultDto.CreateResDto> create(@RequestBody TbpapertypeDto.CreateReqDto param){
//        return ResponseEntity.ok(tbpapertypeService.create(param));
//    }
//    @PutMapping("")
//    public ResponseEntity<String> update(@RequestBody TbpapertypeDto.UpdateReqDto param){
//        tbpapertypeService.update(param);
//        return ResponseEntity.ok().build();
//    }
//    @DeleteMapping("")
//    public ResponseEntity<String> delete(@RequestBody TbpapertypeDto.UpdateReqDto param){
//        tbpapertypeService.delete(param.getId());
//        return ResponseEntity.ok().build();
//    }
//
//    @GetMapping("/detail")
//    public ResponseEntity<TbpapertypeDto.DetailResDto> detail(@RequestParam Long id){
//        return ResponseEntity.ok(tbpapertypeService.detail(id));
//    }
//    @GetMapping("/list")
//    public ResponseEntity<List<TbpapertypeDto.DetailResDto>> list(TbpapertypeDto.ListReqDto param){
//        return ResponseEntity.ok(tbpapertypeService.list(param));
//    }
//    @GetMapping("/plist")
//    public ResponseEntity<DefaultDto.PagedListResDto> plist(TbpapertypeDto.PagedListReqDto param){
//        return ResponseEntity.ok(tbpapertypeService.pagedList(param));
//    }
//    @GetMapping("/mlist")
//    public ResponseEntity<List<TbpapertypeDto.DetailResDto>> mlist(TbpapertypeDto.ScrollListReqDto param){
//        return ResponseEntity.ok(tbpapertypeService.scrollList(param));
//    }
//}
