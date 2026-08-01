package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11196e {
    public static final C11196e ad = new Object();
    public static final C16089e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eُۖ۟, java.lang.Object] */
    static {
        C10610e c10610e = new C10610e();
        c10610e.startapp(C2772e.class, C5457e.ad);
        c10610e.startapp(C9716e.class, C10979e.ad);
        c10610e.startapp(C12796e.class, C7286e.ad);
        c10610e.startapp(C10426e.class, C7612e.ad);
        c10610e.startapp(C13666e.class, C5947e.ad);
        c10610e.startapp(C2039e.class, C12741e.ad);
        c10610e.f20918e = true;
        vip = new C16089e(c10610e);
    }

    public static C10426e ad(C14679e c14679e) {
        c14679e.ad();
        Context context = c14679e.ad;
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        c14679e.ad();
        String str = c14679e.metrica.vip;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = valueOf;
        }
        String str5 = Build.MANUFACTURER;
        c14679e.ad();
        C2039e advert = AbstractC14380e.advert(context);
        c14679e.ad();
        return new C10426e(str, new C13666e(packageName, str4, valueOf, advert, AbstractC14380e.purchase(context)));
    }
}
