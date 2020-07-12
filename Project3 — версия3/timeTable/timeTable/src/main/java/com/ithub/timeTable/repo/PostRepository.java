package com.ithub.timeTable.repo;

import com.ithub.timeTable.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
