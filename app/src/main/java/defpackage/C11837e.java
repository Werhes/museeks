package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٚۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11837e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10376e f23744e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23745e;

    public /* synthetic */ C11837e(C10376e c10376e, int i) {
        this.f23745e = i;
        this.f23744e = c10376e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23745e) {
            case 0:
                this.f23744e.f20502e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                C10376e c10376e = this.f23744e;
                if (c10376e.m2800strictfp()) {
                    c10376e.m2514goto(new C3409e());
                } else {
                    c10376e.m2514goto(new C1963e());
                }
                return Unit.INSTANCE;
            default:
                this.f23744e.f20502e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
        }
    }
}
