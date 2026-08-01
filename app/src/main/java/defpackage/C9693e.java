package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9693e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4070e f19187e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19188e;

    public /* synthetic */ C9693e(C4070e c4070e, int i) {
        this.f19188e = i;
        this.f19187e = c4070e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.f19188e) {
            case 0:
                if (th != null) {
                    this.f19187e.ad(th);
                }
                return Unit.INSTANCE;
            case 1:
                if (th != null) {
                    C4070e c4070e = this.f19187e;
                    if (!c4070e.yandex()) {
                        c4070e.ad(th);
                    }
                }
                return Unit.INSTANCE;
            default:
                if (th != null) {
                    C4070e c4070e2 = this.f19187e;
                    if (!c4070e2.smaato()) {
                        c4070e2.ad(th);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
