public class BonusMilesService {
    public int calculate(int price) {
        int percent = 20;
        int bonus = price / percent;
        return bonus;
    }
}
