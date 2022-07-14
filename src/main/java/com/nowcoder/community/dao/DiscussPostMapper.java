package com.nowcoder.community.dao;


import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    /**
     *
     * @param userId  将来想要查询自己的userId的时候  当在首页查询的时候不需要管他
     * @param offset  每一页起始行的行号
     * @param limit   每一个显示多少行
     * @return
     */
    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId, @Param("offset") int offset, @Param("limit") int limit);

    // @Param注解用于给参数取别名,  有的参数名比较长可以起别名
    // 如果在sql需要用到动态的条件，并且条件里需要用到参数，且参数只有一个，则参数需要别名
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.
    /**
     * 查询帖子行数
     * @param userId 跟上面一样查村自己的时候有用
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);
}
