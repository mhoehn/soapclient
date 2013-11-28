package de.epages.WebServices.ProductService11;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.epages.WebServices.ErrorHandler;
import de.epages.WebServices.ThrowingErrorHandler;
import de.epages.WebServices.WebServiceConfiguration;
import de.epages.WebServices.ProductService11.Stub.Bind_Product_SOAPStub;
import de.epages.WebServices.ProductService11.Stub.Port_Product_PortType;
import de.epages.WebServices.ProductService11.Stub.ProductService;
import de.epages.WebServices.ProductService11.Stub.ProductServiceLocator;
import de.epages.WebServices.ProductService11.Stub.TCreate_Input;
import de.epages.WebServices.ProductService11.Stub.TCreate_Return;
import de.epages.WebServices.ProductService11.Stub.TDelete_Return;
import de.epages.WebServices.ProductService11.Stub.TExists_Return;
import de.epages.WebServices.ProductService11.Stub.TFind_Input;
import de.epages.WebServices.ProductService11.Stub.TGetInfo_Return;
import de.epages.WebServices.ProductService11.Stub.TUpdate_Input;
import de.epages.WebServices.ProductService11.Stub.TUpdate_Return;

@Deprecated
public class ProductService11Client implements Port_Product_PortType {
    private final ProductService service = new ProductServiceLocator();
    private final Bind_Product_SOAPStub stub;
    private final ErrorHandler errorHandler;

    private static final Logger log = LoggerFactory.getLogger(ProductService11Client.class);

    public ProductService11Client(final WebServiceConfiguration config) {
        this(config, new ThrowingErrorHandler());
    }

    public ProductService11Client(WebServiceConfiguration config, ErrorHandler errorHandler) {
        this(config, errorHandler, new ProductService11StubFactoryImpl());
    }

    public ProductService11Client(WebServiceConfiguration config, ErrorHandler errorHandler, ProductService11StubFactory factory) {
        this.stub = factory.create(config, service);
        this.errorHandler = errorHandler;
    }

    public TGetInfo_Return[] getInfo(String[] products) throws RemoteException {
        return getInfo(products, new String[] {});
    }

    public TGetInfo_Return[] getInfo(String[] products, String[] attributes) throws RemoteException {
        return getInfo(products, attributes, new String[] {});
    }

    /**
     * Gets information about a list of Products. If there is an error with a
     * single Product, then this Product will be skipped and it will be not part
     * of there result list.
     * 
     * @param paths
     *            list of Product paths
     * @param attributes
     *            list of additional attributes
     * @return list of TGetInfo_Return
     * @throws RemoteException
     * @see TGetInfo_Return
     */
    @Override
    public TGetInfo_Return[] getInfo(String[] products, String[] attributes, String[] languageCodes) throws RemoteException {
        TGetInfo_Return[] results = stub.getInfo(products, attributes, languageCodes);
        List<TGetInfo_Return> resultList = new ArrayList<>(results.length);

        for (int i = 0; i < results.length; i++) {
            TGetInfo_Return product = results[i];

            if (product.getError() == null) {
                log.info("successfully retrieved product: " + product.getPath());
                resultList.add(product);
            } else {
                errorHandler.handle(product, product.getError().getMessage());
            }
        }
        return resultList.toArray(new TGetInfo_Return[resultList.size()]);
    }

    /**
     * Creates a list of Products with the given data. If there is an error with
     * a single Product, then this Product will be skipped and it will be not
     * part of there result list.
     * 
     * @param Products
     *            list of TCreate_Input
     * @return list of TCreate_Return
     * @throws RemoteException
     * @see TCreate_Input
     * @see TCreate_Return
     */
    @Override
    public TCreate_Return[] create(TCreate_Input[] products) throws RemoteException {
        TCreate_Return[] results = stub.create(products);
        List<TCreate_Return> resultList = new ArrayList<>(results.length);

        for (int i = 0; i < results.length; i++) {
            TCreate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully created product: " + result.getPath());
                resultList.add(result);
            } else {
                errorHandler.handle(result, result.getError().getMessage());
            }
        }

        return resultList.toArray(new TCreate_Return[resultList.size()]);
    }

    /**
     * Updates a list of Products with the given data. If there is an error with
     * a single Product, then this Product will be skipped and it will be not
     * part of there result list.
     * 
     * @param Products
     *            list of TUpdate_Input
     * @return list of TUpdate_Return
     * @throws RemoteException
     * @see TUpdate_Input
     * @see TUpdate_Return
     */
    @Override
    public TUpdate_Return[] update(TUpdate_Input[] products) throws RemoteException {
        TUpdate_Return[] results = stub.update(products);
        List<TUpdate_Return> resultList = new ArrayList<>(results.length);

        for (int i = 0; i < results.length; i++) {
            TUpdate_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully updated product: " + result.getPath());
                resultList.add(result);
            } else {
                errorHandler.handle(result, result.getError().getMessage());
            }
        }

        return resultList.toArray(new TUpdate_Return[resultList.size()]);
    }

    /**
     * Deletes a list of Products. If there is an error with a single Product,
     * then this Product will be skipped and it will be not part of there result
     * list.
     * 
     * @param paths
     *            list of Product paths
     * @return list of TDelete_Return
     * @throws RemoteException
     * @see TDelete_Return
     */
    @Override
    public TDelete_Return[] delete(String[] products) throws RemoteException {
        TDelete_Return[] results = stub.delete(products);
        List<TDelete_Return> resultList = new ArrayList<>(results.length);

        for (int i = 0; i < results.length; i++) {
            TDelete_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully deleted product: " + result.getPath());
                resultList.add(result);
            } else {
                errorHandler.handle(result, result.getError().getMessage());
            }
        }

        return resultList.toArray(new TDelete_Return[resultList.size()]);
    }

    /**
     * Checks if a list of Products exists. If there is an error with a single
     * Product, then this Product will be skipped and it will be not part of
     * there result list.
     * 
     * @param paths
     *            list of Product paths
     * @return list of TExists_Return
     * @throws RemoteException
     * @see TExists_Return
     */
    @Override
    public TExists_Return[] exists(String[] products) throws RemoteException {
        TExists_Return[] results = stub.exists(products);
        List<TExists_Return> resultList = new ArrayList<>(results.length);

        for (int i = 0; i < results.length; i++) {
            TExists_Return result = results[i];

            if (result.getError() == null) {
                log.info("successfully check product existance: " + result.getPath());
                resultList.add(result);
            } else {
                errorHandler.handle(result, result.getError().getMessage());
            }
        }

        return resultList.toArray(new TExists_Return[resultList.size()]);
    }

    /**
     * Searches for Products by given search parameters.
     * 
     * @param parameters
     *            list of TFind_Input
     * @return List of Product paths
     * @throws RemoteException
     * @see TFind_Input
     */
    @Override
    public String[] find(TFind_Input searchParameters) throws RemoteException {
        return stub.find(searchParameters);
    }

}