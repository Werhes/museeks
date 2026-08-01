package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17526e {
    public final Context ad;
    public final C0034e appmetrica;
    public final C1400e license;
    public final C17647e metrica;
    public final C7287e purchase;
    public final C8365e vip;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, eؚٛۡ] */
    public C17526e(Context context, C8365e c8365e, C0034e c0034e) {
        C17647e c17647e = new C17647e(25);
        C1400e c1400e = new C1400e(25);
        ?? obj = new Object();
        this.ad = context;
        this.vip = c8365e;
        this.metrica = c17647e;
        this.license = c1400e;
        this.appmetrica = c0034e;
        this.purchase = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17526e)) {
            return false;
        }
        C17526e c17526e = (C17526e) obj;
        return AbstractC7890e.billing(this.ad, c17526e.ad) && AbstractC7890e.billing(this.vip, c17526e.vip) && AbstractC7890e.billing(this.metrica, c17526e.metrica) && AbstractC7890e.billing(this.license, c17526e.license) && AbstractC7890e.billing(this.appmetrica, c17526e.appmetrica) && AbstractC7890e.billing(this.purchase, c17526e.purchase);
    }

    public final int hashCode() {
        int hashCode = (this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31)) * 961;
        this.purchase.getClass();
        return (1237 + hashCode) * 31;
    }

    public final String toString() {
        return "Config(appContext=" + this.ad + ", threadConfig=" + this.vip + ", cameraMetadataConfig=" + this.metrica + ", cameraBackendConfig=" + this.license + ", cameraInteropConfig=" + this.appmetrica + ", imageSources=null, flags=" + this.purchase + ", platformApiCompat=null)";
    }
}
