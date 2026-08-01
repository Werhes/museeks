package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2751e extends AbstractC7185e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6653e = 0;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7185e f6654e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f6655e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public /* synthetic */ AbstractC5794e f6656e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC8376e f6657e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f6658e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2751e(C13138e c13138e, InterfaceC5083e interfaceC5083e) {
        super(4, interfaceC5083e);
        this.f6654e = c13138e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2751e(Function4 function4, InterfaceC5083e interfaceC5083e) {
        super(4, interfaceC5083e);
        this.f6654e = (AbstractC7185e) function4;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eؚٖؓ, kotlin.jvm.functions.Function4] */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f6653e) {
            case 0:
                C2751e c2751e = new C2751e((C13138e) this.f6654e, (InterfaceC5083e) obj4);
                c2751e.f6656e = (C3850e) obj;
                c2751e.f6657e = (InterfaceC8376e) obj2;
                c2751e.f6655e = obj3;
                return c2751e.loadAd(Unit.INSTANCE);
            default:
                C2751e c2751e2 = new C2751e((Function4) this.f6654e, (InterfaceC5083e) obj4);
                c2751e2.f6656e = (AbstractC5794e) obj;
                c2751e2.f6657e = (InterfaceC8376e) obj2;
                c2751e2.f6655e = obj3;
                return c2751e2.loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [eؚٖؓ, kotlin.jvm.functions.Function4] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f6653e) {
            case 0:
                C3850e c3850e = (C3850e) this.f6656e;
                InterfaceC8376e interfaceC8376e = this.f6657e;
                Object obj2 = this.f6655e;
                int i = this.f6658e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C13138e c13138e = (C13138e) this.f6654e;
                    this.f6656e = null;
                    this.f6657e = null;
                    this.f6655e = null;
                    this.f6658e = 1;
                    Object invoke = c13138e.invoke(c3850e, interfaceC8376e, obj2, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (invoke == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                AbstractC5794e abstractC5794e = this.f6656e;
                InterfaceC8376e interfaceC8376e2 = this.f6657e;
                Object obj3 = this.f6655e;
                int i2 = this.f6658e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f6656e = null;
                    this.f6657e = null;
                    this.f6655e = null;
                    this.f6658e = 1;
                    Object invoke2 = this.f6654e.invoke(abstractC5794e, interfaceC8376e2, obj3, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (invoke2 == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
