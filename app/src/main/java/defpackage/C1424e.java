package defpackage;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1424e {
    public static final C7936e advert;
    public static final byte[] smaato;
    public final byte[] ad;
    public final boolean adcel;
    public final int appmetrica;
    public final int billing;
    public final boolean license;
    public final byte metrica;
    public final int purchase;
    public final double vip;
    public final byte[] yandex;
    public final ArrayList startapp = new ArrayList();
    public long mopub = 0;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        advert = new C7936e(2);
        smaato = new byte[]{79, 103, 103, 83};
    }

    public C1424e(byte[] bArr) {
        this.license = false;
        this.appmetrica = 0;
        this.adcel = false;
        this.ad = bArr;
        byte b = bArr[4];
        this.metrica = bArr[5];
        if (b == 0) {
            this.vip = 0.0d;
            for (int i = 0; i < 8; i++) {
                this.vip = (Math.pow(2.0d, i * 8) * (bArr[i + 6] & 255)) + this.vip;
            }
            C7936e c7936e = AbstractC1983e.ad;
            this.billing = (int) AbstractC1983e.license(ByteBuffer.wrap(bArr), 14, 17);
            this.purchase = (int) AbstractC1983e.license(ByteBuffer.wrap(bArr), 18, 21);
            AbstractC1983e.license(ByteBuffer.wrap(bArr), 22, 25);
            byte b2 = bArr[26];
            this.yandex = new byte[bArr.length - 27];
            Integer num = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[] bArr2 = this.yandex;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte b3 = bArr[i2 + 27];
                bArr2[i2] = b3;
                int i4 = b3 & 255;
                Integer valueOf = Integer.valueOf(i4);
                int i5 = this.appmetrica + i4;
                this.appmetrica = i5;
                i3 += i4;
                if (i4 < 255) {
                    this.startapp.add(new C10912e(i5 - i3, i3));
                    i3 = 0;
                }
                i2++;
                num = valueOf;
            }
            if (num != null && num.intValue() == 255) {
                this.startapp.add(new C10912e(this.appmetrica - i3, i3));
                this.adcel = true;
            }
            this.license = true;
        }
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        advert.getClass();
        int i6 = C1724e.ad;
    }

    public static C1424e metrica(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        advert.getClass();
        int i = C1724e.ad;
        byte[] bArr = smaato;
        byte[] bArr2 = new byte[bArr.length];
        byteBuffer.get(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            throw new C1110e("OggS Header could not be found, not an ogg stream %s", new String(bArr2));
        }
        byteBuffer.position(position + 26);
        int i2 = byteBuffer.get() & 255;
        byteBuffer.position(position);
        byte[] bArr3 = new byte[i2 + 27];
        byteBuffer.get(bArr3);
        return new C1424e(bArr3);
    }

    public static C1424e vip(RandomAccessFile randomAccessFile) {
        long filePointer = randomAccessFile.getFilePointer();
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = advert;
        c7936e.getClass();
        int i = C1724e.ad;
        byte[] bArr = smaato;
        byte[] bArr2 = new byte[bArr.length];
        randomAccessFile.read(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            randomAccessFile.seek(filePointer);
            if (!AbstractC11095e.m2989this(randomAccessFile)) {
                throw new C1110e("OggS Header could not be found, not an ogg stream %s", new String(bArr2));
            }
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            randomAccessFile.getFilePointer();
            c7936e.getClass();
            randomAccessFile.read(bArr2);
            if (Arrays.equals(bArr2, bArr)) {
                filePointer = randomAccessFile.getFilePointer() - bArr.length;
            }
        }
        randomAccessFile.seek(26 + filePointer);
        int readByte = randomAccessFile.readByte() & 255;
        randomAccessFile.seek(filePointer);
        byte[] bArr3 = new byte[readByte + 27];
        randomAccessFile.read(bArr3);
        C1424e c1424e = new C1424e(bArr3);
        c1424e.mopub = filePointer;
        return c1424e;
    }

    public final int ad() {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        advert.getClass();
        int i = C1724e.ad;
        return this.appmetrica;
    }

    public final String toString() {
        String str = "Ogg Page Header:isValid:" + this.license + ":type:" + ((int) this.metrica) + ":oggPageHeaderLength:" + this.ad.length + ":length:" + this.appmetrica + ":seqNo:" + this.purchase + ":packetIncomplete:" + this.adcel + ":serNum:" + this.billing;
        Iterator it = this.startapp.iterator();
        while (it.hasNext()) {
            C10912e c10912e = (C10912e) it.next();
            StringBuilder inmobi = AbstractC8703e.inmobi(str);
            inmobi.append(c10912e.toString());
            str = inmobi.toString();
        }
        return str;
    }
}
