public class Encap {

    static class InnerEncap {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void printName() {
            System.out.println("Name is : "+ name);
        }
    }
    public static void main(String[] args) {
        InnerEncap used = new InnerEncap();

        used.setName("Swapnil");
        used.printName();
        System.out.println("got name : "+ used.getName());
        
    }
}
