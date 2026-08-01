package defpackage;

import android.os.Build;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16055e {
    public static boolean ad() {
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        return vKXApplication.getPackageManager().canRequestPackageInstalls();
    }

    public static C10675e vip() {
        String str = C10675e.f21023e;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        return C10215e.purchase(vKXApplication.getDir("ota", 0)).appmetrica("vkx_ota_payload.apk");
    }
}
