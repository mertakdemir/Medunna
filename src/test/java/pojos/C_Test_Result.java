package pojos;

public class C_Test_Result {
    private int id;
    private String name;
    private Object result;
    private Object description;
    private String maxValue;
    private String minValue;
    private double price;
    private int testId;
    private String date;

    public C_Test_Result() {
    }

    public C_Test_Result(int id, String name, Object result, Object description, String maxValue, String minValue, double price, int testId, String date) {
        this.id = id;
        this.name = name;
        this.result = result;
        this.description = description;
        this.maxValue = maxValue;
        this.minValue = minValue;
        this.price = price;
        this.testId = testId;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "C_Test_Result{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", result=" + result +
                ", description=" + description +
                ", maxValue='" + maxValue + '\'' +
                ", minValue='" + minValue + '\'' +
                ", price=" + price +
                ", testId=" + testId +
                ", date='" + date + '\'' +
                '}';
    }
}
