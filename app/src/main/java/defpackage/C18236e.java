package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٜۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18236e {
    public static final C17812e Companion = new Object();
    public static final InterfaceC3477e[] advert = {null, null, null, null, null, null, null, null, null, null, AbstractC18039e.appmetrica(2, new C14561e(12))};
    public final int ad;
    public final String adcel;
    public final String appmetrica;
    public final String billing;
    public final String license;
    public final String metrica;
    public final List mopub;
    public final String purchase;
    public final String startapp;
    public final int vip;
    public final String yandex;

    public /* synthetic */ C18236e(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C13144e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = i3;
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = str2;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = str3;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str4;
        }
        if ((i & 64) == 0) {
            this.billing = null;
        } else {
            this.billing = str5;
        }
        if ((i & 128) == 0) {
            this.yandex = null;
        } else {
            this.yandex = str6;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.startapp = null;
        } else {
            this.startapp = str7;
        }
        if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.adcel = null;
        } else {
            this.adcel = str8;
        }
        if ((i & 1024) == 0) {
            this.mopub = null;
        } else {
            this.mopub = list;
        }
    }

    public C18236e(String str, String str2, String str3, String str4, String str5) {
        this.ad = 0;
        this.vip = 0;
        this.metrica = null;
        this.license = null;
        this.appmetrica = null;
        this.purchase = str;
        this.billing = str2;
        this.yandex = str3;
        this.startapp = str4;
        this.adcel = str5;
        this.mopub = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18236e)) {
            return false;
        }
        C18236e c18236e = (C18236e) obj;
        return this.ad == c18236e.ad && this.vip == c18236e.vip && AbstractC7890e.billing(this.metrica, c18236e.metrica) && AbstractC7890e.billing(this.license, c18236e.license) && AbstractC7890e.billing(this.appmetrica, c18236e.appmetrica) && AbstractC7890e.billing(this.purchase, c18236e.purchase) && AbstractC7890e.billing(this.billing, c18236e.billing) && AbstractC7890e.billing(this.yandex, c18236e.yandex) && AbstractC7890e.billing(this.startapp, c18236e.startapp) && AbstractC7890e.billing(this.adcel, c18236e.adcel) && AbstractC7890e.billing(this.mopub, c18236e.mopub);
    }

    public final int hashCode() {
        int i = ((this.ad * 31) + this.vip) * 31;
        String str = this.metrica;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.license;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appmetrica;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.purchase;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.billing;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.yandex;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.startapp;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.adcel;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list = this.mopub;
        return hashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder pro = AbstractC17861e.pro(this.ad, this.vip, "AudioPhotoDto(width=", ", height=", ", id=");
        AbstractC13501e.Signature(pro, this.metrica, ", photo34=", this.license, ", photo68=");
        AbstractC13501e.Signature(pro, this.appmetrica, ", photo135=", this.purchase, ", photo270=");
        AbstractC13501e.Signature(pro, this.billing, ", photo300=", this.yandex, ", photo600=");
        AbstractC13501e.Signature(pro, this.startapp, ", photo1200=", this.adcel, ", sizes=");
        pro.append(this.mopub);
        pro.append(")");
        return pro.toString();
    }
}
