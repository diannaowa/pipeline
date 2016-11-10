{ ->
  node {
    stage "hello world"
    hello 'world'
  }
}
def hello(whom) {
  echo "hello ${whom}"
}
