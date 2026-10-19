package br.com.kelvyn.sistemacadastro.database.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "aircraft_db")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(onlyExplicitlyIncluded = true)
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Aircraft {

    @Id
    @ToString.Include
    @EqualsAndHashCode.Include
    private String id;

    @ToString.Include
    private String status;

    @ToString.Include
    private String model;

    @ToString.Include
    private String manufacturer;

    @ToString.Include
    private String description;

    @ToString.Include
    private String localization;

    @ToString.Include
    private String serialNumber;

    @ToString.Include
    private int seats;

    @ToString.Include
    private BigDecimal flightHours;

    @ToString.Include
    private LocalDate dateOfManuFacture;

    @ToString.Include
    private LocalDate lastMaintenanceDate;

    @ToString.Include
    private BigDecimal fuel;

    @ToString.Include
    private BigDecimal actualFuel;

    @ToString.Include
    private BigDecimal capacity;

    @ToString.Include
    private BigDecimal velocity;

    @ToString.Include
    private BigDecimal acceleration;

}
