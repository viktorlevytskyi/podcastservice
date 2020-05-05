package com.example.podcastservice.controllers;

import com.example.podcastservice.models.Episode;
import com.example.podcastservice.models.Podcast;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("podcasts")
public class PodcastController {
    private List<Podcast> podcasts = Arrays.asList(
            new Podcast(1, "TV Toronto", Arrays.asList(
                    new Episode(1, "Kyva", LocalDateTime.of(2020, 05, 05, 23, 00)),
                    new Episode(2, "Zelensky", LocalDateTime.of(2020, 05, 06, 23, 00))
            )),
            new Podcast(2, "Geek Journal", Arrays.asList(
                new Episode(3, "Jocker", LocalDateTime.of(2020, 05, 05, 16, 00))
            ))
    );


    @RequestMapping("/{podcastId}")
    public Podcast getPodcast(@PathVariable Integer podcastId) {
        return podcasts.stream().filter(podcast -> podcast.getId().equals(podcastId)).findFirst().orElse(null);
    }
}
