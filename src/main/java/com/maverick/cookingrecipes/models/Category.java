package com.maverick.cookingrecipes.models;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Mudassir on 6/13/17.
 */
@Getter
@Setter
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}