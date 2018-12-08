package anonymous_classes;

public class AnonymousMain {

    public static void main(String[] args) {
        Animal monkey = new Monkey();
        Animal parrot = new Animal() {
            @Override
            public void printAnimalname() {
                System.out.println("Parrot! ");
            }
        };

        Monkey monkey2 = new Monkey(){
            @Override
            public void printAnimalname(){
                System.out.println("Gorilla");
            }
        };

        Animal duck = new Animal() {
            @Override
            public void printAnimalname() {
                System.out.println("Duck: ");
            }
            public void makeSound(){
                System.out.println("kwa kwa");
            }
        };



        AnimalProcessor processor = new AnimalProcessor();

        processor.processAnimal(monkey);
        processor.processAnimal(parrot);
        processor.processAnimal(duck);

        processor.processAnimal(new Animal() {
            @Override
            public void printAnimalname() {
                System.out.println("Duck");
            }
        });


        ShowSecret secret = new ShowSecret() {
            @Override
            public void printSecret() {
                System.out.println("Secret!!!");
            }
        };

        SecretProcessor secretProcessor = new SecretProcessor();
        secretProcessor.processSecret(new ShowSecret() {
            @Override
            public void printSecret() {
                System.out.println("Secreeeeeeeeeetttt");
            }
        });

        Moveable moveable1 = new Moveable() {
            @Override
            public void run() {
                System.out.println("RUN");
            }

            @Override
            public void fly() {
                System.out.println("Doesnt fly ;o");
            }
        };

        MoveableProcess  moveableProcess= new MoveableProcess();

        moveableProcess.processMoveable(new Moveable() {
            @Override
            public void run() {
                System.out.println("Doesnt run");
            }

            @Override
            public void fly() {
                System.out.println("Flyes.....");
            }
        });

        humanProcessor humanProcessor = new humanProcessor();

        humanProcessor.processHuman(new Human() {
            @Override
            public void walk() {
                System.out.println("walk");
            }

            @Override
            public void eat() {
                System.out.println("eat");
            }

            @Override
            public void sleep() {
                System.out.println("sleep");
            }
        });


    }

}
