package com.vily.aidl_service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.vily.aidl_myaidl.VilyServiceAidl;
import com.vily.aidl_myaidl.bean.Person;


import java.util.ArrayList;
import java.util.List;


/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2019-11-11
 *  
 **/
public class VilyService extends Service {


    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    private final VilyServiceAidl.Stub mBinder=new VilyServiceAidl.Stub() {
        @Override
        public int addNumbers(int num1, int num2) throws RemoteException {
            return num1+num2;
        }

        @Override
        public List<String> getStringList() throws RemoteException {
            List<String> objects = new ArrayList<>();
            objects.add("asdada");
            objects.add("fffff");
            objects.add("ttttt");
            return objects;
        }

        @Override
        public List<Person> getPersonList() throws RemoteException {
            List<Person> list=new ArrayList<>();
            list.add(new Person("aaaa",12));
            list.add(new Person("bbbbb",25));
            list.add(new Person("xcccc",5));
            list.add(new Person("yyyy",66));
            return list;
        }

    };

}
