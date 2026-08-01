package defpackage;

import android.content.Context;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۥ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6043e {
    public static final C7259e vip;
    public final Context ad;

    static {
        C9237e vip2 = C7259e.vip(C6043e.class);
        vip2.ad(C8625e.vip(C2316e.class));
        vip2.ad(C8625e.vip(Context.class));
        vip2.billing = new C6607e(23);
        vip = vip2.vip();
    }

    public C6043e(Context context) {
        this.ad = context;
    }

    public final synchronized String ad() {
        String string = this.ad.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.ad.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
