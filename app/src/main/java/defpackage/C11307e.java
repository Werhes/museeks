package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11307e {
    public final Context ad;
    public final C5363e appmetrica;
    public final C5363e license;
    public final C5363e metrica;
    public final C17306e purchase;
    public final C13661e vip;

    public C11307e(Context context, C13661e c13661e, C5363e c5363e, C5363e c5363e2, C5363e c5363e3, C17306e c17306e) {
        this.ad = context;
        this.vip = c13661e;
        this.metrica = c5363e;
        this.license = c5363e2;
        this.appmetrica = c5363e3;
        this.purchase = c17306e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11307e)) {
            return false;
        }
        C11307e c11307e = (C11307e) obj;
        if (!AbstractC7890e.billing(this.ad, c11307e.ad) || !this.vip.equals(c11307e.vip) || !this.metrica.equals(c11307e.metrica) || !this.license.equals(c11307e.license) || !this.appmetrica.equals(c11307e.appmetrica)) {
            return false;
        }
        Object obj2 = C2282e.f5778e;
        return obj2.equals(obj2) && this.purchase.equals(c11307e.purchase);
    }

    public final int hashCode() {
        return (this.purchase.hashCode() + ((C2282e.f5778e.hashCode() + ((this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.ad + ", defaults=" + this.vip + ", mainCoroutineContextLazy=" + this.metrica + ", memoryCacheLazy=" + this.license + ", diskCacheLazy=" + this.appmetrica + ", eventListenerFactory=" + C2282e.f5778e + ", componentRegistry=" + this.purchase + ", logger=null)";
    }
}
