package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC2251e;
import defpackage.AbstractC4653e;
import defpackage.C16151e;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class NumberVariableLength extends AbstractDataType {
    private static final int MAXIMUM_NO_OF_DIGITS = 8;
    private static final int MINIMUM_NO_OF_DIGITS = 1;
    int minLength;

    public NumberVariableLength(NumberVariableLength numberVariableLength) {
        super(numberVariableLength);
        this.minLength = 1;
        this.minLength = numberVariableLength.minLength;
    }

    public NumberVariableLength(String str, AbstractC12444e abstractC12444e, int i) {
        super(str, abstractC12444e);
        this.minLength = i;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof NumberVariableLength) && this.minLength == ((NumberVariableLength) obj).minLength && super.equals(obj);
    }

    public int getMaximumLenth() {
        return 8;
    }

    public int getMinimumLength() {
        return this.minLength;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        Object obj = this.value;
        int i = 0;
        if (obj == null) {
            return 0;
        }
        long mopub = AbstractC2251e.mopub(obj);
        for (int i2 = 1; i2 <= 8; i2++) {
            if ((((byte) mopub) & 255) != 0) {
                i = i2;
            }
            mopub >>= 8;
        }
        int i3 = this.minLength;
        return i3 > i ? i3 : i;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        long j = c16151e.f31731e;
        long j2 = 0;
        if (j == 0) {
            if (this.minLength != 0) {
                throw new Exception("No data for value");
            }
            this.value = 0L;
        } else {
            int min = (int) Math.min(i, j);
            int i2 = 0;
            while (i2 < min) {
                i2++;
                j2 = (j2 << 8) + (c16151e.readByte() & 255);
            }
            this.value = Long.valueOf(j2);
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("Byte array is null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "negativer offset into an array offset:"));
        }
        long j = 0;
        if (i >= bArr.length) {
            if (this.minLength == 0) {
                this.value = 0L;
                return;
            } else {
                StringBuilder premium = AbstractC4653e.premium("Offset to byte array is out of bounds: offset = ", i, ", array.length = ");
                premium.append(bArr.length);
                throw new Exception(premium.toString());
            }
        }
        while (i < bArr.length) {
            long j2 = (j << 8) + (bArr[i] & 255);
            i++;
            j = j2;
        }
        this.value = Long.valueOf(j);
    }

    public void setMinimumSize(int i) {
        if (i > 0) {
            this.minLength = i;
        }
    }

    public String toString() {
        Object obj = this.value;
        return obj == null ? BuildConfig.FLAVOR : obj.toString();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        int size = getSize();
        if (size == 0) {
            return new byte[0];
        }
        long mopub = AbstractC2251e.mopub(this.value);
        byte[] bArr = new byte[size];
        for (int i = size - 1; i >= 0; i--) {
            bArr[i] = (byte) (255 & mopub);
            mopub >>= 8;
        }
        return bArr;
    }
}
