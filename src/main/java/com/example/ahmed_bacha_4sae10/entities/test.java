package com.example.ahmed_bacha_4sae10.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class test {
    @Id
    private int id;
}
