class Q4{
    public static void main(String[] args){
        int num1 = 80, num2=69, temp;
        if(num1 == num2)
            System.out.println("Both are same");
        else{
            temp = num1 > num2 ? num1:num2;
            System.out.println(temp+ "is largest");
        }    
    }
}