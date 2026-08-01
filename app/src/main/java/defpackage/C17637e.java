package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17637e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f34562e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f34563e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7576e f34564e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ boolean f34565e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17637e(int i, InterfaceC5083e interfaceC5083e, C7576e c7576e) {
        super(2, interfaceC5083e);
        this.f34564e = c7576e;
        this.f34563e = i;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C17637e c17637e = new C17637e(this.f34563e, interfaceC5083e, this.f34564e);
        c17637e.f34565e = ((Boolean) obj).booleanValue();
        return c17637e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C17637e) advert((InterfaceC5083e) obj2, bool)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i;
        boolean z = this.f34565e;
        int i2 = this.f34562e;
        if (i2 == 0) {
            AbstractC2003e.purchase(obj);
            if (!z) {
                i = this.f34563e;
                return new Integer(i);
            }
            InterfaceC4417e billing = this.f34564e.billing();
            this.f34565e = z;
            this.f34562e = 1;
            obj = billing.ad(this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (obj == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        i = ((Number) obj).intValue();
        return new Integer(i);
    }
}
