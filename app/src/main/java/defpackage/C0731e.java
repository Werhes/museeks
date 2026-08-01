package defpackage;

import android.graphics.Bitmap;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۨؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731e implements InterfaceC12765e, InterfaceC1106e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f3025e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3026e;

    public C0731e(int i) {
        this.f3026e = i;
        switch (i) {
            case 1:
                this.f3025e = new C7699e();
                return;
            case 2:
            default:
                return;
            case 3:
                this.f3025e = new C0560e();
                return;
        }
    }

    public /* synthetic */ C0731e(int i, Object obj) {
        this.f3026e = i;
        this.f3025e = obj;
    }

    public C0731e(C7044e c7044e, C6936e c6936e) {
        this.f3026e = 5;
        this.f3025e = c6936e;
    }

    @Override // defpackage.InterfaceC1106e
    public void ad(Bitmap bitmap) {
        ((C6639e) this.f3025e).metrica(bitmap, 3);
    }

    @Override // defpackage.InterfaceC12765e
    /* renamed from: final */
    public void mo213final(C0560e c0560e) {
        switch (this.f3026e) {
            case 4:
                C8130e c8130e = (C8130e) this.f3025e;
                c8130e.mopub.metrica(c8130e, "connection");
                C16680e c16680e = c8130e.adcel;
                c16680e.getClass();
                C14847e c14847e = new C14847e(c8130e.purchase);
                HandlerC9134e handlerC9134e = c16680e.f32734e;
                handlerC9134e.sendMessage(handlerC9134e.obtainMessage(14, c14847e));
                C0560e c0560e2 = c14847e.vip.ad;
                return;
            default:
                ((C10078e) ((BinderC1109e) this.f3025e).appmetrica).license("joinApplication", c0560e);
                return;
        }
    }

    public boolean metrica() {
        C13879e c13879e = ((C6936e) this.f3025e).f14227e;
        C6936e.yandex(c13879e);
        return Log.isLoggable(c13879e.m3695e(), 3);
    }

    public long vip(long j) {
        C7699e c7699e = (C7699e) this.f3025e;
        c7699e.getClass();
        if (C11422e.vip(j) <= 0.0f || C11422e.metrica(j) <= 0.0f) {
            AbstractC14070e.metrica("maximumVelocity should be a positive value. You specified=" + ((Object) C11422e.billing(j)));
        }
        return AbstractC5458e.ad(((C1756e) c7699e.f15624e).vip(C11422e.vip(j)), ((C1756e) c7699e.f15623e).vip(C11422e.metrica(j)));
    }
}
