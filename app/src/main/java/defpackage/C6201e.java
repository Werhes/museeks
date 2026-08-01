package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6201e {
    public final LinkedHashSet ad;
    public final C11376e adcel;
    public final ArrayList appmetrica;
    public final AbstractC16510e billing;
    public final ArrayList license;
    public final ArrayList metrica;
    public final C14402e purchase;
    public final C11376e startapp;
    public final ArrayList vip;
    public final HashMap yandex;

    public C6201e(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C14402e c14402e, AbstractC16510e abstractC16510e, HashMap hashMap, C11376e c11376e, C11376e c11376e2) {
        this.ad = linkedHashSet;
        this.vip = arrayList;
        this.metrica = arrayList2;
        this.license = arrayList3;
        this.appmetrica = arrayList4;
        this.purchase = c14402e;
        this.billing = abstractC16510e;
        this.yandex = hashMap;
        this.startapp = c11376e;
        this.adcel = c11376e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6201e)) {
            return false;
        }
        C6201e c6201e = (C6201e) obj;
        return this.ad.equals(c6201e.ad) && this.vip.equals(c6201e.vip) && this.metrica.equals(c6201e.metrica) && this.license.equals(c6201e.license) && this.appmetrica.equals(c6201e.appmetrica) && AbstractC7890e.billing(this.purchase, c6201e.purchase) && AbstractC7890e.billing(this.billing, c6201e.billing) && this.yandex.equals(c6201e.yandex) && AbstractC7890e.billing(this.startapp, c6201e.startapp) && AbstractC7890e.billing(this.adcel, c6201e.adcel);
    }

    public final int hashCode() {
        int hashCode = (this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        C14402e c14402e = this.purchase;
        int hashCode2 = (hashCode + (c14402e == null ? 0 : c14402e.hashCode())) * 31;
        AbstractC16510e abstractC16510e = this.billing;
        int hashCode3 = (this.startapp.hashCode() + ((this.yandex.hashCode() + ((hashCode2 + (abstractC16510e == null ? 0 : abstractC16510e.hashCode())) * 31)) * 31)) * 31;
        C11376e c11376e = this.adcel;
        return hashCode3 + (c11376e != null ? c11376e.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.ad + ", cameraUseCases=" + this.vip + ", cameraUseCasesToAttach=" + this.metrica + ", cameraUseCasesToKeep=" + this.license + ", cameraUseCasesToDetach=" + this.appmetrica + ", streamSharing=" + this.purchase + ", placeholderForExtensions=" + this.billing + ", useCaseConfigs=" + this.yandex + ", primaryStreamSpecResult=" + this.startapp + ", secondaryStreamSpecResult=" + this.adcel + ')';
    }
}
