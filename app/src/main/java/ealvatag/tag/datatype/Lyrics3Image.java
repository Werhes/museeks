package ealvatag.tag.datatype;

import defpackage.AbstractC10257e;
import defpackage.AbstractC12444e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC4639e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC8703e;
import defpackage.C16151e;
import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class Lyrics3Image extends AbstractDataType {
    private String description;
    private String filename;
    private Lyrics3TimeStamp time;

    public Lyrics3Image(Lyrics3Image lyrics3Image) {
        super(lyrics3Image);
        this.time = null;
        this.description = BuildConfig.FLAVOR;
        this.filename = BuildConfig.FLAVOR;
        this.time = new Lyrics3TimeStamp(lyrics3Image.time);
        this.description = lyrics3Image.description;
        this.filename = lyrics3Image.filename;
    }

    public Lyrics3Image(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
        this.time = null;
        this.description = BuildConfig.FLAVOR;
        this.filename = BuildConfig.FLAVOR;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (!(obj instanceof Lyrics3Image)) {
            return false;
        }
        Lyrics3Image lyrics3Image = (Lyrics3Image) obj;
        if (!this.description.equals(lyrics3Image.description) || !this.filename.equals(lyrics3Image.filename)) {
            return false;
        }
        Lyrics3TimeStamp lyrics3TimeStamp = this.time;
        if (lyrics3TimeStamp == null) {
            if (lyrics3Image.time != null) {
                return false;
            }
        } else if (!lyrics3TimeStamp.equals(lyrics3Image.time)) {
            return false;
        }
        return super.equals(obj);
    }

    public String getDescription() {
        return this.description;
    }

    public String getFilename() {
        return this.filename;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        int length = this.description.length() + this.filename.length() + 2 + 2;
        Lyrics3TimeStamp lyrics3TimeStamp = this.time;
        return lyrics3TimeStamp != null ? lyrics3TimeStamp.getSize() + length : length;
    }

    public Lyrics3TimeStamp getTimeStamp() {
        return this.time;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        readString(Arrays.toString(c16151e.subs(c16151e.f31731e)), 0);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        readString(Arrays.toString(bArr), i);
    }

    public void readString(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Image string is null");
        }
        if (i < 0 || i >= str.length()) {
            StringBuilder premium = AbstractC4653e.premium("Offset to image string is out of bounds: offset = ", i, ", string.length()");
            premium.append(str.length());
            throw new IndexOutOfBoundsException(premium.toString());
        }
        int indexOf = str.indexOf("||", i);
        this.filename = str.substring(i, indexOf);
        int i2 = indexOf + 2;
        int indexOf2 = str.indexOf("||", i2);
        this.description = str.substring(i2, indexOf2);
        if (str.substring(indexOf2 + 2).length() == 7) {
            Lyrics3TimeStamp lyrics3TimeStamp = new Lyrics3TimeStamp("Time Stamp");
            this.time = lyrics3TimeStamp;
            lyrics3TimeStamp.readString();
        }
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setTimeStamp(Lyrics3TimeStamp lyrics3TimeStamp) {
        this.time = lyrics3TimeStamp;
    }

    public String toString() {
        String str = "filename = " + this.filename + ", description = " + this.description;
        if (this.time != null) {
            StringBuilder isPro = AbstractC8703e.isPro(str, ", timestamp = ");
            isPro.append(this.time.toString());
            str = isPro.toString();
        }
        return AbstractC10257e.adcel(str, "\n");
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        return writeString().getBytes(AbstractC4639e.vip);
    }

    public String writeString() {
        String signatures = this.filename == null ? "||" : AbstractC1786e.signatures(new StringBuilder(), this.filename, "||");
        String adcel = this.description == null ? AbstractC10257e.adcel(signatures, "||") : AbstractC1786e.signatures(AbstractC8703e.inmobi(signatures), this.description, "||");
        if (this.time == null) {
            return adcel;
        }
        StringBuilder inmobi = AbstractC8703e.inmobi(adcel);
        inmobi.append(this.time.writeString());
        return inmobi.toString();
    }
}
