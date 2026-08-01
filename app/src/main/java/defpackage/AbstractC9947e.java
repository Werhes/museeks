package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۨۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9947e {
    public static final C2892e ad = new C2892e(-1281002169, false, new C14234e(29));
    public static final C2892e vip = new C2892e(-611165370, false, new C13060e(0));
    public static final C2892e metrica = new C2892e(-976257904, false, new C13060e(1));

    public static void ad(Cstrictfp cstrictfp) {
        int i = cstrictfp.f36463e;
        if (i == 128) {
        } else {
            throw new IllegalStateException(AbstractC17861e.admob("Expected ", "CONTEXT", " tag but found ", i != 64 ? i != 128 ? i != 192 ? "UNIVERSAL" : "PRIVATE" : "CONTEXT" : "APPLICATION"));
        }
    }

    public static boolean metrica(Context context) {
        ApplicationInfo applicationInfo;
        Intent putExtra = new Intent().addFlags(268435456).setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                putExtra.setPackage(applicationInfo.packageName);
                context.startActivity(putExtra);
                return true;
            }
        }
        return false;
    }

    public static String vip(int i, int i2) {
        return AbstractC1634e.smaato(i != 64 ? i != 128 ? i != 192 ? "[UNIVERSAL " : "[PRIVATE " : "[CONTEXT " : "[APPLICATION ", i2, "]");
    }
}
