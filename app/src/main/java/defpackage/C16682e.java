package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۨٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16682e extends AbstractC9555e {
    public static final C16682e license = new AbstractC9555e(1, 0, 2);

    @Override // defpackage.AbstractC9555e
    public final void license(C11226e c11226e, InterfaceC11305e interfaceC11305e, C14479e c14479e, C14995e c14995e, InterfaceC15989e interfaceC15989e) {
        int purchase = c11226e.purchase(0);
        int i = c14479e.tapsense;
        int m3822try = c14479e.m3822try(c14479e.vip, c14479e.subscription(i));
        int billing = c14479e.billing(c14479e.vip, c14479e.subscription(i + 1));
        for (int max = Math.max(m3822try, billing - purchase); max < billing; max++) {
            Object obj = c14479e.metrica[c14479e.yandex(max)];
            if (obj instanceof InterfaceC9374e) {
                c14995e.billing((InterfaceC9374e) obj);
            } else if (obj instanceof C2846e) {
                ((C2846e) obj).license();
            }
        }
        if (purchase <= 0) {
            AbstractC1889e.ad("Check failed");
        }
        int i2 = c14479e.tapsense;
        int m3822try2 = c14479e.m3822try(c14479e.vip, c14479e.subscription(i2));
        int billing2 = c14479e.billing(c14479e.vip, c14479e.subscription(i2 + 1)) - purchase;
        if (billing2 < m3822try2) {
            AbstractC1889e.ad("Check failed");
        }
        c14479e.m3818native(billing2, purchase, i2);
        int i3 = c14479e.startapp;
        if (i3 >= m3822try2) {
            c14479e.startapp = i3 - purchase;
        }
    }
}
