package com.a8.data.model;

/**
 * Created by fornia on 17-1-18.
 */
public class PlayerStatistic {
    private Long id;
    private Long playerId;
    private Long matchId;
    private Integer goal;
    private Short isStarter;
    private Integer penalty;//点球
    private Integer redCard;
    private Integer yellowCard;
    private Integer offSide;//越位
    private Short isMvp;
    private Float score;


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

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Integer getGoal() {
        return goal;
    }

    public void setGoal(Integer goal) {
        this.goal = goal;
    }

    public Short getIsStarter() {
        return isStarter;
    }

    public void setIsStarter(Short isStarter) {
        this.isStarter = isStarter;
    }

    public Integer getPenalty() {
        return penalty;
    }

    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
    }

    public Integer getRedCard() {
        return redCard;
    }

    public void setRedCard(Integer redCard) {
        this.redCard = redCard;
    }

    public Integer getYellowCard() {
        return yellowCard;
    }

    public void setYellowCard(Integer yellowCard) {
        this.yellowCard = yellowCard;
    }

    public Integer getOffSide() {
        return offSide;
    }

    public void setOffSide(Integer offSide) {
        this.offSide = offSide;
    }

    public Short getIsMvp() {
        return isMvp;
    }

    public void setIsMvp(Short isMvp) {
        this.isMvp = isMvp;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
