package com.vadik.hibernate.model.tableperclass;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class PerClassChild extends PerClassParent {

    private String childName;
}
