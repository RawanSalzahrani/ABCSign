/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcsign;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Level")

public class Level implements java.io.Serializable{
    
     @Id 
     @GeneratedValue
     @Column(name="Id")
     private int id;
     @Column(name="User_name")
     private String userName;
     @Column(name="Learn_level")
     private int learnLevel;
     @Column(name="Challenge_level")
     private int challengeLevel;
     @Column(name="Scores")
     private int scores;

    public Level() {
    }

   
    public Level(String userName, int learnLevel, int challengeLevel, int scores) {
        this.userName = userName;
        this.learnLevel = learnLevel;
        this.challengeLevel = challengeLevel;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLearnLevel() {
        return learnLevel;
    }

    public void setLearnLevel(int learnLevel) {
        this.learnLevel = learnLevel;
    }

    public int getChallengeLevel() {
        return challengeLevel;
    }

    public void setChallengeLevel(int challengeLevel) {
        this.challengeLevel = challengeLevel;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }
     
     
     
     
    
}