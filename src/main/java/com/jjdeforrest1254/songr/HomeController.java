package com.jjdeforrest1254.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;



@Controller
public class HomeController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/")
    public String getHome(Model m) {
        return "home";
    }

    @GetMapping("/hello")
    public String hello(Model m) {
        return "hello";
    }

    @PostMapping("/albumss")
    public RedirectView posAlbums(String title, String artist, Integer songCount, Integer length, String imageUrl) {
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        System.out.println(newAlbum);
        albumRepository.save(newAlbum);

        return new RedirectView("/albums");

    }



    @GetMapping("/albums")
    public String getAlbums(Model m){
                List<Album> albums = albumRepository.findAll();
        System.out.println(albums);
        m.addAttribute("albums", albums);
        return "albums";
    }

    @GetMapping("/capitalize/{string}")
    public String caps(@PathVariable String string, Model m) {
        String word = string.toUpperCase();
        m.addAttribute("capitalize", word);
        return "caps";
    }


    @ControllerAdvice
    public class RestResponseEntityExceptionHandler
            extends ResponseEntityExceptionHandler {

        @ExceptionHandler(value
                = { IllegalArgumentException.class, IllegalStateException.class })
        protected ResponseEntity<Object> handleConflict(
                RuntimeException ex, WebRequest request) {
            String bodyOfResponse = "This should be application specific";
            return handleExceptionInternal(ex, bodyOfResponse,
                    new HttpHeaders(), HttpStatus.CONFLICT, request);
        }
    }

}
