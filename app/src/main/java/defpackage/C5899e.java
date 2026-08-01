package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۚۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5899e extends AbstractC12790e {
    public final Integer ad;
    public final String adcel;
    public final String advert;
    public final String appmetrica;
    public final String billing;
    public final String license;
    public final String metrica;
    public final String mopub;
    public final String purchase;
    public final String startapp;
    public final String vip;
    public final String yandex;

    public C5899e(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.ad = num;
        this.vip = str;
        this.metrica = str2;
        this.license = str3;
        this.appmetrica = str4;
        this.purchase = str5;
        this.billing = str6;
        this.yandex = str7;
        this.startapp = str8;
        this.adcel = str9;
        this.mopub = str10;
        this.advert = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC12790e) {
            AbstractC12790e abstractC12790e = (AbstractC12790e) obj;
            Integer num = this.ad;
            if (num != null ? num.equals(((C5899e) abstractC12790e).ad) : ((C5899e) abstractC12790e).ad == null) {
                String str = this.vip;
                if (str != null ? str.equals(((C5899e) abstractC12790e).vip) : ((C5899e) abstractC12790e).vip == null) {
                    String str2 = this.metrica;
                    if (str2 != null ? str2.equals(((C5899e) abstractC12790e).metrica) : ((C5899e) abstractC12790e).metrica == null) {
                        String str3 = this.license;
                        if (str3 != null ? str3.equals(((C5899e) abstractC12790e).license) : ((C5899e) abstractC12790e).license == null) {
                            String str4 = this.appmetrica;
                            if (str4 != null ? str4.equals(((C5899e) abstractC12790e).appmetrica) : ((C5899e) abstractC12790e).appmetrica == null) {
                                String str5 = this.purchase;
                                if (str5 != null ? str5.equals(((C5899e) abstractC12790e).purchase) : ((C5899e) abstractC12790e).purchase == null) {
                                    String str6 = this.billing;
                                    if (str6 != null ? str6.equals(((C5899e) abstractC12790e).billing) : ((C5899e) abstractC12790e).billing == null) {
                                        String str7 = this.yandex;
                                        if (str7 != null ? str7.equals(((C5899e) abstractC12790e).yandex) : ((C5899e) abstractC12790e).yandex == null) {
                                            String str8 = this.startapp;
                                            if (str8 != null ? str8.equals(((C5899e) abstractC12790e).startapp) : ((C5899e) abstractC12790e).startapp == null) {
                                                String str9 = this.adcel;
                                                if (str9 != null ? str9.equals(((C5899e) abstractC12790e).adcel) : ((C5899e) abstractC12790e).adcel == null) {
                                                    String str10 = this.mopub;
                                                    if (str10 != null ? str10.equals(((C5899e) abstractC12790e).mopub) : ((C5899e) abstractC12790e).mopub == null) {
                                                        String str11 = this.advert;
                                                        if (str11 != null ? str11.equals(((C5899e) abstractC12790e).advert) : ((C5899e) abstractC12790e).advert == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.ad;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.vip;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.metrica;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.license;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.appmetrica;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.purchase;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.billing;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.yandex;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.startapp;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.adcel;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.mopub;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.advert;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.ad);
        sb.append(", model=");
        sb.append(this.vip);
        sb.append(", hardware=");
        sb.append(this.metrica);
        sb.append(", device=");
        sb.append(this.license);
        sb.append(", product=");
        sb.append(this.appmetrica);
        sb.append(", osBuild=");
        sb.append(this.purchase);
        sb.append(", manufacturer=");
        sb.append(this.billing);
        sb.append(", fingerprint=");
        sb.append(this.yandex);
        sb.append(", locale=");
        sb.append(this.startapp);
        sb.append(", country=");
        sb.append(this.adcel);
        sb.append(", mccMnc=");
        sb.append(this.mopub);
        sb.append(", applicationBuild=");
        return AbstractC1786e.signatures(sb, this.advert, "}");
    }
}
