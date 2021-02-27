## 効率の必要性
データ構造を工夫して大量データに対処

## Interface
* データ構造にはinterfaceと実装がある  

```go
type Queue interface{
    add(x int) // add x to quere
    remove() // 
}

type FIFOQueue interface{
    enqueue(x int) // add x to quere
    dequeue() 
}

type PriorityQueue interface{
    enqueue(x int) // add x to quere
    deleteMin()
}

// STACK
type LIFOQueue interface{
    push(x int) // add x to quere
    pop()
}

type Deque interface{
    addFirst(x int)
    removeFirst()
    addLast(x int)
    removeLast()
}

// Queue interface can be  represented by List interface.
// have value of array x0,x1...xn-1
type List interface {
    size()
    get(i int) 
    set(i int, x T) // replace
    add(i int, x T) // shift current array
    remove(i int)

}

type USet {
    size()
    add(x) // if x is not exist , add x to set else return null
    remove(x) // if x is exist, x is delete else return null
    find(y) // if y is not exist , return null
}

// find dirfferent from USet
type SSet {
    size()
    add(x) // if x is not exist , add x to set else return null
    remove(x) // if x is exist, x is delete else return null
    find(y) // if y is not exist , return null
}

```
## ビックオー記法

## データ構造の重要な３要素
* ただしさ　... IFを正しく実装
* 時間計算量 ... 実行時間が短いほどいい
* 空間計算量　... メモリを使わないほどいい