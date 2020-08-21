package proxy.dynamic;

public class Person implements PersonBean {

    private String name;

    private String gender;

    private String interests;

    private int hotOrNotRating;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public int getHotOrNotRating() {
        return hotOrNotRating;
    }

    @Override
    public void setHotOrNotRating(int hotOrNotRating) {
        this.hotOrNotRating = hotOrNotRating;
    }
}
