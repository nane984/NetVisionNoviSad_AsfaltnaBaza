/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.wimpi.modbus.*;
import net.wimpi.modbus.msg.*;
import net.wimpi.modbus.io.*;
import net.wimpi.modbus.net.*;
import net.wimpi.modbus.procimg.Register;
import net.wimpi.modbus.util.BitVector;

/**
 *
 * @author branko.scekic
 */
public class Mxl {
    
    //0xxxx - Coil (read write boolean)
    //1xxxx - DiscreteInput (read-only boolean)
    //3xxxx - InputRegister (read - only integer)
    //4xxxx - HoldingRegister (read - write integer)
    
    

    private TCPMasterConnection con = null; //the connection
    private ModbusTCPTransaction trans = null; //the transaction

    //****************************Digital input******************************
    private ReadInputDiscretesRequest readReqDI = null; //boolean (read-only) request (DiscretInput)
    private ReadInputDiscretesResponse readResDI = null; //boolean (read-only) response (DiscretInput)

    //***************************Digital output******************************
    private ReadCoilsRequest readReqCoil = null;  //boolean (read - write) request 
    private ReadCoilsResponse readResCoil = null; //boolean (read - write) response

    private WriteCoilRequest writeSingleReqCoil = null;  //boolean (read - write) request
    //private WriteCoilRequest writeSingleResDO = null;  //boolean (read - write) response
    private WriteMultipleCoilsRequest writeReqCoil = null;  //boolean (read - write) request
    //private WriteMultipleCoilsResponse writeResDO = null;  //boolean (read - write) response

    //****************************Input Register**********************************
    private ReadInputRegistersRequest readInputReqRegisters = null;   //input register (read - only) request  (npr sa a/d konvertora) 
    private ReadInputRegistersResponse readInputResRegisters = null;  //input register (read - only) response  (npr sa a/d konvertora)

    //**************************Holding Registers************************************
    private ReadMultipleRegistersRequest readReqHoldingRegisters = null;   //registers (read) request - register
    private ReadMultipleRegistersResponse readResRegister = null;   //registers (read) request

    private WriteSingleRegisterRequest writeSingleReqHoldingRegister = null;   //register (write) request
    //private WriteSingleRegisterResponse writeSingleResRegister = null;   //register (write) response
    private WriteMultipleRegistersRequest writeReqMultipleHoldingRegister = null;   //registers (write) request
    // private WriteMultipleRegistersResponse writeResMultipleRegister = null;   //registers (write) request

    /* Variables for storing the parameters */
    private InetAddress ip;    //the slave's ip address
    private int port;            //Modbus.DEFAULT_PORT;  //port 502 for modbus (buffer)
    private int repeat;             //a loop for repeating the transaction
    private int id;

    public static boolean alarm;
    public static boolean conOk;

    private Register register;

    public Mxl() {
        this.port = 502;
        this.repeat = 0;
        this.id = 1;

        //tryConnected = false;
        conOk = false;

        readReqDI = new ReadInputDiscretesRequest();
        readReqCoil = new ReadCoilsRequest();
        readReqHoldingRegisters = new ReadMultipleRegistersRequest();
        readInputReqRegisters = new ReadInputRegistersRequest();

        writeSingleReqHoldingRegister = new WriteSingleRegisterRequest();
        writeReqMultipleHoldingRegister = new WriteMultipleRegistersRequest();

        register = ModbusCoupler.getReference().getProcessImageFactory().createRegister();
    }

    public Mxl(InetAddress ip, int port, int id) {
        this.ip = ip;
        this.port = port;
        repeat = 0;
        this.id = id;

        readReqDI = new ReadInputDiscretesRequest();
        readReqCoil = new ReadCoilsRequest();
        readReqHoldingRegisters = new ReadMultipleRegistersRequest();
        readInputReqRegisters = new ReadInputRegistersRequest();

        writeSingleReqHoldingRegister = new WriteSingleRegisterRequest();
        writeReqMultipleHoldingRegister = new WriteMultipleRegistersRequest();

        register = ModbusCoupler.getReference().getProcessImageFactory().createRegister();

    }

