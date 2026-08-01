package defpackage;

import java.util.regex.Matcher;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10036e implements InterfaceC8152e {
    public static final C10036e ad = new Object();
    public static final C10445e vip = new C10445e("[\\[<](\\d+):(\\d+)\\.(\\d+)[]>]");
    public static final C11817e metrica = AbstractC7763e.ad(new C3685e(5));

    public static C6571e vip(String str) {
        Matcher matcher = vip.f20638e.matcher(str);
        C14031e c14031e = !matcher.find(0) ? null : new C14031e(matcher, str);
        if (c14031e == null) {
            return null;
        }
        String str2 = (String) ((C15942e) c14031e.ad()).get(1);
        String str3 = (String) ((C15942e) c14031e.ad()).get(2);
        String str4 = (String) ((C15942e) c14031e.ad()).get(3);
        C17647e c17647e = C14157e.f27993e;
        Integer signatures = AbstractC6507e.signatures(str2);
        long Signature = AbstractC0326e.Signature(signatures != null ? signatures.intValue() : 0, EnumC15934e.MINUTES);
        Integer signatures2 = AbstractC6507e.signatures(str3);
        long billing = C14157e.billing(Signature, AbstractC0326e.Signature(signatures2 != null ? signatures2.intValue() : 0, EnumC15934e.SECONDS));
        Integer signatures3 = AbstractC6507e.signatures(str4);
        long billing2 = C14157e.billing(billing, AbstractC0326e.Signature(signatures3 != null ? signatures3.intValue() : 0, EnumC15934e.MILLISECONDS));
        int m1865interface = AbstractC5304e.m1865interface(str, str.charAt(0) == '[' ? ']' : '>', 0, 6);
        if (m1865interface != -1) {
            str = str.substring(m1865interface + 1, str.length());
        }
        return new C6571e(Long.valueOf(C14157e.license(billing2)), AbstractC5304e.m1855const(str).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ad, code lost:
    
        if (r3 == r7) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.InterfaceC8152e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.C9398e r19, defpackage.AbstractC16049e r20, defpackage.InterfaceC5083e r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10036e.ad(eٍُۘ, eؙٖۛ, eًؗۖ):java.lang.Object");
    }
}
