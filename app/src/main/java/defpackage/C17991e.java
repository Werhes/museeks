package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C17991e {
    public static final int ad;
    public static final C17991e vip;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eِ٘ۚ] */
    static {
        int i = AbstractC18410e.appmetrica;
        ad = 12451000;
        vip = new Object();
    }

    public static int ad(Context context) {
        int i = AbstractC18410e.appmetrica;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static void license(Context context) {
        int i = AbstractC18410e.appmetrica;
        C17991e c17991e = vip;
        int metrica = c17991e.metrica(context, 11925000);
        if (metrica != 0) {
            Intent vip2 = c17991e.vip(metrica, context, "e");
            StringBuilder sb = new StringBuilder(String.valueOf(metrica).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(metrica);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (vip2 != null) {
                throw new Exception("Google Play Services not available");
            }
            throw new Exception();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:2|3)|4|(4:8|2d|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(3:43|(1:45)(1:47)|46)|48|(13:50|(1:52)(1:125)|53|(4:117|118|(1:120)(1:123)|121)(1:55)|56|57|(1:59)(1:115)|60|61|(1:63)(2:(2:86|(1:88))|(4:94|(1:96)(1:113)|(1:98)|(1:100)(4:101|(2:107|108)|103|(1:105)(1:106)))(1:93))|64|(2:(5:67|68|69|70|(2:71|(2:73|(1:75)(1:76))(2:77|78)))|81)(0)|(1:83)(1:84)))|126|(0)(0)|53|(0)(0)|56|57|(0)(0)|60|61|(0)(0)|64|(0)(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0205, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0256 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0257 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int metrica(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17991e.metrica(android.content.Context, int):int");
    }

    public Intent vip(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && AbstractC12684e.ad(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(ad);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C5277e.ad(context).metrica(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }
}
