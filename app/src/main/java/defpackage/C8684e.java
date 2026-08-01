package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8684e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2832e f17526e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f17527e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8684e(AbstractC2832e abstractC2832e, int i) {
        super(1);
        this.f17527e = i;
        this.f17526e = abstractC2832e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17527e) {
            case 0:
                ((AbstractC3698e) obj).billing(this.f17526e, 0, 0, 0.0f);
                return Unit.INSTANCE;
            case 1:
                AbstractC3698e.advert((AbstractC3698e) obj, this.f17526e, 0, 0);
                return Unit.INSTANCE;
            case 2:
                ((AbstractC3698e) obj).billing(this.f17526e, 0, 0, 0.0f);
                return Unit.INSTANCE;
            case 3:
                ((AbstractC3698e) obj).billing(this.f17526e, 0, 0, 0.0f);
                return Unit.INSTANCE;
            case 4:
                ((AbstractC3698e) obj).billing(this.f17526e, 0, 0, 0.0f);
                return Unit.INSTANCE;
            case 5:
                AbstractC3698e.advert((AbstractC3698e) obj, this.f17526e, 0, 0);
                return Unit.INSTANCE;
            default:
                AbstractC3698e.smaato((AbstractC3698e) obj, this.f17526e, 0, 0, null, 12);
                return Unit.INSTANCE;
        }
    }
}
