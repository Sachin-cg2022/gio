package com.cg.consumer;

import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.assignment.Employee;

@Service
public class EmployeeConsumer
{

  @PostConstruct
  public void consumer()
  {
    String url = "http://producer:8053/getEmployee";
    RestTemplate template = new RestTemplate();
    ResponseEntity<List<Employee>> employees =template.exchange(url, HttpMethod.GET, HttpEntity.EMPTY,
        new ParameterizedTypeReference<List<Employee>>()
        {
          @Override
          public Type getType()
          {
            return super.getType();
          }
        });
    List<Employee> list=employees.getBody();
    System.out.println("Size:"+list.size());
    if(list.size()>0) {
      for(Employee st:list) {
        System.out.println("id:"+st.getId()+"name:"+st.getName());
      }
    }
  }

}





