package com.vadik.hibernate.model.tableperclass;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * This is not very different from merely mapping each entity without inheritance.
 * The distinction is apparent when querying the base class,
 * which will return all the sub-class records as well by using a UNION statement in the background.
 *
 * The use of UNION can also lead to inferior performance when choosing this strategy.
 * Another issue is that we can no longer use identity key generation.
 */
@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PerClassParent {

    public PerClassParent(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private String name;
}
