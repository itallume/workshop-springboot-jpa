package com.itallume.course.config;

import com.itallume.course.entities.Order;
import com.itallume.course.entities.User;
import com.itallume.course.repositories.OrderRepository;
import com.itallume.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "999999999", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "988888888", "123456");
        User u3 = new User(null, "Itallo Oliveira", "itallo@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2024-11-05T10:50:30Z"), u1);
        Order o2 = new Order(null, Instant.parse("2024-07-21T21:40:30Z"), u2);
        Order o3 = new Order(null, Instant.parse("2024-11-09T21:40:30Z"), u3);
        Order o4 = new Order(null, Instant.parse("2024-10-05T12:50:30Z"), u1);
        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));
    }
}
