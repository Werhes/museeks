package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15952e {
    public final C6510e ad;
    public final Boolean adcel;
    public final List appmetrica;
    public final List billing;
    public final C13743e license;
    public final C12332e metrica;
    public final List purchase;
    public final Boolean startapp;
    public final C2548e vip;
    public final Boolean yandex;

    public C15952e(C6510e c6510e, C2548e c2548e, C12332e c12332e, C13743e c13743e, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.ad = c6510e;
        this.vip = c2548e;
        this.metrica = c12332e;
        this.license = c13743e;
        this.appmetrica = list;
        this.purchase = list2;
        this.billing = list3;
        this.yandex = bool;
        this.startapp = bool2;
        this.adcel = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15952e)) {
            return false;
        }
        C15952e c15952e = (C15952e) obj;
        return AbstractC7890e.billing(this.ad, c15952e.ad) && AbstractC7890e.billing(this.vip, c15952e.vip) && AbstractC7890e.billing(this.metrica, c15952e.metrica) && AbstractC7890e.billing(this.license, c15952e.license) && AbstractC7890e.billing(this.appmetrica, c15952e.appmetrica) && AbstractC7890e.billing(this.purchase, c15952e.purchase) && AbstractC7890e.billing(this.billing, c15952e.billing) && AbstractC7890e.billing(this.yandex, c15952e.yandex) && AbstractC7890e.billing(this.startapp, c15952e.startapp) && AbstractC7890e.billing(this.adcel, c15952e.adcel);
    }

    public final int hashCode() {
        C6510e c6510e = this.ad;
        int i = (c6510e == null ? 0 : c6510e.ad) * 31;
        C2548e c2548e = this.vip;
        int i2 = (i + (c2548e == null ? 0 : c2548e.ad)) * 31;
        C12332e c12332e = this.metrica;
        int i3 = (i2 + (c12332e == null ? 0 : c12332e.ad)) * 31;
        C13743e c13743e = this.license;
        int i4 = (i3 + (c13743e == null ? 0 : c13743e.ad)) * 31;
        List list = this.appmetrica;
        int hashCode = (i4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.purchase;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.billing;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.yandex;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.startapp;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.adcel;
        return hashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "State3A(aeMode=" + this.ad + ", afMode=" + this.vip + ", awbMode=" + this.metrica + ", flashMode=" + this.license + ", aeRegions=" + this.appmetrica + ", afRegions=" + this.purchase + ", awbRegions=" + this.billing + ", aeLock=" + this.yandex + ", afLock=" + this.startapp + ", awbLock=" + this.adcel + ')';
    }
}
