package my_package.anonymous_classes.my_anonymous;


public class MainPlantAnon {
    public static void main(String[] args) {
          Plant plant1 = new Plant() {
              @Override
              public void grow() {
                  System.out.println("grow");
              }

              @Override
              public void smell() {
                  System.out.println("smell");
              }

              @Override
              public void wilt() {
                  System.out.println("wilt");
              }
          };

          Gardener gardener = new Gardener();

          gardener.processPlant(plant1);
          gardener.processPlant(new Plant() {
              @Override
              public void grow() {
                  System.out.println("grow2");
              }

              @Override
              public void smell() {
                  System.out.println("semll2");
              }

              @Override
              public void wilt() {
                  System.out.println("wilt2");
              }
          });

          Plant3 plant3 = new Plant3();


    }
}
