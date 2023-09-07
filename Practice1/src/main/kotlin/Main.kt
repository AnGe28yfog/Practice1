import kotlin.math.sqrt

fun main(args: Array<String>) {
    // задача 1
    val exercises: Int = 13
    var exercisesSolved: Int = 0

    exercisesSolved+=1
    println("exercisesSolved +1  =  {$exercisesSolved}")
    //____

    //задача 2
    val Age: Int = 18
    println("Age = {$Age}")

    exercisesSolved+=1
    println("exercisesSolved +1  =  {$exercisesSolved}")

    //____

    // задача 3
    var srArif: Double = 18.0
    srArif = (30.0+18.0)/2
    println("среднее арифметическое = {&srArif}")

    exercisesSolved+=1
    println("exercisesSolved +1  =  {$exercisesSolved}")
    //____

    //задача 4
    val  testNumber: Int = 8
    val  evenOdd: Int
    evenOdd = testNumber % 2
    println(" evenOdd = {$evenOdd}")

    exercisesSolved+=1
    println("exercisesSolved +1  =  {$exercisesSolved}")
    //____

    // задача 5
    var  answer: Int = 0
    answer+=1
    answer+=10
    answer*=10
    answer shr 3
    println("answer =  {$answer}")

    exercisesSolved+=1
    println("exercisesSolved +1  =  {$exercisesSolved}")
    //____

    //задача 6

   var age: Int = 16
    println (age)
     age = 30
    println (age)

    exercisesSolved+=1
    println("exercisesSolved +1  =  {$exercisesSolved}")
    //____

    //задача 7
    val a: Int = 46
    val b: Int = 10
    val answer2: Int = (a*100) + (b/10)
    val answer1: Int = (a*100) + (b*100)
    val answer3: Int = a*100 + b
    val Answer: Int = answer1 + answer2 + answer3 //???
    println("Answer = ${Answer}")

    exercisesSolved+=1
    println("exercisesSolved +1  =  {$exercisesSolved}")
    //____

    /*задача 8
    5*3-4/2*2 скобки не нужны, решается как обычное математическое уравнение
    ____*/
    exercisesSolved+=1
    println("exercisesSolved +1  =  {$exercisesSolved}")

    //задача 9
    val c: Double = 10.2
    val d: Double = 4.6
    val avarage: Double = (c+d)/2
    println("avarage = {$avarage}")

    exercisesSolved+=1
    println("exercisesSolved +1  =  {$exercisesSolved}")
    //____

    //задача 10
    val fahrenheit: Double = 100.2
    val celcius: Double
    celcius = (fahrenheit/1.8) - 32
    println("celcius = {$celcius}")

    exercisesSolved+=1
    println("exercisesSolved +1  =  {$exercisesSolved}")
    //____

    //задача 11
    exercisesSolved+=1
    println("exercisesSolved +1  =  {$exercisesSolved}")

    //задача 12
    val degrees: Double = 250.0
    val radians: Double
    radians = degrees
    exercisesSolved+=1
    println("exercisesSolved +1  =  {$exercisesSolved}")

    //задача 13
    val x1: Double = 15.0
    val y1: Double = 20.0
    val x2: Double = 25.0
    val y2: Double = 30.0
    val distance: Double
    distance = sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1))
    println("distance = {$distance} ")

    exercisesSolved+=1
    println("exercisesSolved +1  =  {$exercisesSolved}")





}