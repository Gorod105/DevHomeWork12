package org.example.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    String id;
    @Column (name = "name")
    String name;
}
