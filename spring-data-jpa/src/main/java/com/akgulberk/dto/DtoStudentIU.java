package com.akgulberk.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentIU {

    @NotEmpty(message = "Firstname alanı boş bırakılamaz!")
    @Min(value = 3)
    @Max(value = 10)
    private String firstName;

    @Size(min = 3, max = 30)
    private String lastName;

    private Date birthOfDate;

    @Email(message = "Email formatında bir adres giriniz!")
    private String email;

    @Size(min = 11, max = 11, message = "Tckn alanı 11 karakter olmalı")
    @NotEmpty(message = "Tckn alanı boş geçilemez")
    private String tckn;
}
