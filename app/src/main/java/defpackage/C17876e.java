package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٜ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17876e extends C16966e {
    public final Object metrica;

    public C17876e(int i) {
        super(i);
        this.metrica = new Object();
    }

    @Override // defpackage.C16966e
    public final Object ad() {
        Object ad;
        synchronized (this.metrica) {
            ad = super.ad();
        }
        return ad;
    }

    @Override // defpackage.C16966e
    public final boolean metrica(Object obj) {
        boolean metrica;
        synchronized (this.metrica) {
            metrica = super.metrica(obj);
        }
        return metrica;
    }
}
