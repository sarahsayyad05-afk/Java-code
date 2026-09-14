import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
    private String orderId;
    private String customerName;
    private double amountSpent;

    public Order(String orderId, String customerName, double amountSpent) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amountSpent = amountSpent;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmountSpent() {
        return amountSpent;
    }

 
    public String toString() {
        return "Order{" +"orderId='" + orderId + '\'' +", customerName='" + customerName + '\'' + ", amountSpent=" + amountSpent +'}';
    }
}

public class Example2 {
    public static void main(String[] args) {
                List<Order> orders = Arrays.asList(
            new Order("O001", "ABC", 150.75),
            new Order("O002", "PQR", 200.50),
            new Order("O003", "ABC", 99.99),
            new Order("O004", "XYZ", 125.00),
            new Order("O005", "PQR", 75.25),
            new Order("O006", "XYZ", 180.00)
        );

System.out.println(
    "Grouped by Customer Name and total amount spent: "+orders.stream().collect(
        Collectors.groupingBy(
            x->x.getCustomerName(),Collectors.summingDouble(x->x.getAmountSpent())
        )
    )
);
System.out.println(
    "Grouped by Customer Name and number of orders: "+orders.stream().collect(
        Collectors.groupingBy(
            x->x.getCustomerName(), Collectors.counting()
        
        )));
Map<String,Double>  maporder=orders.stream().distinct().collect(
    Collectors.toMap( a->a.getOrderId() , a-> a.getAmountSpent()
)
);
System.out.println("Map of ID and price: "+ maporder);




    }
}
