package practice.challenge.challengeanton1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenericDataBaseLogic {

    private List<Device> tvDbList;
    {
        tvDbList = new ArrayList<>();
        tvDbList.add( new TV(1445, "4k", 67, 1,
                "Samsung Fd", "X1", "Samsung", 222, LocalDate.now()));
    }


    private List<Object> lightBDbList = new ArrayList<>();
    {
        lightBDbList.add(new LightBulb("red", 1234, "455W", "23",
                1232432, "Xiaomi", "Mi Pro",
                " Xiaomi", 222, LocalDate.now()));
    }


    public List<Device> getTvDbList(){
        return tvDbList;
    }

    public Device getTvById(long id){
        for(Device tv : tvDbList){
            if (tv.getId() == id){
                return tv;
            }
        }
        return null;
    }

    public void saveTv(TV tv){
        tvDbList.add(tv);
    }

    public void deleteTv(TV tv){
        tvDbList.remove(tv);
    }

    public void deleteTvById(long id){
        tvDbList.remove(getTvById(id));
    }

    public void updateTv(long id, TV updatedTv){
        TV toBeUpdate = (TV) getTvById(id);
        toBeUpdate.setId(updatedTv.getId());
        toBeUpdate.setName(updatedTv.getName());
        toBeUpdate.setModel(updatedTv.getModel());
        toBeUpdate.setBrand(updatedTv.getBrand());
        toBeUpdate.setResolution(updatedTv.getResolution());
        toBeUpdate.setRefreshHZ(updatedTv.getRefreshHZ());
        toBeUpdate.setScreenSize(toBeUpdate.getScreenSize());
    }
}