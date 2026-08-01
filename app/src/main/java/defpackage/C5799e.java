package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5799e implements InterfaceC2881e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C5241e f12247e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC3958e f12248e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC12424e f12249e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f12250e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C8591e f12251e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C2673e f12252e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10503e f12253e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public InterfaceC3232e f12254e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f12255e;

    public C5799e(C6140e c6140e, C10503e c10503e, InterfaceC12424e interfaceC12424e, InterfaceC3958e interfaceC3958e, C8591e c8591e, C5241e c5241e) {
        this.f12253e = c10503e;
        this.f12249e = interfaceC12424e;
        this.f12248e = interfaceC3958e;
        this.f12251e = c8591e;
        this.f12247e = c5241e;
        String str = c6140e.f12912e;
        this.f12255e = str;
        this.f12254e = AbstractC17943e.ad;
        C11498e c11498e = AbstractC8995e.ad;
        c11498e.getClass();
        this.f12250e = C11498e.vip.incrementAndGet(c11498e);
        this.f12252e = AbstractC14430e.metrica(false);
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "Created " + this + " for " + ((Object) C5060e.vip(str)));
        }
    }

    @Override // defpackage.InterfaceC0876e
    public final void Signature(AbstractC16510e abstractC16510e) {
        C10503e c10503e = this.f12253e;
        synchronized (c10503e.mopub) {
            try {
                if (c10503e.smaato.remove(abstractC16510e)) {
                    c10503e.smaato();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC2881e
    public final InterfaceC11659e ad() {
        return this.f12247e.vip;
    }

    @Override // defpackage.InterfaceC2881e
    public final void adcel(boolean z) {
        C10503e c10503e = this.f12253e;
        synchronized (c10503e.mopub) {
            c10503e.amazon = z;
            C6455e yandex = c10503e.yandex();
            if (yandex != null) {
                AbstractC5336e.purchase(yandex.vip.appmetrica, null, 0, new C11441e((InterfaceC5083e) null, yandex, z), 3);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // defpackage.InterfaceC2881e
    public final void admob(boolean z) {
        C10503e c10503e = this.f12253e;
        synchronized (c10503e.mopub) {
            c10503e.Signature = z;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC2881e
    public final void advert(Collection collection) {
        this.f12253e.license(AbstractC13480e.m3575continue(collection));
    }

    @Override // defpackage.InterfaceC2881e
    public final void amazon() {
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", this + " received removed signal. Cleaning up.");
        }
        if (this.f12252e.ad()) {
            AbstractC5336e.purchase(this.f12251e.ad, null, 0, new C7239e(this, null, 0), 3);
        }
    }

    @Override // defpackage.InterfaceC0876e
    public final void appmetrica(AbstractC16510e abstractC16510e) {
        this.f12253e.ad(abstractC16510e);
    }

    @Override // defpackage.InterfaceC2881e
    public final InterfaceC3958e billing() {
        return this.f12248e;
    }

    @Override // defpackage.InterfaceC2881e
    public final boolean license() {
        return vip().admob() == 0;
    }

    @Override // defpackage.InterfaceC2881e
    public final /* synthetic */ boolean loadAd() {
        return true;
    }

    @Override // defpackage.InterfaceC0876e
    public final void metrica(AbstractC16510e abstractC16510e) {
        C10503e c10503e = this.f12253e;
        synchronized (c10503e.mopub) {
            try {
                if (c10503e.advert.contains(abstractC16510e)) {
                    c10503e.advert(c10503e.advert);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC2881e
    public final boolean mopub() {
        return this.f12252e.vip();
    }

    @Override // defpackage.InterfaceC0876e
    public final void purchase(AbstractC16510e abstractC16510e) {
        C10503e c10503e = this.f12253e;
        synchronized (c10503e.mopub) {
            try {
                if (c10503e.advert.contains(abstractC16510e)) {
                    c10503e.smaato();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC2881e
    public final ListenableFuture release() {
        return AbstractC5750e.purchase(new C0211e(18, AbstractC5336e.purchase(this.f12251e.ad, null, 0, new C7239e(this, null, 1), 3)));
    }

    public final void remoteconfig(boolean z) {
        C10503e c10503e = this.f12253e;
        synchronized (c10503e.mopub) {
            c10503e.loadAd = z;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC2881e
    public final void smaato(ArrayList arrayList) {
        this.f12253e.billing(AbstractC13480e.m3575continue(arrayList));
    }

    @Override // defpackage.InterfaceC2881e
    public final void startapp(InterfaceC3232e interfaceC3232e) {
        this.f12254e = interfaceC3232e == null ? AbstractC17943e.ad : interfaceC3232e;
        if (interfaceC3232e != null) {
            ((C6594e) interfaceC3232e).m2230transient();
        }
        synchronized (this.f12253e.mopub) {
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC2881e
    public final InterfaceC12424e subscription() {
        return this.f12249e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInternalAdapter<");
        sb.append((Object) C5060e.vip(this.f12255e));
        sb.append('(');
        return AbstractC17861e.smaato(this.f12250e, ")>", sb);
    }

    @Override // defpackage.InterfaceC2881e, defpackage.InterfaceC1489e
    public final InterfaceC12424e vip() {
        return subscription();
    }

    @Override // defpackage.InterfaceC2881e
    public final InterfaceC3232e yandex() {
        return this.f12254e;
    }
}
