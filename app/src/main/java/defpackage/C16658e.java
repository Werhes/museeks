package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۧؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16658e {
    public final /* synthetic */ int ad;

    public /* synthetic */ C16658e(int i) {
        this.ad = i;
    }

    public final C9106e ad(InterfaceC17718e interfaceC17718e) {
        C14980e vip;
        C14980e c14980e;
        switch (this.ad) {
            case 0:
                return new C9106e(interfaceC17718e.adcel().ad(interfaceC17718e.adcel().metrica), interfaceC17718e.billing().ad(interfaceC17718e.billing().license), interfaceC17718e.yandex() == 1);
            case 1:
                return AbstractC8495e.billing(new C9106e(interfaceC17718e.adcel().ad(interfaceC17718e.adcel().metrica), interfaceC17718e.billing().ad(interfaceC17718e.billing().license), interfaceC17718e.yandex() == 1), interfaceC17718e);
            case 2:
                return AbstractC8495e.ad(interfaceC17718e, C12575e.f25223e);
            case 3:
                return AbstractC8495e.ad(interfaceC17718e, C15802e.f31128e);
            default:
                C9106e metrica = interfaceC17718e.metrica();
                if (metrica == null) {
                    return AbstractC8495e.ad(interfaceC17718e, C12575e.f25223e);
                }
                C14980e c14980e2 = metrica.vip;
                C14980e c14980e3 = metrica.ad;
                if (interfaceC17718e.ad()) {
                    c14980e = AbstractC8495e.vip(interfaceC17718e, interfaceC17718e.adcel(), c14980e3);
                    vip = c14980e2;
                    c14980e2 = c14980e3;
                    c14980e3 = c14980e;
                } else {
                    vip = AbstractC8495e.vip(interfaceC17718e, interfaceC17718e.billing(), c14980e2);
                    c14980e = vip;
                }
                if (AbstractC7890e.billing(c14980e, c14980e2)) {
                    return metrica;
                }
                boolean z = true;
                if (interfaceC17718e.yandex() != 1 && (interfaceC17718e.yandex() != 3 || c14980e3.vip <= vip.vip)) {
                    z = false;
                }
                return AbstractC8495e.billing(new C9106e(c14980e3, vip, z), interfaceC17718e);
        }
    }
}
