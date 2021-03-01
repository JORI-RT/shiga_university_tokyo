package arraystack

import (
	"testing"
)

func TestSize(t *testing.T) {

	var a = Newstack(5)
	a.Push(5)

	actual := a.Get(0)
	exp := 5
	if actual != exp {
		t.Errorf("actual %v want %v", actual, exp)
	}
}
