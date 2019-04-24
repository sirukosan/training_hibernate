package com.vadik.hibernate.repository.commonexample;

import com.vadik.hibernate.model.commonexample.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
