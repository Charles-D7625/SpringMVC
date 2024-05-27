package com.example.project_test.members.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project_test.members.models.MembersModel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/members")
public class MembersController {

    private List<MembersModel> members = new ArrayList<>();

    @GetMapping("")
    public String showMembers(Model model) {
        model.addAttribute("members", members);
        return "members/members";
    }

    @GetMapping("/new-member")
    public String showNewMember() {
        return "members/new_member";
    }

    @PostMapping("/new-member/create")
    public String createMember(@RequestParam String firstName, @RequestParam String lastName, Model model) {
        
        System.out.printf("Firstname: %s\nLastname: %s", firstName, lastName);
        members.add(new MembersModel(firstName, lastName));
        return "redirect:/members";
    }
}
