package api.cepmanager.entity;

import api.cepmanager.dto.UsersDataDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

    @Embedded
    private Address address;

    public Users(UsersDataDTO usersDataDTO) {
        this.id = usersDataDTO.id();
        this.name = usersDataDTO.name();
        this.cpf = usersDataDTO.cpf();
        this.address = new Address(usersDataDTO.address());
    }
}
