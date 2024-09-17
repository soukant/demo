package com.example.demo.web;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Payment;
import com.example.demo.entities.PaymentStatus;
import com.example.demo.entities.PaymentType;
import com.example.demo.entities.Student;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PaymentRestController {

    private StudentRepository studentRepository;
    private PaymentRepository paymentRepository;
    

    public PaymentRestController(PaymentRepository paymentRepository,StudentRepository studentRepository) {
        this.paymentRepository = paymentRepository;
        this.studentRepository = studentRepository;
    }

    @GetMapping("/payments")
    public List<Payment> AllPayments() {
        return paymentRepository.findAll();
    }

    @GetMapping("/students/{code}/payments")
    public List<Payment> paymentsByStudent( @PathVariable String code) {
        return paymentRepository.findByStudentCode(code);
    }

    @GetMapping("/payments/byStatus")
    public List<Payment> paymentsByStatus( @RequestParam PaymentStatus status) {
        return paymentRepository.findByStatus(status);
    }

    @GetMapping("/payments/byType")
    public List<Payment> paymentsByType( @RequestParam PaymentType type) {
        return paymentRepository.findByType(type);
    }


    @GetMapping("/payments/{id}")
    public Payment getPaymenetById (@PathVariable Long id)
    {
        return paymentRepository.findById(id).get();
    }

    @GetMapping("/students")
    public List<Student> allStudents(){
        return studentRepository.findAll();
    }
    
    @GetMapping("/students/{code}")
    public Student getStudentByCode(String code){

        return studentRepository.findBycode(code);
    }

    @GetMapping("/studentsByProgramId")
    public List<Student> getStudentsByProgramId(@RequestParam String programId)
    {
        return studentRepository.findByProgramId(programId);
    }
}
