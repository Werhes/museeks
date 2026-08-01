package defpackage;

import android.util.Log;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۥؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8331e implements InterfaceC8596e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f17053e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f17054e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f17055e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f17056e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f17057e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f17058e;

    public C8331e(int i, float f, AbstractC16904e abstractC16904e) {
        this.f17054e = abstractC16904e;
        this.f17056e = new C16330e(i);
        this.f17053e = new C2616e(f);
        this.f17058e = new C0705e(i, 30, 100);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8331e(defpackage.C14679e r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.f17055e = r0
            eٌَۜ r0 = new eٌَۜ
            r0.<init>()
            r6.f17056e = r0
            r0 = 0
            r6.f17057e = r0
            eٌَۜ r1 = new eٌَۜ
            r1.<init>()
            r6.f17053e = r1
            r7.ad()
            android.content.Context r1 = r7.ad
            r6.f17054e = r7
            java.lang.String r7 = "com.google.firebase.crashlytics"
            android.content.SharedPreferences r7 = r1.getSharedPreferences(r7, r0)
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3d
            r6.f17057e = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L3e
        L3d:
            r7 = r5
        L3e:
            if (r7 != 0) goto L84
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r1 == 0) goto L71
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            boolean r2 = r2.containsKey(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            boolean r7 = r1.getBoolean(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            goto L72
        L69:
            r7 = move-exception
            java.lang.String r1 = "Could not read data collection permission from manifest"
            java.lang.String r2 = "FirebaseCrashlytics"
            android.util.Log.e(r2, r1, r7)
        L71:
            r7 = r5
        L72:
            if (r7 != 0) goto L78
            r6.f17057e = r0
            r7 = r5
            goto L84
        L78:
            r6.f17057e = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L84:
            r6.f17058e = r7
            java.lang.Object r7 = r6.f17055e
            monitor-enter(r7)
            boolean r0 = r6.ad()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L99
            java.lang.Object r0 = r6.f17056e     // Catch: java.lang.Throwable -> L97
            eٌَۜ r0 = (defpackage.C8988e) r0     // Catch: java.lang.Throwable -> L97
            r0.license(r5)     // Catch: java.lang.Throwable -> L97
            goto L99
        L97:
            r0 = move-exception
            goto L9b
        L99:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L97
            return
        L9b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L97
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8331e.<init>(eّٜٔ):void");
    }

    public C8331e(C16680e c16680e, InterfaceC2367e interfaceC2367e, C7735e c7735e) {
        Objects.requireNonNull(c16680e);
        this.f17058e = c16680e;
        this.f17056e = null;
        this.f17053e = null;
        this.f17057e = false;
        this.f17054e = interfaceC2367e;
        this.f17055e = c7735e;
    }

    @Override // defpackage.InterfaceC8596e
    public void Signature(C14758e c14758e) {
        ((C16680e) this.f17058e).f32734e.post(new RunnableC17144e(this, c14758e, false, 24));
    }

    public synchronized boolean ad() {
        boolean z;
        Boolean bool = (Boolean) this.f17058e;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            try {
                z = ((C14679e) this.f17054e).yandex();
            } catch (IllegalStateException unused) {
                z = false;
            }
        }
        vip(z);
        return z;
    }

    public void metrica(C14758e c14758e) {
        C1623e c1623e = (C1623e) ((C16680e) this.f17058e).f32737e.get((C7735e) this.f17055e);
        if (c1623e != null) {
            c1623e.smaato(c14758e);
        }
    }

    public void vip(boolean z) {
        String subscription = AbstractC17861e.subscription("Crashlytics automatic data collection ", z ? "ENABLED" : "DISABLED", " by ", ((Boolean) this.f17058e) == null ? "global Firebase setting" : this.f17057e ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", subscription, null);
        }
    }
}
