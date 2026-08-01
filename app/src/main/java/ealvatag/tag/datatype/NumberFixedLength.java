package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC2251e;
import defpackage.AbstractC2301e;
import defpackage.AbstractC4653e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class NumberFixedLength extends AbstractDataType {
    public NumberFixedLength(NumberFixedLength numberFixedLength) {
        super(numberFixedLength);
        this.size = numberFixedLength.size;
    }

    public NumberFixedLength(String str, AbstractC12444e abstractC12444e, int i) {
        super(str, abstractC12444e);
        AbstractC2301e.billing(i >= 0);
        this.size = i;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof NumberFixedLength) && this.size == ((NumberFixedLength) obj).size && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return this.size;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        long j = 0;
        for (int i2 = 0; i2 < this.size; i2++) {
            j = (j << 8) + (c16151e.readByte() & 255);
        }
        this.value = Long.valueOf(j);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("Byte array is null");
        }
        if (i < 0 || i >= bArr.length) {
            StringBuilder premium = AbstractC4653e.premium("Offset to byte array is out of bounds: offset = ", i, ", array.length = ");
            premium.append(bArr.length);
            throw new Exception(premium.toString());
        }
        if (this.size + i > bArr.length) {
            StringBuilder premium2 = AbstractC4653e.premium("Offset plus size to byte array is out of bounds: offset = ", i, ", size = ");
            premium2.append(this.size);
            premium2.append(" + array.length ");
            premium2.append(bArr.length);
            throw new Exception(premium2.toString());
        }
        long j = 0;
        for (int i2 = i; i2 < this.size + i; i2++) {
            j = (j << 8) + (bArr[i2] & 255);
        }
        this.value = Long.valueOf(j);
        InterfaceC4279e interfaceC4279e = AbstractDataType.LOG;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ((C7936e) interfaceC4279e).getClass();
        int i3 = C1724e.ad;
    }

    public void setSize(int i) {
        if (i > 0) {
            this.size = i;
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void setValue(Object obj) {
        if (obj instanceof Number) {
            super.setValue(obj);
        } else {
            throw new IllegalArgumentException("Invalid value type for NumberFixedLength:" + obj.getClass());
        }
    }

    public String toString() {
        Object obj = this.value;
        return obj == null ? BuildConfig.FLAVOR : obj.toString();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] bArr = new byte[this.size];
        Object obj = this.value;
        if (obj != null) {
            long mopub = AbstractC2251e.mopub(obj);
            for (int i = this.size - 1; i >= 0; i--) {
                bArr[i] = (byte) (255 & mopub);
                mopub >>= 8;
            }
        }
        return bArr;
    }
}
