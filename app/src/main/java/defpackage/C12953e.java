package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؑؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12953e implements InterfaceC8371e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C8873e vip;

    public /* synthetic */ C12953e(C8873e c8873e, int i) {
        this.ad = i;
        this.vip = c8873e;
    }

    @Override // defpackage.InterfaceC8371e
    public final String ad(Object obj) {
        switch (this.ad) {
            case 0:
                return AbstractC6261e.purchase(AbstractC6261e.metrica(AbstractC16316e.ad, ((InterfaceC13460e) obj).metrica()), this.vip.vip(), false);
            default:
                return AbstractC6261e.purchase(((InterfaceC13460e) obj).mopub(), this.vip.vip(), false);
        }
    }

    @Override // defpackage.InterfaceC8371e
    public final boolean vip(Object obj) {
        switch (this.ad) {
            case 0:
                return ((InterfaceC13460e) obj).yandex();
            default:
                return ((InterfaceC13460e) obj).billing();
        }
    }
}
