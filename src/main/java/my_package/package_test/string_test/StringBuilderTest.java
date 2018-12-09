package my_package.package_test.string_test;

public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder name = new StringBuilder("Jędrek");

        StringBuilder ala2 = new StringBuilder();

        ala2.append("ala");
        ala2.append(" ma");
        ala2.append(" kota");

        System.out.println(ala2);

//        ala2.append("ala")
//            .append(" ma")
//            .append(" kota");
//
//        System.out.println(ala2);



        ala2.replace(4,6, "miała");

        System.out.println(ala2);

        //String ala2String = ala2.toString();





    }
}
