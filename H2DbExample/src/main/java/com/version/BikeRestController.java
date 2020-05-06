package com.version;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeRestController
{
	
	@Autowired
	private BikeRepository brepo;
	
	@GetMapping("/bike/save/")
	public void save(@RequestBody Bike entity)
	{
	//	brepo.save(new Bike("Yamaha",150,"SZ-RR"));
	}
	
	@GetMapping("/bike/default")
	public String getDefault()
	{
		brepo.save(new Bike("Yamaha",150,"SZ-RR"));
		return new String("Satya Sreeram");
	}
	
	@GetMapping("/bike/getvalues")
	public List entries()
	{
		return (List)brepo.findAll();
	}
	
	
	
}
