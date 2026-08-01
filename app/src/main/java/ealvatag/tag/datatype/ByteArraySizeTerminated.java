package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC4653e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class ByteArraySizeTerminated extends AbstractDataType {
    public ByteArraySizeTerminated(ByteArraySizeTerminated byteArraySizeTerminated) {
        super(byteArraySizeTerminated);
    }

    public ByteArraySizeTerminated(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof ByteArraySizeTerminated) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        Object obj = this.value;
        if (obj != null) {
            return ((byte[]) obj).length;
        }
        return 0;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        this.value = c16151e.subs(i);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("Byte array is null");
        }
        if (i < 0) {
            StringBuilder premium = AbstractC4653e.premium("Offset to byte array is out of bounds: offset = ", i, ", array.length = ");
            premium.append(bArr.length);
            throw new IndexOutOfBoundsException(premium.toString());
        }
        if (i >= bArr.length) {
            this.value = null;
            return;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        this.value = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, length);
    }

    public String toString() {
        return getSize() + " bytes";
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        getIdentifier();
        ((C7936e) interfaceC4279e).getClass();
        int i = C1724e.ad;
        return (byte[]) this.value;
    }
}
