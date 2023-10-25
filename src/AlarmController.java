import java.util.ArrayList;

public class AlarmController {
    private ArrayList<AlarmModel> alarmsModel;

    public AlarmController(AlarmModel model) {
        this.alarmsModel = new ArrayList<>();
    }


    public void addAlarm(AlarmModel model) {
        alarmsModel.add(model);
    }
    
    public void removeAlarm(AlarmModel model) {
        alarmsModel.remove(model);
    }

    public void ringAlarm(AlarmModel model) {
        model.ring();
    }


}
