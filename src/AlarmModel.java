public class AlarmModel {
    private int time;
    private String description;
    
    public AlarmModel(int time, String description) {
        this.time = time;
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int newTime) {
        time = newTime;
    }

    public void ring() {
        System.out.println("Ring ring ring!\n" + this.description);
    }
}
