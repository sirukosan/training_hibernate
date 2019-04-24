package com.vadik.hibernate.repository.joinedtable;

import com.vadik.hibernate.model.joinedtable.JoinedChild;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoinedChildRepository  extends JpaRepository<JoinedChild, Long> {
}
