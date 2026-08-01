package defpackage;

import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3547e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C12688e f8002e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8003e;

    public /* synthetic */ C3547e(C12688e c12688e, int i) {
        this.f8003e = i;
        this.f8002e = c12688e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f8003e;
        C12688e c12688e = this.f8002e;
        switch (i) {
            case 0:
                DecimalFormat decimalFormat = C5575e.ad;
                C5575e.ad(c12688e.f25433e);
                c12688e.f25432e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                c12688e.f25432e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                c12688e.m2514goto(new C11522e());
                return Unit.INSTANCE;
            case 3:
                c12688e.m2514goto(new C7888e());
                return Unit.INSTANCE;
            default:
                c12688e.f25432e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
