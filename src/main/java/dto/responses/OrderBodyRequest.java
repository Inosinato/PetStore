package dto.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
public class OrderBodyRequest {

    @JsonProperty
    private int id;
    private int petId;
    private int quantity;
    private LocalDate shipDate;
    private String status;
    private boolean complete;
}
