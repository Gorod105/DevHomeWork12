package org.example.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "planet")
public class Planet {
    @Id
    @Pattern(regexp = "[A-Z,0-9]{1,255}")
    @Column(columnDefinition = "planet_id")
    private String id;
    @Column (name = "name")
    private String name;

}
