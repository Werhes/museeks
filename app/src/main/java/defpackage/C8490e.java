package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8490e {
    public static final C7936e metrica;
    public C15816e ad;
    public C10433e vip;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        metrica = new C7936e(2);
    }

    public static void ad(ByteBuffer byteBuffer) {
        byteBuffer.putInt(22, 0);
        byte[] array = byteBuffer.array();
        boolean z = AbstractC16852e.vip;
        long[] jArr = AbstractC16852e.ad;
        long j = 0;
        if (!z) {
            for (int i = 0; i < 256; i++) {
                long j2 = i << 24;
                for (int i2 = 0; i2 < 8; i2++) {
                    j2 = (2147483648L & j2) != 0 ? (j2 << 1) ^ 79764919 : j2 << 1;
                }
                jArr[i] = j2;
            }
            AbstractC16852e.vip = true;
        }
        for (byte b : array) {
            j = (j << 8) ^ jArr[(int) ((255 & (j >>> 24)) ^ (b & 255))];
        }
        byte[] bArr = {(byte) (j & 255), (byte) ((j >>> 8) & 255), (byte) ((j >>> 16) & 255), (byte) ((j >>> 24) & 255)};
        for (int i3 = 0; i3 < 4; i3++) {
            byteBuffer.put(i3 + 22, bArr[i3]);
        }
        byteBuffer.rewind();
    }

    public static ByteBuffer license(C15475e c15475e, int i, int i2, C1424e c1424e, ByteBuffer byteBuffer) {
        byte[] byteArray;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = metrica;
        c7936e.getClass();
        int i3 = C1724e.ad;
        int i4 = c15475e.ad;
        List list = (List) c15475e.metrica;
        c7936e.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i4 == 0) {
            byteArray = vip(i, false);
        } else {
            byte[] vip = vip(i, true);
            byte[] vip2 = list.size() > 0 ? vip(i4, true) : vip(i4, false);
            try {
                byteArrayOutputStream.write(vip);
                byteArrayOutputStream.write(vip2);
                if (list.size() > 0) {
                    list.size();
                    c7936e.getClass();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        byteArrayOutputStream.write(vip(((C10912e) it.next()).vip.intValue(), false));
                    }
                }
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new RuntimeException(AbstractC8703e.admob(e, new StringBuilder("Unable to create segment table:")));
            }
        }
        int length = byteArray.length + 27;
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        c7936e.getClass();
        int i5 = C1724e.ad;
        c7936e.getClass();
        ByteBuffer allocate = ByteBuffer.allocate(i2 + length);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put(c1424e.ad, 0, 26);
        allocate.put((byte) byteArray.length);
        for (byte b : byteArray) {
            allocate.put(b);
        }
        allocate.put(byteBuffer);
        return allocate;
    }

    public static boolean metrica(int i, int i2, List list) {
        int i3;
        int i4;
        if (i == 0) {
            i3 = 1;
        } else {
            int i5 = i / 255;
            i3 = i5 + 1;
            if (i % 255 == 0) {
                i3 = i5 + 2;
            }
        }
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = metrica;
        c7936e.getClass();
        int i6 = C1724e.ad;
        if (i2 == 0) {
            i4 = i3 + 1;
        } else {
            i4 = i3 + (i2 / 255) + 1;
            if (i2 % 255 == 0) {
                i4++;
            }
        }
        c7936e.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = ((C10912e) it.next()).vip;
            if (num.intValue() == 0) {
                i4++;
            } else {
                int intValue = (num.intValue() / 255) + 1 + i4;
                if (num.intValue() % 255 == 0) {
                    intValue++;
                }
                i4 = intValue;
            }
        }
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        c7936e.getClass();
        int i7 = C1724e.ad;
        return i4 <= 255;
    }

    public static void purchase(int i, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        long j;
        long filePointer = randomAccessFile.getFilePointer();
        long filePointer2 = randomAccessFile2.getFilePointer();
        ByteBuffer allocate = ByteBuffer.allocate((int) (randomAccessFile.length() - randomAccessFile.getFilePointer()));
        ByteBuffer allocate2 = ByteBuffer.allocate((int) (randomAccessFile.length() - randomAccessFile.getFilePointer()));
        randomAccessFile.getChannel().read(allocate);
        allocate.rewind();
        while (allocate.hasRemaining()) {
            try {
                C1424e metrica2 = C1424e.metrica(allocate);
                byte[] bArr = metrica2.ad;
                ByteBuffer allocate3 = ByteBuffer.allocate(metrica2.ad() + bArr.length);
                allocate3.order(ByteOrder.LITTLE_ENDIAN);
                allocate3.put(bArr);
                ByteBuffer slice = allocate.slice();
                slice.limit(metrica2.ad());
                allocate3.put(slice);
                i++;
                allocate3.putInt(18, i);
                ad(allocate3);
                allocate.position(metrica2.ad() + allocate.position());
                allocate3.rewind();
                allocate2.put(allocate3);
            } catch (C1110e e) {
                allocate.position(allocate.position() - C1424e.smaato.length);
                C7936e c7936e = AbstractC1983e.ad;
                byte[] bArr2 = new byte[3];
                allocate.get(bArr2);
                if (!new String(bArr2, AbstractC4639e.vip).equals("TAG")) {
                    throw e;
                }
                j = allocate.remaining() + 3;
            }
        }
        j = 0;
        allocate2.flip();
        randomAccessFile2.getChannel().write(allocate2);
        if (randomAccessFile.length() - filePointer == (randomAccessFile2.length() + j) - filePointer2) {
            return;
        }
        throw new Exception("File written counts don't match, file not written:origAudioLength:" + (randomAccessFile.length() - filePointer) + ":newAudioLength:" + ((randomAccessFile2.length() + j) - filePointer2) + ":bytesDiscarded:" + j);
    }

    public static byte[] vip(int i, boolean z) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        metrica.getClass();
        int i2 = C1724e.ad;
        int i3 = 0;
        if (i == 0) {
            return new byte[]{0};
        }
        int i4 = (i / 255) + ((i % 255 != 0 || z) ? 1 : 0);
        byte[] bArr = new byte[i4];
        while (true) {
            int i5 = i4 - 1;
            if (i3 >= i5) {
                bArr[i5] = (byte) (i - (i3 * 255));
                return bArr;
            }
            bArr[i3] = -1;
            i3++;
        }
    }

    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, eٕٕؒ] */
    public final void appmetrica(InterfaceC1425e interfaceC1425e, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        boolean z;
        ArrayList arrayList;
        int i;
        long filePointer;
        List subList;
        int i2;
        int i3;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = metrica;
        c7936e.getClass();
        int i4 = C1724e.ad;
        c7936e.getClass();
        C1424e vip = C1424e.vip(randomAccessFile);
        randomAccessFile.seek(vip.mopub);
        FileChannel channel = randomAccessFile2.getChannel();
        FileChannel channel2 = randomAccessFile.getChannel();
        int ad = vip.ad() + 27;
        byte[] bArr = vip.yandex;
        channel.transferFrom(channel2, 0L, ad + bArr.length);
        randomAccessFile2.skipBytes(vip.ad() + 27 + bArr.length);
        c7936e.getClass();
        C1424e vip2 = C1424e.vip(randomAccessFile);
        int i5 = vip2.purchase;
        boolean z2 = vip2.adcel;
        ArrayList arrayList2 = vip2.startapp;
        long filePointer2 = randomAccessFile.getFilePointer();
        c7936e.getClass();
        randomAccessFile.seek(0L);
        this.vip.getClass();
        C10433e.vip.getClass();
        long filePointer3 = randomAccessFile.getFilePointer();
        ArrayList arrayList3 = new ArrayList();
        randomAccessFile.seek(randomAccessFile.getFilePointer() + C1424e.vip(randomAccessFile).ad());
        C1424e vip3 = C1424e.vip(randomAccessFile);
        randomAccessFile.getFilePointer();
        int length = vip3.yandex.length;
        byte[] bArr2 = new byte[7];
        randomAccessFile.read(bArr2);
        String str = new String(bArr2, 1, 6, AbstractC4639e.vip);
        int i6 = 0;
        if (bArr2[0] != 3 || !str.equals("vorbis")) {
            throw new Exception("Cannot find comment block (no vorbiscomment header)");
        }
        randomAccessFile.seek(randomAccessFile.getFilePointer() - 7);
        randomAccessFile.getFilePointer();
        int i7 = 0;
        while (true) {
            z = vip3.adcel;
            arrayList = vip3.startapp;
            i7 += ((C10912e) arrayList.get(i6)).vip.intValue();
            randomAccessFile.skipBytes(((C10912e) arrayList.get(i6)).vip.intValue());
            if (arrayList.size() > 1 || !z) {
                break;
            }
            vip3 = C1424e.vip(randomAccessFile);
            i6 = 0;
        }
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        randomAccessFile.getFilePointer();
        int i8 = C1724e.ad;
        if (arrayList.size() == 1) {
            C1424e vip4 = C1424e.vip(randomAccessFile);
            ArrayList arrayList4 = vip4.startapp;
            C10912e c10912e = (C10912e) arrayList4.get(0);
            byte[] bArr3 = new byte[7];
            randomAccessFile.read(bArr3);
            if (!C10433e.vip(bArr3)) {
                throw new Exception("Cannot find vorbis setup parentHeader");
            }
            i = i7;
            randomAccessFile.seek(randomAccessFile.getFilePointer() - 7);
            randomAccessFile.getFilePointer();
            filePointer = randomAccessFile.getFilePointer() - (vip4.yandex.length + 27);
            Integer num = c10912e.vip;
            i2 = num.intValue();
            randomAccessFile.skipBytes(num.intValue());
            int i9 = 1;
            if (arrayList4.size() <= 1) {
                if (vip4.adcel) {
                    C1424e vip5 = C1424e.vip(randomAccessFile);
                    ArrayList arrayList5 = vip5.startapp;
                    while (true) {
                        i2 += ((C10912e) arrayList5.get(0)).vip.intValue();
                        EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                        ((C10912e) arrayList5.get(0)).vip.intValue();
                        int i10 = C1724e.ad;
                        randomAccessFile.skipBytes(((C10912e) arrayList5.get(0)).vip.intValue());
                        if (arrayList5.size() > 1 || !vip5.adcel) {
                            break;
                        } else {
                            vip5 = C1424e.vip(randomAccessFile);
                        }
                    }
                    randomAccessFile.getFilePointer();
                    if (arrayList5.size() > 1) {
                        subList = arrayList5.subList(1, arrayList5.size());
                    }
                    subList = arrayList3;
                } else {
                    i9 = 1;
                }
            }
            randomAccessFile.getFilePointer();
            if (arrayList4.size() > i9) {
                subList = arrayList4.subList(i9, arrayList4.size());
            }
            subList = arrayList3;
        } else {
            i = i7;
            C10912e c10912e2 = (C10912e) arrayList.get(1);
            byte[] bArr4 = new byte[7];
            randomAccessFile.read(bArr4);
            if (!C10433e.vip(bArr4)) {
                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                new String(bArr4);
                randomAccessFile.getFilePointer();
                throw new Exception("Cannot find vorbis setup parentHeader");
            }
            randomAccessFile.seek(randomAccessFile.getFilePointer() - 7);
            randomAccessFile.getFilePointer();
            filePointer = (randomAccessFile.getFilePointer() - (vip3.yandex.length + 27)) - ((C10912e) arrayList.get(0)).vip.intValue();
            Integer num2 = c10912e2.vip;
            int intValue = num2.intValue();
            randomAccessFile.skipBytes(num2.intValue());
            if (arrayList.size() > 2 || !z) {
                randomAccessFile.getFilePointer();
                if (arrayList.size() > 2) {
                    subList = arrayList.subList(2, arrayList.size());
                    i2 = intValue;
                }
                i2 = intValue;
                subList = arrayList3;
            } else {
                C1424e vip6 = C1424e.vip(randomAccessFile);
                ArrayList arrayList6 = vip6.startapp;
                while (true) {
                    intValue += ((C10912e) arrayList6.get(0)).vip.intValue();
                    EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                    ((C10912e) arrayList6.get(0)).vip.intValue();
                    int i11 = C1724e.ad;
                    randomAccessFile.skipBytes(((C10912e) arrayList6.get(0)).vip.intValue());
                    if (arrayList6.size() > 1 || !vip6.adcel) {
                        break;
                    } else {
                        vip6 = C1424e.vip(randomAccessFile);
                    }
                }
                randomAccessFile.getFilePointer();
                if (arrayList6.size() > 1) {
                    subList = arrayList6.subList(1, arrayList6.size());
                    i2 = intValue;
                }
                i2 = intValue;
                subList = arrayList3;
            }
        }
        randomAccessFile.seek(filePointer3);
        ?? obj = new Object();
        obj.metrica = subList;
        obj.vip = filePointer;
        obj.ad = i2;
        ByteBuffer adcel = ((C18334e) this.ad.f31190e).adcel(interfaceC1425e, 0);
        ByteBuffer allocate = ByteBuffer.allocate(adcel.capacity() + 8);
        allocate.put((byte) 3);
        allocate.put(InterfaceC2368e.ad);
        allocate.put(adcel);
        allocate.put((byte) 1);
        allocate.rewind();
        int capacity = allocate.capacity();
        int ad2 = obj.ad() + i2 + capacity;
        EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
        arrayList2.size();
        c7936e.getClass();
        vip2.ad();
        c7936e.getClass();
        c7936e.getClass();
        c7936e.getClass();
        subList.size();
        c7936e.getClass();
        obj.ad();
        c7936e.getClass();
        c7936e.getClass();
        c7936e.getClass();
        c7936e.getClass();
        int i12 = 65025;
        if (metrica(capacity, i2, subList)) {
            if (vip2.ad() < 65025 && ((arrayList2.size() == 2 && !z2) || arrayList2.size() > 2)) {
                c7936e.getClass();
                c7936e.getClass();
                ByteBuffer license = license(obj, capacity, ad2, vip2, allocate);
                randomAccessFile.seek(filePointer2);
                randomAccessFile.skipBytes(i);
                randomAccessFile.getChannel().read(license);
                ad(license);
                randomAccessFile2.getChannel().write(license);
                randomAccessFile2.getChannel().transferFrom(randomAccessFile.getChannel(), randomAccessFile2.getFilePointer(), randomAccessFile.length() - randomAccessFile.getFilePointer());
                return;
            }
            c7936e.getClass();
            c7936e.getClass();
            ByteBuffer license2 = license(obj, capacity, ad2, vip2, allocate);
            byte[] ad3 = C10433e.ad(filePointer, randomAccessFile);
            int length2 = ad3.length;
            license2.position();
            license2.capacity();
            license2.put(ad3);
            ad(license2);
            randomAccessFile2.getChannel().write(license2);
            purchase(i5, randomAccessFile, randomAccessFile2);
            return;
        }
        c7936e.getClass();
        byte[] bArr5 = vip2.ad;
        int i13 = capacity / 65025;
        c7936e.getClass();
        int i14 = 26;
        if (i13 > 0) {
            int i15 = 0;
            i3 = 0;
            while (i15 < i13) {
                byte[] vip7 = vip(i12, false);
                ByteBuffer allocate2 = ByteBuffer.allocate(vip7.length + 65052);
                allocate2.order(ByteOrder.LITTLE_ENDIAN);
                allocate2.put(bArr5, 0, i14);
                allocate2.put((byte) vip7.length);
                for (byte b : vip7) {
                    allocate2.put(b);
                }
                ByteBuffer slice = allocate.slice();
                slice.limit(65025);
                allocate2.put(slice);
                allocate2.putInt(18, i5);
                i5++;
                if (i15 != 0) {
                    allocate2.put(5, (byte) 1);
                }
                ad(allocate2);
                randomAccessFile2.getChannel().write(allocate2);
                i3 += 65025;
                allocate.position(i3);
                i15++;
                i12 = 65025;
                i14 = 26;
            }
        } else {
            i3 = 0;
        }
        int i16 = capacity % i12;
        EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
        int i17 = C1724e.ad;
        int i18 = obj.ad;
        List list = (List) obj.metrica;
        long j = obj.vip;
        if (metrica(i16, i18, list)) {
            int ad4 = obj.ad();
            allocate.position(i3);
            ByteBuffer license3 = license(obj, i16, ad4 + i18 + i16, vip2, allocate.slice());
            randomAccessFile.seek(j);
            license3.put(C10433e.ad(j, randomAccessFile));
            license3.putInt(18, i5);
            license3.put(5, (byte) 1);
            ad(license3);
            randomAccessFile2.getChannel().write(license3);
        } else {
            byte[] vip8 = vip(i16, true);
            ByteBuffer allocate3 = ByteBuffer.allocate(vip8.length + 27 + i16);
            allocate3.order(ByteOrder.LITTLE_ENDIAN);
            allocate3.put(bArr5, 0, 26);
            allocate3.put((byte) vip8.length);
            for (byte b2 : vip8) {
                allocate3.put(b2);
            }
            allocate.position(i3);
            allocate3.put(allocate.slice());
            allocate3.putInt(18, i5);
            if (i13 > 0) {
                allocate3.put(5, (byte) 1);
            }
            EnumC1005e[] enumC1005eArr8 = EnumC1005e.f3456e;
            int i19 = C1724e.ad;
            i5++;
            ad(allocate3);
            randomAccessFile2.getChannel().write(allocate3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(vip(i18, true));
                if (list.size() > 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        byteArrayOutputStream.write(vip(((C10912e) it.next()).vip.intValue(), false));
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length3 = byteArray.length + 27;
                byte[] ad5 = C10433e.ad(j, randomAccessFile);
                ByteBuffer allocate4 = ByteBuffer.allocate(ad5.length + length3);
                allocate4.order(ByteOrder.LITTLE_ENDIAN);
                allocate4.put(bArr5, 0, 26);
                allocate4.put((byte) byteArray.length);
                for (byte b3 : byteArray) {
                    allocate4.put(b3);
                }
                allocate4.put(ad5);
                allocate4.putInt(18, i5);
                EnumC1005e[] enumC1005eArr9 = EnumC1005e.f3456e;
                int i20 = C1724e.ad;
                ad(allocate4);
                randomAccessFile2.getChannel().write(allocate4);
            } catch (IOException e) {
                throw new RuntimeException(AbstractC8703e.admob(e, new StringBuilder("Unable to create segment table:")));
            }
        }
        purchase(i5, randomAccessFile, randomAccessFile2);
    }
}
