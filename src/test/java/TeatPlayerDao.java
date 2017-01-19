import com.a8.data.Manager;
import com.a8.data.dao.PlayerDao;
import com.a8.data.mapper.PlayerMapper;
import com.a8.data.model.Player;
import org.junit.Test;

import java.util.Date;

/**
 * Created by fornia on 17-1-19.
 */
public class TeatPlayerDao {
    @Test
    public void testGetAll(){
        Manager manager = Manager.getInstance();
        PlayerDao playerDao = manager.getInjector().getInstance(PlayerDao.class);
        playerDao.getAll();
    }

    @Test
    public void testAdd(){
        Player player = new Player();
        player.setAvatar("hhhh");
        player.setBirthDay(new Date());
        player.setCountry("china");
        player.setName("xiaoFu");
        player.setEnName("littleFu");
        player.setCreateTime(new Date());
        player.setType(Short.valueOf("1"));
        Manager manager = Manager.getInstance();
        //PlayerDao playerDao = manager.getInjector().getInstance(PlayerDao.class);
        //playerDao.add(player);
        PlayerMapper mapper = manager.getInjector().getInstance(PlayerMapper.class);
        mapper.add(player);
    }
}
