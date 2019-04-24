package com.vadik.hibernate.model.mappedsuperclass;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * If we’re using this strategy, ancestors cannot contain associations with other entities.
 */
@Data
@NoArgsConstructor
@MappedSuperclass
public class MappedSuperClazz {

    public MappedSuperClazz(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private long id;

    private String name;

}
