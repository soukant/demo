package com.example.demo;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Payment;
import com.example.demo.entities.PaymentStatus;
import com.example.demo.entities.PaymentType;
import com.example.demo.entities.Student;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository,PaymentRepository paymentRepository)
	{

		return args -> {
			studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
			.firstName("Mohamed").code("112233").programId("SDIA")
			.build());
			studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
			.firstName("Amine").code("112244").programId("ENSA")
			.build());
			studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
			.firstName("Yassmine").code("112255").programId("EMSI")
			.build());
			studentRepository.save(Student.builder().id(UUID.randomUUID().toString())
			.firstName("Ikram").code("112266").programId("SDIA")
			.build());

			PaymentType[] paymentTypes = PaymentType.values();
			Random random = new Random ();
			studentRepository.findAll().forEach(st-> {

				for (int i = 0 ; i<10; i++) {
					int index = random.nextInt(paymentTypes.length);
					Payment payment = Payment.builder()
					.amount(1000+(int)(Math.random()+20000))
					.type(paymentTypes[index])
					.status(PaymentStatus.CREATED)
					.date(LocalDate.now())
					.student(st)
					.build();

					paymentRepository.save(payment);
				}
			});
		};

	}
}
