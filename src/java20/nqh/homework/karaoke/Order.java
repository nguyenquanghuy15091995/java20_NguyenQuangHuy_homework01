package java20.nqh.homework.karaoke;

public class Order {
    private float timeStart;
    private float timeEnd;
    private int bottleOfWater;

    public Order(float timeStart, float timeEnd, int bottleOfWater) {
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.bottleOfWater = bottleOfWater;
    }

    public double calculateOrder() {
        if (this.timeStart < OrderConstants.RANGE_TIME[0] || this.timeEnd > OrderConstants.RANGE_TIME[1]) {
            System.err.println("Invalid input! The range of time must be 9 to 24.");
            return 0;
        }
        if (this.timeStart > this.timeEnd) {
            System.err.println("Invalid input! Time start must be less than end time.");
            return 0;
        }

        double priceResult = 0;
        double priceOfWater = bottleOfWater * OrderConstants.PRICE_PER_BOTTLE_OF_WATER;
        int totalTime = Math.round(this.timeEnd - this.timeStart);

        double discountRangeTime = 0;
        if (this.timeStart >= OrderConstants.RANGE_TIME_OF_DISCOUNT[0] && this.timeStart <= OrderConstants.RANGE_TIME_OF_DISCOUNT[1]) {
            discountRangeTime = OrderConstants.DISCOUNT_RANGE_TIME_PERCENTAGE;
        }

        if (totalTime > OrderConstants.NUMBER_OF_FIRST_DISCOUNT) {
            totalTime -= OrderConstants.NUMBER_OF_FIRST_DISCOUNT;
            priceResult += OrderConstants.NUMBER_OF_FIRST_DISCOUNT * OrderConstants.PRICE_PER_HOUR;
        } else {
            priceResult += totalTime * OrderConstants.PRICE_PER_HOUR;
            totalTime = 0;
        }

        if (totalTime > 0) {
            priceResult += totalTime * OrderConstants.NUMBER_OF_FIRST_DISCOUNT * OrderConstants.PRICE_PER_HOUR * OrderConstants.DISCOUNT_FIRST_TIME_PERCENTAGE;
        }

        priceResult += priceOfWater;
        priceResult -= priceResult * discountRangeTime;

        return priceResult;
    }

    public String getStringPrice() {
        return String.format("%.0f", this.calculateOrder());
    }

    public static void main(String[] args) {
        Order order1 = new Order(9, 13, 0);
        System.out.println("Order1: " + order1.getStringPrice()); // 93600
        Order order2 = new Order(19, 20, 1);
        System.out.println("Order2: " + order2.getStringPrice()); // 40000
        Order order3 = new Order(17, 20, 1);
        System.out.println("Order2: " + order3.getStringPrice()); // 80000
    }
}
