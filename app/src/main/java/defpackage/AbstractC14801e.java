package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14801e {
    public static final C4789e ad = new C4789e(AbstractC16497e.metrica, C5438e.f11672e);

    public static final C4789e ad(InterfaceC6428e interfaceC6428e, InterfaceC3886e interfaceC3886e, C13770e c13770e, int i) {
        if (AbstractC7890e.billing(interfaceC6428e, AbstractC16497e.metrica) && AbstractC7890e.billing(interfaceC3886e, C5438e.f11672e)) {
            c13770e.m3676strictfp(-1446604504);
            c13770e.Signature(false);
            return ad;
        }
        c13770e.m3676strictfp(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && c13770e.purchase(interfaceC6428e)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c13770e.purchase(interfaceC3886e)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object m3681throw = c13770e.m3681throw();
        if (z3 || m3681throw == C2987e.ad) {
            m3681throw = new C4789e(interfaceC6428e, interfaceC3886e);
            c13770e.m3682throws(m3681throw);
        }
        C4789e c4789e = (C4789e) m3681throw;
        c13770e.Signature(false);
        return c4789e;
    }
}
