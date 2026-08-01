package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6936e implements InterfaceC17023e {

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public static volatile C6936e f14197e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C1195e f14198e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C8320e f14199e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C10693e f14200e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C7936e f14201e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C7269e f14202e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C18388e f14203e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C6339e f14204e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public C10640e f14205e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public final long f14206e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f14207e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C13185e f14208e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C16391e f14209e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final String f14210e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C2285e f14212e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public volatile boolean f14213e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public int f14214e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C17647e f14215e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public volatile Boolean f14216e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public final long f14218e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public int f14219e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C12003e f14220e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C10476e f14221e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public Boolean f14222e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C5240e f14223e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public long f14224e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f14225e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C6915e f14226e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C13879e f14227e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C12724e f14228e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public boolean f14217e = false;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public final AtomicInteger f14211e = new AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ec, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f2, code lost:
    
        if (r3.compareAndSet(null, r1) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f9, code lost:
    
        if (r3.get() == null) goto L85;
     */
    /* JADX WARN: Type inference failed for: r1v13, types: [eَۘٓ, package] */
    /* JADX WARN: Type inference failed for: r4v3, types: [eًِۡ, eٖٞ۠] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6936e(defpackage.C7044e r11) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6936e.<init>(eٍؚۤ):void");
    }

    public static C6936e amazon(Context context, C8660e c8660e, Long l, Long l2) {
        Bundle bundle;
        if (c8660e != null) {
            Bundle bundle2 = c8660e.f17494e;
            c8660e = new C8660e(c8660e.f17495e, c8660e.f17493e, c8660e.f17492e, bundle2, null);
        }
        AbstractC9528e.startapp(context);
        AbstractC9528e.startapp(context.getApplicationContext());
        if (f14197e == null) {
            synchronized (C6936e.class) {
                try {
                    if (f14197e == null) {
                        f14197e = new C6936e(new C7044e(context, c8660e, l, l2));
                    }
                } finally {
                }
            }
        } else if (c8660e != null && (bundle = c8660e.f17494e) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC9528e.startapp(f14197e);
            f14197e.f14216e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC9528e.startapp(f14197e);
        return f14197e;
    }

    public static final void appmetrica(AbstractC9748e abstractC9748e) {
        if (abstractC9748e == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void billing(AbstractC3947e abstractC3947e) {
        if (abstractC3947e == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC3947e.f8802e) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC3947e.getClass())));
        }
    }

    public static final void purchase(Cpackage cpackage) {
        if (cpackage == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void yandex(AbstractC7884e abstractC7884e) {
        if (abstractC7884e == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC7884e.f15961e) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC7884e.getClass())));
        }
    }

    public final boolean ad() {
        return vip() == 0;
    }

    public final C13185e adcel() {
        billing(this.f14208e);
        return this.f14208e;
    }

    public final C12003e advert() {
        yandex(this.f14220e);
        return this.f14220e;
    }

    @Override // defpackage.InterfaceC17023e
    /* renamed from: eؚؓؓ, reason: contains not printable characters */
    public final Context mo2258e() {
        return this.f14225e;
    }

    @Override // defpackage.InterfaceC17023e
    /* renamed from: eٕؓؗ, reason: contains not printable characters */
    public final C17647e mo2259e() {
        return this.f14215e;
    }

    @Override // defpackage.InterfaceC17023e
    /* renamed from: eْۥؑ, reason: contains not printable characters */
    public final C7936e mo2260e() {
        return this.f14201e;
    }

    @Override // defpackage.InterfaceC17023e
    /* renamed from: eٍٕ, reason: contains not printable characters */
    public final C13879e mo2261e() {
        C13879e c13879e = this.f14227e;
        yandex(c13879e);
        return c13879e;
    }

    @Override // defpackage.InterfaceC17023e
    /* renamed from: eٖۤٝ, reason: contains not printable characters */
    public final C6915e mo2262e() {
        C6915e c6915e = this.f14226e;
        yandex(c6915e);
        return c6915e;
    }

    public final void license(int i, Throwable th, byte[] bArr) {
        C13879e c13879e;
        C13879e c13879e2;
        int i2 = i;
        C13879e c13879e3 = this.f14227e;
        if (i2 != 200 && i2 != 204) {
            if (i2 == 304) {
                i2 = 304;
            }
            yandex(c13879e3);
            c13879e3.f27495e.metrica(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
        }
        if (th == null) {
            C1195e c1195e = this.f14198e;
            purchase(c1195e);
            c1195e.f3803e.vip(true);
            if (bArr == null || bArr.length == 0) {
                yandex(c13879e3);
                c13879e3.f27496e.ad("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", BuildConfig.FLAVOR);
                if (TextUtils.isEmpty(optString)) {
                    yandex(c13879e3);
                    c13879e3.f27496e.ad("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", BuildConfig.FLAVOR);
                String optString3 = jSONObject.optString("gbraid", BuildConfig.FLAVOR);
                String optString4 = jSONObject.optString("gad_source", BuildConfig.FLAVOR);
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                C5240e c5240e = this.f14223e;
                purchase(c5240e);
                C6936e c6936e = (C6936e) c5240e.f36443e;
                if (TextUtils.isEmpty(optString)) {
                    c13879e2 = c13879e3;
                } else {
                    Context context = c6936e.f14225e;
                    c13879e2 = c13879e3;
                    try {
                        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(optString3)) {
                                bundle.putString("gbraid", optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                bundle.putString("gad_source", optString4);
                            }
                            bundle.putString("gclid", optString2);
                            bundle.putString("_cis", "ddp");
                            this.f14199e.m2406e("auto", "_cmp", bundle);
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    Context context2 = c6936e.f14225e;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    } else {
                                        context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            } catch (RuntimeException e) {
                                C13879e c13879e4 = ((C6936e) c5240e.f36443e).f14227e;
                                yandex(c13879e4);
                                c13879e4.f27502e.vip(e, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        c13879e = c13879e2;
                        yandex(c13879e);
                        c13879e.f27502e.vip(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                yandex(c13879e2);
                c13879e = c13879e2;
                try {
                    c13879e.f27495e.license("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                } catch (JSONException e3) {
                    e = e3;
                    yandex(c13879e);
                    c13879e.f27502e.vip(e, "Failed to parse the Deferred Deep Link response. exception");
                    return;
                }
            } catch (JSONException e4) {
                e = e4;
                c13879e = c13879e3;
            }
        }
        yandex(c13879e3);
        c13879e3.f27495e.metrica(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.f14224e) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean metrica() {
        /*
            r6 = this;
            boolean r0 = r6.f14217e
            if (r0 == 0) goto L96
            eؚؕٓ r0 = r6.f14226e
            yandex(r0)
            r0.mo2250e()
            java.lang.Boolean r0 = r6.f14222e
            eٍ٘ؖ r1 = r6.f14215e
            if (r0 == 0) goto L34
            long r2 = r6.f14224e
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8f
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f14224e
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L8f
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f14224e = r0
            eۣؗۦ r0 = r6.f14223e
            purchase(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.m1800e(r1)
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.m1800e(r1)
            if (r1 == 0) goto L75
            android.content.Context r1 = r6.f14225e
            eّۘٚ r3 = defpackage.C5277e.ad(r1)
            boolean r3 = r3.license()
            r4 = 1
            if (r3 != 0) goto L74
            eَۘٓ r3 = r6.f14221e
            boolean r3 = r3.m2827e()
            if (r3 != 0) goto L74
            boolean r3 = defpackage.C5240e.m1777e(r1)
            if (r3 == 0) goto L75
            boolean r1 = defpackage.C5240e.m1786e(r1)
            if (r1 == 0) goto L75
        L74:
            r2 = r4
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r6.f14222e = r1
            if (r2 == 0) goto L8f
            eّۙۤ r1 = r6.smaato()
            java.lang.String r1 = r1.m3392e()
            boolean r0 = r0.m1807e(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f14222e = r0
        L8f:
            java.lang.Boolean r0 = r6.f14222e
            boolean r0 = r0.booleanValue()
            return r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6936e.metrica():boolean");
    }

    public final C10640e mopub() {
        billing(this.f14205e);
        return this.f14205e;
    }

    public final C12724e smaato() {
        billing(this.f14228e);
        return this.f14228e;
    }

    public final C7269e startapp() {
        return this.f14202e;
    }

    public final int vip() {
        C6915e c6915e = this.f14226e;
        yandex(c6915e);
        c6915e.mo2250e();
        C10476e c10476e = this.f14221e;
        if (c10476e.m2818e()) {
            return 1;
        }
        yandex(c6915e);
        c6915e.mo2250e();
        if (!this.f14213e) {
            return 8;
        }
        C1195e c1195e = this.f14198e;
        purchase(c1195e);
        c1195e.mo2250e();
        Boolean valueOf = c1195e.m490e().contains("measurement_enabled") ? Boolean.valueOf(c1195e.m490e().getBoolean("measurement_enabled", true)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue() ? 0 : 3;
        }
        C7936e c7936e = ((C6936e) c10476e.f36443e).f14201e;
        Boolean m2820e = c10476e.m2820e("firebase_analytics_collection_enabled");
        return m2820e != null ? m2820e.booleanValue() ? 0 : 4 : (this.f14216e == null || this.f14216e.booleanValue()) ? 0 : 7;
    }
}
