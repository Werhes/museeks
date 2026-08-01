package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؓۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4612e extends AbstractC6950e implements InterfaceC9591e {
    public C8988e Signature;
    public final AtomicLong admob;
    public final CastDevice ads;
    public HandlerC9134e advert;
    public boolean amazon;
    public C8023e applovin;

    /* renamed from: class, reason: not valid java name */
    public int f9941class;
    public final C18017e crashlytics;
    public final List firebase;
    public int inmobi;
    public int isPro;
    public boolean isVip;
    public C8988e loadAd;
    public final BinderC12679e mopub;
    public final HashMap premium;
    public C17005e pro;
    public final Object remoteconfig;
    public String signatures;
    public boolean smaato;
    public final HashMap subs;
    public final Object subscription;
    public double tapsense;

    /* renamed from: interface, reason: not valid java name */
    public static final C18482e f9940interface = new C18482e("CastClient", null);

    /* renamed from: goto, reason: not valid java name */
    public static final C13391e f9939goto = new C13391e("Cast.API_CXLESS", new C17150e(5), AbstractC1082e.ad);

    public C4612e(Context context, C9826e c9826e) {
        super(context, f9939goto, c9826e, C16258e.metrica);
        this.mopub = new BinderC12679e(this);
        this.subscription = new Object();
        this.remoteconfig = new Object();
        this.firebase = DesugarCollections.synchronizedList(new ArrayList());
        this.crashlytics = c9826e.metrica;
        this.ads = c9826e.vip;
        this.premium = new HashMap();
        this.subs = new HashMap();
        this.admob = new AtomicLong(0L);
        this.f9941class = 1;
        mopub();
    }

    public final void adcel(int i) {
        synchronized (this.subscription) {
            try {
                C8988e c8988e = this.loadAd;
                if (c8988e != null) {
                    c8988e.ad(AbstractC9600e.vip(new Status(i, null, null, null)));
                }
                this.loadAd = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void billing(int i, long j) {
        C8988e c8988e;
        HashMap hashMap = this.premium;
        synchronized (hashMap) {
            Long valueOf = Long.valueOf(j);
            c8988e = (C8988e) hashMap.get(valueOf);
            hashMap.remove(valueOf);
        }
        if (c8988e != null) {
            if (i == 0) {
                c8988e.vip(null);
            } else {
                c8988e.ad(AbstractC9600e.vip(new Status(i, null, null, null)));
            }
        }
    }

    public final void mopub() {
        CastDevice castDevice = this.ads;
        C5401e c5401e = castDevice.f673e;
        if (c5401e.m1901class(2048) || !c5401e.m1901class(4) || c5401e.m1901class(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.f657e);
    }

    public final void purchase(int i) {
        synchronized (this.remoteconfig) {
            try {
                C8988e c8988e = this.Signature;
                if (c8988e == null) {
                    return;
                }
                if (i == 0) {
                    c8988e.vip(new Status(0, null, null, null));
                } else {
                    c8988e.ad(AbstractC9600e.vip(new Status(i, null, null, null)));
                }
                this.Signature = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void startapp() {
        f9940interface.vip("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap hashMap = this.subs;
        synchronized (hashMap) {
            hashMap.clear();
        }
    }

    public final Handler yandex() {
        if (this.advert == null) {
            this.advert = new HandlerC9134e(this.billing, 6);
        }
        return this.advert;
    }
}
