package com.example.demo.entities;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private LocalDate date;
        private double amount;
        private PaymentType type;
        private PaymentStatus status;
        private String file;
        @ManyToOne
        private Student student;
}
