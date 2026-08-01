package defpackage;

import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3842e {
    public static final C12949e vip = C12949e.vip(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String ad;

    public C3842e(Context context, C6043e c6043e) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        AbstractC10849e.ad(context);
        synchronized (C15802e.class) {
            if (C15802e.f31126e == null) {
                C15802e.f31126e = new C15802e(0);
            }
        }
        this.ad = "common";
        C6594e m2212final = C6594e.m2212final();
        CallableC8878e callableC8878e = new CallableC8878e(6, this);
        m2212final.getClass();
        C6594e.m2211e(callableC8878e);
        C6594e m2212final2 = C6594e.m2212final();
        Objects.requireNonNull(c6043e);
        CallableC16081e callableC16081e = new CallableC16081e(c6043e, 1);
        m2212final2.getClass();
        C6594e.m2211e(callableC16081e);
        C12949e c12949e = vip;
        if (c12949e.containsKey("common")) {
            C0781e.license(context, (String) c12949e.get("common"), false);
        }
    }
}
