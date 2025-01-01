def list = [1, 2, 3]
try {
    println list[3] 
} catch (MissingMethodException e) {
    println "Index out of bounds: "+ e.message
}

// Alternatively, use the getAt() method with a default value
println list.getAt(3, -1) //Prints -1 as the element at index 3 doesn't exist