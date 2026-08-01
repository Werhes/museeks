package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟۣ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17924e extends AbstractC9135e {
    public final String ad;
    public final AbstractC10782e adcel;
    public final int advert;
    public final Long appmetrica;
    public final AbstractC17162e billing;
    public final long license;
    public final String metrica;
    public final List mopub;
    public final boolean purchase;
    public final AbstractC15286e startapp;
    public final String vip;
    public final AbstractC17920e yandex;

    public C17924e(String str, String str2, String str3, long j, Long l, boolean z, AbstractC17162e abstractC17162e, AbstractC17920e abstractC17920e, AbstractC15286e abstractC15286e, AbstractC10782e abstractC10782e, List list, int i) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = j;
        this.appmetrica = l;
        this.purchase = z;
        this.billing = abstractC17162e;
        this.yandex = abstractC17920e;
        this.startapp = abstractC15286e;
        this.adcel = abstractC10782e;
        this.mopub = list;
        this.advert = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٗٙؗ, java.lang.Object] */
    @Override // defpackage.AbstractC9135e
    public final C17082e ad() {
        ?? obj = new Object();
        obj.ad = this.ad;
        obj.vip = this.vip;
        obj.metrica = this.metrica;
        obj.license = this.license;
        obj.appmetrica = this.appmetrica;
        obj.purchase = this.purchase;
        obj.billing = this.billing;
        obj.yandex = this.yandex;
        obj.startapp = this.startapp;
        obj.adcel = this.adcel;
        obj.mopub = this.mopub;
        obj.advert = this.advert;
        obj.smaato = (byte) 7;
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l;
        AbstractC17920e abstractC17920e;
        AbstractC15286e abstractC15286e;
        AbstractC10782e abstractC10782e;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9135e) {
            C17924e c17924e = (C17924e) ((AbstractC9135e) obj);
            List list2 = c17924e.mopub;
            AbstractC10782e abstractC10782e2 = c17924e.adcel;
            AbstractC15286e abstractC15286e2 = c17924e.startapp;
            AbstractC17920e abstractC17920e2 = c17924e.yandex;
            Long l2 = c17924e.appmetrica;
            String str2 = c17924e.metrica;
            if (this.ad.equals(c17924e.ad) && this.vip.equals(c17924e.vip) && ((str = this.metrica) != null ? str.equals(str2) : str2 == null) && this.license == c17924e.license && ((l = this.appmetrica) != null ? l.equals(l2) : l2 == null) && this.purchase == c17924e.purchase && this.billing.equals(c17924e.billing) && ((abstractC17920e = this.yandex) != null ? abstractC17920e.equals(abstractC17920e2) : abstractC17920e2 == null) && ((abstractC15286e = this.startapp) != null ? abstractC15286e.equals(abstractC15286e2) : abstractC15286e2 == null) && ((abstractC10782e = this.adcel) != null ? abstractC10782e.equals(abstractC10782e2) : abstractC10782e2 == null) && ((list = this.mopub) != null ? list.equals(list2) : list2 == null) && this.advert == c17924e.advert) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003;
        String str = this.metrica;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.license;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.appmetrica;
        int hashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.purchase ? 1231 : 1237)) * 1000003) ^ this.billing.hashCode()) * 1000003;
        AbstractC17920e abstractC17920e = this.yandex;
        int hashCode4 = (hashCode3 ^ (abstractC17920e == null ? 0 : abstractC17920e.hashCode())) * 1000003;
        AbstractC15286e abstractC15286e = this.startapp;
        int hashCode5 = (hashCode4 ^ (abstractC15286e == null ? 0 : abstractC15286e.hashCode())) * 1000003;
        AbstractC10782e abstractC10782e = this.adcel;
        int hashCode6 = (hashCode5 ^ (abstractC10782e == null ? 0 : abstractC10782e.hashCode())) * 1000003;
        List list = this.mopub;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.advert;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.ad);
        sb.append(", identifier=");
        sb.append(this.vip);
        sb.append(", appQualitySessionId=");
        sb.append(this.metrica);
        sb.append(", startedAt=");
        sb.append(this.license);
        sb.append(", endedAt=");
        sb.append(this.appmetrica);
        sb.append(", crashed=");
        sb.append(this.purchase);
        sb.append(", app=");
        sb.append(this.billing);
        sb.append(", user=");
        sb.append(this.yandex);
        sb.append(", os=");
        sb.append(this.startapp);
        sb.append(", device=");
        sb.append(this.adcel);
        sb.append(", events=");
        sb.append(this.mopub);
        sb.append(", generatorType=");
        return AbstractC17861e.smaato(this.advert, "}", sb);
    }
}
