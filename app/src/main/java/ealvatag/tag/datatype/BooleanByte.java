package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC4653e;
import defpackage.C16151e;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class BooleanByte extends AbstractDataType {
    private int bitPosition;

    public BooleanByte(String str, AbstractC12444e abstractC12444e, int i) {
        super(str, abstractC12444e);
        this.bitPosition = -1;
        if (i < 0 || i > 7) {
            throw new IndexOutOfBoundsException(AbstractC1786e.admob(i, "Bit position needs to be from 0 - 7 : "));
        }
        this.bitPosition = i;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof BooleanByte) && this.bitPosition == ((BooleanByte) obj).bitPosition && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return 1;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        this.value = Boolean.valueOf(((byte) (((byte) (c16151e.readByte() >> this.bitPosition)) & 1)) == 1);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("Byte array is null");
        }
        if (i >= 0 && i < bArr.length) {
            this.value = Boolean.valueOf(((byte) (((byte) (bArr[i] >> this.bitPosition)) & 1)) == 1);
        } else {
            StringBuilder premium = AbstractC4653e.premium("Offset to byte array is out of bounds: offset = ", i, ", array.length = ");
            premium.append(bArr.length);
            throw new IndexOutOfBoundsException(premium.toString());
        }
    }

    public String toString() {
        return BuildConfig.FLAVOR + this.value;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] bArr = new byte[1];
        Object obj = this.value;
        if (obj != null) {
            byte b = ((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0;
            bArr[0] = b;
            bArr[0] = (byte) (b << this.bitPosition);
        }
        return bArr;
    }
}
