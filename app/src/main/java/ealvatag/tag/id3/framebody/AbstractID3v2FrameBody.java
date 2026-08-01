package ealvatag.tag.id3.framebody;

import defpackage.AbstractC12444e;
import defpackage.AbstractC18186e;
import defpackage.C10754e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C7737e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import ealvatag.tag.datatype.AbstractDataType;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public abstract class AbstractID3v2FrameBody extends AbstractC12444e {
    private static final InterfaceC4279e LOG;
    private static final String TYPE_BODY = "body";
    private int size;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        LOG = new C7936e(2);
    }

    public AbstractID3v2FrameBody() {
    }

    public AbstractID3v2FrameBody(AbstractID3v2FrameBody abstractID3v2FrameBody) {
        super(abstractID3v2FrameBody);
    }

    public AbstractID3v2FrameBody(C16151e c16151e, int i) {
        setSize(i);
        read(c16151e);
    }

    public AbstractID3v2FrameBody(ByteBuffer byteBuffer, int i) {
        setSize(i);
        read(byteBuffer);
    }

    private void setSize() {
        this.size = 0;
        List<AbstractDataType> dataTypeList = getDataTypeList();
        int size = dataTypeList.size();
        for (int i = 0; i < size; i++) {
            this.size = dataTypeList.get(i).getSize() + this.size;
        }
    }

    public void createStructure() {
        C7936e c7936e = C7737e.billing;
        throw null;
    }

    @Override // defpackage.AbstractC12444e
    public boolean equals(Object obj) {
        return (obj instanceof AbstractID3v2FrameBody) && super.equals(obj);
    }

    public abstract String getIdentifier();

    @Override // defpackage.AbstractC11463e
    public int getSize() {
        return this.size;
    }

    public void read(C16151e c16151e) {
        String identifier = getIdentifier();
        AbstractDataType abstractDataType = null;
        try {
            int size = getSize();
            List<AbstractDataType> dataTypeList = getDataTypeList();
            int size2 = dataTypeList.size();
            int i = 0;
            while (i < size2) {
                AbstractDataType abstractDataType2 = dataTypeList.get(i);
                try {
                    abstractDataType2.read(c16151e, size);
                    size -= abstractDataType2.getSize();
                    i++;
                    abstractDataType = abstractDataType2;
                } catch (EOFException | ArrayIndexOutOfBoundsException e) {
                    e = e;
                    abstractDataType = abstractDataType2;
                    throw new Exception(String.format(Locale.getDefault(), "Problem reading %s in %s. %s", abstractDataType != null ? abstractDataType.getClass() : "Unknown", identifier, e.getMessage()), e);
                }
            }
            if (size >= 0) {
                return;
            }
            Locale.getDefault();
            throw new Exception("Problem reading Past last in " + identifier + ". Not enough data. Maybe previous data type read past it's size");
        } catch (EOFException e2) {
            e = e2;
        } catch (ArrayIndexOutOfBoundsException e3) {
            e = e3;
        }
    }

    @Override // defpackage.AbstractC11463e
    public void read(ByteBuffer byteBuffer) {
        int size = getSize();
        InterfaceC4279e interfaceC4279e = LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        getIdentifier();
        ((C7936e) interfaceC4279e).getClass();
        int i = C1724e.ad;
        byte[] bArr = new byte[size];
        byteBuffer.get(bArr);
        int size2 = getDataTypeList().size();
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractDataType abstractDataType = getDataTypeList().get(i3);
            InterfaceC4279e interfaceC4279e2 = LOG;
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            C7936e c7936e = (C7936e) interfaceC4279e2;
            c7936e.getClass();
            int i4 = C1724e.ad;
            if (i2 > size) {
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                c7936e.getClass();
                throw new Exception("Invalid size for Frame Body");
            }
            try {
                abstractDataType.readByteArray(bArr, i2);
                i2 += abstractDataType.getSize();
            } catch (C10754e e) {
                InterfaceC4279e interfaceC4279e3 = LOG;
                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                ((C7936e) interfaceC4279e3).getClass();
                int i5 = C1724e.ad;
                throw e;
            }
        }
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        InterfaceC4279e interfaceC4279e = LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        getIdentifier();
        ((C7936e) interfaceC4279e).getClass();
        int i = C1724e.ad;
        List<AbstractDataType> dataTypeList = getDataTypeList();
        int size = dataTypeList.size();
        for (int i2 = 0; i2 < size; i2++) {
            byte[] writeByteArray = dataTypeList.get(i2).writeByteArray();
            if (writeByteArray != null) {
                try {
                    byteArrayOutputStream.write(writeByteArray);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        setSize();
        InterfaceC4279e interfaceC4279e2 = LOG;
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        getIdentifier();
        ((C7936e) interfaceC4279e2).getClass();
        int i3 = C1724e.ad;
    }
}
