var numoforg : int // The starting number of organisms
var popinc : int // The average percent of population increase 
var numofdays : int // The number of times the organisms will multiply
//Ask user for the starting number of organisms.
print("Enter the starting number of organisms:")
numoforg = readLine()!!.toInt()
for (numoforg > 2 ) { 
  println(" Enter a number greater than 1.")
}
//Ask user for average percent increase of organisms.
print("Enter daily average percent increase of population:")
popinc = readLine()!!.toInt()
for (popinc > 0 ){
  println(" Enter a positive number.")
  //Ask user for the number of days population will multiply
  print("Enter the number of days population will multiply:")
  numofdays = readLine()!!.toInt()
for (numofdays > 1) {
println(" Enter a number greater than zero")
