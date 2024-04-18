
package police_killer;

public class Police {
    private String name;
    private int age;
    private String gender;
    private String raceethnicity;
    private String month;
    private int day;
    private int year;
    private String streetaddress;
    private String city;
    private String state;

    public Police() {
    }

    public Police(String name, int age, String gender, String raceethnicity, String month, int day, int year, String streetaddress, String city, String state) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.raceethnicity = raceethnicity;
        this.month = month;
        this.day = day;
        this.year = year;
        this.streetaddress = streetaddress;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRaceethnicity() {
        return raceethnicity;
    }

    public void setRaceethnicity(String raceethnicity) {
        this.raceethnicity = raceethnicity;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return name + "\t" + age + "\t" + gender + "\t" +raceethnicity+ "\t" +month+ "\t" +day+ "\t" +year+ "\t" +
                streetaddress+ "\t" +city+ "\t" +state;
    }
    
    
}
