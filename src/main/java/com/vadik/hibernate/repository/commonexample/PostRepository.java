package com.vadik.hibernate.repository.commonexample;

import com.vadik.hibernate.model.commonexample.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
