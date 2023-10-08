package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Autor")
public class Autor extends Base{
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "apellido")
    private String apellido;

    @Column (name = "biografia", length = 1500 )
    private String biografia;







}
