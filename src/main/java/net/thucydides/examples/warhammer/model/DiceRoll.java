package net.thucydides.examples.warhammer.model;

/**
 * Created by john on 24/10/2014.
 */
public class DiceRoll {

    int ballisticSkill;

    public DiceRoll(int ballisticSkill) {
        this.ballisticSkill = ballisticSkill;
    }

    public static DiceRoll withBalisticSkillOf(int ballisticSkill) {
        return new DiceRoll(ballisticSkill);
    }

    public int getMinimumNeededToHit() {
        return 7 - ballisticSkill;
    }
}
