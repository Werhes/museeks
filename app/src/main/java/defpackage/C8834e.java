package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٝٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8834e implements InterfaceC8371e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C15483e vip;

    public /* synthetic */ C8834e(C15483e c15483e, int i) {
        this.ad = i;
        this.vip = c15483e;
    }

    @Override // defpackage.InterfaceC8371e
    public final String ad(Object obj) {
        switch (this.ad) {
            case 0:
                String str = ((C5129e) obj).adcel;
                this.vip.getClass();
                return AbstractC6261e.purchase(str, "EXT-X-MEDIA", false);
            case 1:
                String metrica = AbstractC6261e.metrica(AbstractC16316e.ad, ((C5129e) obj).mopub);
                this.vip.getClass();
                return AbstractC6261e.purchase(metrica, "EXT-X-MEDIA", false);
            case 2:
                String str2 = ((C5129e) obj).vip;
                this.vip.getClass();
                return AbstractC6261e.purchase(str2, "EXT-X-MEDIA", false);
            case 3:
                String str3 = ((C5129e) obj).metrica;
                this.vip.getClass();
                return AbstractC6261e.purchase(str3, "EXT-X-MEDIA", false);
            case 4:
                String str4 = ((C5129e) obj).license;
                this.vip.getClass();
                return AbstractC6261e.purchase(str4, "EXT-X-MEDIA", false);
            case 5:
                String str5 = ((C5129e) obj).appmetrica;
                this.vip.getClass();
                return AbstractC6261e.purchase(str5, "EXT-X-MEDIA", false);
            default:
                String str6 = ((C5129e) obj).purchase;
                this.vip.getClass();
                return AbstractC6261e.purchase(str6, "EXT-X-MEDIA", false);
        }
    }

    @Override // defpackage.InterfaceC8371e
    public final boolean vip(Object obj) {
        switch (this.ad) {
            case 0:
                return ((C5129e) obj).adcel != null;
            case 1:
                return !((C5129e) obj).mopub.isEmpty();
            case 2:
                String str = ((C5129e) obj).vip;
                return (str == null || str.isEmpty()) ? false : true;
            case 3:
                return true;
            case 4:
                return ((C5129e) obj).license != null;
            case 5:
                return ((C5129e) obj).appmetrica != null;
            default:
                return true;
        }
    }
}
