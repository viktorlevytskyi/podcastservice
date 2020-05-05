package com.example.podcastservice.models;

import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Episode {
    Integer id;
    String name;
    LocalDateTime startTime;
}
