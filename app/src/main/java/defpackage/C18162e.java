package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.Executor;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۧۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18162e implements InterfaceC15973e, InterfaceC13586e {
    public final C6491e ad;
    public final Executor appmetrica;
    public final Set license;
    public final InterfaceC7970e metrica;
    public final Context vip;

    public C18162e(Context context, String str, Set set, InterfaceC7970e interfaceC7970e, Executor executor) {
        this.ad = new C6491e(new C12412e(context, str, 1));
        this.license = set;
        this.appmetrica = executor;
        this.metrica = interfaceC7970e;
        this.vip = context;
    }

    public final synchronized int ad() {
        long currentTimeMillis = System.currentTimeMillis();
        C7551e c7551e = (C7551e) this.ad.get();
        if (!c7551e.startapp(currentTimeMillis)) {
            return 1;
        }
        c7551e.billing();
        return 3;
    }

    public final void metrica() {
        if (this.license.size() <= 0) {
            AbstractC1749e.appmetrica(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? AbstractC12026e.admob(this.vip) : true) {
            AbstractC1749e.metrica(this.appmetrica, new CallableC3962e(this, 1));
        } else {
            AbstractC1749e.appmetrica(null);
        }
    }

    public final C0560e vip() {
        if (Build.VERSION.SDK_INT >= 24 ? AbstractC12026e.admob(this.vip) : true) {
            return AbstractC1749e.metrica(this.appmetrica, new CallableC3962e(this, 0));
        }
        return AbstractC1749e.appmetrica(BuildConfig.FLAVOR);
    }
}
