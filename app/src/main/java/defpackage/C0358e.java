package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0358e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9669e f2391e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2392e;

    public /* synthetic */ C0358e(C9669e c9669e, int i) {
        this.f2392e = i;
        this.f2391e = c9669e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2392e) {
            case 0:
                this.f2391e.f19164e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                this.f2391e.m2624import(false);
                return Unit.INSTANCE;
            case 2:
                this.f2391e.m2624import(true);
                return Unit.INSTANCE;
            default:
                this.f2391e.f19164e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
        }
    }
}
