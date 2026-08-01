package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC8922e extends AbstractBinderC16179e {
    public static final C18482e advert = new C18482e("MediaRouterProxy", null);
    public boolean adcel;
    public final C10085e appmetrica;
    public final HashMap billing;
    public boolean mopub;
    public final C12487e purchase;
    public final boolean startapp;
    public final C9149e yandex;

    public BinderC8922e(Context context, C10085e c10085e, C12487e c12487e, C4480e c4480e) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 1);
        this.billing = new HashMap();
        this.appmetrica = c10085e;
        this.purchase = c12487e;
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        advert.vip("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.yandex = new C9149e(c12487e);
        new Intent(context, (Class<?>) AbstractC17033e.class).setPackage(context.getPackageName());
        this.startapp = !context.getPackageManager().queryBroadcastReceivers(r5, 0).isEmpty();
        this.adcel = true;
        c4480e.yandex(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).ad(new C0047e(this));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eٍؚؒ, java.lang.Object] */
    /* renamed from: eٜؑ٘, reason: contains not printable characters */
    public final void m2505e(C12894e c12894e) {
        C0909e c0909e;
        this.appmetrica.getClass();
        C10085e.vip();
        C14090e metrica = C10085e.metrica();
        metrica.crashlytics = c12894e;
        if (c12894e != null) {
            ?? obj = new Object();
            obj.f3321e = metrica;
            obj.f3323e = c12894e;
            c0909e = obj;
        } else {
            c0909e = null;
        }
        C0909e c0909e2 = metrica.subs;
        if (c0909e2 != null) {
            c0909e2.applovin();
        }
        metrica.subs = c0909e;
        if (c0909e != null) {
            metrica.amazon();
        }
    }

    /* renamed from: eؚؓؓ, reason: contains not printable characters */
    public final void m2506e(C0056e c0056e, int i) {
        Set set = (Set) this.billing.get(c0056e);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.appmetrica.ad(c0056e, (AbstractC17065e) it.next(), i);
        }
    }

    /* renamed from: eٔۚٙ, reason: contains not printable characters */
    public final void m2507e(C0056e c0056e) {
        Set set = (Set) this.billing.get(c0056e);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.appmetrica.yandex((AbstractC17065e) it.next());
        }
    }

    /* renamed from: eٖۤٝ, reason: contains not printable characters */
    public final boolean m2508e() {
        C12487e c12487e;
        return this.startapp && this.adcel && (c12487e = this.purchase) != null && c12487e.f25003e;
    }
}
