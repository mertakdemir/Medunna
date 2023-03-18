package pojos;

public class CStatePostPojo {

    public Country country;

    public String name;

    public CStatePostPojo() {
    }

    public CStatePostPojo(Country country, String name) {
        this.country = country;
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CStatePostPojo{" +
                "country=" + country +
                ", name='" + name + '\'' +
                '}';
    }
}
