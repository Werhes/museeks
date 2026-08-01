package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2467e {
    public static final byte[] ad = {112, 114, 111, 0};
    public static final byte[] vip = {112, 114, 109, 0};

    public static C13485e[] Signature(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C13485e[0];
        }
        C13485e[] c13485eArr = new C13485e[i];
        for (int i3 = 0; i3 < i; i3++) {
            int billing = (int) AbstractC11538e.billing(byteArrayInputStream, 2);
            int billing2 = (int) AbstractC11538e.billing(byteArrayInputStream, 2);
            c13485eArr[i3] = new C13485e(str, new String(AbstractC11538e.appmetrica(byteArrayInputStream, billing), StandardCharsets.UTF_8), AbstractC11538e.billing(byteArrayInputStream, 4), billing2, (int) AbstractC11538e.billing(byteArrayInputStream, 4), (int) AbstractC11538e.billing(byteArrayInputStream, 4), new int[billing2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C13485e c13485e = c13485eArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = c13485e.purchase;
            int i6 = c13485e.billing;
            TreeMap treeMap = c13485e.startapp;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) AbstractC11538e.billing(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                int billing3 = (int) AbstractC11538e.billing(byteArrayInputStream, 2);
                while (billing3 > 0) {
                    AbstractC11538e.billing(byteArrayInputStream, 2);
                    int billing4 = (int) AbstractC11538e.billing(byteArrayInputStream, 1);
                    if (billing4 != 6 && billing4 != 7) {
                        while (billing4 > 0) {
                            AbstractC11538e.billing(byteArrayInputStream, 1);
                            int i9 = i2;
                            int i10 = i4;
                            for (int billing5 = (int) AbstractC11538e.billing(byteArrayInputStream, 1); billing5 > 0; billing5--) {
                                AbstractC11538e.billing(byteArrayInputStream, 2);
                            }
                            billing4--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    billing3--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c13485e.yandex = mopub(byteArrayInputStream, c13485e.appmetrica);
            BitSet valueOf = BitSet.valueOf(AbstractC11538e.appmetrica(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return c13485eArr;
    }

    public static final void ad(AbstractC11110e abstractC11110e, InterfaceC12864e interfaceC12864e, C2892e c2892e, C13770e c13770e, int i, int i2) {
        C2892e c2892e2;
        InterfaceC12864e interfaceC12864e2;
        int i3;
        InterfaceC12864e interfaceC12864e3;
        c13770e.m3671package(707388573);
        int i4 = i | (c13770e.yandex(abstractC11110e) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if (c13770e.m3673protected(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                i3 = i4;
                interfaceC12864e3 = C0115e.f1276e;
            } else {
                i3 = i4;
                interfaceC12864e3 = interfaceC12864e;
            }
            C16005e metrica = AbstractC12220e.metrica(16, 0.0f, 2);
            C13964e billing = AbstractC16497e.billing(8);
            boolean z = (i3 & 14) == 4 || c13770e.yandex(abstractC11110e);
            Object m3681throw = c13770e.m3681throw();
            if (z || m3681throw == C2987e.ad) {
                c2892e2 = c2892e;
                m3681throw = new C9041e(abstractC11110e, c2892e2, 3);
                c13770e.m3682throws(m3681throw);
            } else {
                c2892e2 = c2892e;
            }
            AbstractC7023e.vip(interfaceC12864e3, null, metrica, billing, null, null, false, null, (Function1) m3681throw, c13770e, ((i3 >> 3) & 14) | 24960, 490);
            interfaceC12864e2 = interfaceC12864e3;
        } else {
            c2892e2 = c2892e;
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4880e(abstractC11110e, interfaceC12864e2, c2892e2, i, i2);
        }
    }

    public static void adcel(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        purchase(jArr, jArr2, jArr4);
        admob(jArr4, jArr3);
    }

    public static void admob(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = (j9 >>> 50) ^ j11;
        jArr2[2] = j12;
        jArr2[3] = 1 & j9;
    }

    public static C13485e[] advert(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C13485e[] c13485eArr) {
        byte[] bArr3 = AbstractC4107e.purchase;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, AbstractC4107e.billing)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int billing = (int) AbstractC11538e.billing(fileInputStream, 2);
            byte[] purchase = AbstractC11538e.purchase(fileInputStream, (int) AbstractC11538e.billing(fileInputStream, 4), (int) AbstractC11538e.billing(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(purchase);
            try {
                C13485e[] amazon = amazon(byteArrayInputStream, bArr2, billing, c13485eArr);
                byteArrayInputStream.close();
                return amazon;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(AbstractC4107e.ad, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int billing2 = (int) AbstractC11538e.billing(fileInputStream, 1);
        byte[] purchase2 = AbstractC11538e.purchase(fileInputStream, (int) AbstractC11538e.billing(fileInputStream, 4), (int) AbstractC11538e.billing(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(purchase2);
        try {
            C13485e[] smaato = smaato(byteArrayInputStream2, billing2, c13485eArr);
            byteArrayInputStream2.close();
            return smaato;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C13485e[] amazon(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C13485e[] c13485eArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C13485e[0];
        }
        if (i != c13485eArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC11538e.billing(byteArrayInputStream, 2);
            String str = new String(AbstractC11538e.appmetrica(byteArrayInputStream, (int) AbstractC11538e.billing(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long billing = AbstractC11538e.billing(byteArrayInputStream, 4);
            int billing2 = (int) AbstractC11538e.billing(byteArrayInputStream, 2);
            C13485e c13485e = null;
            if (c13485eArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= c13485eArr.length) {
                        break;
                    }
                    if (c13485eArr[i3].vip.equals(substring)) {
                        c13485e = c13485eArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (c13485e == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c13485e.license = billing;
            int[] mopub = mopub(byteArrayInputStream, billing2);
            if (Arrays.equals(bArr, AbstractC4107e.appmetrica)) {
                c13485e.appmetrica = billing2;
                c13485e.yandex = mopub;
            }
        }
        return c13485eArr;
    }

    public static void appmetrica(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    public static void billing(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        int i2 = (int) j;
        long j7 = (jArr[(i2 >>> 3) & 7] << 3) ^ jArr[i2 & 7];
        long j8 = 0;
        int i3 = 36;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (((jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3)) ^ (jArr[(i4 >>> 6) & 7] << 6)) ^ (jArr[(i4 >>> 9) & 7] << 9)) ^ (jArr[(i4 >>> 12) & 7] << 12);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (562949953421311L & j7);
        int i5 = i + 1;
        jArr2[i5] = jArr2[i5] ^ ((j7 >>> 49) ^ (j8 << 15));
    }

    public static int inmobi(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static void isVip(ByteArrayOutputStream byteArrayOutputStream, C13485e c13485e) {
        int i = 0;
        for (Map.Entry entry : c13485e.startapp.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC11538e.adcel(intValue - i, byteArrayOutputStream);
                AbstractC11538e.adcel(0, byteArrayOutputStream);
                i = intValue;
            }
        }
    }

    public static String license(String str, String str2, byte[] bArr) {
        byte[] bArr2 = AbstractC4107e.appmetrica;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = AbstractC4107e.license;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return AbstractC1786e.signatures(AbstractC8703e.inmobi(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static C13485e[] loadAd(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, AbstractC4107e.vip)) {
            throw new IllegalStateException("Unsupported version");
        }
        int billing = (int) AbstractC11538e.billing(fileInputStream, 1);
        byte[] purchase = AbstractC11538e.purchase(fileInputStream, (int) AbstractC11538e.billing(fileInputStream, 4), (int) AbstractC11538e.billing(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(purchase);
        try {
            C13485e[] Signature = Signature(byteArrayInputStream, str, billing);
            byteArrayInputStream.close();
            return Signature;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] metrica(C13485e[] c13485eArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (C13485e c13485e : c13485eArr) {
            i2 += ((((c13485e.billing * 2) + 7) & (-8)) / 8) + (c13485e.appmetrica * 2) + license(c13485e.ad, c13485e.vip, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c13485e.purchase;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, AbstractC4107e.metrica)) {
            int length = c13485eArr.length;
            while (i < length) {
                C13485e c13485e2 = c13485eArr[i];
                signatures(byteArrayOutputStream, c13485e2, license(c13485e2.ad, c13485e2.vip, bArr));
                pro(byteArrayOutputStream, c13485e2);
                i++;
            }
        } else {
            for (C13485e c13485e3 : c13485eArr) {
                signatures(byteArrayOutputStream, c13485e3, license(c13485e3.ad, c13485e3.vip, bArr));
            }
            int length2 = c13485eArr.length;
            while (i < length2) {
                pro(byteArrayOutputStream, c13485eArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static int[] mopub(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) AbstractC11538e.billing(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static void pro(ByteArrayOutputStream byteArrayOutputStream, C13485e c13485e) {
        isVip(byteArrayOutputStream, c13485e);
        int i = c13485e.billing;
        int[] iArr = c13485e.yandex;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            AbstractC11538e.adcel(i4 - i3, byteArrayOutputStream);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c13485e.startapp.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i5 = intValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i6 = intValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void purchase(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        appmetrica(jArr, jArr4);
        appmetrica(jArr2, jArr5);
        long[] jArr6 = new long[8];
        billing(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        billing(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        billing(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        billing(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        billing(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        billing(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        billing(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        billing(jArr6, j, j3, jArr7, 0);
        billing(jArr6, j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = jArr3[3] ^ (j5 ^ j6);
        jArr3[3] = j9;
        long j10 = jArr3[4] ^ (j6 ^ j7);
        jArr3[4] = j10;
        long j11 = jArr3[5] ^ j7;
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 49);
        jArr3[1] = (j13 >>> 15) ^ (j8 << 34);
        jArr3[2] = (j8 >>> 30) ^ (j9 << 19);
        jArr3[3] = ((j9 >>> 45) ^ (j10 << 4)) ^ (j11 << 53);
        jArr3[4] = ((j10 >>> 60) ^ (j14 << 38)) ^ (j11 >>> 11);
        jArr3[5] = (j14 >>> 26) ^ (j15 << 23);
        jArr3[6] = j15 >>> 41;
        jArr3[7] = 0;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean remoteconfig(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C13485e[] c13485eArr) {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = AbstractC4107e.ad;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = AbstractC4107e.vip;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] metrica = metrica(c13485eArr, bArr3);
                AbstractC11538e.startapp(byteArrayOutputStream, c13485eArr.length, 1);
                AbstractC11538e.startapp(byteArrayOutputStream, metrica.length, 4);
                byte[] vip2 = AbstractC11538e.vip(metrica);
                AbstractC11538e.startapp(byteArrayOutputStream, vip2.length, 4);
                byteArrayOutputStream.write(vip2);
                return true;
            }
            byte[] bArr4 = AbstractC4107e.license;
            if (Arrays.equals(bArr, bArr4)) {
                AbstractC11538e.startapp(byteArrayOutputStream, c13485eArr.length, 1);
                for (C13485e c13485e : c13485eArr) {
                    int size = c13485e.startapp.size() * 4;
                    String license = license(c13485e.ad, c13485e.vip, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    AbstractC11538e.adcel(license.getBytes(charset).length, byteArrayOutputStream);
                    AbstractC11538e.adcel(c13485e.yandex.length, byteArrayOutputStream);
                    AbstractC11538e.startapp(byteArrayOutputStream, size, 4);
                    AbstractC11538e.startapp(byteArrayOutputStream, c13485e.metrica, 4);
                    byteArrayOutputStream.write(license.getBytes(charset));
                    Iterator it = c13485e.startapp.keySet().iterator();
                    while (it.hasNext()) {
                        AbstractC11538e.adcel(((Integer) it.next()).intValue(), byteArrayOutputStream);
                        AbstractC11538e.adcel(0, byteArrayOutputStream);
                    }
                    for (int i2 : c13485e.yandex) {
                        AbstractC11538e.adcel(i2, byteArrayOutputStream);
                    }
                }
                return true;
            }
            byte[] bArr5 = AbstractC4107e.metrica;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] metrica2 = metrica(c13485eArr, bArr5);
                AbstractC11538e.startapp(byteArrayOutputStream, c13485eArr.length, 1);
                AbstractC11538e.startapp(byteArrayOutputStream, metrica2.length, 4);
                byte[] vip3 = AbstractC11538e.vip(metrica2);
                AbstractC11538e.startapp(byteArrayOutputStream, vip3.length, 4);
                byteArrayOutputStream.write(vip3);
                return true;
            }
            byte[] bArr6 = AbstractC4107e.appmetrica;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            AbstractC11538e.adcel(c13485eArr.length, byteArrayOutputStream);
            for (C13485e c13485e2 : c13485eArr) {
                String str = c13485e2.ad;
                TreeMap treeMap = c13485e2.startapp;
                String license2 = license(str, c13485e2.vip, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                AbstractC11538e.adcel(license2.getBytes(charset2).length, byteArrayOutputStream);
                AbstractC11538e.adcel(treeMap.size(), byteArrayOutputStream);
                AbstractC11538e.adcel(c13485e2.yandex.length, byteArrayOutputStream);
                AbstractC11538e.startapp(byteArrayOutputStream, c13485e2.metrica, 4);
                byteArrayOutputStream.write(license2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    AbstractC11538e.adcel(((Integer) it2.next()).intValue(), byteArrayOutputStream);
                }
                for (int i3 : c13485e2.yandex) {
                    AbstractC11538e.adcel(i3, byteArrayOutputStream);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            AbstractC11538e.adcel(c13485eArr.length, byteArrayOutputStream2);
            int i4 = 2;
            int i5 = 2;
            for (C13485e c13485e3 : c13485eArr) {
                AbstractC11538e.startapp(byteArrayOutputStream2, c13485e3.metrica, 4);
                AbstractC11538e.startapp(byteArrayOutputStream2, c13485e3.license, 4);
                AbstractC11538e.startapp(byteArrayOutputStream2, c13485e3.billing, 4);
                String license3 = license(c13485e3.ad, c13485e3.vip, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = license3.getBytes(charset3).length;
                AbstractC11538e.adcel(length2, byteArrayOutputStream2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(license3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C9343e c9343e = new C9343e(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(c9343e);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < c13485eArr.length) {
                try {
                    C13485e c13485e4 = c13485eArr[i6];
                    AbstractC11538e.adcel(i6, byteArrayOutputStream3);
                    AbstractC11538e.adcel(c13485e4.appmetrica, byteArrayOutputStream3);
                    i7 = i7 + 4 + (c13485e4.appmetrica * i4);
                    int[] iArr = c13485e4.yandex;
                    int length3 = iArr.length;
                    int i8 = i;
                    int i9 = i4;
                    int i10 = i8;
                    while (i10 < length3) {
                        int i11 = iArr[i10];
                        AbstractC11538e.adcel(i11 - i8, byteArrayOutputStream3);
                        i10++;
                        i8 = i11;
                    }
                    i6++;
                    i4 = i9;
                    i = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            C9343e c9343e2 = new C9343e(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(c9343e2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < c13485eArr.length) {
                try {
                    C13485e c13485e5 = c13485eArr[i12];
                    Iterator it3 = c13485e5.startapp.entrySet().iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        i14 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        tapsense(byteArrayOutputStream4, i14, c13485e5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            isVip(byteArrayOutputStream4, c13485e5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            AbstractC11538e.adcel(i12, byteArrayOutputStream3);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i13 + 6;
                            ArrayList arrayList4 = arrayList3;
                            AbstractC11538e.startapp(byteArrayOutputStream3, length4, 4);
                            AbstractC11538e.adcel(i14, byteArrayOutputStream3);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i15 + length4;
                            i12++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            C9343e c9343e3 = new C9343e(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(c9343e3);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + (arrayList2.size() * 16);
            AbstractC11538e.startapp(byteArrayOutputStream, arrayList2.size(), 4);
            int i16 = 0;
            while (i16 < arrayList2.size()) {
                C9343e c9343e4 = (C9343e) arrayList2.get(i16);
                int i17 = c9343e4.ad;
                byte[] bArr7 = c9343e4.vip;
                if (i17 == 1) {
                    j = 0;
                } else if (i17 == 2) {
                    j = 1;
                } else if (i17 == 3) {
                    j = 2;
                } else if (i17 == 4) {
                    j = 3;
                } else {
                    if (i17 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                AbstractC11538e.startapp(byteArrayOutputStream, j, 4);
                AbstractC11538e.startapp(byteArrayOutputStream, size2, 4);
                if (c9343e4.metrica) {
                    long length5 = bArr7.length;
                    byte[] vip4 = AbstractC11538e.vip(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(vip4);
                    AbstractC11538e.startapp(byteArrayOutputStream, vip4.length, 4);
                    AbstractC11538e.startapp(byteArrayOutputStream, length5, 4);
                    length = vip4.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    AbstractC11538e.startapp(byteArrayOutputStream, bArr7.length, 4);
                    AbstractC11538e.startapp(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i16++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void signatures(ByteArrayOutputStream byteArrayOutputStream, C13485e c13485e, String str) {
        Charset charset = StandardCharsets.UTF_8;
        AbstractC11538e.adcel(str.getBytes(charset).length, byteArrayOutputStream);
        AbstractC11538e.adcel(c13485e.appmetrica, byteArrayOutputStream);
        AbstractC11538e.startapp(byteArrayOutputStream, c13485e.purchase, 4);
        AbstractC11538e.startapp(byteArrayOutputStream, c13485e.metrica, 4);
        AbstractC11538e.startapp(byteArrayOutputStream, c13485e.billing, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static C13485e[] smaato(ByteArrayInputStream byteArrayInputStream, int i, C13485e[] c13485eArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C13485e[0];
        }
        if (i != c13485eArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int billing = (int) AbstractC11538e.billing(byteArrayInputStream, 2);
            iArr[i2] = (int) AbstractC11538e.billing(byteArrayInputStream, 2);
            strArr[i2] = new String(AbstractC11538e.appmetrica(byteArrayInputStream, billing), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C13485e c13485e = c13485eArr[i3];
            if (!c13485e.vip.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c13485e.appmetrica = i4;
            c13485e.yandex = mopub(byteArrayInputStream, i4);
        }
        return c13485eArr;
    }

    public static final boolean startapp(C13915e c13915e) {
        if (c13915e.f27587e == null) {
            return false;
        }
        C13915e tapsense = c13915e.tapsense();
        return (tapsense != null ? tapsense.f27587e : null) == null || c13915e.f27612e.vip;
    }

    public static void subscription(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        yandex(jArr, jArr3);
        while (true) {
            admob(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                yandex(jArr2, jArr3);
            }
        }
    }

    public static void tapsense(ByteArrayOutputStream byteArrayOutputStream, int i, C13485e c13485e) {
        int i2 = c13485e.billing;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c13485e.startapp.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (i3 * i2) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void vip(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void yandex(long[] jArr, long[] jArr2) {
        AbstractC15792e.license(3, jArr, jArr2);
        jArr2[6] = jArr[3] & 1;
    }
}
