package br.com.villas.payrollapi.resources;

import br.com.villas.payrollapi.domain.Payroll;
import br.com.villas.payrollapi.domain.User;
import br.com.villas.payrollapi.feignClients.UserFeign;
import br.com.villas.payrollapi.services.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    @Autowired
    private PayrollService service;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(service.getPayment(workerId,payment));
    }
}
