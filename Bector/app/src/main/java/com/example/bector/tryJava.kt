package com.example.bector

import com.example.bector.Animal
import com.example.bector.Pig

/*
// interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
 */
// interface
/*
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}
 */
interface Animal {
    fun animalSound() // interface method (does not have a body)
    fun sleep() // interface method (does not have a body)

} // Pig "implements" the Animal interface
/*
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}
 */
class Pig : Animal {
    override fun animalSound() {
        // The body of animalSound() is provided here
        println("The pig says: wee wee")
    }

    override fun sleep() {
        // The body of sleep() is provided here
        println("Zzz")
    }
}

object MyMainClass {
    @JvmStatic
    fun main(args: Array<String>) {
        val myPig = Pig() // Create a Pig object
        myPig.animalSound()
        myPig.sleep()
    }
}