package Models;
import lombok.Data;

import java.util.List;
@Data
public class ParkingLot {
    private List<Floor> floorList;
    private String parkingLotId;


}
