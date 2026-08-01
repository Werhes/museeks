package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC4639e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC8703e;
import defpackage.C16151e;
import java.util.Iterator;
import java.util.LinkedList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class Lyrics3Line extends AbstractDataType {
    private String lyric;
    private LinkedList<Lyrics3TimeStamp> timeStamp;

    public Lyrics3Line(Lyrics3Line lyrics3Line) {
        super(lyrics3Line);
        this.timeStamp = new LinkedList<>();
        this.lyric = BuildConfig.FLAVOR;
        this.lyric = lyrics3Line.lyric;
        for (int i = 0; i < lyrics3Line.timeStamp.size(); i++) {
            this.timeStamp.add(new Lyrics3TimeStamp(lyrics3Line.timeStamp.get(i)));
        }
    }

    public Lyrics3Line(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
        this.timeStamp = new LinkedList<>();
        this.lyric = BuildConfig.FLAVOR;
    }

    public void addLyric(ID3v2LyricLine iD3v2LyricLine) {
        this.lyric += iD3v2LyricLine.getText();
    }

    public void addLyric(String str) {
        this.lyric = AbstractC1786e.signatures(new StringBuilder(), this.lyric, str);
    }

    public void addTimeStamp(Lyrics3TimeStamp lyrics3TimeStamp) {
        this.timeStamp.add(lyrics3TimeStamp);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        if (!(obj instanceof Lyrics3Line)) {
            return false;
        }
        Lyrics3Line lyrics3Line = (Lyrics3Line) obj;
        return this.lyric.equals(lyrics3Line.lyric) && this.timeStamp.equals(lyrics3Line.timeStamp) && super.equals(obj);
    }

    public String getLyric() {
        return this.lyric;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public int getSize() {
        Iterator<Lyrics3TimeStamp> it = this.timeStamp.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().getSize();
        }
        return this.lyric.length() + i;
    }

    public Iterator<Lyrics3TimeStamp> getTimeStamp() {
        return this.timeStamp.iterator();
    }

    public boolean hasTimeStamp() {
        return !this.timeStamp.isEmpty();
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void read(C16151e c16151e, int i) {
        readString(c16151e.subs(c16151e.f31731e).toString(), 0);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void readByteArray(byte[] bArr, int i) {
        readString(bArr.toString(), i);
    }

    public void readString(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Image is null");
        }
        if (i < 0 || i >= str.length()) {
            StringBuilder premium = AbstractC4653e.premium("Offset to line is out of bounds: offset = ", i, ", line.length()");
            premium.append(str.length());
            throw new IndexOutOfBoundsException(premium.toString());
        }
        this.timeStamp = new LinkedList<>();
        int indexOf = str.indexOf("[", i);
        while (indexOf >= 0) {
            i = str.indexOf("]", indexOf) + 1;
            Lyrics3TimeStamp lyrics3TimeStamp = new Lyrics3TimeStamp("Time Stamp");
            lyrics3TimeStamp.readString();
            this.timeStamp.add(lyrics3TimeStamp);
            indexOf = str.indexOf("[", i);
        }
        this.lyric = str.substring(i);
    }

    public void setLyric(ID3v2LyricLine iD3v2LyricLine) {
        this.lyric = iD3v2LyricLine.getText();
    }

    public void setLyric(String str) {
        this.lyric = str;
    }

    public void setTimeStamp(Lyrics3TimeStamp lyrics3TimeStamp) {
        this.timeStamp.clear();
        this.timeStamp.add(lyrics3TimeStamp);
    }

    public String toString() {
        Iterator<Lyrics3TimeStamp> it = this.timeStamp.iterator();
        String str = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            Lyrics3TimeStamp next = it.next();
            StringBuilder inmobi = AbstractC8703e.inmobi(str);
            inmobi.append(next.toString());
            str = inmobi.toString();
        }
        return AbstractC1786e.signatures(AbstractC8703e.applovin("timeStamp = ", str, ", lyric = "), this.lyric, "\n");
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public byte[] writeByteArray() {
        return writeString().getBytes(AbstractC4639e.vip);
    }

    public String writeString() {
        Iterator<Lyrics3TimeStamp> it = this.timeStamp.iterator();
        String str = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            Lyrics3TimeStamp next = it.next();
            StringBuilder inmobi = AbstractC8703e.inmobi(str);
            inmobi.append(next.writeString());
            str = inmobi.toString();
        }
        StringBuilder inmobi2 = AbstractC8703e.inmobi(str);
        inmobi2.append(this.lyric);
        return inmobi2.toString();
    }
}
