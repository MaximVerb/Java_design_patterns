package maxim.patterns.creational.builder.concrete_builder;

import java.time.LocalDate;

public class Person {
    enum Gender { M, V}
    private final String name;
    private final String favoriteQuote;
    private final LocalDate birthday;
    private final Gender gender;
    private final int age;

    private Person(PersonBuilder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.birthday = builder.birthday;
        this.gender = builder.gender;
        this.favoriteQuote = builder.favoriteQuote;
    }

    public static class PersonBuilder{
        private final String name; //non-optional parameters for the builder
        private final LocalDate birthday; //due to use of final
        private final Gender gender;
        private final int age;

        private String favoriteQuote = " ";  //optional parameter, with a default value

        public PersonBuilder(String name, LocalDate birthday, Gender gender, int age) {
            this.name = name;
            this.birthday = birthday;
            this.gender = gender;
            this.age = age;
        }

        public PersonBuilder fillInFavoriteQuote(String favoriteQuote) {
            this.favoriteQuote = favoriteQuote;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
