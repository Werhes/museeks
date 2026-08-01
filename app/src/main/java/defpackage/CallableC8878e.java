package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٟۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC8878e implements Callable {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ CallableC8878e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public CallableC8878e(BinderC14884e binderC14884e, C15541e c15541e, String str) {
        this.ad = 4;
        this.vip = binderC14884e;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.ad) {
            case 0:
                ((RunnableC2783e) this.vip).run();
                return null;
            case 1:
                ((Runnable) this.vip).run();
                return null;
            case 2:
                return ((Context) this.vip).getSharedPreferences("google_sdk_flags", 0);
            case 3:
                return new C6021e(((C10961e) this.vip).f21706e);
            case 4:
                BinderC14884e binderC14884e = (BinderC14884e) this.vip;
                binderC14884e.metrica.m3946default();
                C4172e c4172e = binderC14884e.metrica.f30366e;
                C15398e.m3939break(c4172e);
                c4172e.mo2250e();
                throw new IllegalStateException("Unexpected call on client side");
            case 5:
                C10682e c10682e = (C10682e) this.vip;
                c10682e.getClass();
                return C7092e.metrica.ad(c10682e.billing);
            case 6:
                C3842e c3842e = (C3842e) this.vip;
                c3842e.getClass();
                return C7092e.metrica.ad(c3842e.ad);
            case 7:
                C0642e c0642e = (C0642e) this.vip;
                synchronized (((C9664e) c0642e.f2879e).billing) {
                    c0642e.f2880e = null;
                }
                return null;
            default:
                C17856e c17856e = (C17856e) this.vip;
                c17856e.getClass();
                return C7092e.metrica.ad(c17856e.billing);
        }
    }
}
