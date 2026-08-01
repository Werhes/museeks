package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؑۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12184e {
    public static final C2892e ad = new C2892e(1480876134, false, new C2131e(24));
    public static final C2892e vip = new C2892e(132448518, false, new C2131e(25));
    public static final C2892e metrica = new C2892e(-745452109, false, new C2131e(26));
    public static final C2892e license = new C2892e(-138726756, false, new C2131e(27));
    public static final C2892e appmetrica = new C2892e(-957779654, false, new C13428e(6));
    public static final C2892e purchase = new C2892e(270510870, false, new C13428e(7));
    public static final C2892e billing = new C2892e(535587762, false, new C13428e(8));

    /* JADX WARN: Removed duplicated region for block: B:101:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(final defpackage.C12380e r27, final defpackage.InterfaceC12864e r28, final boolean r29, final defpackage.InterfaceC12006e r30, final defpackage.C1839e r31, final defpackage.C4988e r32, final defpackage.InterfaceC13435e r33, final defpackage.C15274e r34, final defpackage.C18466e r35, final defpackage.InterfaceC16921e r36, final int r37, final char r38, defpackage.C9137e r39, defpackage.C13770e r40, final int r41) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12184e.ad(eٍّٕ, eّۤۧ, boolean, eِْۜ, eٕؓۧ, eؗٚٓ, eْۖۦ, eؘٕؕ, eۣۧ, eَٗٛ, int, char, eٌۧٔ, eٓؕۥ, int):void");
    }

    public static byte license(long j) {
        AbstractC2301e.appmetrica(j, "out of range: %s", (j >> 8) == 0);
        return (byte) j;
    }

    public static final C3155e metrica(C3155e c3155e) {
        if (!(c3155e instanceof C3155e)) {
            c3155e = null;
        }
        if (c3155e != null) {
            return c3155e;
        }
        AbstractC1889e.vip("Inconsistent composition");
        throw new C14803e(9);
    }

    public static final void vip(C2892e c2892e, C13770e c13770e, int i) {
        c13770e.m3671package(1141174275);
        if (c13770e.m3673protected(i & 1, (i & 3) != 2)) {
            C15492e c15492e = AbstractC11473e.subscription;
            boolean purchase2 = c13770e.purchase((InterfaceC4358e) c13770e.adcel(c15492e));
            Object m3681throw = c13770e.m3681throw();
            if (purchase2 || m3681throw == C2987e.ad) {
                m3681throw = new Object();
                c13770e.m3682throws(m3681throw);
            }
            AbstractC1101e.ad(c15492e.ad((C13052e) m3681throw), c2892e, c13770e, 56);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7099e(c2892e, i, 2);
        }
    }
}
