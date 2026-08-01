package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۘۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15679e implements InterfaceC8371e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C1595e vip;

    public /* synthetic */ C15679e(C1595e c1595e, int i) {
        this.ad = i;
        this.vip = c1595e;
    }

    @Override // defpackage.InterfaceC8371e
    public final String ad(Object obj) {
        switch (this.ad) {
            case 0:
                String str = ((C4903e) obj).vip;
                this.vip.getClass();
                return AbstractC6261e.purchase(str, "EXT-X-KEY", false);
            case 1:
                String str2 = ((C4903e) obj).license;
                this.vip.getClass();
                return AbstractC6261e.purchase(str2, "EXT-X-KEY", true);
            default:
                String metrica = AbstractC6261e.metrica("/", ((C4903e) obj).appmetrica);
                this.vip.getClass();
                return AbstractC6261e.purchase(metrica, "EXT-X-KEY", true);
        }
    }

    @Override // defpackage.InterfaceC8371e
    public final /* bridge */ /* synthetic */ boolean vip(Object obj) {
        switch (this.ad) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return true;
        }
    }
}
