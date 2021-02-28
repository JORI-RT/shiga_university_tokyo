package main

import (
	"bufio"
	"fmt"
	"os"

	"github.com/paullius/go-graphs-/collections"
)

func main() {
	var sc = bufio.NewScanner(os.Stdin)
	stack1 := collections.Stack{}
	var i int = 0
	for sc.Scan() {
		if i == 50 {
			show(&stack1)
			i = 0
		}
		stack1.Push(sc.Text())
		i++
	}
	show(&stack1) // 残り
}

func show(s *collections.Stack) {
	for i := s.Len(); i > 0; i-- {
		fmt.Println(s.Pop())
	}
}
