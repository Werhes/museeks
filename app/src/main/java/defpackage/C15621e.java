package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٞؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15621e {
    public final String ad;
    public final String appmetrica;
    public final String billing;
    public final String license;
    public final ArrayList metrica;
    public final String purchase;
    public final String vip;
    public final C13391e yandex;

    public C15621e(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, C13391e c13391e) {
        this.ad = str;
        this.vip = str2;
        this.metrica = arrayList;
        this.license = str3;
        this.appmetrica = str4;
        this.purchase = str5;
        this.billing = str6;
        this.yandex = c13391e;
    }

    public static C15621e ad(Context context, C17960e c17960e, String str, String str2, ArrayList arrayList, C13391e c13391e) {
        String packageName = context.getPackageName();
        String license = c17960e.license();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String l = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C15621e(str, str2, arrayList, license, packageName, l, str3, c13391e);
    }
}
