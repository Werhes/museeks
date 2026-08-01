package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5686e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f12074e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ int[] f12075e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC12260e f12076e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Context f12077e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f12078e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f12079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5686e(AbstractC12260e abstractC12260e, Context context, int[] iArr, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f12074e = i;
        this.f12076e = abstractC12260e;
        this.f12077e = context;
        this.f12075e = iArr;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f12074e) {
            case 0:
                C5686e c5686e = new C5686e(this.f12076e, this.f12077e, this.f12075e, interfaceC5083e, 0);
                c5686e.f12078e = obj;
                return c5686e;
            default:
                C5686e c5686e2 = new C5686e(this.f12076e, this.f12077e, this.f12075e, interfaceC5083e, 1);
                c5686e2.f12078e = obj;
                return c5686e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f12074e) {
            case 0:
                return ((C5686e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C5686e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f12074e) {
            case 0:
                int i = this.f12079e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f12078e;
                    this.f12079e = 1;
                    Object ad = this.f12076e.ad(interfaceC18435e, this.f12077e, this.f12075e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (ad == enumC2821e) {
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
                int i2 = this.f12079e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC18435e interfaceC18435e2 = (InterfaceC18435e) this.f12078e;
                    this.f12079e = 1;
                    Object license = this.f12076e.license(interfaceC18435e2, this.f12077e, this.f12075e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (license == enumC2821e2) {
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
