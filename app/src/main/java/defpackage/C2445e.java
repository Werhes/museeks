package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2445e extends AbstractC9555e {
    public static final C2445e license = new AbstractC9555e(0, 1, 1);

    @Override // defpackage.AbstractC9555e
    public final void license(C11226e c11226e, InterfaceC11305e interfaceC11305e, C14479e c14479e, C14995e c14995e, InterfaceC15989e interfaceC15989e) {
        C2846e c2846e = (C2846e) c11226e.billing(0);
        Set set = (Set) c14995e.ad;
        if (set == null) {
            return;
        }
        C16283e c16283e = new C16283e(set);
        C0583e c0583e = (C0583e) c14995e.startapp;
        if (c0583e == null) {
            long[] jArr = AbstractC12981e.ad;
            c0583e = new C0583e();
            c14995e.startapp = c0583e;
        }
        c0583e.amazon(c2846e, c16283e);
        ((C12431e) c14995e.appmetrica).license(new C6673e(c16283e, -1));
    }
}
