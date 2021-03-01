package arraystack

// Stack type
type Stack struct {
	ba []int
	n  int
}

// Newstack constructor
func Newstack(cap int) *Stack {
	// sliceは可変長配列
	return &Stack{ba: make([]int, 0, cap), n: 0}
}

// Size piyo
func (s *Stack) Size() int {
	return s.n
}

// Push hoge
func (s *Stack) Push(n int) {
	s.ba = append(s.ba, n)
	s.n++
}

// Get fuga
func (s *Stack) Get(i int) int {
	return s.ba[i]
}
