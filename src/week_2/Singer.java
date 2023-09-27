package week_2;

public class Singer {
    private String name;
    private String gender;
    private String nationality;
    private Date debutyear;

    Singer(String name,String gender,String nationality,Date debutyear){
        this.name=name;
        this.gender=gender;
        this.nationality=nationality;
        this.debutyear=debutyear;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDebutyear() {
        return debutyear;
    }

    public void setDebutyear(Date debutyear) {
        this.debutyear = debutyear;
    }
    public String toString(){
        return String.format("singer name is %s\n gender:%s\nnationality:%s\ndebutdate is %s",name,gender,nationality,debutyear);
    }
}
