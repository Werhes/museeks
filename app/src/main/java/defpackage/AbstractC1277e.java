package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۘ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1277e {
    public static final C0193e ad;
    public static final C0193e vip;

    static {
        C0193e c0193e = new C0193e("\"\\".getBytes(AbstractC5508e.ad));
        c0193e.f1410e = "\"\\";
        ad = c0193e;
        C0193e c0193e2 = new C0193e("\t ,=".getBytes(AbstractC5508e.ad));
        c0193e2.f1410e = "\t ,=";
        vip = c0193e2;
    }

    public static final boolean ad(C11058e c11058e) {
        if (AbstractC7890e.billing(c11058e.f21944e.vip, "HEAD")) {
            return false;
        }
        int i = c11058e.f21942e;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || AbstractC16286e.appmetrica(c11058e) != -1) {
            return true;
        }
        String appmetrica = c11058e.f21946e.appmetrica("Transfer-Encoding");
        if (appmetrica == null) {
            appmetrica = null;
        }
        return "chunked".equalsIgnoreCase(appmetrica);
    }

    public static final boolean appmetrica(C16151e c16151e) {
        boolean z = false;
        while (!c16151e.yandex()) {
            byte Signature = c16151e.Signature(0L);
            if (Signature != 44) {
                if (Signature != 32 && Signature != 9) {
                    break;
                }
                c16151e.readByte();
            } else {
                c16151e.readByte();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a0, code lost:
    
        if (defpackage.AbstractC16953e.ad.license(r0) == false) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void license(defpackage.C5107e r34, defpackage.C15718e r35, defpackage.C15793e r36) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1277e.license(eٍؗۘ, eٕۛؕ, eٕۡۡ):void");
    }

    public static final String metrica(C16151e c16151e) {
        long inmobi = c16151e.inmobi(0L, vip);
        if (inmobi == -1) {
            inmobi = c16151e.f31731e;
        }
        if (inmobi != 0) {
            return c16151e.mo1683e(inmobi, AbstractC5508e.ad);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0103, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0103, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r6v8, types: [eِٖۢ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(defpackage.C16151e r17, java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1277e.vip(eِٖۢ, java.util.ArrayList):void");
    }
}
