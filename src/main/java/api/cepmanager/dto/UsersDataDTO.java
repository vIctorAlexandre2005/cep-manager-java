package api.cepmanager.dto;

public record UsersDataDTO(
        Long id,
        String name,
        String cpf,
        AddressDataDTO addressDataDTO
) {
}
