package main

import (
	"testing"
)

type Provider struct {
	a   int32
	b   int32
	exp int32
}

func TestSum(t *testing.T) {

	providers := []Provider{
		Provider{1, 2, 3},
		Provider{2, 4, 6},
		Provider{3, 5, 8}}

	for i := range providers {
		testSum(t, providers[i])
	}
}

func testSum(t *testing.T, p Provider) {
	actual := Sum(p.a, p.b)
	exp := p.exp

	if actual != exp {
		t.Errorf("actual %v\nwant %v", actual, exp)
	}
}
