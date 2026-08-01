package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17960e {
    public static final Pattern billing = Pattern.compile("[^\\p{Alnum}]");
    public static final String yandex = Pattern.quote("/");
    public final C15400e ad;
    public final C8331e appmetrica;
    public final InterfaceC4648e license;
    public final String metrica;
    public C2632e purchase;
    public final Context vip;

    public C17960e(Context context, String str, InterfaceC4648e interfaceC4648e, C8331e c8331e) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.vip = context;
        this.metrica = str;
        this.license = interfaceC4648e;
        this.appmetrica = c8331e;
        this.ad = new C15400e();
    }

    public final synchronized String ad(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = billing.matcher(UUID.randomUUID().toString()).replaceAll(BuildConfig.FLAVOR).toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final String license() {
        String str;
        C15400e c15400e = this.ad;
        Context context = this.vip;
        synchronized (c15400e) {
            try {
                if (c15400e.f30389e == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = BuildConfig.FLAVOR;
                    }
                    c15400e.f30389e = installerPackageName;
                }
                str = BuildConfig.FLAVOR.equals(c15400e.f30389e) ? null : c15400e.f30389e;
            } finally {
            }
        }
        return str;
    }

    public final synchronized C2632e metrica() {
        String str;
        C2632e c2632e = this.purchase;
        if (c2632e != null && (c2632e.vip != null || !this.appmetrica.ad())) {
            return this.purchase;
        }
        C5438e c5438e = C5438e.f11671e;
        c5438e.signatures("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.vip.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        c5438e.signatures("Cached Firebase Installation ID: " + string);
        if (this.appmetrica.ad()) {
            C3046e vip = vip(false);
            c5438e.signatures("Fetched Firebase Installation ID: " + vip.ad);
            if (vip.ad == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                vip = new C3046e(str, null);
            }
            if (Objects.equals(vip.ad, string)) {
                this.purchase = new C2632e(sharedPreferences.getString("crashlytics.installation.id", null), vip.ad, vip.vip);
            } else {
                this.purchase = new C2632e(ad(sharedPreferences, vip.ad), vip.ad, vip.vip);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.purchase = new C2632e(ad(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.purchase = new C2632e(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        c5438e.signatures("Install IDs: " + this.purchase);
        return this.purchase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(1:5))|6|(7:18|19|9|10|11|12|13)|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C3046e vip(boolean r7) {
        /*
            r6 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = r0.isCurrentThread()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            if (r0 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Must not be called on a main thread, was called on "
            r0.<init>(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L32
            android.util.Log.d(r2, r0, r1)
        L32:
            r3 = 10000(0x2710, double:4.9407E-320)
            eؗؕۦ r0 = r6.license
            if (r7 == 0) goto L50
            r7 = r0
            eٔۙؗ r7 = (defpackage.C14935e) r7     // Catch: java.lang.Exception -> L4a
            eؑۛٞ r7 = r7.appmetrica()     // Catch: java.lang.Exception -> L4a
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L4a
            java.lang.Object r7 = defpackage.AbstractC1749e.vip(r7, r3, r5)     // Catch: java.lang.Exception -> L4a
            eٌٔۛ r7 = (defpackage.C14606e) r7     // Catch: java.lang.Exception -> L4a
            java.lang.String r7 = r7.ad     // Catch: java.lang.Exception -> L4a
            goto L51
        L4a:
            r7 = move-exception
            java.lang.String r5 = "Error getting Firebase authentication token."
            android.util.Log.w(r2, r5, r7)
        L50:
            r7 = r1
        L51:
            eٔۙؗ r0 = (defpackage.C14935e) r0     // Catch: java.lang.Exception -> L61
            eؑۛٞ r0 = r0.license()     // Catch: java.lang.Exception -> L61
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L61
            java.lang.Object r0 = defpackage.AbstractC1749e.vip(r0, r3, r5)     // Catch: java.lang.Exception -> L61
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L61
            r1 = r0
            goto L67
        L61:
            r0 = move-exception
            java.lang.String r3 = "Error getting Firebase installation id."
            android.util.Log.w(r2, r3, r0)
        L67:
            eًؕؐ r0 = new eًؕؐ
            r0.<init>(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17960e.vip(boolean):eًؕؐ");
    }
}
