package cakes;

import lombok.Data;

@Data
public class InMemoryCatalog implements Catalog {
	
	private final String name;
	private final double price;
	
}
