package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2010e extends AbstractC16858e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13158e f5289e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f5290e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f5291e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f5292e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2832e f5293e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2010e(C9839e c9839e, long j, int i, int i2, InterfaceC13158e interfaceC13158e, AbstractC2832e abstractC2832e) {
        super(1);
        this.f5291e = j;
        this.f5290e = i;
        this.f5292e = i2;
        this.f5289e = interfaceC13158e;
        this.f5293e = abstractC2832e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
        long j = (this.f5290e << 32) | (this.f5292e & 4294967295L);
        EnumC7792e layoutDirection = this.f5289e.getLayoutDirection();
        long j2 = this.f5291e;
        float f = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f2 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        float f3 = layoutDirection == EnumC7792e.f15794e ? -1.0f : (-1) * (-1.0f);
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        float f6 = (f4 - 1.0f) * f2;
        AbstractC3698e.adcel(abstractC3698e, this.f5293e, (Math.round(f6) & 4294967295L) | (Math.round(f5) << 32));
        return Unit.INSTANCE;
    }
}
