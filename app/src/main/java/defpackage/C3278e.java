package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3278e implements AutoCloseable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C0485e f7429e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0433e f7431e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1962e f7433e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f7434e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C9203e f7435e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f7430e = new Object();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ArrayList f7432e = new ArrayList();

    public C3278e(C1962e c1962e, C0433e c0433e) {
        this.f7433e = c1962e;
        this.f7431e = c0433e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eؑۖؒ] */
    public final void ad() {
        if (this.f7429e == null) {
            this.f7429e = new Object();
            C9203e c9203e = new C9203e(this.f7431e, this.f7433e, new C8630e(this), new C8630e(this));
            this.f7435e = c9203e;
            C14241e c14241e = C9203e.billing;
            synchronized (c14241e) {
                c14241e.ad.addLast(c9203e);
                c14241e.ad();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f7430e) {
            try {
                if (this.f7434e) {
                    return;
                }
                this.f7434e = true;
                AbstractC17475e subscription = AbstractC17475e.subscription(this.f7432e);
                CallableC8878e callableC8878e = new CallableC8878e(0, new RunnableC2783e(21, this));
                C12136e c12136e = new C12136e(subscription, false);
                c12136e.f24302e = new C7219e(c12136e, callableC8878e);
                c12136e.remoteconfig();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
