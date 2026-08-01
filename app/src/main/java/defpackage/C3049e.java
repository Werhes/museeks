package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؐٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3049e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5014e f7109e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f7110e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3049e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, int i) {
        super(1);
        this.f7110e = i;
        this.f7109e = viewTreeObserverOnGlobalLayoutListenerC5014e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7110e) {
            case 0:
                ((C8212e) this.f7109e.getFocusOwner()).billing(((C10202e) obj).ad, false);
                return Unit.INSTANCE;
            case 1:
                Function0 function0 = (Function0) obj;
                ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.f7109e;
                viewTreeObserverOnGlobalLayoutListenerC5014e.getUncaughtExceptionHandler$ui();
                Handler handler = viewTreeObserverOnGlobalLayoutListenerC5014e.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = viewTreeObserverOnGlobalLayoutListenerC5014e.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC7547e(1, function0));
                    }
                }
                return Unit.INSTANCE;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e2 = this.f7109e;
                return new C12747e(viewTreeObserverOnGlobalLayoutListenerC5014e2, viewTreeObserverOnGlobalLayoutListenerC5014e2.getTextInputService(), (InterfaceC18435e) obj);
        }
    }
}
