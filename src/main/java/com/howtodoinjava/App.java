package com.howtodoinjava;

import com.howtodoinjava.dao.model.Item;
import com.howtodoinjava.dao.model.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class App implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @Autowired
  ItemRepository itemRepository;
  
  @GetMapping("/home")
	public String index() {
		return "Spring Application is Running...";
	}

  @Override
  public void run(String... args) throws Exception {
    itemRepository.save(new Item(null, "Item 1"));
    itemRepository.save(new Item(null, "Item 2"));
  }
}
