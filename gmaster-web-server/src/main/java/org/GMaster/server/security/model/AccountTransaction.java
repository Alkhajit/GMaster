package org.GMaster.server.security.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "account_transaction")
@XmlRootElement
public class AccountTransaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "transaction_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;

    @Basic(optional = false)
    @Column(name = "amount")
    private Integer amount;

    @Column(name = "note")
    private String note;

    @JoinColumn(name = "transaction_category_id", referencedColumnName = "id")
    @ManyToOne
    private TransactionCategory transactionCategory;

    public AccountTransaction() {
    }

    public AccountTransaction(Date transactionDate, Integer amount, String note, TransactionCategory transactionCategory) {
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.note = note;
        this.transactionCategory = transactionCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public TransactionCategory getTransactionCategory() {
        return transactionCategory;
    }

    public void setTransactionCategory(TransactionCategory transactionCategory) {
        this.transactionCategory = transactionCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountTransaction that = (AccountTransaction) o;

        if (!id.equals(that.id)) return false;
        if (!transactionDate.equals(that.transactionDate)) return false;
        if (!amount.equals(that.amount)) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        return transactionCategory.equals(that.transactionCategory);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + transactionDate.hashCode();
        result = 31 * result + amount.hashCode();
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
