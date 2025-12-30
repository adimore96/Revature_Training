echo "Enter a Number"
read num

for i in $(seq 1 10)
do
    result=$((num * i)) 
    echo "$num x $i = $result"
done

echo "$num Table Done"
