#!/usr/bin/ruby


# find the sum of even-valued terms < 4,000,000

sum = 2
num1 = 1 
num2 = 2

while num2 < 4000000 and num1 < 4000000 do
  p num1
  p num2
  if num1 > num2
    num2 = num1 + num2
    if num2 % 2 == 0
      sum += num2
    end
  end
  if num2 > num1
    num1 = num1 + num2
    if num1 % 2 == 0
      sum += num1
    end
  end
end

p sum
