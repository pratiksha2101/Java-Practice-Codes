package com.demo;

public class Sample{

    public static void main(String[] args) {
        
        try {
            
                int num =3/0;
                System.out.println(num);
                
            
        } catch (NullPointerException e) {
             System.out.println(e);
        }catch (StackOverflowError e) {
               System.out.println(e);
        }catch (IndexOutOfBoundsException e) {
              System.out.println(e);
        }catch(ArithmeticException e)
        {
             System.out.println(e);
             
        }
        
        catch(Exception e)
        {
             System.out.println(e);
        }

        System.out.println("rest of the code...");
    }

}
