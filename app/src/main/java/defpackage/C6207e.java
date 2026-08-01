package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؙؗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6207e {
    public static final C2858e Companion = new Object();
    public static final InterfaceC3477e[] yandex = {AbstractC18039e.appmetrica(2, new C1349e(5)), AbstractC18039e.appmetrica(2, new C1349e(6)), AbstractC18039e.appmetrica(2, new C1349e(7)), AbstractC18039e.appmetrica(2, new C1349e(8)), AbstractC18039e.appmetrica(2, new C1349e(9)), AbstractC18039e.appmetrica(2, new C1349e(10)), AbstractC18039e.appmetrica(2, new C1349e(11))};
    public final C8641e ad;
    public final C8641e appmetrica;
    public final C8641e billing;
    public final C8641e license;
    public final C8641e metrica;
    public final C8641e purchase;
    public final C8641e vip;

    public /* synthetic */ C6207e(int i, C8641e c8641e, C8641e c8641e2, C8641e c8641e3, C8641e c8641e4, C8641e c8641e5, C8641e c8641e6, C8641e c8641e7) {
        this.ad = (i & 1) == 0 ? new C8641e() : c8641e;
        if ((i & 2) == 0) {
            this.vip = new C8641e();
        } else {
            this.vip = c8641e2;
        }
        if ((i & 4) == 0) {
            this.metrica = new C8641e();
        } else {
            this.metrica = c8641e3;
        }
        if ((i & 8) == 0) {
            this.license = new C8641e();
        } else {
            this.license = c8641e4;
        }
        if ((i & 16) == 0) {
            this.appmetrica = new C8641e();
        } else {
            this.appmetrica = c8641e5;
        }
        if ((i & 32) == 0) {
            this.purchase = new C8641e();
        } else {
            this.purchase = c8641e6;
        }
        if ((i & 64) == 0) {
            this.billing = new C8641e();
        } else {
            this.billing = c8641e7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6207e)) {
            return false;
        }
        C6207e c6207e = (C6207e) obj;
        return AbstractC7890e.billing(this.ad, c6207e.ad) && AbstractC7890e.billing(this.vip, c6207e.vip) && AbstractC7890e.billing(this.metrica, c6207e.metrica) && AbstractC7890e.billing(this.license, c6207e.license) && AbstractC7890e.billing(this.appmetrica, c6207e.appmetrica) && AbstractC7890e.billing(this.purchase, c6207e.purchase) && AbstractC7890e.billing(this.billing, c6207e.billing);
    }

    public final int hashCode() {
        return this.billing.hashCode() + ((this.purchase.hashCode() + ((this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioSearchMainResponseDto(albums=" + this.ad + ", audios=" + this.vip + ", artists=" + this.metrica + ", playlists=" + this.license + ", ownAudios=" + this.appmetrica + ", ownPlaylists=" + this.purchase + ", ownAlbums=" + this.billing + ")";
    }
}
