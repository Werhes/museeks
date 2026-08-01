package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6451e {
    public static final C8587e ad = new C8587e(AbstractC16497e.ad, C5438e.f11685e);

    public static final C8587e ad(InterfaceC10260e interfaceC10260e, C14544e c14544e, C13770e c13770e, int i) {
        if (AbstractC7890e.billing(interfaceC10260e, AbstractC16497e.ad) && AbstractC7890e.billing(c14544e, C5438e.f11685e)) {
            c13770e.m3676strictfp(-1073830487);
            c13770e.Signature(false);
            return ad;
        }
        c13770e.m3676strictfp(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && c13770e.purchase(interfaceC10260e)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c13770e.purchase(c14544e)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object m3681throw = c13770e.m3681throw();
        if (z3 || m3681throw == C2987e.ad) {
            m3681throw = new C8587e(interfaceC10260e, c14544e);
            c13770e.m3682throws(m3681throw);
        }
        C8587e c8587e = (C8587e) m3681throw;
        c13770e.Signature(false);
        return c8587e;
    }
}
