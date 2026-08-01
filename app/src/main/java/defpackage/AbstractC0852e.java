package defpackage;

import android.os.Build;
import android.provider.Settings;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0852e {
    public static final C18382e ad = AbstractC7890e.ad(new C10310e(2));

    public static final String ad() {
        if (Build.VERSION.SDK_INT < 25) {
            return Build.MODEL;
        }
        VKXApplication.Companion companion = VKXApplication.f36531e;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        String string = Settings.Global.getString(vKXApplication.getContentResolver(), "device_name");
        String str = Build.MODEL;
        if (AbstractC7890e.billing(string, str)) {
            return str;
        }
        return string + " (" + str + ')';
    }
}
