package inner_class;

import java.util.ArrayList;
import java.util.List;

public class House {
    private String houseName;
    List<Apartment> apartmentList;

    public House(String houseName){
        this.houseName=houseName;
        for(int i=0; i < 1000; i++){
            apartmentList.add(new Apartment(30));
        }
    }


    public House(){
        apartmentList = new ArrayList<>();
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public void addAppartment(Apartment apartment){
        apartmentList.add(apartment);
    }
    public class Apartment{
        int sizeInSquareM;

        public Apartment(int sizeInSquareM) {
            this.sizeInSquareM = sizeInSquareM;
        }


        public void printNameOfHouse(){
            System.out.println("House name: " + House.this.houseName);
        }

    }


}
