package servlet.hibernate4Homework.pojo.cmChapj;

public class CharacterСharacteristic {

    private Integer seasonAppearance;
    private String  job;
    private String  specialty;

    public CharacterСharacteristic(){}

    public CharacterСharacteristic(Integer seasonAppearance, Boolean stillOnShow, String job, String specialty) {
        this.seasonAppearance = seasonAppearance;
        this.job = job;
        this.specialty = specialty;
    }

    public Integer getSeasonAppearance() {
        return seasonAppearance;
    }

    public void setSeasonAppearance(Integer seasonAppearance) {
        this.seasonAppearance = seasonAppearance;
    }



    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
