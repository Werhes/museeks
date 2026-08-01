package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8916e {
    public static final Set ad = AbstractC1660e.m664case(new Character[]{'/', '?', '#', '@'});
    public static final C13935e vip;

    static {
        List list = C2667e.vip;
        vip = AbstractC8439e.ad(AbstractC6874e.startapp("HTTP/1.0", "HTTP/1.1"), new C14099e(18), new C8171e(3));
    }

    public static final void ad(C17466e c17466e, char c) {
        throw new C9442e("Character with code " + (c & 255) + " is not allowed in header names, \n" + ((Object) c17466e), 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f3 A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #2 {all -> 0x00f9, blocks: (B:16:0x00ed, B:20:0x00f3), top: B:15:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x002f, B:33:0x007b, B:36:0x0089, B:38:0x0091, B:41:0x00ba, B:43:0x00c7, B:45:0x00cd, B:47:0x00d3, B:51:0x00fc, B:52:0x0104, B:53:0x0105, B:54:0x010d, B:55:0x010e, B:56:0x0131, B:58:0x00a7, B:60:0x00af, B:61:0x00b4, B:63:0x0068), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [eؒۚۡ] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0078 -> B:33:0x007b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object appmetrica(defpackage.InterfaceC13033e r14, defpackage.AbstractC10731e r15) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8916e.appmetrica(eْٕؕ, eُؑ۠):java.lang.Object");
    }

    public static final void billing(C4860e c4860e) {
        if (AbstractC5304e.subs(c4860e, ":")) {
            throw new C9442e("Host header with ':' should contains port: " + ((Object) c4860e), 7);
        }
        for (int i = 0; i < c4860e.length(); i++) {
            Character valueOf = Character.valueOf(c4860e.charAt(i));
            Set set = ad;
            if (set.contains(valueOf)) {
                throw new C9442e("Host cannot contain any of the following symbols: " + set, 7);
            }
        }
    }

    public static final C3434e license(C17466e c17466e, C12434e c12434e) {
        AbstractC8508e.billing(c17466e, c12434e);
        C3434e c3434e = (C3434e) AbstractC13480e.m3603synchronized(C13935e.m3729catch(AbstractC7076e.ad, c17466e, c12434e.f24874e, c12434e.f24873e, new C8436e((byte) 0, 13), 8));
        if (c3434e != null) {
            c12434e.f24874e = c3434e.ad.length() + c12434e.f24874e;
            return c3434e;
        }
        int metrica = AbstractC8508e.metrica(c17466e, c12434e);
        CharSequence subSequence = c17466e.subSequence(c12434e.f24874e, metrica);
        c12434e.f24874e = metrica;
        return new C3434e(subSequence.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
    
        ad(r2, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079 A[Catch: all -> 0x007d, TryCatch #1 {all -> 0x007d, blocks: (B:14:0x006c, B:16:0x0079, B:19:0x0081, B:23:0x008e, B:26:0x009a, B:60:0x00a6, B:31:0x00ab, B:32:0x00d3, B:33:0x0054, B:40:0x00b2, B:53:0x00c6, B:54:0x00c9, B:50:0x00ca, B:58:0x00cd, B:63:0x00df, B:64:0x00e6, B:65:0x00e7, B:67:0x00ef), top: B:13:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081 A[Catch: all -> 0x007d, TryCatch #1 {all -> 0x007d, blocks: (B:14:0x006c, B:16:0x0079, B:19:0x0081, B:23:0x008e, B:26:0x009a, B:60:0x00a6, B:31:0x00ab, B:32:0x00d3, B:33:0x0054, B:40:0x00b2, B:53:0x00c6, B:54:0x00c9, B:50:0x00ca, B:58:0x00cd, B:63:0x00df, B:64:0x00e6, B:65:0x00e7, B:67:0x00ef), top: B:13:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0067 -> B:13:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(defpackage.InterfaceC13033e r17, defpackage.C17466e r18, defpackage.C12434e r19, defpackage.AbstractC10731e r20) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8916e.metrica(eْٕؕ, e٘ؐۧ, eًّّ, eُؑ۠):java.lang.Object");
    }

    public static final String purchase(C17466e c17466e, C12434e c12434e) {
        AbstractC8508e.billing(c17466e, c12434e);
        int i = c12434e.f24874e;
        int i2 = c12434e.f24873e;
        if (i >= i2) {
            throw new IllegalStateException(("Failed to parse version: " + ((Object) c17466e)).toString());
        }
        String str = (String) AbstractC13480e.m3603synchronized(C13935e.m3729catch(vip, c17466e, i, i2, new C8436e((byte) 0, 14), 8));
        if (str != null) {
            c12434e.f24874e = str.length() + c12434e.f24874e;
            return str;
        }
        int metrica = AbstractC8508e.metrica(c17466e, c12434e);
        CharSequence subSequence = c17466e.subSequence(c12434e.f24874e, metrica);
        c12434e.f24874e = metrica;
        throw new C9442e("Unsupported HTTP version: " + ((Object) subSequence), 7);
    }

    public static final int vip(C17466e c17466e, C12434e c12434e) {
        int i = c12434e.f24873e;
        for (int i2 = c12434e.f24874e; i2 < i; i2++) {
            char charAt = c17466e.charAt(i2);
            if (charAt == ':' && i2 != c12434e.f24874e) {
                c12434e.f24874e = i2 + 1;
                return i2;
            }
            if (AbstractC7890e.yandex(charAt, 32) <= 0 || AbstractC5304e.isPro("\"(),/:;<=>?@[\\]{}", charAt)) {
                int i3 = c12434e.f24874e;
                if (charAt == ':') {
                    throw new C9442e("Empty header names are not allowed as per RFC7230.", 7);
                }
                if (i2 == i3) {
                    throw new C9442e("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.", 7);
                }
                ad(c17466e, charAt);
                throw null;
            }
        }
        throw new C9442e("No colon in HTTP header in " + c17466e.subSequence(c12434e.f24874e, c12434e.f24873e).toString() + " in builder: \n" + ((Object) c17466e), 7);
    }
}
