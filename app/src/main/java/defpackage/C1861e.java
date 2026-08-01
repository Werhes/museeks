package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1861e implements IBinder.DeathRecipient {
    public final C15719e ad = new C15719e(this);
    public final /* synthetic */ C12621e appmetrica;
    public final Handler license;
    public BinderC8864e metrica;
    public HandlerC10242e vip;

    public C1861e(C12621e c12621e, Looper looper) {
        this.appmetrica = c12621e;
        this.license = new Handler(looper, new C3275e(2, this));
    }

    public final void ad(boolean z) {
        C12318e c12318e = this.appmetrica.vip;
        c12318e.getClass();
        AbstractC2301e.subscription(Looper.myLooper() == c12318e.f24699e.getLooper());
        InterfaceC17145e interfaceC17145e = c12318e.f24703e;
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
        interfaceC17145e.advert(c12318e, new C11858e("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY), bundle);
    }

    public final void appmetrica() {
        Handler handler = this.license;
        if (handler.hasMessages(1)) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, this.appmetrica.yandex);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        metrica(8, null);
    }

    public final void license(Handler handler) {
        if (handler != null) {
            HandlerC10242e handlerC10242e = new HandlerC10242e(this, handler.getLooper(), 1);
            this.vip = handlerC10242e;
            handlerC10242e.vip = true;
        } else {
            HandlerC10242e handlerC10242e2 = this.vip;
            if (handlerC10242e2 != null) {
                handlerC10242e2.vip = false;
                handlerC10242e2.removeCallbacksAndMessages(null);
                this.vip = null;
            }
        }
    }

    public final void metrica(int i, Object obj) {
        HandlerC10242e handlerC10242e = this.vip;
        if (handlerC10242e != null) {
            handlerC10242e.obtainMessage(i, obj).sendToTarget();
        }
    }

    public final void vip(C4820e c4820e) {
        C12621e c12621e = this.appmetrica;
        C13798e c13798e = c12621e.amazon;
        c12621e.amazon = new C13798e((C18368e) c13798e.f27346e, C12621e.metrica(c4820e), (C3737e) c13798e.f27345e, (List) c13798e.f27352e, (CharSequence) c13798e.f27351e, c13798e.f27350e, c13798e.f27347e, (Bundle) c13798e.f27348e);
        appmetrica();
    }
}
