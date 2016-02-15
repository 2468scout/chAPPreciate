package com.maxkrass.appreciate.objects;


/**
 * Max made this for APPreciate on 18.12.2015 for APPreciate.
 */
public class MatchRecord extends Record {


    int autoPoints;
    int totalPoints;
    int matchNumber;
    String autoComment;
    String teleComment;
    Boolean pickPort;
    Boolean pickChevel;
    Boolean pickMoat;
    Boolean pickRamp;
    Boolean pickSally;
    Boolean pickRock;
    Boolean pickRough;
    Boolean startWithBall;
    Boolean autoSpy;

    Boolean reachedDefense;
    String defenseReach;
    int lowGoalAuto;
    int highGoalAuto;
    Boolean secreatPassage;
    Boolean netural;
    Boolean courtYard;
    Boolean steal;
    Boolean block;
    Boolean push;
    Boolean canPickUp;
    Boolean fast;
    Boolean penalty;
    Boolean breach;
    Boolean capture;
    Boolean scale;

    public boolean isFast2() {
        return fast2;
    }

    public void setFast2(boolean fast2) {
        this.fast2 = fast2;
    }

    public boolean isFast3() {
        return fast3;
    }

    public void setFast3(boolean fast3) {
        this.fast3 = fast3;
    }

    public boolean isFast4() {
        return fast4;
    }

    public void setFast4(boolean fast4) {
        this.fast4 = fast4;
    }

    public boolean isFast5() {
        return fast5;
    }

    public void setFast5(boolean fast5) {
        this.fast5 = fast5;
    }

    boolean fast2;
    boolean fast3;
    boolean fast4;
    boolean fast5;


    int defenseSpinner;

    public int getSpinner2() {
        return spinner2;
    }

    public void setSpinner2(int spinner2) {
        this.spinner2 = spinner2;
    }

    public int getSpinner3() {
        return spinner3;
    }

    public void setSpinner3(int spinner3) {
        this.spinner3 = spinner3;
    }

    public int getSpinner4() {
        return spinner4;
    }

    public void setSpinner4(int spinner4) {
        this.spinner4 = spinner4;
    }

    public int getSpinner5() {
        return spinner5;
    }

    public void setSpinner5(int spinner5) {
        this.spinner5 = spinner5;
    }

    int spinner2;
    int spinner3;
    int spinner4;
    int spinner5;

    public void setDefenseSpinner(int defenseSpinner){
        this.defenseSpinner=defenseSpinner;
    }
    public int getDefenseSpinner(){ return defenseSpinner;}





    public Boolean getPickPort() {
        return pickPort;
    }

    public void setPickPort(Boolean pickPort) {
        this.pickPort = pickPort;
    }

    public Boolean getPickChevel() {
        return pickChevel;
    }

    public void setPickChevel(Boolean pickChevel) {
        this.pickChevel = pickChevel;
    }

    public Boolean getPickMoat() {
        return pickMoat;
    }

    public void setPickMoat(Boolean pickMoat) {
        this.pickMoat = pickMoat;
    }

    public Boolean getPickRamp() {
        return pickRamp;
    }

    public void setPickRamp(Boolean pickRamp) {
        this.pickRamp = pickRamp;
    }

    public Boolean getPickSally() {
        return pickSally;
    }

    public void setPickSally(Boolean pickSally) {
        this.pickSally = pickSally;
    }

    public Boolean getPickRock() {
        return pickRock;
    }

    public void setPickRock(Boolean pickRock) {
        this.pickRock = pickRock;
    }

    public Boolean getPickRough() {
        return pickRough;
    }

    public void setPickRough(Boolean pickRough) {
        this.pickRough = pickRough;
    }

    public Boolean getStartWithBall() {
        return startWithBall;
    }

    public void setStartWithBall(Boolean startWithBall) {
        this.startWithBall = startWithBall;
    }

    public Boolean getAutoSpy() {
        return autoSpy;
    }

    public void setAutoSpy(Boolean autoSpy) {
        this.autoSpy = autoSpy;
    }

    public Boolean getReachedDefense() {
        return reachedDefense;
    }

    public void setReachedDefense(Boolean reachedDefense) {
        this.reachedDefense = reachedDefense;
    }

    public String getDefenseReach() {
        return defenseReach;
    }

    public void setDefenseReach(String defenseReach) {
        this.defenseReach = defenseReach;
    }

    public int getLowGoalAuto() {
        return lowGoalAuto;
    }

    public void setLowGoalAuto(int lowGoalAuto) {
        this.lowGoalAuto = lowGoalAuto;
    }

    public int getHighGoalAuto() {
        return highGoalAuto;
    }

    public void setHighGoalAuto(int highGoalAuto) {
        this.highGoalAuto = highGoalAuto;
    }

    public Boolean getSecreatPassage() {
        return secreatPassage;
    }

    public void setSecreatPassage(Boolean secreatPassage) {
        this.secreatPassage = secreatPassage;
    }

    public Boolean getNetural() {
        return netural;
    }

    public void setNetural(Boolean netural) {
        this.netural = netural;
    }

    public Boolean getCourtYard() {
        return courtYard;
    }

    public void setCourtYard(Boolean courtYard) {
        this.courtYard = courtYard;
    }

    public Boolean getSteal() {
        return steal;
    }

    public void setSteal(Boolean steal) {
        this.steal = steal;
    }

    public Boolean getBlock() {
        return block;
    }

    public void setBlock(Boolean block) {
        this.block = block;
    }

    public Boolean getPush() {
        return push;
    }

    public void setPush(Boolean push) {
        this.push = push;
    }

    public Boolean getCanPickUp() {
        return canPickUp;
    }

    public void setCanPickUp(Boolean canPickUp) {
        this.canPickUp = canPickUp;
    }

    public Boolean getFast() {
        return fast;
    }

    public void setFast(Boolean fast) {
        this.fast = fast;
    }

    public Boolean getPenalty() {
        return penalty;
    }

    public void setPenalty(Boolean penalty) {
        this.penalty = penalty;
    }

    public Boolean getBreach() {
        return breach;
    }

    public void setBreach(Boolean breach) {
        this.breach = breach;
    }

    public Boolean getCapture() {
        return capture;
    }

    public void setCapture(Boolean capture) {
        this.capture = capture;
    }

    public Boolean getScale() {
        return scale;
    }

    public void setScale(Boolean scale) {
        this.scale = scale;
    }








    public int getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(int matchNumber) {
        this.matchNumber = matchNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public int getAutoPoints() {
        return autoPoints;
    }

    public void setAutoPoints(int autoPoints) {
        this.autoPoints = autoPoints;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public String getAutoComment() {
        return autoComment;
    }

    public void setAutoComment(String autoComment) {
        this.autoComment = autoComment;
    }

    public String getTeleComment() {
        return teleComment;
    }

    public void setTeleComment(String teleComment) {
        this.teleComment = teleComment;
    }




    public MatchRecord() {

	}
}
