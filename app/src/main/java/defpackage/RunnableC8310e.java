package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۣٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC8310e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C8320e f16986e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f16987e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16988e;

    public /* synthetic */ RunnableC8310e(C8320e c8320e, Bundle bundle, int i) {
        this.f16988e = i;
        this.f16987e = bundle;
        this.f16986e = c8320e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16988e) {
            case 0:
                C8320e c8320e = this.f16986e;
                c8320e.mo2250e();
                c8320e.m1411e();
                Bundle bundle = this.f16987e;
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                AbstractC9528e.purchase(string);
                AbstractC9528e.purchase(string2);
                AbstractC9528e.startapp(bundle.get("value"));
                C6936e c6936e = (C6936e) c8320e.f36443e;
                if (!c6936e.ad()) {
                    C13879e c13879e = c6936e.f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27497e.ad("Conditional property not set since app measurement is disabled");
                    return;
                }
                C9097e c9097e = new C9097e(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                try {
                    C5240e c5240e = c6936e.f14223e;
                    C6936e.purchase(c5240e);
                    bundle.getString("app_id");
                    C15541e m1803e = c5240e.m1803e(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                    C6936e.purchase(c5240e);
                    bundle.getString("app_id");
                    C15541e m1803e2 = c5240e.m1803e(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                    bundle.getString("app_id");
                    c6936e.mopub().m2855e(new C15148e(bundle.getString("app_id"), string2, c9097e, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), m1803e2, bundle.getLong("trigger_timeout"), m1803e, bundle.getLong("time_to_live"), c5240e.m1803e(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 1:
                C8320e c8320e2 = this.f16986e;
                c8320e2.mo2250e();
                c8320e2.m1411e();
                Bundle bundle2 = this.f16987e;
                String string3 = bundle2.getString("name");
                AbstractC9528e.purchase(string3);
                C6936e c6936e2 = (C6936e) c8320e2.f36443e;
                if (!c6936e2.ad()) {
                    C13879e c13879e2 = c6936e2.f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27497e.ad("Conditional property not cleared since app measurement is disabled");
                    return;
                } else {
                    C9097e c9097e2 = new C9097e(0L, null, string3, BuildConfig.FLAVOR);
                    try {
                        C5240e c5240e2 = c6936e2.f14223e;
                        C6936e.purchase(c5240e2);
                        bundle2.getString("app_id");
                        c6936e2.mopub().m2855e(new C15148e(bundle2.getString("app_id"), BuildConfig.FLAVOR, c9097e2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), c5240e2.m1803e(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), BuildConfig.FLAVOR, bundle2.getLong("creation_timestamp"), 0L, true)));
                        return;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
            default:
                C8320e c8320e3 = this.f16986e;
                C13951e c13951e = c8320e3.f17014e;
                C6936e c6936e3 = (C6936e) c8320e3.f36443e;
                Bundle bundle3 = this.f16987e;
                if (!bundle3.isEmpty()) {
                    C1195e c1195e = c6936e3.f14198e;
                    C5240e c5240e3 = c6936e3.f14223e;
                    C10476e c10476e = c6936e3.f14221e;
                    C13879e c13879e3 = c6936e3.f14227e;
                    C6936e.purchase(c1195e);
                    Bundle bundle4 = new Bundle(c1195e.f3810e.m3009finally());
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            C6936e.purchase(c5240e3);
                            if (C5240e.m1778e(obj)) {
                                C5240e.m1792e(c13951e, null, 27, null, null, 0);
                            }
                            C6936e.yandex(c13879e3);
                            c13879e3.f27494e.metrica(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (C5240e.m1785e(str)) {
                            C6936e.yandex(c13879e3);
                            c13879e3.f27494e.vip(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle4.remove(str);
                        } else {
                            C6936e.purchase(c5240e3);
                            c10476e.getClass();
                            if (c5240e3.m1832e("param", str, 500, obj)) {
                                c5240e3.m1838e(bundle4, str, obj);
                            }
                        }
                    }
                    C6936e.purchase(c5240e3);
                    C5240e c5240e4 = ((C6936e) c10476e.f36443e).f14223e;
                    C6936e.purchase(c5240e4);
                    int i = c5240e4.m1797e(201500000) ? 100 : 25;
                    if (bundle4.size() > i) {
                        Iterator it = new TreeSet(bundle4.keySet()).iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i2++;
                            if (i2 > i) {
                                bundle4.remove(str2);
                            }
                        }
                        C6936e.purchase(c5240e3);
                        C5240e.m1792e(c13951e, null, 26, null, null, 0);
                        C6936e.yandex(c13879e3);
                        c13879e3.f27494e.ad("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle3 = bundle4;
                }
                C1195e c1195e2 = c6936e3.f14198e;
                C6936e.purchase(c1195e2);
                c1195e2.f3810e.m3004const(bundle3);
                c6936e3.mopub().m2847e(bundle3);
                return;
        }
    }
}
