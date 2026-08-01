package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC4639e;
import defpackage.AbstractC4653e;
import defpackage.C16151e;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class ID3v2LyricLine extends AbstractDataType {
    String text;
    long timeStamp;

    public ID3v2LyricLine(ID3v2LyricLine iD3v2LyricLine) {
        super(iD3v2LyricLine);
        this.text = BuildConfig.FLAVOR;
        this.timeStamp = 0L;
        this.text = iD3v2LyricLine.text;
        this.timeStamp = iD3v2LyricLine.timeStamp;
    }

    public ID3v2LyricLine(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
        this.text = BuildConfig.FLAVOR;
        this.timeStamp = 0L;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (!(obj instanceof ID3v2LyricLine)) {
            return false;
        }
        ID3v2LyricLine iD3v2LyricLine = (ID3v2LyricLine) obj;
        return this.text.equals(iD3v2LyricLine.text) && this.timeStamp == iD3v2LyricLine.timeStamp && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return this.text.length() + 5;
    }

    public String getText() {
        return this.text;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        this.text = c16151e.mo1683e(c16151e.f31731e - 4, AbstractC4639e.vip);
        this.timeStamp = 0L;
        for (int i2 = 0; i2 < 4; i2++) {
            long j = this.timeStamp << 8;
            this.timeStamp = j;
            this.timeStamp = j + c16151e.readByte();
        }
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("Byte array is null");
        }
        if (i < 0 || i >= bArr.length) {
            StringBuilder premium = AbstractC4653e.premium("Offset to byte array is out of bounds: offset = ", i, ", array.length = ");
            premium.append(bArr.length);
            throw new IndexOutOfBoundsException(premium.toString());
        }
        this.text = new String(bArr, i, (bArr.length - i) - 4, AbstractC4639e.vip);
        this.timeStamp = 0L;
        for (int length = bArr.length - 4; length < bArr.length; length++) {
            long j = this.timeStamp << 8;
            this.timeStamp = j;
            this.timeStamp = j + bArr[length];
        }
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public String toString() {
        return this.timeStamp + " " + this.text;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        byte[] bArr = new byte[getSize()];
        int i = 0;
        while (i < this.text.length()) {
            bArr[i] = (byte) this.text.charAt(i);
            i++;
        }
        bArr[i] = 0;
        long j = this.timeStamp;
        bArr[i + 1] = (byte) (((-16777216) & j) >> 24);
        bArr[i + 2] = (byte) ((16711680 & j) >> 16);
        bArr[i + 3] = (byte) ((65280 & j) >> 8);
        bArr[i + 4] = (byte) (j & 255);
        return bArr;
    }
}
