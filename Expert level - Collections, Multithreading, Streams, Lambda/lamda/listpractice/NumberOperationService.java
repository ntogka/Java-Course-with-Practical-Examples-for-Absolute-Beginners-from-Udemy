package expert.lamda.listpractice;

import java.util.ArrayList;
import java.util.List;

public class NumberOperationService {

    public List<Integer> executeOperation(List<Integer> inputNumber, Operation operation) {
        List<Integer> outputNumber = new ArrayList<>();
        for (int number : inputNumber) {
            outputNumber.add(operation.operate(number));
        }

        return outputNumber;
    }

}
