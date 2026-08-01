package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10053e {
    public final AbstractC13345e ad;
    public final C10312e vip;

    public C10053e(Context context) {
        C14172e c14172e = VKXApplication.f36533e;
        c14172e.getClass();
        this.ad = c14172e.vip(AudioTrack.class, AbstractC7644e.ad, null);
        this.vip = new C10312e(context, 17);
    }

    public static void ad(int i, int i2, String str, Function1 function1) {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC5336e.purchase(vKXApplication, new C12416e(C5170e.f11077e, 2), 0, new C14771e(null, i, i2, str, function1), 2);
    }

    public static void vip(int i, int i2, String str, Function1 function1) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('_');
        sb.append(i2);
        sb.append((str == null || str.length() == 0) ? AbstractC17861e.Signature("_", str) : BuildConfig.FLAVOR);
        AbstractC18406e.purchase(new C13029e(new String[]{sb.toString()}), new C2046e(5, function1));
    }
}
