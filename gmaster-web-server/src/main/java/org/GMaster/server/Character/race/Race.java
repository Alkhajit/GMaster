package org.GMaster.server.Character.race;


import java.util.Arrays;
import java.util.List;


public class Race {
    public String name;
    public String description;
    String physicalDescription;
    String society;
    String relations;
    String alignment;
    String adventurers;

    public Race(String name, String description, String physicalDescription, String society, String relations, String alignment, String adventurers) {
        this.name = name;
        this.description = description;
        this.physicalDescription = physicalDescription;
        this.society = society;
        this.relations = relations;
        this.alignment = alignment;
        this.adventurers = adventurers;
    }

    public static List<Race> getSampleList(){
        Race dwarf = new Race("Dwarf",
                "Dwarves are a stoic but stern race, ensconced in cities\n" +
                "carved from the hearts of mountains and fiercely\n" +
                "determined to repel the depredations of savage races like\n" +
                "orcs and goblins. More than any other race, the dwarves\n" +
                "have acquired a reputation as dour and humorless\n" +
                "craftsmen of the earth. It could be said that dwarven\n" +
                "history shapes the dark disposition of many dwarves,\n" +
                "for they reside in high mountains and dangerous realms\n" +
                "below the earth, constantly at war with giants, goblins,\n" +
                "and other such horrors. \n",
                "Dwarves are a short and stocky\n" +
                        "race, and stand about a foot shorter than most humans,\n" +
                        "with wide, compact bodies that account for their burly\n" +
                        "appearance. Male and female dwarves pride themselves\n" +
                        "on the length of their hair, and men often decorate their\n" +
                        "beards with a variety of clasps and intricate braids. A cleanshaven\n" +
                        "male dwarf is a sure sign of madness, or worse—no\n" +
                        "one familiar with their race trusts a beardless dwarf",
                "The great distances between their mountain\n" +
                        "citadels account for many of the cultural differences\n" +
                        "that exist within dwarven society. Despite these schisms,\n" +
                        "dwarves throughout the world are characterized by their\n" +
                        "love of stonework, their passion for stone- and metal-based\n" +
                        "craftsmanship and architecture, and a fierce hatred of\n" +
                        "giants, orcs, and goblinoids.",
                "Dwarves and orcs have long dwelt in\n" +
                        "proximity, theirs a history of violence as old as both\n"+
                        "their races. Dwarves generally distrust and shun halforcs.\n" +
                        "They find half lings, elves, and gnomes to be too\n" +
                        "frail, f lighty, or “pretty” to be worthy of proper respect.\n" +
                        "It is with humans that dwarves share the strongest link,\n" +
                        "for humans’ industrious nature and hearty appetites\n" +
                        "come closest to matching those of the dwarven ideal. ",
                "Dwarves are driven by honor\n" +
                        "and tradition, and while they are often satirized as\n" +
                        "standoffish, they have a strong sense of friendship and\n" +
                        "justice, and those who win their trust understand that,\n" +
                        "while they work hard, they play even harder—especially\n" +
                        "when good ale is involved. Most dwarves are lawful good.\n" +
                        "They prefer to worship deities whose tenets match these\n" +
                        "traits, and Torag is a favorite among dwarves, though\n" +
                        "Abadar and Gorum are common choices as well.",
                "Although dwarven adventurers are rare\n" +
                        "compared to humans, they can be found in most regions\n" +
                        "of the world. Dwarves often leave the confines of their\n" +
                        "redoubts to seek glory for their clans, to find wealth with\n" +
                        "which to enrich the fortress-homes of their birth, or to\n" +
                        "reclaim fallen dwarven citadels from racial enemies.\n" +
                        "Dwarven warfare is often characterized by tunnel\n" +
                        "fighting and melee combat, and as such most dwarves\n" +
                        "tend toward classes such as fighters and barbarians. ");
        Race elf = new Race("Elf","ElfDescription","ElfPhysicalDescription","ElfSociety","ElfRelations","ElfAlignment","ElfAdventurers");

        return Arrays.asList(elf,dwarf);
    }
}
