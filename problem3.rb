#!usr/bin/ruby
#
#largest prime factor of 600851475143

num = 600851475143
lop = []
prime = 2
while num != 1 do
  if num % prime == 0
    lop.push(prime)
    num = num/prime
  end
  if num % prime != 0
    prime += 1
  end
end
p lop.last
