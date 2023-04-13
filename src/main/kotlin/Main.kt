fun main( ) {
println(addition(79,30))
println(total(arrayOf(30,45,23,44,12,26)))
    println(words(arrayOf("Brenda","Florence","Rosa","Bernard")))
    println(multiply(listOf(20,4,5,6,7,10)))
println(numberAverage(listOf(10.0,20.0,30.0,12.0,4.0,9.2,4.8,6.2)))
    println(elements(listOf(30,24,60,2,40,18,33,22,21)))
    println(Numbers(listOf(13,67,45,90,67,687,45,251,2,41,50)))
    println(statement(listOf("loves","beaches","along","the","Coast")))
}
//Write a function that takes two integers as
//parameters and returns their sum.
fun addition(num1:Int,num:Int):Int{
    var sum =num1+num
    return sum
}
//Write a function that takes an array of integers as a parameter and
// returns the sum of all the elements.
fun  total (myArray: Array<Int>):Int{
    var sums =myArray.sum()
    return sums

}
//Write a function that takes an array of strings as a parameter and
// returns the length of the longest string.
fun words(namesArray: Array<String>):Int {
    var maxlength=0
    for(x in namesArray){
        if(x.length  > maxlength){
            maxlength = x.length
        }
    }
    return maxlength
}

//Write a function that takes a list of integers as a parameter
// and returns the product of all the elements.
fun multiply(list: List<Int>):Int {
    var result = 1
    for (x in list) {
        result *= x
    }
    return result
}

//Write a function that takes a list of integers as a parameter
// and returns the average of all the elements.
fun numberAverage(lists: List<Double>):Double{
    var Average=lists.average()
    return Average
}
//Write a function that takes a list of integers as a parameter
//and returns a new list with all the elements that are divisible by a given number.
fun elements(List:List<Int>):List<Int>{
    var newList= mutableListOf<Int>()
    for (i in List){
        if(i % 3==0){
            newList.add(i)
        }
    }
    return newList
}
//Write a function that takes a list of integers as a parameter
// and returns a new list with all the elements in descending order
fun Numbers(lists: List<Int>):List<Int>{
    var newlists= lists.sorted()
    return newlists
    }
//Write a function that takes a list of strings as a parameter
// and returns the concatenation of all the strings.
fun statement(Words:List<String>):String{
    var x = " "
    for(i in Words){
        x += i
    }
    return x
}