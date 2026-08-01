package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10433e {
    public static final C7936e vip;
    public final C3534e ad = new Object();

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        vip = new C7936e(2);
    }

    public static byte[] ad(long j, RandomAccessFile randomAccessFile) {
        C1424e vip2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        randomAccessFile.seek(j);
        C1424e vip3 = C1424e.vip(randomAccessFile);
        ArrayList arrayList = vip3.startapp;
        if (arrayList.size() > 1) {
            randomAccessFile.skipBytes(((C10912e) arrayList.get(0)).vip.intValue());
        }
        byte[] bArr = new byte[7];
        randomAccessFile.read(bArr);
        if (!vip(bArr)) {
            throw new Exception("Unable to find setup header(2), unable to write ogg file");
        }
        randomAccessFile.seek(randomAccessFile.getFilePointer() - 7);
        if (arrayList.size() > 1) {
            byte[] bArr2 = new byte[((C10912e) arrayList.get(1)).vip.intValue()];
            randomAccessFile.read(bArr2);
            byteArrayOutputStream.write(bArr2);
        } else {
            byte[] bArr3 = new byte[((C10912e) arrayList.get(0)).vip.intValue()];
            randomAccessFile.read(bArr3);
            byteArrayOutputStream.write(bArr3);
        }
        boolean z = vip3.adcel;
        C7936e c7936e = vip;
        if (!z || arrayList.size() > 2) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i = C1724e.ad;
            if (arrayList.size() > 2) {
                for (int i2 = 2; i2 < arrayList.size(); i2++) {
                    byte[] bArr4 = new byte[((C10912e) arrayList.get(i2)).vip.intValue()];
                    randomAccessFile.read(bArr4);
                    byteArrayOutputStream.write(bArr4);
                }
            }
            return byteArrayOutputStream.toByteArray();
        }
        do {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i3 = C1724e.ad;
            vip2 = C1424e.vip(randomAccessFile);
            ArrayList arrayList2 = vip2.startapp;
            byte[] bArr5 = new byte[((C10912e) arrayList2.get(0)).vip.intValue()];
            randomAccessFile.read(bArr5);
            byteArrayOutputStream.write(bArr5);
            if (arrayList2.size() > 1) {
                c7936e.getClass();
                return byteArrayOutputStream.toByteArray();
            }
        } while (vip2.adcel);
        c7936e.getClass();
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean vip(byte[] bArr) {
        return bArr[0] == 5 && new String(bArr, 1, 6, AbstractC4639e.vip).equals("vorbis");
    }

    public final C3095e metrica(RandomAccessFile randomAccessFile) {
        byte[] byteArray;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = vip;
        c7936e.getClass();
        int i = C1724e.ad;
        c7936e.getClass();
        randomAccessFile.seek(randomAccessFile.getFilePointer() + C1424e.vip(randomAccessFile).ad());
        C1424e vip2 = C1424e.vip(randomAccessFile);
        ArrayList arrayList = vip2.startapp;
        byte[] bArr = new byte[7];
        randomAccessFile.read(bArr);
        String str = new String(bArr, 1, 6, AbstractC4639e.vip);
        if (bArr[0] != 3 || !str.equals("vorbis")) {
            throw new Exception("Cannot find comment block (no vorbiscomment header)");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[((C10912e) arrayList.get(0)).vip.intValue() - 7];
        randomAccessFile.read(bArr2);
        byteArrayOutputStream.write(bArr2);
        if (arrayList.size() > 1) {
            byteArray = byteArrayOutputStream.toByteArray();
        } else {
            if (!vip2.adcel) {
                byteArray = byteArrayOutputStream.toByteArray();
            }
            while (true) {
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                int i2 = C1724e.ad;
                C1424e vip3 = C1424e.vip(randomAccessFile);
                ArrayList arrayList2 = vip3.startapp;
                byte[] bArr3 = new byte[((C10912e) arrayList2.get(0)).vip.intValue()];
                randomAccessFile.read(bArr3);
                byteArrayOutputStream.write(bArr3);
                if (arrayList2.size() > 1) {
                    byteArray = byteArrayOutputStream.toByteArray();
                    break;
                }
                if (!vip3.adcel) {
                    byteArray = byteArrayOutputStream.toByteArray();
                    break;
                }
            }
        }
        this.ad.getClass();
        C3095e ad = C3534e.ad(true, byteArray);
        EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
        c7936e.getClass();
        return ad;
    }
}
