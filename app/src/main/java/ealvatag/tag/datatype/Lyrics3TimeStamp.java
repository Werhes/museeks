package ealvatag.tag.datatype;

import defpackage.AbstractC10257e;
import defpackage.AbstractC12444e;
import defpackage.AbstractC4639e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC8703e;
import defpackage.C16151e;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class Lyrics3TimeStamp extends AbstractDataType {
    private long minute;
    private long second;

    public Lyrics3TimeStamp(Lyrics3TimeStamp lyrics3TimeStamp) {
        super(lyrics3TimeStamp);
        this.minute = 0L;
        this.second = 0L;
        this.minute = lyrics3TimeStamp.minute;
        this.second = lyrics3TimeStamp.second;
    }

    public Lyrics3TimeStamp(String str) {
        super(str, null);
        this.minute = 0L;
        this.second = 0L;
    }

    public Lyrics3TimeStamp(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
        this.minute = 0L;
        this.second = 0L;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (!(obj instanceof Lyrics3TimeStamp)) {
            return false;
        }
        Lyrics3TimeStamp lyrics3TimeStamp = (Lyrics3TimeStamp) obj;
        return this.minute == lyrics3TimeStamp.minute && this.second == lyrics3TimeStamp.second && super.equals(obj);
    }

    public long getMinute() {
        return this.minute;
    }

    public long getSecond() {
        return this.second;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        return 7;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        readString(Arrays.toString(c16151e.subs(c16151e.f31731e)), 0);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        readString(Arrays.toString(bArr), i);
    }

    public void readString() {
    }

    public void readString(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Image is null");
        }
        if (i < 0 || i >= str.length()) {
            StringBuilder premium = AbstractC4653e.premium("Offset to timeStamp is out of bounds: offset = ", i, ", timeStamp.length()");
            premium.append(str.length());
            throw new IndexOutOfBoundsException(premium.toString());
        }
        if (str.substring(i).length() == 7) {
            this.minute = Integer.parseInt(r4.substring(1, 3));
            this.second = Integer.parseInt(r4.substring(4, 6));
        } else {
            this.minute = 0L;
            this.second = 0L;
        }
    }

    public void setMinute(long j) {
        this.minute = j;
    }

    public void setSecond(long j) {
        this.second = j;
    }

    public void setTimeStamp(long j, byte b) {
        long j2 = j / 1000;
        this.minute = j2 / 60;
        this.second = j2 % 60;
    }

    public String toString() {
        return writeString();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        return writeString().getBytes(AbstractC4639e.vip);
    }

    public String writeString() {
        String sb;
        String sb2;
        long j = this.minute;
        if (j < 0) {
            sb = "[00";
        } else {
            StringBuilder inmobi = AbstractC8703e.inmobi(j < 10 ? "[0" : "[");
            inmobi.append(Long.toString(this.minute));
            sb = inmobi.toString();
        }
        String str = sb + ':';
        long j2 = this.second;
        if (j2 < 0) {
            sb2 = AbstractC10257e.adcel(str, "00");
        } else {
            if (j2 < 10) {
                str = str + '0';
            }
            StringBuilder inmobi2 = AbstractC8703e.inmobi(str);
            inmobi2.append(Long.toString(this.second));
            sb2 = inmobi2.toString();
        }
        return sb2 + ']';
    }
}
