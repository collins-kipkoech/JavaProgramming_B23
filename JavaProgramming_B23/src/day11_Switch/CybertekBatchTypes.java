package day11_Switch;

public class CybertekBatchTypes {

    public static void main(String[] args) {

        String batch1 = "US batch";
        String batch2 = "EU batch";
        String morningBatch = "morning";
        String eveningBatch = "evening";

        if(batch1=="US batch" || batch2=="EU batch"){
            if(batch1=="US batch" && morningBatch=="morning"){
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            }
            else{
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            }

        }
        else{
            System.out.println("Invalid Batch");

        }
    }
}
/*
4. In Cybertek we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        First figure out is is a US batch or EU batch

            - for US batches:

                > Figure out is it a morning batch or evening batch
                    > morning - print: Class times are 10-5 EST. M, T, Th, F.
                    > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S

            - for EU batches:

                > print: Class times are  10-5 EST. M, T, W, Th, F.

              If Batch type is not EU or US, print Invalid Batch
                NOTE: MUST APPLY NESTED IF
*/
