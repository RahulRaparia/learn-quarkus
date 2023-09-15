package org.acuver;

import java.util.Objects;

public class Fruit {

    private String name;
    private String description;
    private String id;

    public Fruit() {
    }

    public Fruit(String name, String description, String id) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Fruit)){
            return false;
        }

        Fruit other = (Fruit) obj;

        return Objects.equals(other, obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

	public Object getDescription() {
		return description;
	}
    
}
