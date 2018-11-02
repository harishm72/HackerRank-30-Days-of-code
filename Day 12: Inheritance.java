class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
 public Student(String firstName, String lastName, int id, int testScores[]){
	   super(firstName,lastName,id);
       this.testScores=testScores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate(){
        int sum=0;
       // int numScores=0;
		for(int i=0; i<testScores.length; i++){
	        sum=sum+ testScores[i];
	    }
        char grade;
        int a=(sum/testScores.length);
        if((a>=90)&&(a<=100))
            grade='O';
        else if((a>=80)&&(a<90))
            grade='E';
        else if((a>=70)&&(a<80))
            grade='A';
        else if((a>=55)&&(a<70))
            grade='P';
        else if((a>=40)&&(a<55))
            grade='D';
        else
            grade='T';
        return grade;
    }


    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}
