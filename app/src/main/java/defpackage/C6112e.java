package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6112e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13578e f12839e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12840e;

    public /* synthetic */ C6112e(C13578e c13578e, int i) {
        this.f12840e = i;
        this.f12839e = c13578e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f12840e) {
            case 0:
                C13578e c13578e = this.f12839e;
                if (c13578e.applovin()) {
                    c13578e.billing(null);
                }
                return Unit.INSTANCE;
            case 1:
                this.f12839e.billing(null);
                return Unit.INSTANCE;
            case 2:
                C13578e c13578e2 = this.f12839e;
                if (c13578e2.applovin()) {
                    c13578e2.billing(C9139e.f18290e);
                }
                return Unit.INSTANCE;
            default:
                Unit unit = Unit.INSTANCE;
                this.f12839e.billing(unit);
                return unit;
        }
    }
}
