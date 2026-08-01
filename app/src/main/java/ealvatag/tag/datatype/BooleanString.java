package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.C16151e;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class BooleanString extends AbstractDataType {
    public BooleanString(BooleanString booleanString) {
        super(booleanString);
    }

    public BooleanString(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof BooleanString) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return 1;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        this.value = Boolean.valueOf(48 != c16151e.readByte());
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        this.value = Boolean.valueOf(bArr[i] != 48);
    }

    public String toString() {
        return BuildConfig.FLAVOR + this.value;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] bArr = new byte[1];
        Object obj = this.value;
        if (obj == null) {
            bArr[0] = 48;
            return bArr;
        }
        if (((Boolean) obj).booleanValue()) {
            bArr[0] = 48;
            return bArr;
        }
        bArr[0] = 49;
        return bArr;
    }
}
