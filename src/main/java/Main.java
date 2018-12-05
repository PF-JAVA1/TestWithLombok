public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setId("P001");
        p.setName("Programmer 1");
        p.setAge((byte) 10);
        System.out.println(p.toString());

        Programmer p2 = new Programmer("P002", "Programmer 2", (byte) 20);
        System.out.println(p2.toString());

        Programmer p3 = Programmer.builder()
                .id("P003").name("Programmer 3").age((byte) 30).build();
        System.out.println(p3.toString());
    }
}
