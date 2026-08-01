package defpackage;

import android.content.ComponentName;
import android.content.Context;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1535e {
    public static boolean ad(VKXApplication vKXApplication, EnumC6916e enumC6916e) {
        int componentEnabledSetting = vKXApplication.getPackageManager().getComponentEnabledSetting(vip(vKXApplication, enumC6916e));
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && enumC6916e == EnumC6916e.f14174e);
    }

    public static ComponentName vip(Context context, EnumC6916e enumC6916e) {
        return new ComponentName(context.getPackageName(), "ua.itaysonlab.vkx.VkxIcon" + enumC6916e.f14179e);
    }
}
