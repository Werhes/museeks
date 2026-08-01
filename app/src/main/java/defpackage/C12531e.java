package defpackage;

import android.content.Context;
import android.os.PowerManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12531e extends AbstractC17646e {
    @Override // defpackage.AbstractC17646e
    public final Object ad(Context context, InterfaceC5083e interfaceC5083e) {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        PowerManager powerManager = (PowerManager) vKXApplication.getSystemService(PowerManager.class);
        if (powerManager != null) {
            VKXApplication vKXApplication2 = VKXApplication.f36528e;
            if (!powerManager.isIgnoringBatteryOptimizations((vKXApplication2 != null ? vKXApplication2 : null).getPackageName())) {
                return new C5648e(new C13126e(R.string.qf_power, R.string.qf_power_description, R.drawable.ic_power_socket_outline_28, new C10629e(R.drawable.ic_flash_outline_28, R.string.qf_power_action, new C14874e(2, this, C12531e.class, "resolve", "resolve(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 10))));
            }
        }
        return C6752e.ad;
    }
}
