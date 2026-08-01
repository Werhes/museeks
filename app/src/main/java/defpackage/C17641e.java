package defpackage;

import android.content.Intent;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17641e {
    public final AppActivity ad;

    public /* synthetic */ C17641e(AppActivity appActivity) {
        this.ad = appActivity;
    }

    public static void vip(Intent intent) {
        if (intent == null || !AbstractC7890e.billing(intent.getAction(), "android.intent.action.VIEW") || intent.getData() == null) {
            return;
        }
        C5658e c5658e = C5658e.ad;
        if (AbstractC7890e.billing(intent.getAction(), "android.intent.action.VIEW") && !AbstractC6507e.pro(String.valueOf(intent.getData()), "vkx://", false)) {
            C5658e.metrica(c5658e, intent.getData(), intent.getBooleanExtra("vkx_autoplay", false), 4);
        }
    }

    public Object ad(String str, AbstractC10731e abstractC10731e) {
        C15420e c15420e = AbstractC6731e.ad;
        return AbstractC5336e.advert(AbstractC1497e.ad, new C14869e(str, this.ad, (InterfaceC5083e) null, 6), abstractC10731e);
    }
}
