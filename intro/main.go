package main

import (
	"fmt"
	"os"
)

func main() {

	// go run main.go hoge fuga で　hoge fugaを出力
	fmt.Print(os.Args[1:])
}
