package com.example.hanghaememo.controller;

import com.example.hanghaememo.dto.MemoRequestDto;
import com.example.hanghaememo.dto.RegisterRequestDto;
import com.example.hanghaememo.service.MemoService;
import com.example.hanghaememo.entity.Memo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class MemoController {

    private final MemoService memoService;
    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

    @PostMapping("/api/memos")
    public Memo createMemo(@RequestBody MemoRequestDto requestDto)
    {
        return memoService.createMemo(requestDto);
    }

    @GetMapping("/api/memos")
    public List<Memo> getMemos()
    {
        return memoService.getMemos();
    }
    @PutMapping("/api/memos/{id}")
    public Long updateMemo(@PathVariable Long id,@RequestBody MemoRequestDto requestDto) {
        String pwd="1234";
        return memoService.update(id,pwd,requestDto);
    }

    @DeleteMapping("/api/memos/{id}/{pwd}")
    public Long deleteMemo(@PathVariable Long id,@PathVariable String pwd,@RequestBody MemoRequestDto requestDto) {
        return memoService.deleteMemo(id,pwd,requestDto);
    }
}
