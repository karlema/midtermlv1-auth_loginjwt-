package com.example.hanghaememo.dto;

import lombok.Getter;
import com.example.hanghaememo.entity.Memo;

@Getter
public class MemoRequestDto {
    private String username;
    private String contents;
    private String title;
    private String pwd;

}
