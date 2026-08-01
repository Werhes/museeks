package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۡۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2155e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C5385e f5534e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f5535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2155e(C5385e c5385e, int i) {
        super(1);
        this.f5535e = i;
        this.f5534e = c5385e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5535e) {
            case 0:
                this.f5534e.Signature(((InterfaceC0043e) obj).isVip());
                return Unit.INSTANCE;
            case 1:
                C12729e c12729e = new C12729e(((C12729e) obj).ad);
                C5385e c5385e = this.f5534e;
                c5385e.m1894setPopupContentSizefhxjrPA(c12729e);
                c5385e.admob();
                return Unit.INSTANCE;
            default:
                Function0 function0 = (Function0) obj;
                C5385e c5385e2 = this.f5534e;
                Handler handler = c5385e2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = c5385e2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC7547e(6, function0));
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
