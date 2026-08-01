package defpackage;

import java.security.PublicKey;
import java.security.Signature;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۢؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6725e implements AutoCloseable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AutoCloseable f13891e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13892e = 1;

    public C6725e(C3278e c3278e) {
        this.f13891e = c3278e;
    }

    public C6725e(PublicKey publicKey, C16347e c16347e) {
        this.f13891e = c16347e;
        ((Signature) c16347e.ad()).initVerify(publicKey);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eؒؓٙ, java.lang.Object] */
    public AbstractC0798e ad() {
        C3278e c3278e = (C3278e) this.f13891e;
        synchronized (c3278e.f7430e) {
            try {
                if (c3278e.f7434e) {
                    return AbstractC2017e.metrica(new IllegalStateException("Retriever is released."));
                }
                c3278e.ad();
                ?? obj = new Object();
                c3278e.f7432e.add(obj);
                C0485e c0485e = c3278e.f7429e;
                c0485e.getClass();
                C0444e c0444e = new C0444e((Object) obj);
                c0485e.ad(new RunnableC17144e(c0485e, c0444e, 11), EnumC3320e.f7489e);
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f13892e) {
            case 0:
                ((C16347e) this.f13891e).close();
                return;
            default:
                ((C3278e) this.f13891e).close();
                return;
        }
    }
}
