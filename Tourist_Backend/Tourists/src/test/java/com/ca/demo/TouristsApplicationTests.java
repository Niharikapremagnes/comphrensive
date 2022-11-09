package com.ca.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ca.entity.Tourist;
import com.ca.repository.TouristRepository;
import com.ca.service.TouristServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class TouristsApplicationTests {
	
	@Autowired
	private TouristServiceImpl ts;
	
	@MockBean
	private TouristRepository trepo;
	
	@Test
	public void getTouristsTest() {
		when(trepo.findByOrderByFirstnameDesc()).thenReturn(Stream.of(new Tourist(25,"Niharika","P","f",21,"kkd",5),
				new Tourist(7,"Agnes","P","f",22,"kakinada",3)).collect(Collectors.toList()));
		assertEquals(2, ts.getTourists().size());
	}
		
		@Test
		public void createTouristTest() {
			Tourist t=new Tourist(25,"Sasikanth","Thota","M",21,"kkd",5);
			when(trepo.save(t)).thenReturn(t);
			assertEquals(t,ts.createTourist(t));
		}

}
