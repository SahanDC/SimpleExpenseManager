/*
 * Copyright 2015 Department of Computer Science and Engineering, University of Moratuwa.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *                  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

//package lk.ac.mrt.cse.dbs.simpleexpensemanager;
//
//import static org.junit.Assert.assertTrue;
//
//import android.content.Context;
//
//import androidx.test.core.app.ApplicationProvider;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.List;
//
//import lk.ac.mrt.cse.dbs.simpleexpensemanager.control.ExpenseManager;
//import lk.ac.mrt.cse.dbs.simpleexpensemanager.control.PersistantExpenseManager;

package lk.ac.mrt.cse.dbs.simpleexpensemanager;

import static org.junit.Assert.assertTrue;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.control.ExpenseManager;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.control.PersistantExpenseManager;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest {
    private ExpenseManager expenseManager;

    @Before
    public void setup() {
        Context context = ApplicationProvider.getApplicationContext();
        expenseManager = new PersistantExpenseManager(context);
    }

    @Test
    public void testAddAccount(){
        expenseManager.addAccount("190097A", "Sampath", "Daniel", 1000);
        List<String> accountNumbersList = expenseManager.getAccountNumbersList();
        assertTrue(accountNumbersList.contains("190097A"));
    }
}