package api.cepmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

public record DataUpdateAddressDTO(
        @NotNull
        Long id,
        String name,
        String cpf,
        @JsonProperty("address")
        UpdateAddressDTO updateAddressDTO
) {
}
