package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۦٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11392e implements InterfaceC8371e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C8873e vip;

    public /* synthetic */ C11392e(C8873e c8873e, int i) {
        this.ad = i;
        this.vip = c8873e;
    }

    @Override // defpackage.InterfaceC8371e
    public final String ad(Object obj) {
        switch (this.ad) {
            case 0:
                String str = ((C14796e) obj).purchase;
                this.vip.getClass();
                return AbstractC6261e.purchase(str, "EXT-X-STREAM-INF", false);
            case 1:
                String str2 = ((C14796e) obj).yandex;
                this.vip.getClass();
                return AbstractC6261e.purchase(str2, "EXT-X-STREAM-INF", false);
            default:
                String str3 = ((C14796e) obj).startapp;
                this.vip.getClass();
                return AbstractC6261e.purchase(str3, "EXT-X-STREAM-INF", false);
        }
    }

    @Override // defpackage.InterfaceC8371e
    public final boolean vip(Object obj) {
        switch (this.ad) {
            case 0:
                return ((C14796e) obj).purchase != null;
            case 1:
                return ((C14796e) obj).yandex != null;
            default:
                return ((C14796e) obj).startapp != null;
        }
    }
}
