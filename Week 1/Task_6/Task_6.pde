// 6.a make 2 integer variables named a and b. Print "Success!" if either of them is equal to 10 or if the sum is. If not, print "Failure!".

int a = 5;
int b = 3;

if (((a == 10)||(b == 10))||(a + b == 10))  {
  println("Success!");
}
else  {
  println("Failure!");
}


// 6.b make 3 integer variables named x, y and z. Print "Success!" if their sum is 30, but none of them may have the value of 10, 20 or 30. Otherwise print "Failure!".

int x = 10;
int y = 10;
int z = 10;

if ((x + y + z == 30) && (x != 10, 20, 30))  {
  println("Success!");
}
else  {
  println("Failure!");
}