    //*****************seter and getter*****************************************  
    public void setIp(InetAddress ip) {
        this.ip = ip;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public void setId(int id) {
        this.id = id;
    }

    //*******************connection**********************************************
    public void openConnection() {
        try {
            con = new TCPMasterConnection(ip);
            con.setPort(port);
            trans = new ModbusTCPTransaction(con);
            conOk = true;
            
            
        } catch (Exception ex) {
            Logger.getLogger(Mxl.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

    public void closeConnection() {
        alarm = false;
        conOk = false;
        con.close();
    }

    public boolean ping() {
        boolean p = false;
        int temp = port;
        try {
            this.port = 7;
            p = ip.isReachable(1000);
        } catch (IOException ex) {
            Logger.getLogger(Mxl.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.port = temp;
        return p;
    }

    //*********************read*************************************************
    public boolean[] readDiscretInput(int offset, int brDI) { //offset where to start reading from, the number of DI's to read
        readReqDI.setReference(offset);
        readReqDI.setBitCount(brDI);
        readReqDI.setUnitID(id);
        trans.setRequest(readReqDI);
        return executeTransactionDI(brDI);
    }

    public boolean[] readCoil(int offset, int brDO_kolikoIhCita) { //offset where to start reading from, the number how many DO's to read
        readReqCoil.setReference(offset);
        readReqCoil.setBitCount(brDO_kolikoIhCita);
        readReqCoil.setUnitID(id);
        trans.setRequest(readReqCoil);
        return executeTransactionDO(brDO_kolikoIhCita);
    }

    public int[] readHoldingRegisters(int offset, int brReg_kolikoIhCita) { //offset where to start reading from, the number how many Registers to read
        readReqHoldingRegisters.setReference(offset);
        readReqHoldingRegisters.setWordCount(brReg_kolikoIhCita);
        readReqHoldingRegisters.setUnitID(id);
        trans.setRequest(readReqHoldingRegisters);
        return executeTransactionRegistri(brReg_kolikoIhCita);
    }

    public int[] readInputRegisters(int offset, int brReg_kolikoIhCita) { //offset where to start reading from, the number how many Registers to read
        readInputReqRegisters.setReference(offset);
        readInputReqRegisters.setWordCount(brReg_kolikoIhCita);
        readInputReqRegisters.setUnitID(id);
        trans.setRequest(readInputReqRegisters);
        return executeTransactionInputRegistri(brReg_kolikoIhCita);
    }

    //*********************************write************************************
    public void writeCoil(int offset, boolean vrednost) { //offset where to start reading from, the number how many DO's to read
        writeSingleReqCoil = new WriteCoilRequest(offset, vrednost);
        writeSingleReqCoil.setCoil(vrednost);
        writeSingleReqCoil.setUnitID(id);
        trans.setRequest(writeSingleReqCoil);
        transaction();

    }

    public void writeCoil(int offset, boolean[] brDO_kolikoIhUpisuje) { //offset where to start reading from, the number how many DO's to read
        writeReqCoil = new WriteMultipleCoilsRequest(offset, brDO_kolikoIhUpisuje.length);
        BitVector bv = getVector(brDO_kolikoIhUpisuje);
        writeReqCoil.setCoils(bv);
        writeReqCoil.setUnitID(id);
        trans.setRequest(writeReqCoil);
        transaction();

    }

    public void writeHoldingRegister(int offset, int value) {
        writeSingleReqHoldingRegister.setReference(offset);
        register.setValue(value);
        writeSingleReqHoldingRegister.setRegister(register);
        writeSingleReqHoldingRegister.setUnitID(id);
        trans.setRequest(writeSingleReqHoldingRegister);
        transaction();
    }

    public void writeHoldingRegisters(int offset, int[] values) {
        writeReqMultipleHoldingRegister.setReference(offset);
        Register[] reg = getRegisters(values);
        writeReqMultipleHoldingRegister.setRegisters(reg);
        writeReqMultipleHoldingRegister.setUnitID(id);
        trans.setRequest(writeReqMultipleHoldingRegister);
        transaction();
    }

    //************************transaction***************************************
    private void transaction() {
        try {
            trans.execute();
            conOk = true;
            alarm = true;
        } catch (ModbusSlaveException ex) {
            Logger.getLogger(Mxl.class.getName()).log(Level.SEVERE, null, ex);
            closeConnection();
        } catch (ModbusException ex) {
            Logger.getLogger(Mxl.class.getName()).log(Level.SEVERE, null, ex);
            closeConnection();
        }
    }

    //************************readExecution*************************************
    private boolean[] executeTransactionDI(int brDI) {
        int k = 0;
        do {
            transaction();   
            readResDI = (ReadInputDiscretesResponse) trans.getResponse();
            boolean[] result = new boolean[brDI];
            for (int i = 0; i < brDI; i++) {
                result[i] = readResDI.getDiscreteStatus(i);
            }
            k++;
            return result;
        } while (k < repeat);
    }

    private boolean[] executeTransactionDO(int br_kolikocita) {
        int k = 0;
        do {
            transaction();
            readResCoil = (ReadCoilsResponse) trans.getResponse();

            boolean[] result = new boolean[br_kolikocita];
            for (int i = 0; i < br_kolikocita; i++) {
                result[i] = readResCoil.getCoilStatus(i);
            }
            k++;
            return result;
        } while (k < repeat);
    }

    private int[] executeTransactionRegistri(int brReg) {
        int k = 0;
        do {
            transaction();
            readResRegister = (ReadMultipleRegistersResponse) trans.getResponse();

            int[] result = new int[brReg];

            for (int i = 0; i < brReg; i++) {
                result[i] = readResRegister.getRegisterValue(i);
            }
            k++;
            return result;
        } while (k < repeat);
    }

    private int[] executeTransactionInputRegistri(int brReg) {
        int k = 0;

        do {
            transaction();
            readInputResRegisters = (ReadInputRegistersResponse) trans.getResponse();
            int[] result = new int[brReg];
            for (int i = 0; i < brReg; i++) {
                result[i] = readInputResRegisters.getRegisterValue(i);
            }
            k++;
            return result;
        } while (k < repeat);

    }

    //****************pomocne metode********************************************
    private Register[] getRegisters(int[] values) {
        Register[] reg = new Register[values.length];
        for (int i = 0; i < values.length; i++) {
            reg[i] = ModbusCoupler.getReference().getProcessImageFactory().createRegister();
            reg[i].setValue(values[i]);
        }
        return reg;
    }

    private BitVector getVector(boolean[] brDO_kolikoIhUpisuje) {
        BitVector bv = new BitVector(brDO_kolikoIhUpisuje.length);
        for (int i = 0; i < brDO_kolikoIhUpisuje.length; i++) {
            bv.setBit(i, brDO_kolikoIhUpisuje[i]);
        }
        return bv;
    }
}