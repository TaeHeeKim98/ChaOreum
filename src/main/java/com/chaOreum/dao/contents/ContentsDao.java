package com.chaOreum.dao.contents;

import java.util.List;

import com.chaOreum.entity.Post;

public interface ContentsDao {

	List<Post> getList(int category_no, String nickname, String title, String sort, int offset, int size);

}
