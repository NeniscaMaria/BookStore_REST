package repository;

import model.Purchase;

public interface PurchaseRepository extends Repository<Long, Purchase> {
    long deleteByclientID(Long clientID);
}
