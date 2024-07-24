package com.wikimedia.consumer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "wikimedia_recent_change")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wikimedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition="LONGTEXT",length = 16777215)
    private String data;
}
