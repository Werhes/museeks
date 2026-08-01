package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5706e {
    public static final C2892e ad = new C2892e(932383035, false, new C11789e(8));
    public static final C2892e vip = new C2892e(572279132, false, new C11789e(9));

    public static final void ad(Long l, long j, C3434e c3434e) {
        if (l == null || l.longValue() < 0 || c3434e.equals(C3434e.billing) || l.longValue() == j) {
            return;
        }
        throw new IllegalStateException(("Content-Length mismatch: expected " + l.longValue() + " bytes, but received " + j + " bytes").toString());
    }

    public static final InterfaceC5372e appmetrica(AbstractC10674e abstractC10674e, InterfaceC2043e interfaceC2043e, String str) {
        InterfaceC5372e purchase = abstractC10674e.purchase(interfaceC2043e, str);
        if (purchase != null) {
            return purchase;
        }
        AbstractC0853e.mopub(abstractC10674e.yandex(), str);
        throw null;
    }

    public static String license(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static byte[] metrica(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int digit = Character.digit(str.charAt(i2), 16);
            int digit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static final InterfaceC5372e purchase(AbstractC10674e abstractC10674e, InterfaceC5757e interfaceC5757e, Object obj) {
        InterfaceC5372e billing = abstractC10674e.billing(interfaceC5757e, obj);
        if (billing != null) {
            return billing;
        }
        InterfaceC7227e vip2 = AbstractC3820e.ad.vip(obj.getClass());
        InterfaceC7227e yandex = abstractC10674e.yandex();
        String mopub = vip2.mopub();
        if (mopub == null) {
            mopub = String.valueOf(vip2);
        }
        AbstractC0853e.mopub(yandex, mopub);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0019, code lost:
    
        if (r1 <= r2) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C4718e vip(defpackage.C12816e r5, defpackage.C6272e r6, defpackage.InterfaceC5334e r7, java.io.InputStream r8) {
        /*
            eؙۣٝ r6 = defpackage.C6535e.purchase     // Catch: java.lang.Throwable -> L41
            eؙۣٝ r6 = defpackage.AbstractC7711e.metrica(r8)     // Catch: java.lang.Throwable -> L41
            eؙۣٝ r0 = defpackage.C6535e.purchase     // Catch: java.lang.Throwable -> L41
            int r1 = r6.metrica     // Catch: java.lang.Throwable -> L41
            int r2 = r0.metrica     // Catch: java.lang.Throwable -> L41
            int r3 = r0.vip     // Catch: java.lang.Throwable -> L41
            int r4 = r6.vip     // Catch: java.lang.Throwable -> L41
            if (r4 != 0) goto L17
            if (r3 != 0) goto L43
            if (r1 != r2) goto L43
            goto L1b
        L17:
            if (r4 != r3) goto L43
            if (r1 > r2) goto L43
        L1b:
            eۧ۠ r1 = new eۧ۠     // Catch: java.lang.Throwable -> L41
            r1.<init>()     // Catch: java.lang.Throwable -> L41
            defpackage.AbstractC13818e.ad(r1)     // Catch: java.lang.Throwable -> L41
            eٌُْ r2 = defpackage.C15503e.f30626e     // Catch: java.lang.Throwable -> L41
            r2.getClass()     // Catch: java.lang.Throwable -> L41
            eؖۖؓ r3 = new eؖۖؓ     // Catch: java.lang.Throwable -> L41
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r1 = r2.ad(r3, r1)     // Catch: java.lang.Throwable -> L41
            eؙِۛ r1 = (defpackage.AbstractC6649e) r1     // Catch: java.lang.Throwable -> L41
            r2 = 0
            r3.ad(r2)     // Catch: defpackage.C14226e -> L3d java.lang.Throwable -> L41
            defpackage.C13141e.vip(r1)     // Catch: java.lang.Throwable -> L41
            eٕٖٜ r1 = (defpackage.C15503e) r1     // Catch: java.lang.Throwable -> L41
            goto L44
        L3d:
            r5 = move-exception
            r5.f28108e = r1     // Catch: java.lang.Throwable -> L41
            throw r5     // Catch: java.lang.Throwable -> L41
        L41:
            r5 = move-exception
            goto L70
        L43:
            r1 = 0
        L44:
            r8.close()
            if (r1 == 0) goto L4f
            eؚؚؗ r8 = new eؚؚؗ
            r8.<init>(r5, r7, r1, r6)
            return r8
        L4f:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Kotlin built-in definition format version is not supported: expected "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r8 = ", actual "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = ". Please update Kotlin"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L70:
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r6 = move-exception
            defpackage.AbstractC16704e.vip(r8, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5706e.vip(eّۡۜ, eًؙۡ, eؘؙؐ, java.io.InputStream):eؚؚؗ");
    }
}
