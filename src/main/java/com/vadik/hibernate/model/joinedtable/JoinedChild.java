package com.vadik.hibernate.model.joinedtable;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "child_id")
public class JoinedChild extends JoinedParent {

    public JoinedChild(String name, String childName) {
        super(name);
        this.childName = childName;
    }

    private String childName;
}
