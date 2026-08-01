package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11535e implements InterfaceC4843e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f23175e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23176e;

    public /* synthetic */ C11535e(int i, Object obj) {
        this.f23176e = i;
        this.f23175e = obj;
    }

    @Override // defpackage.InterfaceC4843e
    public final void ad(AbstractC1816e abstractC1816e) {
        C16480e c16480e;
        switch (this.f23176e) {
            case 0:
                C2601e c2601e = (C2601e) ((WeakReference) ((C12997e) this.f23175e).f25916e).get();
                if (c2601e != null) {
                    c2601e.f6449e.execute(new RunnableC2783e(12, c2601e));
                    return;
                }
                return;
            default:
                C4052e c4052e = (C4052e) this.f23175e;
                synchronized (c4052e.f9000e) {
                    try {
                        int i = c4052e.f9001e - 1;
                        c4052e.f9001e = i;
                        if (c4052e.f9003e && i == 0) {
                            c4052e.close();
                        }
                        c16480e = (C16480e) c4052e.f9005e;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c16480e != null) {
                    c16480e.ad(abstractC1816e);
                    return;
                }
                return;
        }
    }
}
