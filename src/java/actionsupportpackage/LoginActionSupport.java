/*
 * $Id: Login.template,v 1.2 2008-03-27 05:47:21 ub3rsold4t Exp $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package actionsupportpackage;

import com.opensymphony.xwork2.ActionSupport;
import entity.Login;
import entity.NewHibernateUtil;
import org.hibernate.Session;

/**
 * <code>Set welcome message.</code>
 */
public class LoginActionSupport extends ActionSupport {
 String userName,password;
 Session hibernateSession;
 Login login;
    public String execute() throws Exception {
        hibernateSession=NewHibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        System.out.println("session get"+ userName+ "  "+password);
        if(userName!=null && password!=null &&(!userName.equals(""))&&(!password.equals(""))){
        login=(Login) hibernateSession.createQuery("from Login where userName='"+userName+"' AND password='"+password+"'").uniqueResult();
        }else{
            addActionError("User Name does not exist");
            return INPUT;
        }
        if(login==null){
            addActionError("User Name does not exist");
            return INPUT;
        }
        addActionMessage("Welcome you logined");
        return SUCCESS;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}

