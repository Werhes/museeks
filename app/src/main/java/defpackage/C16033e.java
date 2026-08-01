package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16033e implements InterfaceC4911e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C4725e f31567e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Boolean f31568e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile InterfaceC4911e f31569e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Method f31570e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f31571e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f31572e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Queue f31573e;

    public C16033e(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.f31571e = str;
        this.f31573e = linkedBlockingQueue;
        this.f31572e = z;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, eؚؗۡ] */
    public final InterfaceC4911e Signature() {
        if (this.f31569e != null) {
            return this.f31569e;
        }
        if (this.f31572e) {
            return C11437e.f23001e;
        }
        if (this.f31567e == null) {
            Queue queue = this.f31573e;
            ?? obj = new Object();
            obj.f10112e = this;
            obj.f10111e = queue;
            this.f31567e = obj;
        }
        return this.f31567e;
    }

    @Override // defpackage.InterfaceC4911e
    public final void ad(Object obj) {
        Signature().ad(obj);
    }

    @Override // defpackage.InterfaceC4911e
    public final void adcel(String str, Throwable th) {
        Signature().adcel(str, th);
    }

    public final boolean admob() {
        Boolean bool = this.f31568e;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f31570e = this.f31569e.getClass().getMethod("log", C11131e.class);
            this.f31568e = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f31568e = Boolean.FALSE;
        }
        return this.f31568e.booleanValue();
    }

    @Override // defpackage.InterfaceC4911e
    public final void advert(Exception exc) {
        Signature().advert(exc);
    }

    @Override // defpackage.InterfaceC4911e
    public final void amazon(String str) {
        Signature().amazon(str);
    }

    @Override // defpackage.InterfaceC4911e
    public final boolean appmetrica() {
        return Signature().appmetrica();
    }

    @Override // defpackage.InterfaceC4911e
    public final void billing(String str) {
        Signature().billing(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C16033e.class == obj.getClass() && this.f31571e.equals(((C16033e) obj).f31571e);
    }

    public final int hashCode() {
        return this.f31571e.hashCode();
    }

    @Override // defpackage.InterfaceC4911e
    public final void license(String str, Throwable th) {
        Signature().license(str, th);
    }

    @Override // defpackage.InterfaceC4911e
    public final boolean loadAd(int i) {
        return Signature().loadAd(i);
    }

    @Override // defpackage.InterfaceC4911e
    public final boolean metrica() {
        return Signature().metrica();
    }

    @Override // defpackage.InterfaceC4911e
    public final void mopub(String str) {
        Signature().mopub(str);
    }

    @Override // defpackage.InterfaceC4911e
    public final boolean purchase() {
        return Signature().purchase();
    }

    @Override // defpackage.InterfaceC4911e
    public final void smaato(String str) {
        Signature().smaato(str);
    }

    @Override // defpackage.InterfaceC4911e
    public final void startapp(String str, IOException iOException) {
        Signature().startapp(str, iOException);
    }

    @Override // defpackage.InterfaceC4911e
    public final boolean vip() {
        return Signature().vip();
    }

    @Override // defpackage.InterfaceC4911e
    public final boolean yandex() {
        return Signature().yandex();
    }
}
