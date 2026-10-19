package br.com.kelvyn.sistemacadastro.dto;

import lombok.*;

//MUDAR CLASSE DEPOIS

@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@Builder
public class AircraftDtoResponse{
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
}
