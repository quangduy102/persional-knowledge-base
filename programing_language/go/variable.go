package main

import (
	"fmt"
	"tut/utils"
)
func main() {
	var message string = "Hello, World!"
	var number int = 42
	var male bool = true
	fmt.Println(message)
	fmt.Println(number)
	fmt.Println(male)

	// short variable declaration
	name := "Alice"
	age := 30
	isStudent := false
	fmt.Println(name)
	fmt.Println(age)
	fmt.Println(isStudent)

	// array 
	arr := []int{2, 4, 6, 8, 10}
	fmt.Println(arr)
	maps := map[string]int{"t": 1};
	fmt.Println(maps)
	//different types int, int64, float32, float64
	utils.ExamplePointer()
}