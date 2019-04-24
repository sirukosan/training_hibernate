package com.vadik.hibernate.model.singletable;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * This strategy has the advantage of polymorphic query performance since
 * only one table needs to be accessed when querying parent entities.
 * On the other hand, this also means that we can no longer use
 * NOT NULL constraints on sub-class entity properties.
 */
@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class SingleTableParent {

    public SingleTableParent(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private long id;
    private String name;
}
