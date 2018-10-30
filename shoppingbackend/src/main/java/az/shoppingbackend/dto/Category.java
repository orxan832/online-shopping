package az.shoppingbackend.dto;

public class Category {
	
	private long id;
	private String name;
	private String description;
	private String imageUrl;
	private boolean active = true;
	
	public Category(long id, String name, String description, String imageUrl, boolean active) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
		this.active = active;
	}

	public Category(String name, String description, String imageUrl, boolean active) {
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
		this.active = active;
	}

	public Category() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
	
	

}
