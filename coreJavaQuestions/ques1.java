package coreJavaQuestions;

interface printable{
    void printTable(int n);
}

abstract class Abs{
    abstract void checkVowel(char c);
}

class Child extends Abs implements printable{
    void checkVowel(char c){
        switch(c){
            case 'a' : 
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                        System.out.println(c+" is a vowel\n");
                        break;
            default : System.out.println(c+" is a consonent\n");
                        break;
        }
        
    }

    public void printTable(int n) {
        for(int i=1; i<=10; i++){
            System.out.println(n+ " * " + i + " = " + n*i);
        }
        
    }
}

public class ques1 {
    public static void main(String args[]){
        Child c = new Child();
        c.checkVowel('j');
        c.printTable(6);
    }

}
