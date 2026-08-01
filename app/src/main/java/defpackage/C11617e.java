package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٌؘِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11617e {
    public static final C14496e Companion = new Object();
    public static final InterfaceC3477e[] smaato = {null, null, null, null, null, null, null, null, null, AbstractC18039e.appmetrica(2, new C14582e(15)), null, null};
    public final C3010e ad;
    public final EnumC11398e adcel;
    public final String advert;
    public final String appmetrica;
    public final Integer billing;
    public final String license;
    public final String metrica;
    public final Integer mopub;
    public final Integer purchase;
    public final String startapp;
    public final String vip;
    public final C5655e yandex;

    public /* synthetic */ C11617e(int i, C3010e c3010e, String str, String str2, String str3, String str4, Integer num, Integer num2, C5655e c5655e, String str5, EnumC11398e enumC11398e, Integer num3, String str6) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = c3010e;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str2;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = str3;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = str4;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = num;
        }
        if ((i & 64) == 0) {
            this.billing = null;
        } else {
            this.billing = num2;
        }
        if ((i & 128) == 0) {
            this.yandex = null;
        } else {
            this.yandex = c5655e;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.startapp = null;
        } else {
            this.startapp = str5;
        }
        if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.adcel = null;
        } else {
            this.adcel = enumC11398e;
        }
        if ((i & 1024) == 0) {
            this.mopub = null;
        } else {
            this.mopub = num3;
        }
        if ((i & 2048) == 0) {
            this.advert = null;
        } else {
            this.advert = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11617e)) {
            return false;
        }
        C11617e c11617e = (C11617e) obj;
        return AbstractC7890e.billing(this.ad, c11617e.ad) && AbstractC7890e.billing(this.vip, c11617e.vip) && AbstractC7890e.billing(this.metrica, c11617e.metrica) && AbstractC7890e.billing(this.license, c11617e.license) && AbstractC7890e.billing(this.appmetrica, c11617e.appmetrica) && AbstractC7890e.billing(this.purchase, c11617e.purchase) && AbstractC7890e.billing(this.billing, c11617e.billing) && AbstractC7890e.billing(this.yandex, c11617e.yandex) && AbstractC7890e.billing(this.startapp, c11617e.startapp) && this.adcel == c11617e.adcel && AbstractC7890e.billing(this.mopub, c11617e.mopub) && AbstractC7890e.billing(this.advert, c11617e.advert);
    }

    public final int hashCode() {
        C3010e c3010e = this.ad;
        int hashCode = (c3010e == null ? 0 : c3010e.hashCode()) * 31;
        String str = this.vip;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metrica;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.license;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appmetrica;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.purchase;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.billing;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C5655e c5655e = this.yandex;
        int vip = (hashCode7 + (c5655e == null ? 0 : C5655e.vip(c5655e.ad))) * 31;
        String str5 = this.startapp;
        int hashCode8 = (vip + (str5 == null ? 0 : str5.hashCode())) * 31;
        EnumC11398e enumC11398e = this.adcel;
        int hashCode9 = (hashCode8 + (enumC11398e == null ? 0 : enumC11398e.hashCode())) * 31;
        Integer num3 = this.mopub;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.advert;
        return hashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLinkButtonDto(action=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", blockId=");
        AbstractC13501e.Signature(sb, this.metrica, ", sectionId=", this.license, ", artistId=");
        sb.append(this.appmetrica);
        sb.append(", curatorId=");
        sb.append(this.purchase);
        sb.append(", albumId=");
        sb.append(this.billing);
        sb.append(", ownerId=");
        sb.append(this.yandex);
        sb.append(", icon=");
        sb.append(this.startapp);
        sb.append(", style=");
        sb.append(this.adcel);
        sb.append(", audioId=");
        sb.append(this.mopub);
        sb.append(", hashtag=");
        sb.append(this.advert);
        sb.append(")");
        return sb.toString();
    }
}
