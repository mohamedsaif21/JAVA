package OOPS;

class Students{
        String name;
        Students(String name){
            this.name = name;
        }
        Students() {
            System.out.println("The object is created");
            this.name = "name";
            }
        }

    class Main{
        public static void main(String[] args) {
            
            Students s = new Students();
            Students s1 = new Students("Rahul");
            System.out.println(s1.name);

        }
    }


