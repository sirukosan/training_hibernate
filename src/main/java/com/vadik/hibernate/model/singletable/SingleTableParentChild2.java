package com.vadik.hibernate.model.singletable;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class SingleTableParentChild2 extends SingleTableParent {
    private String childField2;
}
