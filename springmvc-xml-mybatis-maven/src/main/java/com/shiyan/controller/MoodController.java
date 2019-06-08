package com.shiyan.controller;

import com.shiyan.dto.MoodDTO;
import com.shiyan.service.MoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kevinfeng
 * @date 2019-05-25
 */
@Controller
@RequestMapping("/mood")
public class MoodController {
    @Resource
    private MoodService moodService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<MoodDTO> moodDTOList = moodService.findAll();
        model.addAttribute("moods", moodDTOList);
        return "mood";
    }

    @RequestMapping(value = "/{moodId}/praise")
    public String praise(Model model, @PathVariable(value = "moodId") String moodId,
                         @RequestParam(value = "userId") String userId) {
        boolean isPraise = moodService.praiseMood(Integer.parseInt(userId), Integer.parseInt(moodId));

        List<MoodDTO> moodDTOList = moodService.findAll();
        model.addAttribute("moods", moodDTOList);
        model.addAttribute("isPraise", isPraise);
        return "redirect:/mood/findAll";
    }
}
