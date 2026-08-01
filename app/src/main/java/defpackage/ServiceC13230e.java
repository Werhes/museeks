package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceC13230e extends Service {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C6584e f26249e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C6584e f26251e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C13765e f26253e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C11106e f26254e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C5389e f26256e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C11467e f26257e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final HandlerC17797e f26258e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C17684e f26259e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12916e f26252e = new C12916e(16, this);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C17684e f26250e = new C17684e(this, "android.media.session.MediaController", -1, -1, null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ArrayList f26255e = new ArrayList();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C2271e f26248e = new C17519e(0);

    /* JADX WARN: Type inference failed for: r0v2, types: [eٕ٘ؔ, eؓۨۖ] */
    public ServiceC13230e(C6584e c6584e) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        HandlerC17797e handlerC17797e = new HandlerC17797e(myLooper);
        handlerC17797e.vip = this;
        this.f26258e = handlerC17797e;
        this.f26256e = C5389e.isVip(c6584e.purchase);
        this.f26251e = c6584e;
        this.f26254e = new C11106e(c6584e);
        this.f26249e = c6584e;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [eؚؑ۟, java.lang.Object, eؑۖؒ] */
    public static C0485e ad(ServiceC13230e serviceC13230e, C8802e c8802e) {
        Object obj;
        AbstractC2301e.amazon(c8802e, "LibraryResult must not be null");
        ?? obj2 = new Object();
        if (c8802e.ad != 0 || (obj = c8802e.metrica) == null) {
            obj2.smaato(null);
            return obj2;
        }
        AbstractC17475e abstractC17475e = (AbstractC17475e) obj;
        if (abstractC17475e.isEmpty()) {
            obj2.smaato(new ArrayList());
            return obj2;
        }
        ArrayList arrayList = new ArrayList();
        RunnableC7410e runnableC7410e = new RunnableC7410e((Object) obj2, arrayList, 9);
        EnumC3320e enumC3320e = EnumC3320e.f7489e;
        obj2.ad(runnableC7410e, enumC3320e);
        RunnableC6795e runnableC6795e = new RunnableC6795e(serviceC13230e, new AtomicInteger(0), abstractC17475e, arrayList, (C0485e) obj2);
        for (int i = 0; i < abstractC17475e.size(); i++) {
            byte[] bArr = ((C1962e) abstractC17475e.get(i)).license.mopub;
            if (bArr == null) {
                arrayList.add(null);
                runnableC6795e.run();
            } else {
                ListenableFuture smaato = serviceC13230e.f26249e.smaato.smaato(bArr);
                arrayList.add(smaato);
                smaato.ad(runnableC6795e, enumC3320e);
            }
        }
        return obj2;
    }

    public final void appmetrica(String str, AbstractC5735e abstractC5735e) {
        C18424e vip = vip();
        if (vip == null) {
            abstractC5735e.purchase(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            abstractC5735e.ad();
            AbstractC9413e.m2565strictfp(this.f26249e.advert, new RunnableC4904e(this, vip, abstractC5735e, str));
        } else {
            AbstractC2803e.smaato("MLSLegacyStub", "Ignoring empty itemId from " + vip);
            abstractC5735e.purchase(null);
        }
    }

    public final void billing(String str, C17684e c17684e, Bundle bundle, Bundle bundle2) {
        C5854e c5854e = new C5854e(this, str, c17684e, str, bundle, bundle2);
        this.f26259e = c17684e;
        if (bundle == null) {
            license(str, c5854e, null);
        } else {
            license(str, c5854e, bundle);
        }
        this.f26259e = null;
        if (!c5854e.vip()) {
            throw new IllegalStateException(AbstractC8647e.ads(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), c17684e.ad, " id=", str));
        }
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final void license(String str, AbstractC5735e abstractC5735e, Bundle bundle) {
        C18424e vip = vip();
        if (vip == null) {
            abstractC5735e.purchase(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            abstractC5735e.ad();
            AbstractC9413e.m2565strictfp(this.f26249e.advert, new RunnableC14110e(this, vip, abstractC5735e, bundle, str));
        } else {
            AbstractC2803e.smaato("MLSLegacyStub", "onLoadChildren(): Ignoring empty parentId from " + vip);
            abstractC5735e.purchase(null);
        }
    }

    public final void metrica(C13765e c13765e) {
        attachBaseContext(this.f26251e.purchase);
        onCreate();
        if (c13765e == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f26253e != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f26253e = c13765e;
        C11467e c11467e = this.f26257e;
        c11467e.getClass();
        ((ServiceC13230e) c11467e.f23071e).f26258e.license(new RunnableC17144e(c11467e, c13765e, false, 14));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C11467e c11467e = this.f26257e;
        c11467e.getClass();
        C4363e c4363e = (C4363e) c11467e.f23070e;
        c4363e.getClass();
        return c4363e.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f26257e = new C16602e(this);
        } else if (i >= 26) {
            this.f26257e = new C10756e(this);
        } else {
            this.f26257e = new C11467e(this);
        }
        this.f26257e.crashlytics();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f26258e.vip = null;
    }

    public final void purchase(String str) {
        C18424e vip = vip();
        if (vip == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            AbstractC9413e.m2565strictfp(this.f26249e.advert, new RunnableC4904e(25, this, vip, str));
            return;
        }
        AbstractC2803e.smaato("MLSLegacyStub", "onUnsubscribe(): Ignoring empty id from " + vip);
    }

    public final C18424e vip() {
        C11467e c11467e = this.f26257e;
        c11467e.getClass();
        return this.f26254e.m3007extends(c11467e.isVip());
    }
}
