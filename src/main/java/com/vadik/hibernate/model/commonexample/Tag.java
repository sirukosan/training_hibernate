package com.vadik.hibernate.model.commonexample;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Tag {

    public Tag(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String name;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "tags")
    private Set<Post> posts = new HashSet<>();
}
