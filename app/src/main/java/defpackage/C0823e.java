package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0823e extends AbstractC7939e {
    public final String adcel;
    public final AbstractC4592e advert;
    public final String appmetrica;
    public final String billing;
    public final int license;
    public final String metrica;
    public final AbstractC9135e mopub;
    public final String purchase;
    public final AbstractC13920e smaato;
    public final String startapp;
    public final String vip;
    public final String yandex;

    public C0823e(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, AbstractC9135e abstractC9135e, AbstractC4592e abstractC4592e, AbstractC13920e abstractC13920e) {
        this.vip = str;
        this.metrica = str2;
        this.license = i;
        this.appmetrica = str3;
        this.purchase = str4;
        this.billing = str5;
        this.yandex = str6;
        this.startapp = str7;
        this.adcel = str8;
        this.mopub = abstractC9135e;
        this.advert = abstractC4592e;
        this.smaato = abstractC13920e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eّۣٗ, java.lang.Object] */
    public final C17366e ad() {
        ?? obj = new Object();
        obj.ad = this.vip;
        obj.vip = this.metrica;
        obj.metrica = this.license;
        obj.license = this.appmetrica;
        obj.appmetrica = this.purchase;
        obj.purchase = this.billing;
        obj.billing = this.yandex;
        obj.yandex = this.startapp;
        obj.startapp = this.adcel;
        obj.adcel = this.mopub;
        obj.mopub = this.advert;
        obj.advert = this.smaato;
        obj.smaato = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        AbstractC9135e abstractC9135e;
        AbstractC4592e abstractC4592e;
        AbstractC13920e abstractC13920e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7939e) {
            C0823e c0823e = (C0823e) ((AbstractC7939e) obj);
            AbstractC13920e abstractC13920e2 = c0823e.smaato;
            AbstractC4592e abstractC4592e2 = c0823e.advert;
            AbstractC9135e abstractC9135e2 = c0823e.mopub;
            String str4 = c0823e.yandex;
            String str5 = c0823e.billing;
            String str6 = c0823e.purchase;
            if (this.vip.equals(c0823e.vip) && this.metrica.equals(c0823e.metrica) && this.license == c0823e.license && this.appmetrica.equals(c0823e.appmetrica) && ((str = this.purchase) != null ? str.equals(str6) : str6 == null) && ((str2 = this.billing) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.yandex) != null ? str3.equals(str4) : str4 == null) && this.startapp.equals(c0823e.startapp) && this.adcel.equals(c0823e.adcel) && ((abstractC9135e = this.mopub) != null ? abstractC9135e.equals(abstractC9135e2) : abstractC9135e2 == null) && ((abstractC4592e = this.advert) != null ? abstractC4592e.equals(abstractC4592e2) : abstractC4592e2 == null) && ((abstractC13920e = this.smaato) != null ? abstractC13920e.equals(abstractC13920e2) : abstractC13920e2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.vip.hashCode() ^ 1000003) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license) * 1000003) ^ this.appmetrica.hashCode()) * 1000003;
        String str = this.purchase;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.billing;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.yandex;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.startapp.hashCode()) * 1000003) ^ this.adcel.hashCode()) * 1000003;
        AbstractC9135e abstractC9135e = this.mopub;
        int hashCode5 = (hashCode4 ^ (abstractC9135e == null ? 0 : abstractC9135e.hashCode())) * 1000003;
        AbstractC4592e abstractC4592e = this.advert;
        int hashCode6 = (hashCode5 ^ (abstractC4592e == null ? 0 : abstractC4592e.hashCode())) * 1000003;
        AbstractC13920e abstractC13920e = this.smaato;
        return hashCode6 ^ (abstractC13920e != null ? abstractC13920e.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.vip + ", gmpAppId=" + this.metrica + ", platform=" + this.license + ", installationUuid=" + this.appmetrica + ", firebaseInstallationId=" + this.purchase + ", firebaseAuthenticationToken=" + this.billing + ", appQualitySessionId=" + this.yandex + ", buildVersion=" + this.startapp + ", displayVersion=" + this.adcel + ", session=" + this.mopub + ", ndkPayload=" + this.advert + ", appExitInfo=" + this.smaato + "}";
    }
}
