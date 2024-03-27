function swapVariables(x, y) {
  let a = x;
  let b = y;

  console.log("value of a before swap=" + a);
  console.log("value of b before swap=" + b);

  [a, b] = [b, a];
  console.log("value of a after swap=" + a);
  console.log("value of b after swap=" + b);

  return [a, b];
}

console.log(swapVariables(5, 56));
