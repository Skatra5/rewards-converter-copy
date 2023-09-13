public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }
//
    // Method to get the cash value of RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value of RewardValue
    public double getMilesValue() {
        return milesValue;
    }
}

//