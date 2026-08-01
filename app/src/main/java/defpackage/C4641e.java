package defpackage;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4641e {
    public final String ad;
    public final Function1 adcel;
    public final Function1 appmetrica;
    public final Function1 billing;
    public final boolean license;
    public final Function1 metrica;
    public final HashMap mopub = new HashMap();
    public final Function1 purchase;
    public final Function1 startapp;
    public final Function1 vip;
    public final Function1 yandex;

    public C4641e(String str, Function1 function1, Function1 function12, boolean z, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18) {
        this.ad = str;
        this.vip = function1;
        this.metrica = function12;
        this.license = z;
        this.appmetrica = function13;
        this.purchase = function14;
        this.billing = function15;
        this.yandex = function16;
        this.startapp = function17;
        this.adcel = function18;
    }

    public final double ad(C16439e c16439e) {
        return (c16439e.advert == 2 ? AbstractC0903e.vip : AbstractC0903e.ad).adcel(this, c16439e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4641e)) {
            return false;
        }
        C4641e c4641e = (C4641e) obj;
        return AbstractC7890e.billing(this.ad, c4641e.ad) && AbstractC7890e.billing(this.vip, c4641e.vip) && this.metrica.equals(c4641e.metrica) && this.license == c4641e.license && AbstractC7890e.billing(this.appmetrica, c4641e.appmetrica) && AbstractC7890e.billing(this.purchase, c4641e.purchase) && AbstractC7890e.billing(this.billing, c4641e.billing) && AbstractC7890e.billing(this.yandex, c4641e.yandex) && AbstractC7890e.billing(this.startapp, c4641e.startapp) && AbstractC7890e.billing(this.adcel, c4641e.adcel);
    }

    public final int hashCode() {
        int hashCode = (((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31) + (this.license ? 1231 : 1237)) * 31;
        Function1 function1 = this.appmetrica;
        int hashCode2 = (hashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.purchase;
        int hashCode3 = (hashCode2 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1 function13 = this.billing;
        int hashCode4 = (hashCode3 + (function13 == null ? 0 : function13.hashCode())) * 31;
        Function1 function14 = this.yandex;
        int hashCode5 = (hashCode4 + (function14 == null ? 0 : function14.hashCode())) * 31;
        Function1 function15 = this.startapp;
        int hashCode6 = (hashCode5 + (function15 == null ? 0 : function15.hashCode())) * 31;
        Function1 function16 = this.adcel;
        return hashCode6 + (function16 != null ? function16.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicColor(name=" + this.ad + ", palette=" + this.vip + ", tone=" + this.metrica + ", isBackground=" + this.license + ", chromaMultiplier=" + this.appmetrica + ", background=" + this.purchase + ", secondBackground=" + this.billing + ", contrastCurve=" + this.yandex + ", toneDeltaPair=" + this.startapp + ", opacity=" + this.adcel + ")";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ٘, java.lang.Object] */
    public final C8765e vip() {
        ?? obj = new Object();
        obj.f17669e = this.ad;
        obj.f17667e = this.vip;
        obj.f17671e = this.metrica;
        obj.f17673e = this.license;
        obj.f17666e = this.appmetrica;
        obj.f17675e = this.purchase;
        obj.f17674e = this.billing;
        obj.f17670e = this.yandex;
        obj.f17672e = this.startapp;
        obj.f17668e = this.adcel;
        return obj;
    }
}
