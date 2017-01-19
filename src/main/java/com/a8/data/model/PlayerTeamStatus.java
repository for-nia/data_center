package com.a8.data.model;

import java.util.Date;

/**
 * Created by fornia on 17-1-18.
 */
public class PlayerTeamStatus {
    private Long id;
    private Long playerId;
    private Long teamId;
    private Integer PlayerNo;
    private Date createTime;
    private Short state;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Integer getPlayerNo() {
        return PlayerNo;
    }

    public void setPlayerNo(Integer playerNo) {
        PlayerNo = playerNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }
}
