package org.example.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_seq")
    @SequenceGenerator(name = "ticket_seq", sequenceName = "seq_ticket_id", allocationSize = 1)
    private Long id;
    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @ToString.Exclude
    @ManyToOne(optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    @ToString.Exclude
    @ManyToOne(optional = false)
    @JoinColumn(name = "from_planet_id", nullable = false)
    private Planet fromPlanet;
    @ToString.Exclude
    @ManyToOne(optional = false)
    @JoinColumn(name = "to_planet_id", nullable = false)
    private Planet toPlanet;


}
