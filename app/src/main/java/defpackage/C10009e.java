package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10009e extends AbstractC9555e {
    public static final C10009e license = new AbstractC9555e(0, 2, 1);

    @Override // defpackage.AbstractC9555e
    public final void license(C11226e c11226e, InterfaceC11305e interfaceC11305e, C14479e c14479e, C14995e c14995e, InterfaceC15989e interfaceC15989e) {
        C3155e c3155e = (C3155e) c11226e.billing(0);
        Object billing = c11226e.billing(1);
        if (billing instanceof InterfaceC9374e) {
            c14995e.advert((InterfaceC9374e) billing);
        }
        if (c14479e.amazon != 0) {
            AbstractC1889e.ad("Can only append a slot if not current inserting");
        }
        int i = c14479e.startapp;
        int i2 = c14479e.adcel;
        int metrica = c14479e.metrica(c3155e);
        int billing2 = c14479e.billing(c14479e.vip, c14479e.subscription(metrica + 1));
        c14479e.startapp = billing2;
        c14479e.adcel = billing2;
        c14479e.inmobi(1, metrica);
        if (i >= billing2) {
            i++;
            i2++;
        }
        c14479e.metrica[billing2] = billing;
        c14479e.startapp = i;
        c14479e.adcel = i2;
    }
}
