// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.0
//
// <auto-generated>
//
// Generated from file `goods.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package io.mycat.ep.v1.goods.stock;

public class StorageChangeResult implements java.lang.Cloneable, java.io.Serializable
{
    public int status;

    public StorageChangeResult()
    {
    }

    public StorageChangeResult(int status)
    {
        this.status = status;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        StorageChangeResult _r = null;
        if(rhs instanceof StorageChangeResult)
        {
            _r = (StorageChangeResult)rhs;
        }

        if(_r != null)
        {
            if(status != _r.status)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::goods::stock::StorageChangeResult");
        __h = IceInternal.HashUtil.hashAdd(__h, status);
        return __h;
    }

    public StorageChangeResult
    clone()
    {
        StorageChangeResult c = null;
        try
        {
            c = (StorageChangeResult)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeInt(status);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        status = __is.readInt();
    }

    static public void
    __write(IceInternal.BasicStream __os, StorageChangeResult __v)
    {
        if(__v == null)
        {
            __nullMarshalValue.__write(__os);
        }
        else
        {
            __v.__write(__os);
        }
    }

    static public StorageChangeResult
    __read(IceInternal.BasicStream __is, StorageChangeResult __v)
    {
        if(__v == null)
        {
             __v = new StorageChangeResult();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final StorageChangeResult __nullMarshalValue = new StorageChangeResult();

    public static final long serialVersionUID = 2044886046L;
}
