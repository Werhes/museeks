package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC2251e;
import defpackage.AbstractC4653e;
import defpackage.C16151e;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class TempoCode extends AbstractDataType {
    private static final int MAXIMUM_NO_OF_DIGITS = 2;
    private static final int MINIMUM_NO_OF_DIGITS = 1;

    public TempoCode(TempoCode tempoCode) {
        super(tempoCode);
    }

    public TempoCode(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e, 0);
    }

    public TempoCode(String str, AbstractC12444e abstractC12444e, Object obj) {
        super(str, abstractC12444e, obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof TempoCode) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return AbstractC2251e.mopub(obj) < 255 ? 1 : 2;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        long readByte = c16151e.readByte() & 255;
        if (readByte == 255) {
            readByte += c16151e.readByte() & 255;
        }
        this.value = Long.valueOf(readByte);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("Byte array is null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "negative offset into an array offset:"));
        }
        if (i >= bArr.length) {
            StringBuilder premium = AbstractC4653e.premium("Offset to byte array is out of bounds: offset = ", i, ", array.length = ");
            premium.append(bArr.length);
            throw new Exception(premium.toString());
        }
        long j = bArr[i] & 255;
        if (j == 255) {
            j += bArr[i + 1] & 255;
        }
        this.value = Long.valueOf(j);
    }

    public String toString() {
        Object obj = this.value;
        return obj == null ? BuildConfig.FLAVOR : obj.toString();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] bArr = new byte[getSize()];
        long mopub = AbstractC2251e.mopub(this.value);
        char c = 0;
        if (mopub >= 255) {
            bArr[0] = -1;
            mopub -= 255;
            c = 1;
        }
        bArr[c] = (byte) (mopub & 255);
        return bArr;
    }
}
