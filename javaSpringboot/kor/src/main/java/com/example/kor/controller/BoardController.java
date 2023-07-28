package com.example.kor.controller;

import com.example.kor.dto.BoardDto;
import com.example.kor.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

    @Autowired
    private BoardMapper boardMapper;

    @GetMapping("/board")
    public String getBoardList(Model model) {
        model.addAttribute("art", boardMapper.getBoardList());
        return "board";
    }

    @GetMapping("/write")
    public String getBoardWrite() {
        return "write";
    }

    @PostMapping("/write")
    public String setBoardWrite(@ModelAttribute BoardDto boardDto) {

        boardDto.setGrp(boardMapper.maxCnt());

        boardMapper.setBoardWrite(boardDto);
        return "redirect:/board";
    }

    @GetMapping("/view")
    public String getView(@RequestParam int id, Model model) {
        model.addAttribute("art", boardMapper.getView(id));
        return "view";
    }

    @GetMapping("/reply")
    public String getReply(@RequestParam int id, Model model) {
        model.addAttribute("art", boardMapper.getView(id));
        return "reply";
    }

    @PostMapping("/reply")
    public String setReply(@ModelAttribute BoardDto boardDto) {
        BoardDto list = boardMapper.getView(boardDto.getId());

        boardDto.setGrp(list.getGrp());
        boardDto.setDepth(list.getDepth() + 1);

        boardMapper.setReply(boardDto);

        return "redirect:/board";
    }

}
