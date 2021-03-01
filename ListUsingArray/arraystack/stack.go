package arraystack

// Stack type
type Stack struct {
	ba []int
	n  int
}

// Newstack constructor
func Newstack(cap int) *Stack {
	return &Stack{ba: make([]int, 0, cap), n: 0}
}

func (a *Stack) size() int {
	return a.n
}

// func (a *arraystack) set(i int, x int) {
// 	a.ba[i] = x
// }

func (s *Stack) Push(n int) {
	s.ba = append(s.ba, n)
	s.n++
}
