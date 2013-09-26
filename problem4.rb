#!/usr/lib/ruby
#
#largest palindrome of 2 3digit numbers

lop = []
(100..999).each do |i|
  max = 0
  (100..i).each do |j|
    sum = i*j
    if sum.to_s == sum.to_s.reverse && max < sum 
      max = sum
    end
  end
  lop.push(max)
end
p lop.sort.last
