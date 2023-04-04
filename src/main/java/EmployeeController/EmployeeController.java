package EmployeeController;

import col.collectionOne.oneCollection.Service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/employee")
    public class EmployeeController {
        public  final EmployeeService employeeService;
        public EmployeeController (EmployeeService employeeService){
            this. employeeService = employeeService;
        }
        @GetMapping("/add")
        public col.collectionOne.oneCollection.data.Employee add(@RequestParam String firstName, @RequestParam String lastName){
            return  employeeService.add(firstName,lastName);
        }
        @GetMapping("/remove")
        public col.collectionOne.oneCollection.data.Employee remove (@RequestParam String firstName, @RequestParam String lastName){
            return  employeeService.remove(firstName, lastName);
        }
        @GetMapping ("/find")
        public col.collectionOne.oneCollection.data.Employee find (@RequestParam String firstName, @RequestParam String lastName){
            return employeeService.find(firstName, lastName);
        }
        @GetMapping
        public List<col.collectionOne.oneCollection.data.Employee> List(){
            return employeeService.list();
        }

        private class Employee {
        }
    }


