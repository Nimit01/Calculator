// Calculator.java

class Calculator {
    int addition(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    int multiplication(int[] numbers) {
        return numbers[0] * numbers[1];
    }

    int subtraction(int[] numbers) {
        return numbers[0] - numbers[1];
    }

    double mean(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    double variance(int[] numbers) {
        double meanValue = mean(numbers);
        double varianceSum = 0;
        for (int num : numbers) {
            varianceSum += Math.pow(num - meanValue, 2);
        }
        return varianceSum / numbers.length;
    }

    int[] fibonacci(int[] numbers) {
        int n = numbers[0];
        if (n <= 0) {
            System.out.println("Error: Fibonacci series is not defined for non-positive numbers.");
            return null;
        } else if (n == 1) {
            return new int[]{0};
        } else if (n == 2) {
            return new int[]{0, 1};
        } else {
            int[] arr = new int[n];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr;
        }
    }
}
