package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455e implements InterfaceC3475e, InterfaceC10998e, InterfaceC0816e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final RunnableC2783e f2506e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C13462e f2507e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractComponentCallbacksC17875e f2509e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C4891e f2508e = null;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C5891e f2505e = null;

    public C0455e(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, C13462e c13462e, RunnableC2783e runnableC2783e) {
        this.f2509e = abstractComponentCallbacksC17875e;
        this.f2507e = c13462e;
        this.f2506e = runnableC2783e;
    }

    public final void appmetrica() {
        if (this.f2508e == null) {
            this.f2508e = new C4891e(this, true);
            C3560e c3560e = new C3560e(this, new C13465e(26, this));
            this.f2505e = new C5891e(c3560e);
            c3560e.ad();
            this.f2506e.run();
        }
    }

    @Override // defpackage.InterfaceC0816e
    public final C13462e billing() {
        appmetrica();
        return this.f2507e;
    }

    @Override // defpackage.InterfaceC3475e
    public final C8229e license() {
        Application application;
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = this.f2509e;
        Context applicationContext = abstractComponentCallbacksC17875e.subs().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C8229e c8229e = new C8229e(0);
        if (application != null) {
            c8229e.ad(C1219e.f3858e, application);
        }
        c8229e.ad(AbstractC18129e.ad, abstractComponentCallbacksC17875e);
        c8229e.ad(AbstractC18129e.vip, this);
        Bundle bundle = abstractComponentCallbacksC17875e.f35111e;
        if (bundle != null) {
            c8229e.ad(AbstractC18129e.metrica, bundle);
        }
        return c8229e;
    }

    public final void metrica(EnumC14621e enumC14621e) {
        this.f2508e.appmetrica(enumC14621e);
    }

    @Override // defpackage.InterfaceC16400e
    public final AbstractC0003e vip() {
        appmetrica();
        return this.f2508e;
    }

    @Override // defpackage.InterfaceC10998e
    public final C3168e yandex() {
        appmetrica();
        return (C3168e) this.f2505e.f12439e;
    }
}
