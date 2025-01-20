package com.cleartax.training_superhero.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "superheroes")
public class Superhero
{
    @Id
    private String id;
    private String universe;
    private String name;
    private String power;

    public Superhero()
    {
    }

    public String getId()
    {
        return this.id;
    }

    public String getUniverse()
    {
        return this.universe;
    }

    public String getName() {
        return this.name;
    }

    public String getPower() {
        return this.power;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUniverse(String universe)
    {
        this.universe = universe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(String power)
    {
        this.power = power;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Superhero)) return false;
        final Superhero other = (Superhero) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$universe = this.getUniverse();
        final Object other$universe = other.getUniverse();
        if (this$universe == null ? other$universe != null : !this$universe.equals(other$universe)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$power = this.getPower();
        final Object other$power = other.getPower();
        if (this$power == null ? other$power != null : !this$power.equals(other$power)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Superhero;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $universe = this.getUniverse();
        result = result * PRIME + ($universe == null ? 43 : $universe.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $power = this.getPower();
        result = result * PRIME + ($power == null ? 43 : $power.hashCode());
        return result;
    }

    public String toString() {
        return "Superhero(id=" + this.getId() + ", universe=" + this.getUniverse() + ", name=" + this.getName() + ", power=" + this.getPower() + ")";
    }
}
//
//public class Superhero {
//    private String name;
//    private String power;
//    private String abilities;
//    private String gender;
//    private String universe;
//    private String villains;
//
//    public Superhero() {
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public String getPower() {
//        return this.power;
//    }
//
//    public String getAbilities() {
//        return this.abilities;
//    }
//
//    public String getGender() {
//        return this.gender;
//    }
//
//    public String getUniverse() {
//        return this.universe;
//    }
//
//    public String getVillains() {
//        return this.villains;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPower(String power) {
//        this.power = power;
//    }
//
//    public void setAbilities(String abilities) {
//        this.abilities = abilities;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public void setUniverse(String universe) {
//        this.universe = universe;
//    }
//
//    public void setVillains(String villains) {
//        this.villains = villains;
//    }
//
//    public boolean equals(final Object o) {
//        if (o == this) return true;
//        if (!(o instanceof Superhero)) return false;
//        final Superhero other = (Superhero) o;
//        if (!other.canEqual((Object) this)) return false;
//        final Object this$name = this.getName();
//        final Object other$name = other.getName();
//        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
//        final Object this$power = this.getPower();
//        final Object other$power = other.getPower();
//        if (this$power == null ? other$power != null : !this$power.equals(other$power)) return false;
//        final Object this$abilities = this.getAbilities();
//        final Object other$abilities = other.getAbilities();
//        if (this$abilities == null ? other$abilities != null : !this$abilities.equals(other$abilities)) return false;
//        final Object this$gender = this.getGender();
//        final Object other$gender = other.getGender();
//        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false;
//        final Object this$universe = this.getUniverse();
//        final Object other$universe = other.getUniverse();
//        if (this$universe == null ? other$universe != null : !this$universe.equals(other$universe)) return false;
//        final Object this$villains = this.getVillains();
//        final Object other$villains = other.getVillains();
//        if (this$villains == null ? other$villains != null : !this$villains.equals(other$villains)) return false;
//        return true;
//    }
//
//    protected boolean canEqual(final Object other) {
//        return other instanceof Superhero;
//    }
//
//    public int hashCode() {
//        final int PRIME = 59;
//        int result = 1;
//        final Object $name = this.getName();
//        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
//        final Object $power = this.getPower();
//        result = result * PRIME + ($power == null ? 43 : $power.hashCode());
//        final Object $abilities = this.getAbilities();
//        result = result * PRIME + ($abilities == null ? 43 : $abilities.hashCode());
//        final Object $gender = this.getGender();
//        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
//        final Object $universe = this.getUniverse();
//        result = result * PRIME + ($universe == null ? 43 : $universe.hashCode());
//        final Object $villains = this.getVillains();
//        result = result * PRIME + ($villains == null ? 43 : $villains.hashCode());
//        return result;
//    }
//
//    public String toString() {
//        return "Superhero(name=" + this.getName() + ", power=" + this.getPower() + ", abilities=" + this.getAbilities() + ", gender=" + this.getGender() + ", universe=" + this.getUniverse() + ", villains=" + this.getVillains() + ")";
//    }
//}
