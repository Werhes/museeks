package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7931e extends AbstractC9743e {
    public static final C0189e license = new C0189e(13);
    public final InterfaceC6044e metrica;

    public C7931e(InterfaceC6044e interfaceC6044e) {
        this.metrica = interfaceC6044e;
    }

    public static C14473e Signature(C1292e c1292e, int i, int i2, boolean z, int i3, InterfaceC6044e interfaceC6044e) {
        int i4 = c1292e.vip;
        int m2357interface = m2357interface(i4, c1292e.ad);
        String str = new String(c1292e.ad, i4, m2357interface - i4, StandardCharsets.ISO_8859_1);
        c1292e.m571try(m2357interface + 1);
        int smaato = c1292e.smaato();
        int smaato2 = c1292e.smaato();
        long subs = c1292e.subs();
        if (subs == 4294967295L) {
            subs = -1;
        }
        long subs2 = c1292e.subs();
        long j = subs2 == 4294967295L ? -1L : subs2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (c1292e.vip < i5) {
            AbstractC14681e remoteconfig = remoteconfig(i2, c1292e, z, i3, interfaceC6044e);
            if (remoteconfig != null) {
                arrayList.add(remoteconfig);
            }
        }
        return new C14473e(str, smaato, smaato2, subs, j, (AbstractC14681e[]) arrayList.toArray(new AbstractC14681e[0]));
    }

    public static C9286e admob(C1292e c1292e, int i, int i2, boolean z, int i3, InterfaceC6044e interfaceC6044e) {
        int i4 = c1292e.vip;
        int m2357interface = m2357interface(i4, c1292e.ad);
        String str = new String(c1292e.ad, i4, m2357interface - i4, StandardCharsets.ISO_8859_1);
        c1292e.m571try(m2357interface + 1);
        int ads = c1292e.ads();
        boolean z2 = (ads & 2) != 0;
        boolean z3 = (ads & 1) != 0;
        int ads2 = c1292e.ads();
        String[] strArr = new String[ads2];
        for (int i5 = 0; i5 < ads2; i5++) {
            int i6 = c1292e.vip;
            int m2357interface2 = m2357interface(i6, c1292e.ad);
            strArr[i5] = new String(c1292e.ad, i6, m2357interface2 - i6, StandardCharsets.ISO_8859_1);
            c1292e.m571try(m2357interface2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (c1292e.vip < i7) {
            AbstractC14681e remoteconfig = remoteconfig(i2, c1292e, z, i3, interfaceC6044e);
            if (remoteconfig != null) {
                arrayList.add(remoteconfig);
            }
        }
        return new C9286e(str, z2, z3, strArr, (AbstractC14681e[]) arrayList.toArray(new AbstractC14681e[0]));
    }

    public static C12961e ads(int i, C1292e c1292e, String str) {
        byte[] bArr = new byte[i];
        c1292e.mopub(0, i, bArr);
        return new C12961e(str, null, new String(bArr, 0, m2357interface(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static C14500e applovin(int i, C1292e c1292e) {
        if (i < 1) {
            return null;
        }
        int ads = c1292e.ads();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c1292e.mopub(0, i2, bArr);
        int m2355class = m2355class(0, ads, bArr);
        return new C14500e("TXXX", new String(bArr, 0, m2355class, crashlytics(ads)), isPro(ads, subs(ads) + m2355class, bArr));
    }

    /* renamed from: class, reason: not valid java name */
    public static int m2355class(int i, int i2, byte[] bArr) {
        int m2357interface = m2357interface(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return m2357interface;
        }
        while (m2357interface < bArr.length - 1) {
            if ((m2357interface - i) % 2 == 0 && bArr[m2357interface + 1] == 0) {
                return m2357interface;
            }
            m2357interface = m2357interface(m2357interface + 1, bArr);
        }
        return bArr.length;
    }

    public static Charset crashlytics(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String firebase(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* renamed from: goto, reason: not valid java name */
    public static int m2356goto(int i, C1292e c1292e) {
        byte[] bArr = c1292e.ad;
        int i2 = c1292e.vip;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    public static C14500e inmobi(int i, C1292e c1292e, String str) {
        if (i < 1) {
            return null;
        }
        int ads = c1292e.ads();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c1292e.mopub(0, i2, bArr);
        return new C14500e(str, null, isPro(ads, 0, bArr));
    }

    /* renamed from: interface, reason: not valid java name */
    public static int m2357interface(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static C1410e isPro(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return AbstractC17475e.ads(BuildConfig.FLAVOR);
        }
        C13304e Signature = AbstractC17475e.Signature();
        int m2355class = m2355class(i2, i, bArr);
        while (i2 < m2355class) {
            Signature.metrica(new String(bArr, i2, m2355class - i2, crashlytics(i)));
            i2 = subs(i) + m2355class;
            m2355class = m2355class(i2, i, bArr);
        }
        C1410e billing = Signature.billing();
        return billing.isEmpty() ? AbstractC17475e.ads(BuildConfig.FLAVOR) : billing;
    }

    public static String isVip(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? BuildConfig.FLAVOR : new String(bArr, i, i2 - i, charset);
    }

    public static C15005e loadAd(C1292e c1292e, int i, int i2) {
        int m2357interface;
        String concat;
        int ads = c1292e.ads();
        Charset crashlytics = crashlytics(ads);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c1292e.mopub(0, i3, bArr);
        if (i2 == 2) {
            concat = "image/" + AbstractC3628e.tapsense(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            m2357interface = 2;
        } else {
            m2357interface = m2357interface(0, bArr);
            String tapsense = AbstractC3628e.tapsense(new String(bArr, 0, m2357interface, StandardCharsets.ISO_8859_1));
            concat = tapsense.indexOf(47) == -1 ? "image/".concat(tapsense) : tapsense;
        }
        int i4 = bArr[m2357interface + 1] & 255;
        int i5 = m2357interface + 2;
        int m2355class = m2355class(i5, ads, bArr);
        String str = new String(bArr, i5, m2355class - i5, crashlytics);
        int subs = subs(ads) + m2355class;
        return new C15005e(concat, str, i4, i3 <= subs ? AbstractC9413e.vip : Arrays.copyOfRange(bArr, subs, i3));
    }

    public static C12961e premium(int i, C1292e c1292e) {
        if (i < 1) {
            return null;
        }
        int ads = c1292e.ads();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c1292e.mopub(0, i2, bArr);
        int m2355class = m2355class(0, ads, bArr);
        String str = new String(bArr, 0, m2355class, crashlytics(ads));
        int subs = subs(ads) + m2355class;
        return new C12961e("WXXX", str, isVip(bArr, subs, m2357interface(subs, bArr), StandardCharsets.ISO_8859_1));
    }

    public static C1044e pro(int i, C1292e c1292e) {
        int ads = c1292e.ads();
        Charset crashlytics = crashlytics(ads);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c1292e.mopub(0, i2, bArr);
        int m2357interface = m2357interface(0, bArr);
        String amazon = AbstractC8542e.amazon(new String(bArr, 0, m2357interface, StandardCharsets.ISO_8859_1));
        int i3 = m2357interface + 1;
        int m2355class = m2355class(i3, ads, bArr);
        String isVip = isVip(bArr, i3, m2355class, crashlytics);
        int subs = subs(ads) + m2355class;
        int m2355class2 = m2355class(subs, ads, bArr);
        String isVip2 = isVip(bArr, subs, m2355class2, crashlytics);
        int subs2 = subs(ads) + m2355class2;
        return new C1044e(amazon, isVip, isVip2, i2 <= subs2 ? AbstractC9413e.vip : Arrays.copyOfRange(bArr, subs2, i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01b2, code lost:
    
        if (r5 == 67) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [eّٔ۠] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [eؒۙۚ] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.AbstractC14681e remoteconfig(int r19, defpackage.C1292e r20, boolean r21, int r22, defpackage.InterfaceC6044e r23) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7931e.remoteconfig(int, eؒۙۚ, boolean, int, eؘۥۢ):eّٔ۠");
    }

    public static C3541e signatures(int i, C1292e c1292e) {
        int m565goto = c1292e.m565goto();
        int crashlytics = c1292e.crashlytics();
        int crashlytics2 = c1292e.crashlytics();
        int ads = c1292e.ads();
        int ads2 = c1292e.ads();
        C2125e c2125e = new C2125e();
        c2125e.advert(c1292e);
        int i2 = ((i - 10) * 8) / (ads + ads2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int billing = c2125e.billing(ads);
            int billing2 = c2125e.billing(ads2);
            iArr[i3] = billing;
            iArr2[i3] = billing2;
        }
        return new C3541e(m565goto, crashlytics, iArr, iArr2, crashlytics2);
    }

    public static int subs(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static C10514e subscription(int i, C1292e c1292e) {
        if (i < 4) {
            return null;
        }
        int ads = c1292e.ads();
        Charset crashlytics = crashlytics(ads);
        byte[] bArr = new byte[3];
        c1292e.mopub(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c1292e.mopub(0, i2, bArr2);
        int m2355class = m2355class(0, ads, bArr2);
        String str2 = new String(bArr2, 0, m2355class, crashlytics);
        int subs = subs(ads) + m2355class;
        return new C10514e(str, str2, isVip(bArr2, subs, m2355class(subs, ads, bArr2), crashlytics));
    }

    public static C10852e tapsense(int i, C1292e c1292e) {
        byte[] bArr = new byte[i];
        c1292e.mopub(0, i, bArr);
        int m2357interface = m2357interface(0, bArr);
        String str = new String(bArr, 0, m2357interface, StandardCharsets.ISO_8859_1);
        int i2 = m2357interface + 1;
        return new C10852e(str, i <= i2 ? AbstractC9413e.vip : Arrays.copyOfRange(bArr, i2, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /* renamed from: this, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2358this(defpackage.C1292e r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.vip
        L6:
            int r3 = r1.ad()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.smaato()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.subs()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.m565goto()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.crashlytics()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.crashlytics()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.m571try(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.m571try(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.m571try(r2)
            return r6
        L99:
            int r3 = r1.ad()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.m571try(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.m568protected(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.m571try(r2)
            return r4
        Lb0:
            r1.m571try(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7931e.m2358this(eؒۙۚ, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C17750e amazon(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7931e.amazon(int, byte[]):eۣ٘ٓ");
    }

    @Override // defpackage.AbstractC9743e
    public final C17750e billing(C16890e c16890e, ByteBuffer byteBuffer) {
        return amazon(byteBuffer.limit(), byteBuffer.array());
    }
}
