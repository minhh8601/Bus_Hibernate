package dto;
import entity.Driver;
import entity.BusLine;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DriverBusManagementTempDto {
    Driver driver;
    BusLine busLine;
    Integer round;
}