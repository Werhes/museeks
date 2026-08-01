package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC9258e implements Callable {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ Object vip;

    public /* synthetic */ CallableC9258e(Object obj, Object obj2, int i) {
        this.ad = i;
        this.vip = obj;
        this.metrica = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        ComponentName startService;
        switch (this.ad) {
            case 0:
                C16903e c16903e = (C16903e) this.vip;
                byte[] bArr = (byte[]) this.metrica;
                boolean z = c16903e.f33122e;
                Bitmap license = AbstractC16048e.license(bArr.length, c16903e.f33120e, bArr);
                return z ? AbstractC16048e.tapsense(license) : license;
            case 1:
                C16903e c16903e2 = (C16903e) this.vip;
                Uri uri = (Uri) this.metrica;
                InterfaceC9660e remoteconfig = c16903e2.f33121e.remoteconfig();
                int i2 = c16903e2.f33120e;
                boolean z2 = c16903e2.f33122e;
                try {
                    C2435e c2435e = new C2435e(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0, null);
                    C1300e c1300e = (C1300e) remoteconfig;
                    c1300e.metrica(c2435e);
                    byte[] bArr2 = new byte[1024];
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 != -1) {
                        if (i4 == bArr2.length) {
                            bArr2 = Arrays.copyOf(bArr2, bArr2.length * 2);
                        }
                        i3 = c1300e.read(bArr2, i4, bArr2.length - i4);
                        if (i3 != -1) {
                            i4 += i3;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr2, i4);
                    Bitmap license2 = AbstractC16048e.license(copyOf.length, i2, copyOf);
                    if (z2) {
                        license2 = AbstractC16048e.tapsense(license2);
                    }
                    c1300e.close();
                    return license2;
                } catch (Throwable th) {
                    ((C1300e) remoteconfig).close();
                    throw th;
                }
            default:
                Context context = (Context) this.vip;
                Intent intent = (Intent) this.metrica;
                C11106e m2998while = C11106e.m2998while();
                m2998while.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) m2998while.f22006e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (m2998while) {
                    try {
                        str = (String) m2998while.f22008e;
                        if (str == null) {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        m2998while.f22008e = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        m2998while.f22008e = serviceInfo.name;
                                    }
                                    str = (String) m2998while.f22008e;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                                str = null;
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (m2998while.m3010implements(context)) {
                        startService = AbstractC2940e.license(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
        }
    }
}
