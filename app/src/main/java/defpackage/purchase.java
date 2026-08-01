package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public abstract class purchase {
    public static final C0193e ad;
    public static final C0193e appmetrica;
    public static final C0193e license;
    public static final C0193e metrica;
    public static final C0193e vip;

    static {
        C0193e c0193e = new C0193e("/".getBytes(AbstractC5508e.ad));
        c0193e.f1410e = "/";
        ad = c0193e;
        C0193e c0193e2 = new C0193e("\\".getBytes(AbstractC5508e.ad));
        c0193e2.f1410e = "\\";
        vip = c0193e2;
        C0193e c0193e3 = new C0193e("/\\".getBytes(AbstractC5508e.ad));
        c0193e3.f1410e = "/\\";
        metrica = c0193e3;
        C0193e c0193e4 = new C0193e(".".getBytes(AbstractC5508e.ad));
        c0193e4.f1410e = ".";
        license = c0193e4;
        C0193e c0193e5 = new C0193e("..".getBytes(AbstractC5508e.ad));
        c0193e5.f1410e = "..";
        appmetrica = c0193e5;
    }

    public static final int ad(C10675e c10675e) {
        C0193e c0193e = c10675e.f21024e;
        if (c0193e.license() != 0) {
            if (c0193e.startapp(0) != 47) {
                if (c0193e.startapp(0) == 92) {
                    if (c0193e.license() > 2 && c0193e.startapp(1) == 92) {
                        int purchase = c0193e.purchase(2, vip.yandex());
                        return purchase == -1 ? c0193e.license() : purchase;
                    }
                } else if (c0193e.license() > 2 && c0193e.startapp(1) == 58 && c0193e.startapp(2) == 92) {
                    char startapp = (char) c0193e.startapp(0);
                    if ('a' <= startapp && startapp < '{') {
                        return 3;
                    }
                    if ('A' <= startapp && startapp < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final C0193e appmetrica(byte b) {
        if (b == 47) {
            return ad;
        }
        if (b == 92) {
            return vip;
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(b, "not a directory separator: "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0111 A[EDGE_INSN: B:68:0x0111->B:69:0x0111 BREAK  A[LOOP:1: B:20:0x00ac->B:36:0x00ac], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a6  */
    /* JADX WARN: Type inference failed for: r1v0, types: [eِٖۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C10675e license(defpackage.C16151e r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.purchase.license(eِٖۢ, boolean):eَۦۦ");
    }

    public static final C0193e metrica(C10675e c10675e) {
        C0193e c0193e = c10675e.f21024e;
        C0193e c0193e2 = ad;
        if (C0193e.billing(c0193e, c0193e2) != -1) {
            return c0193e2;
        }
        C0193e c0193e3 = c10675e.f21024e;
        C0193e c0193e4 = vip;
        if (C0193e.billing(c0193e3, c0193e4) != -1) {
            return c0193e4;
        }
        return null;
    }

    public static final C0193e purchase(String str) {
        if (AbstractC7890e.billing(str, "/")) {
            return ad;
        }
        if (AbstractC7890e.billing(str, "\\")) {
            return vip;
        }
        throw new IllegalArgumentException(AbstractC17861e.Signature("not a directory separator: ", str));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eِٖۢ, java.lang.Object] */
    public static final C10675e vip(C10675e c10675e, C10675e c10675e2, boolean z) {
        c10675e2.getClass();
        if (ad(c10675e2) != -1 || c10675e2.purchase() != null) {
            return c10675e2;
        }
        C0193e metrica2 = metrica(c10675e);
        if (metrica2 == null && (metrica2 = metrica(c10675e2)) == null) {
            metrica2 = purchase(C10675e.f21023e);
        }
        ?? obj = new Object();
        obj.m4122catch(c10675e.f21024e);
        if (obj.f31731e > 0) {
            obj.m4122catch(metrica2);
        }
        obj.m4122catch(c10675e2.f21024e);
        return license(obj, z);
    }
}
