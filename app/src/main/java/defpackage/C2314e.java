package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؔؑۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2314e {
    public static final C4578e Companion = new Object();
    public static final InterfaceC3477e[] amazon = {AbstractC18039e.appmetrica(2, new C18420e(10)), null, AbstractC18039e.appmetrica(2, new C18420e(11)), AbstractC18039e.appmetrica(2, new C18420e(12)), AbstractC18039e.appmetrica(2, new C18420e(13)), null, null, null, null, null, AbstractC18039e.appmetrica(2, new C18420e(14)), AbstractC18039e.appmetrica(2, new C18420e(15)), null};
    public final EnumC14399e ad;
    public final String adcel;
    public final EnumC0767e advert;
    public final List appmetrica;
    public final boolean billing;
    public final List license;
    public final List metrica;
    public final List mopub;
    public final C1769e purchase;
    public final C16321e smaato;
    public final boolean startapp;
    public final String vip;
    public final int yandex;

    public /* synthetic */ C2314e(int i, EnumC14399e enumC14399e, String str, List list, List list2, List list3, C1769e c1769e, boolean z, int i2, boolean z2, String str2, List list4, EnumC0767e enumC0767e, C16321e c16321e) {
        if (195 != (i & 195)) {
            AbstractC5756e.billing(i, 195, C16370e.ad.appmetrica());
            throw null;
        }
        this.ad = enumC14399e;
        this.vip = str;
        int i3 = i & 4;
        C13664e c13664e = C13664e.f27089e;
        if (i3 == 0) {
            this.metrica = c13664e;
        } else {
            this.metrica = list;
        }
        if ((i & 8) == 0) {
            this.license = c13664e;
        } else {
            this.license = list2;
        }
        if ((i & 16) == 0) {
            this.appmetrica = c13664e;
        } else {
            this.appmetrica = list3;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = c1769e;
        }
        this.billing = z;
        this.yandex = i2;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.startapp = false;
        } else {
            this.startapp = z2;
        }
        if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.adcel = BuildConfig.FLAVOR;
        } else {
            this.adcel = str2;
        }
        if ((i & 1024) == 0) {
            this.mopub = c13664e;
        } else {
            this.mopub = list4;
        }
        this.advert = (i & 2048) == 0 ? EnumC0767e.f3121e : enumC0767e;
        if ((i & 4096) == 0) {
            this.smaato = null;
        } else {
            this.smaato = c16321e;
        }
    }

    public C2314e(EnumC14399e enumC14399e, String str, List list, List list2, C1769e c1769e, boolean z, int i, List list3, int i2) {
        int i3 = i2 & 1024;
        C13664e c13664e = C13664e.f27089e;
        list3 = i3 != 0 ? c13664e : list3;
        EnumC0767e enumC0767e = EnumC0767e.f3121e;
        this.ad = enumC14399e;
        this.vip = str;
        this.metrica = list;
        this.license = list2;
        this.appmetrica = c13664e;
        this.purchase = c1769e;
        this.billing = z;
        this.yandex = i;
        this.startapp = false;
        this.adcel = BuildConfig.FLAVOR;
        this.mopub = list3;
        this.advert = enumC0767e;
        this.smaato = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2314e)) {
            return false;
        }
        C2314e c2314e = (C2314e) obj;
        return this.ad == c2314e.ad && AbstractC7890e.billing(this.vip, c2314e.vip) && AbstractC7890e.billing(this.metrica, c2314e.metrica) && AbstractC7890e.billing(this.license, c2314e.license) && AbstractC7890e.billing(this.appmetrica, c2314e.appmetrica) && AbstractC7890e.billing(this.purchase, c2314e.purchase) && this.billing == c2314e.billing && this.yandex == c2314e.yandex && this.startapp == c2314e.startapp && AbstractC7890e.billing(this.adcel, c2314e.adcel) && AbstractC7890e.billing(this.mopub, c2314e.mopub) && this.advert == c2314e.advert && AbstractC7890e.billing(this.smaato, c2314e.smaato);
    }

    public final int hashCode() {
        int billing = AbstractC17861e.billing(AbstractC17861e.billing(AbstractC17861e.billing(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica), 31, this.license), 31, this.appmetrica);
        C1769e c1769e = this.purchase;
        int hashCode = (this.advert.hashCode() + AbstractC17861e.billing(AbstractC1786e.advert((((((((billing + (c1769e == null ? 0 : c1769e.hashCode())) * 31) + (this.billing ? 1231 : 1237)) * 31) + this.yandex) * 31) + (this.startapp ? 1231 : 1237)) * 31, 31, this.adcel), 31, this.mopub)) * 31;
        C16321e c16321e = this.smaato;
        return hashCode + (c16321e != null ? c16321e.hashCode() : 0);
    }

    public final String toString() {
        return "Y25CBlock(type=" + this.ad + ", name=" + this.vip + ", titles=" + this.metrica + ", subtitles=" + this.license + ", photoUrls=" + this.appmetrica + ", background=" + this.purchase + ", isVisible=" + this.billing + ", order=" + this.yandex + ", isSharingEnabled=" + this.startapp + ", audioPreviewUrl=" + this.adcel + ", metrics=" + this.mopub + ", colorType=" + this.advert + ", playlist=" + this.smaato + ")";
    }
}
