package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class CallableC4347e implements Callable {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ Object vip;

    public /* synthetic */ CallableC4347e(BinderC14884e binderC14884e, Object obj, int i) {
        this.ad = i;
        this.vip = obj;
        this.metrica = binderC14884e;
    }

    public CallableC4347e(C15398e c15398e, C8019e c8019e) {
        this.ad = 3;
        this.vip = c8019e;
        Objects.requireNonNull(c15398e);
        this.metrica = c15398e;
    }

    public /* synthetic */ CallableC4347e(Object obj, Object obj2, int i) {
        this.ad = i;
        this.vip = obj;
        this.metrica = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C8110e c8110e;
        int i = this.ad;
        Object obj = this.metrica;
        Object obj2 = this.vip;
        switch (i) {
            case 0:
                AbstractC16828e abstractC16828e = (AbstractC16828e) obj2;
                C15444e c15444e = (C15444e) obj;
                HashMap hashMap = C8110e.f16464e;
                C14914e.subscription();
                int i2 = AbstractC2975e.ad;
                C14914e.subscription();
                if (Boolean.parseBoolean(BuildConfig.FLAVOR)) {
                    HashMap hashMap2 = C8110e.f16464e;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new C8110e("detectorTaskWithResource#run"));
                    }
                    c8110e = (C8110e) hashMap2.get("detectorTaskWithResource#run");
                } else {
                    c8110e = C0565e.f2740e;
                }
                c8110e.ad();
                try {
                    List vip = abstractC16828e.f32959e.vip(c15444e);
                    c8110e.close();
                    return vip;
                } catch (Throwable th) {
                    try {
                        c8110e.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            case 1:
                BinderC14884e binderC14884e = (BinderC14884e) obj;
                binderC14884e.metrica.m3946default();
                C1248e c1248e = binderC14884e.metrica.f30353e;
                C15398e.m3939break(c1248e);
                return c1248e.m507e((String) obj2);
            case 2:
                BinderC14884e binderC14884e2 = (BinderC14884e) obj;
                binderC14884e2.metrica.m3946default();
                return new C12221e(binderC14884e2.metrica.m3945const(((C8019e) obj2).f16300e));
            case 3:
                C8019e c8019e = (C8019e) obj2;
                String str = c8019e.f16300e;
                AbstractC9528e.startapp(str);
                C15398e c15398e = (C15398e) obj;
                C5291e ad = c15398e.ad(str);
                EnumC9102e enumC9102e = EnumC9102e.ANALYTICS_STORAGE;
                if (ad.startapp(enumC9102e) && C5291e.metrica(100, c8019e.f16295e).startapp(enumC9102e)) {
                    return c15398e.m3962strictfp(c8019e).m435class();
                }
                c15398e.mo2261e().f27497e.ad("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                C11493e c11493e = (C11493e) obj2;
                C10228e c10228e = (C10228e) obj;
                C13150e c13150e = c11493e.ad;
                C17659e c17659e = new C17659e();
                try {
                    C6843e c6843e = (C6843e) c13150e.purchase.get();
                    Uri uri = c11493e.vip;
                    C7302e c7302e = new C7302e(9, c10228e);
                    c7302e.f14915e = new C17659e[]{c17659e};
                } catch (IOException | RuntimeException e) {
                    AbstractC17808e.Signature(Level.WARNING, c13150e.ad(), e, "Failed to update snapshot for %s flags may be stale.", c11493e.metrica);
                }
                return null;
        }
    }
}
