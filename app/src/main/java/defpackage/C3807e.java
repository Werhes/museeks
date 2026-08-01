package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؐۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3807e extends AbstractC16858e implements Function0 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ long f8425e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C5385e f8426e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7142e f8427e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C10163e f8428e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ long f8429e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3807e(C7142e c7142e, C5385e c5385e, C10163e c10163e, long j, long j2) {
        super(0);
        this.f8427e = c7142e;
        this.f8426e = c5385e;
        this.f8428e = c10163e;
        this.f8425e = j;
        this.f8429e = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C5385e c5385e = this.f8426e;
        this.f8427e.f14622e = c5385e.getPositionProvider().advert(this.f8428e, this.f8425e, c5385e.getParentLayoutDirection(), this.f8429e);
        return Unit.INSTANCE;
    }
}
