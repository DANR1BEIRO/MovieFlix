package br.com.movieflix.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "streaming")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Streaming {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;
}
