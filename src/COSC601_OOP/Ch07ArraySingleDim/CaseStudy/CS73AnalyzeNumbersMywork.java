package Ch07ArraySingleDim.CaseStudy;

public class CS73AnalyzeNumbersMywork {
  public static void main(String[] args) {
//    java.util.Scanner input = new java.util.Scanner(System.in);
//    System.out.print("Enter the number of items: ");
//    int n = input.nextInt();
//    double[] numbers = new double[n];
//    double sum = 0;

    double[] myList= new double[100];
    for (int i=0; i<myList.length;i++){
      myList[i]= Math.random()*100;
    }

    double sum=0.0;
    for (int i=0; i<myList.length;i++){
      sum+=myList[i];
    }
    double ave=sum/myList.length;
    int count=0;
    for (int i=0; i<myList.length;i++){
      if (myList[i]>ave)
        count++;
    }
    System.out.println("Average: " + ave + " and Number more than Ave: "+count);

  }
}