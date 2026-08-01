package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۨؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8374e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f17137e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17138e;

    public C8374e() {
        this.f17138e = 1;
        this.f17137e = new ArrayDeque(10);
    }

    public /* synthetic */ C8374e(int i, Object obj) {
        this.f17138e = i;
        this.f17137e = obj;
    }

    private final void adcel(Activity activity) {
    }

    private final void advert(Activity activity) {
    }

    private final void appmetrica(Activity activity, Bundle bundle) {
    }

    private final void billing(Activity activity) {
    }

    private final void license(Activity activity) {
    }

    private final void metrica(Activity activity) {
    }

    private final void mopub(Activity activity) {
    }

    private final void purchase(Activity activity, Bundle bundle) {
    }

    private final void startapp(Activity activity) {
    }

    private final void vip(Activity activity) {
    }

    private final void yandex(Activity activity) {
    }

    public void Signature(C4360e c4360e) {
        C6936e c6936e = (C6936e) ((C8320e) this.f17137e).f36443e;
        C2285e c2285e = c6936e.f14212e;
        C6936e.billing(c2285e);
        C6936e c6936e2 = (C6936e) c2285e.f36443e;
        c6936e2.f14215e.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C6915e c6915e = c6936e2.f14226e;
        C6936e.yandex(c6915e);
        c6915e.m2254e(new RunnableC14675e(c2285e, elapsedRealtime, 0));
        C10693e c10693e = c6936e.f14200e;
        C6936e.billing(c10693e);
        Object obj = c10693e.f21061e;
        synchronized (obj) {
            try {
                c10693e.f21062e = true;
                if (!Objects.equals(c4360e, c10693e.f21064e)) {
                    synchronized (obj) {
                        c10693e.f21064e = c4360e;
                        c10693e.f21067e = false;
                        C6936e c6936e3 = (C6936e) c10693e.f36443e;
                        if (c6936e3.f14221e.m2815e()) {
                            c10693e.f21063e = null;
                            C6915e c6915e2 = c6936e3.f14226e;
                            C6936e.yandex(c6915e2);
                            c6915e2.m2254e(new RunnableC16804e(c10693e, 1));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6936e c6936e4 = (C6936e) c10693e.f36443e;
        if (!c6936e4.f14221e.m2815e()) {
            c10693e.f21066e = c10693e.f21063e;
            C6915e c6915e3 = c6936e4.f14226e;
            C6936e.yandex(c6915e3);
            c6915e3.m2254e(new RunnableC16804e(c10693e, 0));
            return;
        }
        c10693e.m2910e(c4360e.f9491e, c10693e.m2912e(c4360e), false);
        C6339e c6339e = ((C6936e) c10693e.f36443e).f14204e;
        C6936e.appmetrica(c6339e);
        C6936e c6936e5 = (C6936e) c6339e.f36443e;
        c6936e5.f14215e.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C6915e c6915e4 = c6936e5.f14226e;
        C6936e.yandex(c6915e4);
        c6915e4.m2254e(new RunnableC4140e(c6339e, elapsedRealtime2));
    }

    public void ad(Intent intent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f17137e;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    InterfaceC5632e interfaceC5632e = (InterfaceC5632e) C14679e.metrica().vip(InterfaceC5632e.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (interfaceC5632e != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        C8638e c8638e = (C8638e) interfaceC5632e;
                        if (!AbstractC10945e.metrica.contains("fcm")) {
                            C17768e c17768e = c8638e.ad.ad;
                            c17768e.ad(new C1257e(c17768e, string2, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        c8638e.ad("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            AbstractC0111e.license("_no", bundle);
        }
    }

    public void admob(C4360e c4360e, Bundle bundle) {
        C13288e c13288e;
        C10693e c10693e = ((C6936e) ((C8320e) this.f17137e).f36443e).f14200e;
        C6936e.billing(c10693e);
        if (!((C6936e) c10693e.f36443e).f14221e.m2815e() || bundle == null || (c13288e = (C13288e) c10693e.f21068e.get(Integer.valueOf(c4360e.f9492e))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c13288e.metrica);
        bundle2.putString("name", c13288e.ad);
        bundle2.putString("referrer_name", c13288e.vip);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public void amazon(C4360e c4360e) {
        C10693e c10693e = ((C6936e) ((C8320e) this.f17137e).f36443e).f14200e;
        C6936e.billing(c10693e);
        synchronized (c10693e.f21061e) {
            try {
                if (Objects.equals(c10693e.f21064e, c4360e)) {
                    c10693e.f21064e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C6936e) c10693e.f36443e).f14221e.m2815e()) {
            c10693e.f21068e.remove(Integer.valueOf(c4360e.f9492e));
        }
    }

    public void loadAd(C4360e c4360e) {
        C6936e c6936e = (C6936e) ((C8320e) this.f17137e).f36443e;
        C10693e c10693e = c6936e.f14200e;
        C6936e.billing(c10693e);
        synchronized (c10693e.f21061e) {
            c10693e.f21062e = false;
            c10693e.f21067e = true;
        }
        C6936e c6936e2 = (C6936e) c10693e.f36443e;
        c6936e2.f14215e.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (c6936e2.f14221e.m2815e()) {
            C13288e m2912e = c10693e.m2912e(c4360e);
            c10693e.f21060e = c10693e.f21066e;
            c10693e.f21066e = null;
            C6915e c6915e = c6936e2.f14226e;
            C6936e.yandex(c6915e);
            c6915e.m2254e(new RunnableC15684e(c10693e, m2912e, elapsedRealtime));
        } else {
            c10693e.f21066e = null;
            C6915e c6915e2 = c6936e2.f14226e;
            C6936e.yandex(c6915e2);
            c6915e2.m2254e(new RunnableC4140e(c10693e, elapsedRealtime));
        }
        C2285e c2285e = c6936e.f14212e;
        C6936e.billing(c2285e);
        C6936e c6936e3 = (C6936e) c2285e.f36443e;
        c6936e3.f14215e.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C6915e c6915e3 = c6936e3.f14226e;
        C6936e.yandex(c6915e3);
        c6915e3.m2254e(new RunnableC14675e(c2285e, elapsedRealtime2, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f17138e) {
            case 0:
                AbstractC5004e abstractC5004e = (AbstractC5004e) this.f17137e;
                if (Objects.equals(activity, abstractC5004e.f10582e)) {
                    abstractC5004e.f10582e = activity;
                    abstractC5004e.mopub();
                    abstractC5004e.metrica();
                    return;
                }
                return;
            case 1:
                Intent intent = activity.getIntent();
                if (intent == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT <= 25) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC2623e(this, intent, 21));
                    return;
                } else {
                    ad(intent);
                    return;
                }
            case 2:
                ((C17768e) this.f17137e).ad(new C7078e(this, bundle, activity));
                return;
            default:
                smaato(C4360e.billing(activity), bundle);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f17138e) {
            case 0:
                AbstractC5004e abstractC5004e = (AbstractC5004e) this.f17137e;
                if (Objects.equals(activity, abstractC5004e.f10582e)) {
                    abstractC5004e.amazon();
                    if (abstractC5004e.f10587e) {
                        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((C17768e) this.f17137e).ad(new C17655e(this, activity, 4));
                return;
            default:
                amazon(C4360e.billing(activity));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f17138e) {
            case 0:
                AbstractC5004e abstractC5004e = (AbstractC5004e) this.f17137e;
                if (Objects.equals(activity, abstractC5004e.f10582e)) {
                    abstractC5004e.admob();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((C17768e) this.f17137e).ad(new C17655e(this, activity, 2));
                return;
            default:
                loadAd(C4360e.billing(activity));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f17138e) {
            case 0:
                AbstractC5004e abstractC5004e = (AbstractC5004e) this.f17137e;
                if (Objects.equals(activity, abstractC5004e.f10582e)) {
                    abstractC5004e.subscription();
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((C17768e) this.f17137e).ad(new C17655e(this, activity, 1));
                return;
            default:
                Signature(C4360e.billing(activity));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f17138e) {
            case 0:
            case 1:
                return;
            case 2:
                BinderC7948e binderC7948e = new BinderC7948e();
                ((C17768e) this.f17137e).ad(new C7078e(this, activity, binderC7948e));
                Bundle remoteconfig = binderC7948e.remoteconfig(50L);
                if (remoteconfig != null) {
                    bundle.putAll(remoteconfig);
                    return;
                }
                return;
            default:
                admob(C4360e.billing(activity), bundle);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f17138e) {
            case 0:
            case 1:
                return;
            case 2:
                ((C17768e) this.f17137e).ad(new C17655e(this, activity, 0));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f17138e) {
            case 0:
            case 1:
                return;
            case 2:
                ((C17768e) this.f17137e).ad(new C17655e(this, activity, 3));
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[Catch: all -> 0x0028, RuntimeException -> 0x002b, TryCatch #1 {RuntimeException -> 0x002b, blocks: (B:3:0x0005, B:5:0x0019, B:7:0x001f, B:12:0x0048, B:15:0x004f, B:19:0x0061, B:23:0x006e, B:31:0x002d, B:33:0x0034, B:35:0x0040), top: B:2:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void smaato(defpackage.C4360e r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f17137e
            r1 = r0
            eًْۤ r1 = (defpackage.C8320e) r1
            java.lang.Object r0 = r1.f36443e     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            eؚؖٞ r0 = (defpackage.C6936e) r0     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            eٍؙٓ r2 = r0.f14227e     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            defpackage.C6936e.yandex(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            eِٔۙ r2 = r2.f27497e     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "onActivityCreated"
            r2.ad(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            android.content.Intent r2 = r9.f9490e     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L7d
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 == 0) goto L2d
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r4 != 0) goto L26
            goto L2d
        L26:
            r5 = r3
            goto L46
        L28:
            r0 = move-exception
            goto L9f
        L2b:
            r0 = move-exception
            goto L8a
        L2d:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r4 = 0
            if (r3 == 0) goto L45
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r5 != 0) goto L45
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto L26
        L45:
            r5 = r4
        L46:
            if (r5 == 0) goto L7d
            boolean r3 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L4f
            goto L7d
        L4f:
            eۣؗۦ r3 = r0.f14223e     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            defpackage.C6936e.purchase(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            boolean r2 = defpackage.C5240e.m1791e(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L5e
            java.lang.String r2 = "gs"
        L5c:
            r6 = r2
            goto L61
        L5e:
            java.lang.String r2 = "auto"
            goto L5c
        L61:
            java.lang.String r2 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r10 != 0) goto L6c
            r2 = 1
        L6a:
            r4 = r2
            goto L6e
        L6c:
            r2 = 0
            goto L6a
        L6e:
            eؚؕٓ r0 = r0.f14226e     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            defpackage.C6936e.yandex(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            eٓؒؖ r2 = new eٓؒؖ     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r0.m2254e(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto L9a
        L7d:
            java.lang.Object r0 = r1.f36443e
            eؚؖٞ r0 = (defpackage.C6936e) r0
        L81:
            eَؘۨ r0 = r0.f14200e
            defpackage.C6936e.billing(r0)
            r0.m2911e(r9, r10)
            return
        L8a:
            java.lang.Object r2 = r1.f36443e     // Catch: java.lang.Throwable -> L28
            eؚؖٞ r2 = (defpackage.C6936e) r2     // Catch: java.lang.Throwable -> L28
            eٍؙٓ r2 = r2.f14227e     // Catch: java.lang.Throwable -> L28
            defpackage.C6936e.yandex(r2)     // Catch: java.lang.Throwable -> L28
            eِٔۙ r2 = r2.f27502e     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.vip(r0, r3)     // Catch: java.lang.Throwable -> L28
        L9a:
            java.lang.Object r0 = r1.f36443e
            eؚؖٞ r0 = (defpackage.C6936e) r0
            goto L81
        L9f:
            java.lang.Object r1 = r1.f36443e
            eؚؖٞ r1 = (defpackage.C6936e) r1
            eَؘۨ r1 = r1.f14200e
            defpackage.C6936e.billing(r1)
            r1.m2911e(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8374e.smaato(eؖۚؗ, android.os.Bundle):void");
    }
}
