package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5424e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f11618e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C2038e f11619e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C11467e f11620e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f11621e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f11622e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5424e(C2038e c2038e, C11467e c11467e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f11618e = i;
        this.f11619e = c2038e;
        this.f11620e = c11467e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f11618e) {
            case 0:
                C5424e c5424e = new C5424e(this.f11619e, this.f11620e, interfaceC5083e, 0);
                c5424e.f11621e = obj;
                return c5424e;
            default:
                C5424e c5424e2 = new C5424e(this.f11619e, this.f11620e, interfaceC5083e, 1);
                c5424e2.f11621e = obj;
                return c5424e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f11618e) {
            case 0:
                return ((C5424e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C5424e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f11618e) {
            case 0:
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f11621e;
                int i = this.f11622e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC1108e ad = ((InterfaceC8018e) ((C6325e) AbstractC1831e.metrica().f22772e).f13170e).ad();
                    C17191e c17191e = new C17191e(this.f11619e, interfaceC18435e, this.f11620e);
                    this.f11621e = null;
                    this.f11622e = 1;
                    Object ad2 = ad.ad(c17191e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (ad2 == enumC2821e) {
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
                InterfaceC18435e interfaceC18435e2 = (InterfaceC18435e) this.f11621e;
                int i2 = this.f11622e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C2038e c2038e = this.f11619e;
                    InterfaceC1108e billing = AbstractC7535e.billing(AbstractC17673e.appmetrica(new C10250e(0, new C6989e(AbstractC14114e.appmetrica(AbstractC14533e.smaato(new C5636e(c2038e, 0)), c2038e.ad.f8255e, EnumC7785e.f15776e), 0)), new C14099e(0), AbstractC17673e.vip), 250L);
                    C1247e c1247e = new C1247e(interfaceC18435e2, this.f11620e, c2038e, (InterfaceC5083e) null, 0);
                    this.f11621e = null;
                    this.f11622e = 1;
                    Object appmetrica = AbstractC7535e.appmetrica(billing, c1247e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (appmetrica == enumC2821e2) {
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
