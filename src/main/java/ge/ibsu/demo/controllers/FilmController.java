package ge.ibsu.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ge.ibsu.demo.dto.projections.Cinema;
import ge.ibsu.demo.repositories.FilmRepository;

public class FilmController {

    @Autowired
    private FilmRepository filmRepository;

    @GetMapping("/films")
    public Page<Cinema> searchFilms(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String description,
            @RequestParam(required = false) Integer releaseYear,
            @RequestParam(required = false) String language,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return filmRepository.findByTitleContainingOrDescriptionContainingOrReleaseYearOrLanguageContaining(title,
                description, releaseYear, language, pageable);
    }

}
