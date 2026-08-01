package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؐؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12940e extends AbstractC3743e implements InterfaceC13591e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f25792e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Handler f25793e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f25794e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C12940e f25795e;

    public C12940e(Handler handler) {
        this(handler, null, false);
    }

    public C12940e(Handler handler, String str, boolean z) {
        this.f25793e = handler;
        this.f25794e = str;
        this.f25792e = z;
        this.f25795e = z ? this : new C12940e(handler, str, true);
    }

    @Override // defpackage.InterfaceC13591e
    public final InterfaceC1232e ad(long j, Runnable runnable, InterfaceC8850e interfaceC8850e) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f25793e.postDelayed(runnable, j)) {
            return new C15216e(this, runnable, 0);
        }
        m3424e(interfaceC8850e, runnable);
        return C14251e.f28173e;
    }

    @Override // defpackage.AbstractC3743e
    public final void advert(InterfaceC8850e interfaceC8850e, Runnable runnable) {
        if (this.f25793e.post(runnable)) {
            return;
        }
        m3424e(interfaceC8850e, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12940e)) {
            return false;
        }
        C12940e c12940e = (C12940e) obj;
        return c12940e.f25793e == this.f25793e && c12940e.f25792e == this.f25792e;
    }

    @Override // defpackage.AbstractC3743e
    /* renamed from: extends */
    public final boolean mo1397extends(InterfaceC8850e interfaceC8850e) {
        return (this.f25792e && AbstractC7890e.billing(Looper.myLooper(), this.f25793e.getLooper())) ? false : true;
    }

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public final void m3424e(InterfaceC8850e interfaceC8850e, Runnable runnable) {
        AbstractC6629e.license(interfaceC8850e, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C15420e c15420e = AbstractC6731e.ad;
        ExecutorC3603e.f8134e.advert(interfaceC8850e, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f25793e) ^ (this.f25792e ? 1231 : 1237);
    }

    @Override // defpackage.InterfaceC13591e
    public final void license(long j, C13578e c13578e) {
        RunnableC2623e runnableC2623e = new RunnableC2623e(c13578e, this, 22);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f25793e.postDelayed(runnableC2623e, j)) {
            c13578e.inmobi(new C9041e(this, runnableC2623e, 18));
        } else {
            m3424e(c13578e.f26926e, runnableC2623e);
        }
    }

    @Override // defpackage.AbstractC3743e
    /* renamed from: static */
    public AbstractC3743e mo685static(int i) {
        AbstractC2356e.vip(i);
        return this;
    }

    @Override // defpackage.AbstractC3743e
    public final String toString() {
        C12940e c12940e;
        String str;
        C15420e c15420e = AbstractC6731e.ad;
        C12940e c12940e2 = AbstractC1497e.ad;
        if (this == c12940e2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c12940e = c12940e2.f25795e;
            } catch (UnsupportedOperationException unused) {
                c12940e = null;
            }
            str = this == c12940e ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f25794e;
        if (str2 == null) {
            str2 = this.f25793e.toString();
        }
        return this.f25792e ? AbstractC10257e.adcel(str2, ".immediate") : str2;
    }
}
