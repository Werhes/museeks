package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8044e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f16343e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f16344e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f16345e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f16346e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16347e;

    public /* synthetic */ RunnableC8044e(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f16347e = i;
        this.f16344e = obj;
        this.f16346e = obj2;
        this.f16343e = obj3;
        this.f16345e = z;
    }

    public /* synthetic */ RunnableC8044e(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.f16347e = i;
        this.f16344e = obj;
        this.f16345e = z;
        this.f16346e = obj2;
        this.f16343e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16347e) {
            case 0:
                Context context = (Context) this.f16344e;
                boolean z = this.f16345e;
                C17148e c17148e = (C17148e) this.f16346e;
                C5350e c5350e = (C5350e) this.f16343e;
                C14845e m3854import = C14845e.m3854import(context);
                if (m3854import == null) {
                    AbstractC2803e.smaato("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    C4174e c4174e = c17148e.f33635e;
                    c4174e.getClass();
                    c4174e.f9208e.ad(m3854import);
                }
                LogSessionId m3863static = m3854import.m3863static();
                synchronized (c5350e) {
                    C7407e c7407e = c5350e.vip;
                    c7407e.getClass();
                    c7407e.license(m3863static);
                }
                return;
            case 1:
                ((C11165e) this.f16344e).appmetrica((C4748e) this.f16346e, (C15816e) this.f16343e, this.f16345e);
                return;
            case 2:
                C6584e c6584e = (C6584e) this.f16344e;
                boolean z2 = this.f16345e;
                C18424e c18424e = (C18424e) this.f16346e;
                Runnable runnable = (Runnable) this.f16343e;
                if (z2) {
                    c6584e.purchase(c18424e, new C17687e(new C11858e("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY)));
                }
                runnable.run();
                c6584e.billing.license.premium(c18424e);
                return;
            case 3:
                C13343e c13343e = (C13343e) this.f16344e;
                C6122e c6122e = (C6122e) this.f16346e;
                EnumC14627e enumC14627e = (EnumC14627e) this.f16343e;
                boolean z3 = this.f16345e;
                C6122e c6122e2 = c13343e.amazon;
                if (c6122e2 != null && !c6122e2.yandex.f19184e.isDone()) {
                    c13343e.amazon.metrica();
                }
                c13343e.applovin = z3;
                c13343e.amazon = c6122e;
                c13343e.loadAd = enumC14627e;
                c13343e.startapp(c6122e, enumC14627e, true);
                return;
            default:
                C14461e c14461e = (C14461e) this.f16344e;
                AbstractC7796e abstractC7796e = (AbstractC7796e) this.f16346e;
                C13787e c13787e = (C13787e) this.f16343e;
                boolean z4 = this.f16345e;
                c14461e.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                ((C14848e) c14461e.f28587e).license(abstractC7796e, c13787e.ad, z4);
                return;
        }
    }
}
