package com.vadik.hibernate.model.mappedsuperclass;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class MappedSubClazz2 extends MappedSuperClazz {

    private String field2;
}
