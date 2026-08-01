package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7388e extends AbstractC16858e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C7314e f15141e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f15142e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2832e f15143e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ long f15144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7388e(AbstractC2832e abstractC2832e, long j, long j2, C7314e c7314e) {
        super(1);
        this.f15143e = abstractC2832e;
        this.f15142e = j;
        this.f15144e = j2;
        this.f15141e = c7314e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
        long j = this.f15142e;
        long j2 = this.f15144e;
        abstractC3698e.getClass();
        long j3 = ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
        AbstractC2832e abstractC2832e = this.f15143e;
        AbstractC3698e.ad(abstractC3698e, abstractC2832e);
        abstractC2832e.mo392catch(C11490e.license(j3, abstractC2832e.f6802e), 0.0f, this.f15141e);
        return Unit.INSTANCE;
    }
}
