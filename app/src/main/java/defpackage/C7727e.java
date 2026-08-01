package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7727e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2832e f15675e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f15676e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f15677e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15678e;

    public /* synthetic */ C7727e(int i, AbstractC2832e abstractC2832e, int i2, int i3) {
        this.f15678e = i3;
        this.f15676e = i;
        this.f15675e = abstractC2832e;
        this.f15677e = i2;
    }

    public /* synthetic */ C7727e(AbstractC2832e abstractC2832e, int i, int i2, int i3) {
        this.f15678e = i3;
        this.f15675e = abstractC2832e;
        this.f15676e = i;
        this.f15677e = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15678e) {
            case 0:
                ((AbstractC3698e) obj).billing(this.f15675e, this.f15676e, this.f15677e, 0.0f);
                return Unit.INSTANCE;
            case 1:
                ((AbstractC3698e) obj).billing(this.f15675e, AbstractC1561e.appmetrica((this.f15676e - r0.f6806e) / 2.0f), AbstractC1561e.appmetrica((this.f15677e - r0.f6804e) / 2.0f), 0.0f);
                return Unit.INSTANCE;
            case 2:
                ((AbstractC3698e) obj).billing(this.f15675e, AbstractC1561e.appmetrica((this.f15676e - r0.f6806e) / 2.0f), AbstractC1561e.appmetrica((this.f15677e - r0.f6804e) / 2.0f), 0.0f);
                return Unit.INSTANCE;
            default:
                ((AbstractC3698e) obj).billing(this.f15675e, this.f15676e, this.f15677e, 0.0f);
                return Unit.INSTANCE;
        }
    }
}
