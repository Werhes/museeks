package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۢ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7543e {
    public static final String metrica;
    public static final String vip;
    public final InterfaceC18036e ad;

    static {
        AbstractC1418e.ad("media3.session");
        String str = AbstractC9413e.ad;
        vip = Integer.toString(0, 36);
        metrica = Integer.toString(1, 36);
    }

    public C7543e(int i, int i2, int i3, String str, InterfaceC3001e interfaceC3001e, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        IBinder asBinder = interfaceC3001e.asBinder();
        bundle.getClass();
        this.ad = new C12325e(i, 0, i2, i3, str, BuildConfig.FLAVOR, null, asBinder, bundle, token);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7543e(android.content.Context r13, android.content.ComponentName r14) {
        /*
            r12 = this;
            r12.<init>()
            java.lang.String r0 = "context must not be null"
            defpackage.AbstractC2301e.amazon(r13, r0)
            android.content.pm.PackageManager r13 = r13.getPackageManager()
            java.lang.String r0 = r14.getPackageName()
            r1 = 0
            android.content.pm.ApplicationInfo r0 = r13.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            int r0 = r0.uid     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
        L17:
            r2 = r0
            goto L1b
        L19:
            r0 = -1
            goto L17
        L1b:
            java.lang.String r0 = "androidx.media3.session.MediaLibraryService"
            boolean r0 = ad(r13, r0, r14)
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == 0) goto L28
            r13 = 2
        L26:
            r3 = r13
            goto L3b
        L28:
            java.lang.String r0 = "androidx.media3.session.MediaSessionService"
            boolean r0 = ad(r13, r0, r14)
            if (r0 == 0) goto L32
            r13 = 1
            goto L26
        L32:
            java.lang.String r0 = "android.media.browse.MediaBrowserService"
            boolean r13 = ad(r13, r0, r14)
            if (r13 == 0) goto L5f
            r3 = r1
        L3b:
            if (r3 == r1) goto L56
            eَؚّ r1 = new eَؚّ
            java.lang.String r6 = r14.getPackageName()
            java.lang.String r7 = r14.getClassName()
            android.os.Bundle r10 = android.os.Bundle.EMPTY
            r11 = 0
            r4 = 1000000(0xf4240, float:1.401298E-39)
            r5 = 0
            r9 = 0
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.ad = r1
            goto L5e
        L56:
            r8 = r14
            eؗۖؕ r13 = new eؗۖؕ
            r13.<init>(r8, r2)
            r12.ad = r13
        L5e:
            return
        L5f:
            r8 = r14
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to resolve SessionToken for "
            r14.<init>(r0)
            r14.append(r8)
            java.lang.String r0 = ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name."
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7543e.<init>(android.content.Context, android.content.ComponentName):void");
    }

    public static boolean ad(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (queryIntentServices != null) {
            for (int i = 0; i < queryIntentServices.size(); i++) {
                ResolveInfo resolveInfo = queryIntentServices.get(i);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7543e) {
            return this.ad.equals(((C7543e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return this.ad.toString();
    }

    public final Bundle vip() {
        Bundle bundle = new Bundle();
        InterfaceC18036e interfaceC18036e = this.ad;
        boolean z = interfaceC18036e instanceof C12325e;
        String str = vip;
        if (z) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(metrica, interfaceC18036e.mo1736class());
        return bundle;
    }
}
