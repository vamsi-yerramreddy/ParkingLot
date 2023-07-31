package Models;

import lombok.Getter;

@Getter
public enum InputType {
    CREATE_PARKING_LOT("create_parking_lot"),
    PARK_VEHICLE("park_vehicle"),
    UNPARK_VEHICLE("unpark_vehicle"),
    DISPLAY("display"),
    EXIT("exit");

    private String type;

    InputType(String type){
        this.type= type;
    }
}
