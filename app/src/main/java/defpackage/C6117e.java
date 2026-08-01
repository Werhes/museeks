package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6117e extends AbstractC3421e {
    public static final String mopub = C5401e.crashlytics("WorkContinuationImpl");
    public C13391e adcel;
    public final int appmetrica;
    public final ArrayList billing;
    public final String license;
    public final C15899e metrica;
    public final List purchase;
    public boolean startapp;
    public final ArrayList yandex = new ArrayList();

    public C6117e(C15899e c15899e, String str, int i, List list) {
        this.metrica = c15899e;
        this.license = str;
        this.appmetrica = i;
        this.purchase = list;
        this.billing = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            String uuid = ((C13654e) list.get(i2)).ad.toString();
            this.billing.add(uuid);
            this.yandex.add(uuid);
        }
    }

    public static HashSet advert(C6117e c6117e) {
        HashSet hashSet = new HashSet();
        c6117e.getClass();
        return hashSet;
    }

    public final C13391e mopub() {
        if (this.startapp) {
            C5401e.loadAd().firebase(mopub, AbstractC5087e.m1746extends("Already enqueued work ids (", TextUtils.join(", ", this.billing), ")"), new Throwable[0]);
        } else {
            RunnableC5684e runnableC5684e = new RunnableC5684e(this);
            this.metrica.purchase.license(runnableC5684e);
            this.adcel = runnableC5684e.f12072e;
        }
        return this.adcel;
    }
}
