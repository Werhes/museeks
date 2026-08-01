package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ۠ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7504e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C7142e f15292e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7142e f15293e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C7765e f15294e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15295e;

    public /* synthetic */ C7504e(C7142e c7142e, C7142e c7142e2, C7765e c7765e, int i) {
        this.f15295e = i;
        this.f15293e = c7142e;
        this.f15292e = c7142e2;
        this.f15294e = c7765e;
    }

    public /* synthetic */ C7504e(C7142e c7142e, C7765e c7765e, C7142e c7142e2, int i) {
        this.f15295e = i;
        this.f15293e = c7142e;
        this.f15294e = c7765e;
        this.f15292e = c7142e2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15295e) {
            case 0:
                C7765e c7765e = this.f15294e;
                C7765e.yandex(this.f15293e, this.f15292e, c7765e);
                return Unit.INSTANCE;
            case 1:
                C7765e.billing(this.f15293e, this.f15292e, this.f15294e);
                return Unit.INSTANCE;
            case 2:
                C7765e.billing(this.f15293e, this.f15292e, this.f15294e);
                return Unit.INSTANCE;
            default:
                C7765e c7765e2 = this.f15294e;
                C7765e.yandex(this.f15293e, this.f15292e, c7765e2);
                return Unit.INSTANCE;
        }
    }
}
