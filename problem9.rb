#!/usr/lib/ruby
#
#find product of abc where a**2 + b**2 = c**2

(1..999).each do |i|
  a = i**2
  (1..i).each do |j|
    b = j**2
    c = 1000 - i - j
    if (a + b == c**2)
      p i 
      p j
      p c
      p i*j*c
    end
  end
end

