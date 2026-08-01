package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۡۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12815e extends AbstractC16858e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f25634e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C3866e f25635e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2832e[] f25636e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f25637e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12815e(AbstractC2832e[] abstractC2832eArr, C3866e c3866e, int i, int i2) {
        super(1);
        this.f25636e = abstractC2832eArr;
        this.f25635e = c3866e;
        this.f25637e = i;
        this.f25634e = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
        for (AbstractC2832e abstractC2832e : this.f25636e) {
            if (abstractC2832e != null) {
                long ad = this.f25635e.ad.vip.ad((abstractC2832e.f6806e << 32) | (abstractC2832e.f6804e & 4294967295L), (this.f25634e & 4294967295L) | (this.f25637e << 32), EnumC7792e.f15794e);
                abstractC3698e.billing(abstractC2832e, (int) (ad >> 32), (int) (ad & 4294967295L), 0.0f);
            }
        }
        return Unit.INSTANCE;
    }
}
