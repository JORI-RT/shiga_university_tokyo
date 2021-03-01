package main

import (
	"bufio"
	"fmt"
	"os"

	a "github.com/foize/go.fifo"
)

func main() {
	// create a new queue
	q := a.NewQueue()
	var sc = bufio.NewScanner(os.Stdin)

	var i = 0
	for sc.Scan() {

		if i < 42 {
			q.Add(sc.Text)
		} else {
			fmt.Print(q.Next())
			q.Add(sc.Text)
		}
	}

}
