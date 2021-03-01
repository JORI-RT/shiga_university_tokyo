package arraystack

import (
	"fmt"
	"testing"
)

// type Provider struct {
// 	exp int32
// }

func TestSize(t *testing.T) {

	// providers := []Provider{
	// 	Provider{1, 2, 3},
	// 	Provider{2, 4, 6},
	// 	Provider{3, 5, 8}}

	// for i := range providers {
	// 	testSum(t, providers[i])
	// }
	var a = Newstack(5)
	a.Push(1)

	fmt.Print(a)
	actual := a.size()
	exp := 2
	if actual != exp {
		t.Errorf("actual %v want %v", actual, exp)
	}
}
