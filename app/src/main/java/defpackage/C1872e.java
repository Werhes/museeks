package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1872e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4977e f4995e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Activity f4996e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4997e;

    public /* synthetic */ C1872e(Activity activity, InterfaceC4977e interfaceC4977e, int i) {
        this.f4997e = i;
        this.f4996e = activity;
        this.f4995e = interfaceC4977e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4997e) {
            case 0:
                Activity activity = this.f4996e;
                if (activity != null) {
                    InterfaceC4977e interfaceC4977e = this.f4995e;
                    Throwable th = interfaceC4977e instanceof C6577e ? ((C6577e) interfaceC4977e).ad : interfaceC4977e instanceof C5134e ? ((C5134e) interfaceC4977e).ad : null;
                    if (th != null) {
                        new C15252e(th).signatures(activity);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            default:
                Activity activity2 = this.f4996e;
                if (activity2 == null) {
                    return Unit.INSTANCE;
                }
                new C15252e(((C9908e) this.f4995e).ad).signatures(activity2);
                return Unit.INSTANCE;
        }
    }
}
