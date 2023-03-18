package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestItemsPostRequest {
   private Integer Price;
   private String Name;

    public TestItemsPostRequest() {
    }

    public TestItemsPostRequest(Integer price) {
        Price = price;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public TestItemsPostRequest(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "TestItemsPostRequest{" +
                "Price=" + Price +
                ", Name='" + Name + '\'' +
                '}';
    }
}

