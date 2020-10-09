def flexibleFizzBuzz(handler: String => Unit): Unit = {
    for(i <- Range.inclusive(1, 100)) {
        handler(
            if(i % 3 == 0 && i % 5 == 0) "FizzBuzz"
            else if(i % 3 == 0) "Fizz"
            else if(i % 5 == 0) "Buzz"
            else i.toString()
        )
    }
}

flexibleFizzBuzz(s => println(s))
