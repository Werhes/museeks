package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14669e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f28905e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2832e f28906e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28907e;

    public /* synthetic */ C14669e(AbstractC2832e abstractC2832e, int i, int i2) {
        this.f28907e = i2;
        this.f28906e = abstractC2832e;
        this.f28905e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
        switch (this.f28907e) {
            case 0:
                abstractC3698e.billing(this.f28906e, -this.f28905e, 0, 0.0f);
                return Unit.INSTANCE;
            case 1:
                abstractC3698e.billing(this.f28906e, 0, -this.f28905e, 0.0f);
                return Unit.INSTANCE;
            default:
                abstractC3698e.billing(this.f28906e, this.f28905e, 0, 0.0f);
                return Unit.INSTANCE;
        }
    }
}
