package org.example.kogito;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.RuleUnitData;
import org.drools.ruleunits.api.SingletonStore;
import org.example.kogito.model.Person;

public class PersonUnit implements RuleUnitData
{
    private SingletonStore<Person> person;

    public PersonUnit() {
        this(DataSource.createSingleton());
    }

    public PersonUnit(SingletonStore<Person> person) {
        this.person = person;
    }

    public SingletonStore<Person> getPerson() {
        return person;
    }

    public void setPerson(SingletonStore<Person> person) {
        this.person = person;
    }
}