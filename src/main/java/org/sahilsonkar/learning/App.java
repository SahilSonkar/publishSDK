package org.sahilsonkar.learning;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        PayuClient payuClient = PayuClient.init("sahil", "sonkar");
//
//        HasherParams hasherParams = new HasherParams.Builder()
//
//                .setTxnId("txnId")
//
//                .setAmount("1000")
//
//                .setProductInfo("productInfo")
//
//                .setFirstName("<firstName>")
//
//                .setEmail("ssonkar320@hmail.com")
//
//                .build();
//
//       // String hashStr = payuClient.hasher.generateHash(hasherParams);
//        String hashStr = "404388a0bc38c294f7f8ae33466f6fb2876c1988f1168e3a6cd6763525e2242bbe71aae7401b649fec4e68408347b259ea08e9b1a06056b1113933655c682dab";
        // Reverese hash validation
//        System.out.println(hashStr);
//        boolean check = payuClient.hasher.validateHash(hashStr , "failed" , hasherParams);
//        System.out.println(check);
//        showing check = false because don't know the txnstatus that can't
//        match the reverse hash to the current hasg

        // Generate Hash for Update UDF
//        PayuAPIHash generateHash = new PayuAPIHash();
//        generateHash.key = payuClient.hasher.yourKey();
//        generateHash.salt = payuClient.hasher.yourSalt();
//        // used defined fields like address , pincode , street etc.
//        generateHash.var1 = "711101";
//        String hashForUdfUpdate = generateHash.generateHashForUdfUpdteApi();
//        System.out.println(hashForUdfUpdate);
//
////        call method to update Udf with generated hash for UDf update
//        PayuUdfs udfs = new PayuUdfs();
//        udfs.key = payuClient.hasher.yourKey();
        //udfs.hash = hashForUdfUpdate;
//        udfs.environment = "Test";
//        udfs.var1 = "711101";
//        udfs.var2 = "Howrah";
//        udfs.var3 = "Dobson lane";
//        udfs.var4 = "West Bengal";
//        udfs.var5 = "!st floor";
//        udfs.var6 = "Building No:7th";
//        String udfUpdateResponse = udfs.PayuUpdateUdfs();
//        System.out.println(udfUpdateResponse);
        // Response got in html string formate , But showing "Error occurred" in title tag of html


        // Genreate Hash for Invoice update
//        String hashforUpdateInvoice = generateHash.generateHashForInvoiceUploadApi();
//
//        PayuUpdateInvoice invoice = new PayuUpdateInvoice();
//        invoice.key = payuClient.hasher.yourKey();
//        invoice.hash = hashforUpdateInvoice;
//        invoice.var1 = "711101";
//        invoice.var2 = "Howrah";
//        invoice.var3 = "Dobson lane";
//        invoice.environment = "Test";
//        invoice.file = new File("/Users/sahil.sonkar/Desktop/dominos_invoice.pdf");
//        invoice.fileName = new File("dominos_invoice.pdf");
//        String response =  invoice.updateInvoice();
//        System.out.println(response);















    }
}
