package utils
import "fmt"
func ExamplePointer() {
	//pointer example
	/*
		&: address of pointer
		*: dereference pointer
	*/
	x := 10
	var p *int = &x
	p1 := &x
	
	fmt.Println("Value of x:", x)			

	fmt.Println("Address of x:", &x)

	fmt.Println("Pointer p points to address:", p)
	
	fmt.Println("Pointer p1 points to address:", p1)
	
	// We should use pointers when we want to modify the original variable and avoid copy  strucutures or values
}