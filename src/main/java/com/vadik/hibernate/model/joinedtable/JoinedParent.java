package com.vadik.hibernate.model.joinedtable;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * The disadvantage of this inheritance mapping method is that retrieving entities
 * requires joins between tables, which can result in lower performance for large numbers of records.
 *
 * The number of joins is higher when querying the parent class
 * as it will join with every single related child –
 * so performance is more likely to be affected the higher up the hierarchy we want to retrieve records.
 */
@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class JoinedParent {

    public JoinedParent(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private long id;

    private String name;
}
