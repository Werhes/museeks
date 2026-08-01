package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2640e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f6508e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f6509e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f6510e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f6511e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6512e;

    public /* synthetic */ C2640e(InterfaceC7189e interfaceC7189e, int i, C2892e c2892e, int i2, int i3) {
        this.f6512e = 0;
        this.f6511e = interfaceC7189e;
        this.f6510e = i;
        this.f6508e = c2892e;
        this.f6509e = i3;
    }

    public /* synthetic */ C2640e(Object obj, Object obj2, int i, int i2, int i3) {
        this.f6512e = i3;
        this.f6511e = obj;
        this.f6508e = obj2;
        this.f6510e = i;
        this.f6509e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6512e) {
            case 0:
                ((Integer) obj2).getClass();
                int advert = AbstractC5190e.advert(3073);
                AbstractC12751e.vip((InterfaceC7189e) this.f6511e, this.f6510e, (C2892e) this.f6508e, (C13770e) obj, advert, this.f6509e);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ((C9456e) this.f6511e).Signature((Function2) this.f6508e, (C13770e) obj, AbstractC5190e.advert(this.f6510e | 1), this.f6509e);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).intValue();
                int advert2 = AbstractC5190e.advert(this.f6509e | 1);
                AbstractC15842e.ad((Function0) this.f6511e, (C2357e) this.f6508e, this.f6510e, (C13770e) obj, advert2);
                return Unit.INSTANCE;
        }
    }
}
