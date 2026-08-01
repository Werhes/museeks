package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٙؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3446e {
    public final Context ad;
    public final C5363e appmetrica;
    public final Object license;
    public final LinkedHashMap metrica = new LinkedHashMap();
    public final PackageManager vip;

    public C3446e(Context context, PackageManager packageManager) {
        this.ad = context;
        this.vip = packageManager;
        Boolean bool = Boolean.TRUE;
        C0126e c0126e = new C0126e(new C6571e("1c:a8:dc:c0:be:d3:cb:d8:72:d2:cb:79:12:00:c0:29:2c:a9:97:57:68:a8:2d:67:6b:8b:42:4f:b6:5b:52:95", bool));
        Boolean bool2 = Boolean.FALSE;
        this.license = AbstractC10064e.purchase(new C6571e("com.google.android.projection.gearhead", new C15114e(new C6571e("Android Auto", new C0126e[]{c0126e, new C0126e(new C6571e("19:75:b2:f1:71:77:bc:89:a5:df:f3:1f:9e:64:a6:ca:e2:81:a5:3d:c1:d1:d5:9b:1d:14:7f:e1:c8:2a:fa:00", bool2)), new C0126e(new C6571e("70:81:1a:3e:ac:fd:2e:83:e1:8d:a9:bf:ed:e5:2d:f1:6c:e9:1f:2e:69:a4:4d:21:f1:8a:b6:69:91:13:07:71", bool2)), new C0126e(new C6571e("fd:b0:0c:43:db:de:8b:51:cb:31:2a:a8:1d:3b:5f:a1:77:13:ad:b9:4b:28:f5:98:d7:7f:8e:b8:9d:ac:ee:df", bool))}))), new C6571e("com.google.android.wearable.app", new C15114e(new C6571e("WearOS", new C0126e[]{new C0126e(new C6571e("69:d0:72:16:9a:2c:6b:2f:5a:cc:59:0c:e4:33:a1:1a:c3:df:55:1a:df:ee:5d:5f:63:c0:83:b7:22:76:2e:19", bool2)), new C0126e(new C6571e("85:cd:59:73:54:1b:e6:f4:77:d8:47:a0:bc:c6:aa:25:27:68:4b:81:9c:d5:96:85:29:66:4c:b0:71:57:b6:fe", bool))}))), new C6571e("com.google.android.autosimulator", new C15114e(new C6571e("Android Auto Simulator", new C0126e[]{new C0126e(new C6571e("19:75:b2:f1:71:77:bc:89:a5:df:f3:1f:9e:64:a6:ca:e2:81:a5:3d:c1:d1:d5:9b:1d:14:7f:e1:c8:2a:fa:00", bool))}))), new C6571e("com.google.android.googlequicksearchbox", new C15114e(new C6571e("Google", new C0126e[]{new C0126e(new C6571e("19:75:b2:f1:71:77:bc:89:a5:df:f3:1f:9e:64:a6:ca:e2:81:a5:3d:c1:d1:d5:9b:1d:14:7f:e1:c8:2a:fa:00", bool2)), new C0126e(new C6571e("f0:fd:6c:5b:41:0f:25:cb:25:c3:b5:33:46:c8:97:2f:ae:30:f8:ee:74:11:df:91:04:80:ad:6b:2d:60:db:83", bool))}))), new C6571e("com.google.android.carassistant", new C15114e(new C6571e("Google Assistant on Android Automotive OS", new C0126e[]{new C0126e(new C6571e("17:E2:81:11:06:2F:97:A8:60:79:7A:83:70:5B:F8:2C:7C:C0:29:35:56:6D:46:22:BC:4E:CF:EE:1B:EB:F8:15", bool2)), new C0126e(new C6571e("74:B6:FB:F7:10:E8:D9:0D:44:D3:40:12:58:89:B4:23:06:A6:2C:43:79:D0:E5:A6:62:20:E3:A6:8A:BF:90:E2", bool))}))));
        this.appmetrica = new C5363e(new C5671e(1, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [eْۨٝ] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final C6571e ad(String str) {
        Object obj;
        Signature signature;
        byte[] byteArray;
        SigningInfo signingInfo;
        Signature[] signingCertificateHistory;
        Signature signature2;
        Integer subs;
        PackageInfo packageInfo = this.vip.getPackageInfo(str, (Build.VERSION.SDK_INT >= 28 ? 134217728 : 64) | 4096);
        String[] strArr = packageInfo.requestedPermissions;
        String str2 = null;
        if (strArr != null) {
            obj = new ArrayList();
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                String str3 = strArr[i];
                int i3 = i2 + 1;
                int[] iArr = packageInfo.requestedPermissionsFlags;
                if ((((iArr == null || (subs = AbstractC1660e.subs(iArr, i2)) == null) ? 0 : subs.intValue()) & 2) == 0) {
                    str3 = null;
                }
                if (str3 != null) {
                    obj.add(str3);
                }
                i++;
                i2 = i3;
            }
        } else {
            obj = C13664e.f27089e;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo = packageInfo.signingInfo;
            if (signingInfo != null && (signingCertificateHistory = signingInfo.getSigningCertificateHistory()) != null && (signature2 = (Signature) AbstractC1660e.ads(signingCertificateHistory)) != null) {
                byteArray = signature2.toByteArray();
            }
            byteArray = null;
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null && (signature = (Signature) AbstractC1660e.ads(signatureArr)) != null) {
                byteArray = signature.toByteArray();
            }
            byteArray = null;
        }
        if (byteArray != null) {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
            messageDigest.update(byteArray);
            str2 = AbstractC1660e.m671interface(messageDigest.digest(), ":", new C7983e(17), 30);
        }
        return new C6571e(obj, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010e, code lost:
    
        if (r3 != null) goto L41;
     */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vip(defpackage.C18424e r11) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3446e.vip(eُۡ):boolean");
    }
}
