package com.github.andreisuslov.wordsearchapi.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/wordgrid")
public class WordSearchController {
    // creating query parameters

    @PostMapping
    public String createWordGrid(int gridSize, List<String> words) {
        return "";
    }

}
