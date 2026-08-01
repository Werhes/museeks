package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6083e implements InterfaceC16707e {
    public final int ad;
    public final int appmetrica;
    public final int billing;
    public final int license;
    public final String metrica;
    public final int purchase;
    public final String vip;
    public final byte[] yandex;

    public C6083e(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.ad = i;
        this.vip = str;
        this.metrica = str2;
        this.license = i2;
        this.appmetrica = i3;
        this.purchase = i4;
        this.billing = i5;
        this.yandex = bArr;
    }

    public static C6083e license(C1292e c1292e) {
        int smaato = c1292e.smaato();
        String amazon = AbstractC8542e.amazon(c1292e.isPro(c1292e.smaato(), StandardCharsets.US_ASCII));
        String isPro = c1292e.isPro(c1292e.smaato(), StandardCharsets.UTF_8);
        int smaato2 = c1292e.smaato();
        int smaato3 = c1292e.smaato();
        int smaato4 = c1292e.smaato();
        int smaato5 = c1292e.smaato();
        int smaato6 = c1292e.smaato();
        byte[] bArr = new byte[smaato6];
        c1292e.mopub(0, smaato6, bArr);
        return new C6083e(smaato, amazon, isPro, smaato2, smaato3, smaato4, smaato5, bArr);
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ C16975e ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6083e.class == obj.getClass()) {
            C6083e c6083e = (C6083e) obj;
            if (this.ad == c6083e.ad && this.vip.equals(c6083e.vip) && this.metrica.equals(c6083e.metrica) && this.license == c6083e.license && this.appmetrica == c6083e.appmetrica && this.purchase == c6083e.purchase && this.billing == c6083e.billing && Arrays.equals(this.yandex, c6083e.yandex)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.yandex) + ((((((((AbstractC1786e.advert(AbstractC1786e.advert((527 + this.ad) * 31, 31, this.vip), 31, this.metrica) + this.license) * 31) + this.appmetrica) * 31) + this.purchase) * 31) + this.billing) * 31);
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ byte[] metrica() {
        return null;
    }

    public final String toString() {
        return "Picture: mimeType=" + this.vip + ", description=" + this.metrica;
    }

    @Override // defpackage.InterfaceC16707e
    public final void vip(C4761e c4761e) {
        c4761e.ad(this.ad, this.yandex);
    }
}
