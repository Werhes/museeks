package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5594e {
    public static final C2271e ad = new C17519e(0);

    public static synchronized Uri ad() {
        synchronized (AbstractC5594e.class) {
            C2271e c2271e = ad;
            Uri uri = (Uri) c2271e.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            c2271e.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }

    public static String vip(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(str));
        }
        String packageName = context.getPackageName();
        return AbstractC8647e.ads(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
    }
}
