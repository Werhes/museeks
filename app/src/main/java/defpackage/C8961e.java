package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8961e implements InterfaceC10323e {
    public volatile AbstractC17555e ad = null;
    public final /* synthetic */ int vip;

    public C8961e(int i) {
        this.vip = i;
    }

    @Override // defpackage.InterfaceC10323e
    public final AbstractC17555e ad() {
        if (this.ad == null) {
            synchronized (this) {
                try {
                    if (this.ad == null) {
                        this.ad = vip();
                    }
                } finally {
                }
            }
        }
        return this.ad;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e٘ؖ٘, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [e٘ؖ٘, eْٖٜ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [e٘ؖ٘, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [e٘ؖ٘, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [e٘ؖ٘, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [e٘ؖ٘, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [eٕؓۨ, e٘ؖ٘, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [e٘ؖ٘, java.lang.Object, eؓۢ۟] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, eؑؑ۟] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, eًۦٚ] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, eؙٕۣ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, eٖۙٓ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [eُِؓ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [eٟؕؔ, java.lang.Object] */
    public final AbstractC17555e vip() {
        switch (this.vip) {
            case 0:
                return new Object();
            case 1:
                ?? obj = new Object();
                obj.metrica = new Object();
                obj.license = new Object();
                return obj;
            case 2:
                return new Object();
            case 3:
                return new Object();
            case 4:
                return new Object();
            case 5:
                return new Object();
            case 6:
                ?? obj2 = new Object();
                obj2.metrica = new Object();
                ?? obj3 = new Object();
                obj3.ad = new Object();
                obj2.license = obj3;
                return obj2;
            default:
                ?? obj4 = new Object();
                obj4.vip = new Object();
                obj4.metrica = new C10433e();
                return obj4;
        }
    }
}
