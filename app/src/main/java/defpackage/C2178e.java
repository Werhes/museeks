package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۢۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2178e {
    public final InterfaceC8850e ad;
    public final int adcel;
    public final Function1 appmetrica;
    public final Function1 billing;
    public final int license;
    public final InterfaceC8850e metrica;
    public final Function1 purchase;
    public final int startapp;
    public final InterfaceC8850e vip;
    public final InterfaceC10819e yandex;

    public C2178e(InterfaceC8850e interfaceC8850e, InterfaceC8850e interfaceC8850e2, InterfaceC8850e interfaceC8850e3, int i, Function1 function1, Function1 function12, Function1 function13, InterfaceC10819e interfaceC10819e, int i2, int i3) {
        this.ad = interfaceC8850e;
        this.vip = interfaceC8850e2;
        this.metrica = interfaceC8850e3;
        this.license = i;
        this.appmetrica = function1;
        this.purchase = function12;
        this.billing = function13;
        this.yandex = interfaceC10819e;
        this.startapp = i2;
        this.adcel = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2178e)) {
            return false;
        }
        C2178e c2178e = (C2178e) obj;
        return AbstractC7890e.billing(this.ad, c2178e.ad) && AbstractC7890e.billing(this.vip, c2178e.vip) && AbstractC7890e.billing(this.metrica, c2178e.metrica) && this.license == c2178e.license && AbstractC7890e.billing(this.appmetrica, c2178e.appmetrica) && AbstractC7890e.billing(this.purchase, c2178e.purchase) && AbstractC7890e.billing(this.billing, c2178e.billing) && AbstractC7890e.billing(this.yandex, c2178e.yandex) && this.startapp == c2178e.startapp && this.adcel == c2178e.adcel;
    }

    public final int hashCode() {
        InterfaceC8850e interfaceC8850e = this.ad;
        int hashCode = (interfaceC8850e == null ? 0 : interfaceC8850e.hashCode()) * 31;
        InterfaceC8850e interfaceC8850e2 = this.vip;
        int hashCode2 = (hashCode + (interfaceC8850e2 == null ? 0 : interfaceC8850e2.hashCode())) * 31;
        InterfaceC8850e interfaceC8850e3 = this.metrica;
        int hashCode3 = (hashCode2 + (interfaceC8850e3 == null ? 0 : interfaceC8850e3.hashCode())) * 31;
        int i = this.license;
        int m2467class = (hashCode3 + (i == 0 ? 0 : AbstractC8703e.m2467class(i))) * 29791;
        Function1 function1 = this.appmetrica;
        int hashCode4 = (m2467class + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.purchase;
        int hashCode5 = (hashCode4 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1 function13 = this.billing;
        int hashCode6 = (hashCode5 + (function13 == null ? 0 : function13.hashCode())) * 31;
        InterfaceC10819e interfaceC10819e = this.yandex;
        int hashCode7 = (hashCode6 + (interfaceC10819e == null ? 0 : interfaceC10819e.hashCode())) * 31;
        int i2 = this.startapp;
        int m2467class2 = (hashCode7 + (i2 == 0 ? 0 : AbstractC8703e.m2467class(i2))) * 31;
        int i3 = this.adcel;
        return m2467class2 + (i3 != 0 ? AbstractC8703e.m2467class(i3) : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.ad + ", fetcherCoroutineContext=" + this.vip + ", decoderCoroutineContext=" + this.metrica + ", memoryCachePolicy=" + AbstractC10257e.ads(this.license) + ", diskCachePolicy=" + AbstractC10257e.ads(0) + ", networkCachePolicy=" + AbstractC10257e.ads(0) + ", placeholderFactory=" + this.appmetrica + ", errorFactory=" + this.purchase + ", fallbackFactory=" + this.billing + ", sizeResolver=" + this.yandex + ", scale=" + AbstractC0054e.m226try(this.startapp) + ", precision=" + AbstractC1634e.isPro(this.adcel) + ")";
    }
}
