package com.a8.data.mapper;

import com.a8.data.model.Player;
import com.google.inject.Inject;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.junit.Test;

import java.util.List;

/**
 * Created by fornia on 17-1-19.
 */
public interface PlayerMapper {
    String fields = "`id`, `name`, `shortName`, `enName`, `country`, `birthDay`, `avatar`, `type`, `desc`, `CreateTime`, `state`";
    String insertFields = "`name`, `shortName`, `enName`, `country`, `birthDay`, `avatar`, `type`, `desc`, `CreateTime`, `state`";




    @Select({"select ",fields," from a8_player"})
    @Options(timeout = 2)
    public List<Player> getAll();

    @Insert({"insert into a8_player(",insertFields,") values(","#{name}, #{shortName}, #{enName}, #{country}, #{birthDay}, #{avatar}, #{type}, #{desc}, #{CreateTime}, #{state})"})
    @Options(timeout = 2)
    public int add(Player player);

}
