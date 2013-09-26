#!/usr/bin/ruby
#sum of primes < 2000000

sum = 0

(2..1999999).each do |i|
  (2..Math.sqrt(i).ceil).each do |j|
    if i%j == 0 and j != i
      #p "%s is divisible with %s" % [i, j]
      break
    end
    if j == Math.sqrt(i).ceil
      sum += i
      #p i
    end
  end
end
p sum
