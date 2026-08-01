package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُُؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3288e {
    public static void ad(Context context, Catalog2Button catalog2Button) {
        C5363e c5363e = C0308e.appmetrica;
        String pro = AbstractC18271e.metrica().license.pro();
        Catalog2ButtonAction catalog2ButtonAction = catalog2Button.ad;
        if ((catalog2ButtonAction instanceof C16512e) || (catalog2ButtonAction instanceof C10164e)) {
            String str = catalog2Button.vip;
            if (str == null) {
                return;
            }
            AbstractC7237e.metrica(context, new C0963e(str, new C5625e(str, pro, 27)));
            return;
        }
        if (catalog2ButtonAction instanceof Catalog2ButtonAction.OpenUrl) {
            C5658e.metrica(C5658e.ad, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction).ad), false, 6);
        } else if (catalog2ButtonAction instanceof Catalog2ButtonAction.SynthCustomAction) {
            ((Catalog2ButtonAction.SynthCustomAction) catalog2ButtonAction).license.invoke(context);
        }
    }

    public static void vip(Context context, String str, String str2) {
        if ((!AbstractC7890e.billing(str, "group") && !AbstractC7890e.billing(str, "user")) || AbstractC6507e.pro(str2, "https://vk.com/audios", false) || AbstractC6507e.pro(str2, "https://vk.com/podcasts", false) || AbstractC6507e.pro(str2, "https://vk.ru/audios", false) || AbstractC6507e.pro(str2, "https://vk.ru/podcasts", false)) {
            C5658e.metrica(C5658e.ad, Uri.parse(str2), false, 6);
        } else {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
        }
    }
}
