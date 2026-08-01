package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؔٓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2567e {
    public static final C5722e Companion = new Object();
    public static final InterfaceC3477e[] yandex = {null, null, AbstractC18039e.appmetrica(2, new C9283e(19)), null, null, null, null};
    public final C15669e ad;
    public final Integer appmetrica;
    public final String billing;
    public final int license;
    public final EnumC8272e metrica;
    public final String purchase;
    public final String vip;

    public /* synthetic */ C2567e(int i, C15669e c15669e, String str, EnumC8272e enumC8272e, int i2, Integer num, String str2, String str3) {
        if (103 != (i & 103)) {
            AbstractC5756e.billing(i, 103, C1317e.ad.appmetrica());
            throw null;
        }
        this.ad = c15669e;
        this.vip = str;
        this.metrica = enumC8272e;
        if ((i & 8) == 0) {
            this.license = 0;
        } else {
            this.license = i2;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = num;
        }
        this.purchase = str2;
        this.billing = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2567e)) {
            return false;
        }
        C2567e c2567e = (C2567e) obj;
        return AbstractC7890e.billing(this.ad, c2567e.ad) && AbstractC7890e.billing(this.vip, c2567e.vip) && this.metrica == c2567e.metrica && this.license == c2567e.license && AbstractC7890e.billing(this.appmetrica, c2567e.appmetrica) && AbstractC7890e.billing(this.purchase, c2567e.purchase) && AbstractC7890e.billing(this.billing, c2567e.billing);
    }

    public final int hashCode() {
        int hashCode = (((this.metrica.hashCode() + AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip)) * 31) + this.license) * 31;
        Integer num = this.appmetrica;
        return this.billing.hashCode() + AbstractC1786e.advert((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.purchase);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksChapterDto(audioFile=");
        sb.append(this.ad);
        sb.append(", id=");
        sb.append(this.vip);
        sb.append(", progressStatus=");
        sb.append(this.metrica);
        sb.append(", progressTime=");
        sb.append(this.license);
        sb.append(", specialProjectId=");
        sb.append(this.appmetrica);
        sb.append(", title=");
        sb.append(this.purchase);
        sb.append(", trackCode=");
        return AbstractC1786e.signatures(sb, this.billing, ")");
    }
}
