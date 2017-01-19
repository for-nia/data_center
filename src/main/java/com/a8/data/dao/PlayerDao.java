package com.a8.data.dao;

import com.a8.data.mapper.PlayerMapper;
import com.a8.data.model.Player;
import com.google.inject.Inject;
import java.util.List;

/**
 * Created by fornia on 17-1-19.
 */
public class PlayerDao extends AbstractDao{

    @Inject
    private PlayerMapper playerMapper;


    public void add(Player player){
        playerMapper.add(player);
    }

    public List<Player> getAll(){

        return playerMapper.getAll();
    }


}
