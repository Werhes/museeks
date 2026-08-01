package defpackage;

import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۢ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2174e extends AbstractC17555e {
    public C10433e metrica;
    public C11475e vip;

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, eؔۜۛ] */
    @Override // defpackage.AbstractC17555e
    public final C0521e ad(RandomAccessFile randomAccessFile) {
        double d;
        this.vip.getClass();
        long filePointer = randomAccessFile.getFilePointer();
        C0521e c0521e = new C0521e();
        C7936e c7936e = C11475e.ad;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        c7936e.getClass();
        int i = C1724e.ad;
        byte[] bArr = C1424e.smaato;
        byte[] bArr2 = new byte[bArr.length];
        randomAccessFile.read(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            randomAccessFile.seek(0L);
            if (!AbstractC11095e.m2989this(randomAccessFile)) {
                throw new C1110e("OggS Header could not be found, not an ogg stream %s", new String(bArr2));
            }
            randomAccessFile.read(bArr2);
            if (Arrays.equals(bArr2, bArr)) {
                filePointer = randomAccessFile.getFilePointer();
            }
        }
        randomAccessFile.seek(filePointer);
        long j = 2;
        randomAccessFile.seek(randomAccessFile.length() - 2);
        while (true) {
            if (randomAccessFile.getFilePointer() < 4) {
                d = -1.0d;
                break;
            }
            int read = randomAccessFile.read();
            byte[] bArr3 = C1424e.smaato;
            long j2 = j;
            if (read == bArr3[3]) {
                randomAccessFile.seek(randomAccessFile.getFilePointer() - 4);
                byte[] bArr4 = new byte[3];
                randomAccessFile.readFully(bArr4);
                if (bArr4[0] == bArr3[0] && bArr4[1] == bArr3[1] && bArr4[2] == bArr3[2]) {
                    randomAccessFile.seek(randomAccessFile.getFilePointer() - 3);
                    long filePointer2 = randomAccessFile.getFilePointer();
                    randomAccessFile.seek(randomAccessFile.getFilePointer() + 26);
                    int readByte = randomAccessFile.readByte() & 255;
                    randomAccessFile.seek(filePointer2);
                    byte[] bArr5 = new byte[readByte + 27];
                    randomAccessFile.readFully(bArr5);
                    C1424e c1424e = new C1424e(bArr5);
                    randomAccessFile.seek(0L);
                    C7936e c7936e2 = C1424e.advert;
                    EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                    c7936e2.getClass();
                    int i2 = C1724e.ad;
                    d = c1424e.vip;
                    break;
                }
            }
            randomAccessFile.seek(randomAccessFile.getFilePointer() - j2);
            j = j2;
        }
        if (d == -1.0d) {
            throw new Exception("Could not find the Ogg Setup block");
        }
        int ad = C1424e.vip(randomAccessFile).ad();
        byte[] bArr6 = new byte[ad];
        if (ad < 27) {
            throw new Exception("Invalid Identification header for this Ogg File");
        }
        randomAccessFile.read(bArr6);
        ?? obj = new Object();
        byte b = bArr6[0];
        C7936e c7936e3 = C2882e.startapp;
        EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
        c7936e3.getClass();
        int i3 = C1724e.ad;
        String str = new String(bArr6, 1, 6, AbstractC4639e.vip);
        if (b == 1 && str.equals("vorbis")) {
            obj.license = bArr6[7] + (bArr6[8] << 8) + (bArr6[9] << 16) + (bArr6[10] << 24);
            obj.metrica = bArr6[11] & 255;
            obj.appmetrica = (bArr6[12] & 255) + ((bArr6[13] & 255) << 8) + ((bArr6[14] & 255) << 16) + ((bArr6[15] & 255) << 24);
            obj.purchase = (bArr6[16] & 255) + ((bArr6[17] & 255) << 8) + ((bArr6[18] & 255) << 16) + ((bArr6[19] & 255) << 24);
            obj.billing = (bArr6[20] & 255) + ((bArr6[21] & 255) << 8) + ((bArr6[22] & 255) << 16) + ((bArr6[23] & 255) << 24);
            obj.yandex = (bArr6[24] & 255) + ((bArr6[25] & 255) << 8) + ((bArr6[26] & 255) << 16) + ((bArr6[27] & 255) << 24);
            byte b2 = bArr6[29];
        }
        int i4 = obj.appmetrica;
        c0521e.mopub = (float) (d / i4);
        c0521e.appmetrica = obj.metrica;
        c0521e.purchase = i4;
        EnumC12125e.values()[obj.license].getClass();
        c0521e.yandex = "Ogg Vorbis v1";
        c0521e.billing = 16;
        int i5 = obj.billing;
        if (i5 != 0 && obj.yandex == i5 && obj.purchase == i5) {
            c0521e.license = i5 / 1000;
            c0521e.startapp = false;
            return c0521e;
        }
        if (i5 != 0 && obj.yandex == 0 && obj.purchase == 0) {
            c0521e.license = i5 / 1000;
            c0521e.startapp = true;
            return c0521e;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long round = Math.round(c0521e.mopub * 1.0E9d);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long metrica = AbstractC17331e.metrica(round);
        long length = randomAccessFile.length();
        if (metrica == 0) {
            metrica = 1;
        }
        C7936e c7936e4 = AbstractC1983e.ad;
        c0521e.license = (int) (((length / 1000) * 8) / metrica);
        c0521e.startapp = true;
        return c0521e;
    }

    @Override // defpackage.AbstractC17555e
    public final InterfaceC1425e vip(RandomAccessFile randomAccessFile) {
        return this.metrica.metrica(randomAccessFile);
    }
}
