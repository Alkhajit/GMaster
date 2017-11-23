package org.GMaster.server.Character.Base;

public class Character {
  public String  characterName;
    public int characterLevel;
    public String alignment;
    public String player;
    public String deity;
    public String homeland;
    public String race;
    public String size;
    public String gender;
    public String age;



    public int height;
    public int weight;
    public String hair;
    public String eyes;

    public Character(String characterName, int characterLevel, String alignment, String player, String deity, String homeland, String race, String size, String gender, String age, int height, int weight, String hair, String eyes) {
        this.characterName = characterName;
        this.characterLevel = characterLevel;
        this.alignment = alignment;
        this.player = player;
        this.deity = deity;
        this.homeland = homeland;
        this.race = race;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hair = hair;
        this.eyes = eyes;
    }
}
