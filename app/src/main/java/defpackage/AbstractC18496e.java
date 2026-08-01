package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۦَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18496e {
    public static final C1663e ad;
    public static final C8383e metrica;
    public static volatile String vip;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, eؔٔٓ] */
    static {
        C7170e c7170e = C7170e.f14659e;
        int i = AbstractC12614e.f25334e;
        C15071e c15071e = new C15071e(c7170e, true, C4477e.f9679e);
        ?? obj = new Object();
        obj.vip = c15071e;
        metrica = new C8383e(obj);
        ad = new C1663e("__phenotype_server_token", obj, BuildConfig.FLAVOR);
        vip = null;
    }

    public static String ad() {
        return (String) ad.get();
    }
}
