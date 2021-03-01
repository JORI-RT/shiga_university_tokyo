## 1 
collections.Stackを使った回答　[goのstack](https://pkg.go.dev/github.com/golang-collections/collections/stack#New)
```sh
cat 1.txt | go run main.go
```
```go
func main() {
	stdin, _ := ioutil.ReadAll(os.Stdin)
	stack1 := collections.Stack{}
	for _, v := range regexp.MustCompile("\r\n|\n\r|\n|\r").Split(string(stdin), -1) {
		stack1.Push(v)
	}
	for i := stack1.Len(); i > 0; i-- {
		fmt.Println(stack1.Pop())
	}
}
```
## 2
```go
// input用のファイルを作成
for i in `seq 160`; do echo $i >> 2.txt; done

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
```

# 3
