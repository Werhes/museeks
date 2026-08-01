package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16736e {
    public static final String ad = C5401e.crashlytics("PackageManagerHelper");

    public static void ad(Context context, Class cls, boolean z) {
        String str = ad;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C5401e.loadAd().smaato(str, cls.getName() + " " + (z ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e) {
            C5401e.loadAd().smaato(str, AbstractC4653e.isPro(cls.getName(), " could not be ", z ? "enabled" : "disabled"), e);
        }
    }
}
