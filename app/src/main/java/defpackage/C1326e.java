package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۛ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C1326e extends AbstractC9790e {
    public final void adcel(Object obj) {
        boolean z;
        synchronized (this.ad) {
            z = this.purchase == AbstractC9790e.mopub;
            this.purchase = obj;
        }
        if (z) {
            C9129e.m2520class().m2521interface(this.adcel);
        }
    }

    @Override // defpackage.AbstractC9790e
    public final void startapp(Object obj) {
        AbstractC9790e.ad("setValue");
        this.billing++;
        this.appmetrica = obj;
        metrica(null);
    }
}
