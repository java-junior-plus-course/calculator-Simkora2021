
    class Addition{
        private int sum = 0;

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }

        public int add(int ... numbers){

            for (int i:numbers){
                sum+=i;
            }
            return sum;
        }
    }

        public class Varargs{
            public static void main(String[] args) {
                Addition addition = new Addition();
                System.out.println(addition.add(4,5,6,7,8,4,3));
            }
        }



