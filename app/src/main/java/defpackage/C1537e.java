package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؒٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1537e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f4403e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2869e f4404e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f4405e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ float f4406e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16904e f4407e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f4408e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537e(AbstractC16904e abstractC16904e, int i, float f, InterfaceC2869e interfaceC2869e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f4407e = abstractC16904e;
        this.f4405e = i;
        this.f4406e = f;
        this.f4404e = interfaceC2869e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C1537e c1537e = new C1537e(this.f4407e, this.f4405e, this.f4406e, this.f4404e, interfaceC5083e);
        c1537e.f4408e = obj;
        return c1537e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1537e) advert((InterfaceC5083e) obj2, (InterfaceC1719e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i;
        int i2 = this.f4403e;
        if (i2 == 0) {
            AbstractC2003e.purchase(obj);
            InterfaceC1719e interfaceC1719e = (InterfaceC1719e) this.f4408e;
            AbstractC16904e abstractC16904e = this.f4407e;
            C12143e c12143e = new C12143e(interfaceC1719e, abstractC16904e, 1);
            this.f4403e = 1;
            float f = AbstractC1742e.ad;
            int i3 = this.f4405e;
            abstractC16904e.admob.startapp(abstractC16904e.adcel(new Integer(i3).intValue()));
            Unit unit = Unit.INSTANCE;
            boolean z = i3 > abstractC16904e.appmetrica;
            int appmetrica = (c12143e.appmetrica() - abstractC16904e.appmetrica) + 1;
            if (((z && i3 > c12143e.appmetrica()) || (!z && i3 < abstractC16904e.appmetrica)) && Math.abs(i3 - abstractC16904e.appmetrica) >= 3) {
                if (z) {
                    i = i3 - appmetrica;
                    int i4 = abstractC16904e.appmetrica;
                    if (i < i4) {
                        i = i4;
                    }
                } else {
                    int i5 = appmetrica + i3;
                    i = abstractC16904e.appmetrica;
                    if (i5 <= i) {
                        i = i5;
                    }
                }
                c12143e.purchase(i);
            }
            Object license = AbstractC7844e.license(0.0f, c12143e.vip(i3) + this.f4406e, this.f4404e, new C9130e(new Object(), c12143e, 23), this, 4);
            Object obj2 = EnumC2821e.f6782e;
            if (license != obj2) {
                license = Unit.INSTANCE;
            }
            if (license == obj2) {
                return obj2;
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
