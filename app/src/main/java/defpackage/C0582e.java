package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ۟ؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0582e {
    public final C3355e ad;

    public C0582e(C3355e c3355e) {
        this.ad = c3355e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, eٗؒۜ] */
    public static C5441e vip(C0560e c0560e) {
        ?? obj = new Object();
        obj.f32777e = c0560e;
        C17263e c17263e = new C17263e(obj);
        EnumC3320e enumC3320e = EnumC3320e.f7489e;
        c0560e.vip(enumC3320e, c17263e);
        return AbstractC2017e.ad(obj, C10427e.class, C4132e.vip, enumC3320e);
    }

    public final C5441e ad(C3223e c3223e) {
        String sb;
        String simpleName = C1540e.class.getSimpleName();
        C3355e c3355e = this.ad;
        C2580e license = c3355e.license(c3223e, simpleName);
        String tapsense = AbstractC17305e.tapsense();
        if (tapsense == null) {
            sb = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = tapsense.length() + 1;
            int identityHashCode = System.identityHashCode(C1540e.class);
            StringBuilder sb2 = new StringBuilder(length + String.valueOf(identityHashCode).length());
            sb2.append(tapsense);
            sb2.append("|");
            sb2.append(identityHashCode);
            sb = sb2.toString();
        }
        C15024e c15024e = new C15024e(18, c3355e, sb, license);
        C10914e c10914e = C10914e.f21617e;
        C18100e purchase = C10312e.purchase();
        purchase.f35495e = license;
        purchase.f35492e = c15024e;
        purchase.f35489e = c10914e;
        purchase.f35494e = new C1032e[]{AbstractC17540e.appmetrica};
        purchase.f35490e = false;
        return vip(c3355e.vip(purchase.vip()));
    }
}
