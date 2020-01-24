package com.jjdeforrest1254.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping
    public String getHome(Model m){
        return "home";

    }

    @GetMapping("/albums")
    public String getAlbums(Model m){
        List<Album> list = new LinkedList<>();
        Album album = new Album("joker", "serious", 10, 12, "https://media.giphy.com/media/RW9sy8IngoQQU/giphy.gif");
        Album second = new Album("bane", "darkness is your alley", 5, 7, "https://media.giphy.com/media/I8SQMuIELiw0w/giphy.gif");
        Album third = new Album("thanos", "The hardest choices require the strongest wills", 5, 7, "https://media.giphy.com/media/xUOxeZn47mrdabqDNC/giphy.gif");
        list.add(album);
        list.add(second);
        list.add(third);
        m.addAttribute("albums", list);
        return "albums";
    }

    @GetMapping("/capitalize/{string}")
    public String caps(@PathVariable String string, Model m) {
        String word = string.toUpperCase();
        m.addAttribute("capitalize", word);
        return "caps";
    }







}
