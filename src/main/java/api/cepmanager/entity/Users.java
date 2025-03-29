package api.cepmanager.entity;

import api.cepmanager.dto.DataUpdateAddressDTO;
import api.cepmanager.dto.UsersDataDTO;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Table(name = "usuarios")
@Entity(name = "Users")

@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@NoArgsConstructor
public class Users {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private Boolean active;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Timestamp created_at;

    @Embedded
    private Address address;

    public Users(UsersDataDTO usersDataDTO) {
        this.id = usersDataDTO.id();
        this.name = usersDataDTO.name();
        this.cpf = usersDataDTO.cpf();
        this.active = true;
        this.address = new Address(usersDataDTO.address());
    }

    public void updateData(DataUpdateAddressDTO dataUpdate) {
        if (dataUpdate.name() != null) {
            this.name = dataUpdate.name();
        }

        if (dataUpdate.cpf() != null) {
            this.cpf = dataUpdate.cpf();
        }

        if (dataUpdate.updateAddressDTO() != null) {
            this.address.updateInfo(dataUpdate.updateAddressDTO());
        }
    }

    public void delete() {
        this.active = false;
    }
}
