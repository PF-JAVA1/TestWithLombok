public class Programmer {
    private String id;
    private String name;
    private byte age;

    public Programmer() {
    }

    public Programmer(String id, String name, byte age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static ProgrammerBuilder builder() {
        return new ProgrammerBuilder();
    }

    public static class ProgrammerBuilder {
        private String id;
        private String name;
        private byte age;

        ProgrammerBuilder() {
        }

        public Programmer.ProgrammerBuilder id(String id) {
            this.id = id;
            return this;
        }

        public Programmer.ProgrammerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Programmer.ProgrammerBuilder age(byte age) {
            this.age = age;
            return this;
        }

        public Programmer build() {
            return new Programmer(id, name, age);
        }

        @Override
        public String toString() {
            return "Programmer.ProgrammerBuilder{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
