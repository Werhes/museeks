package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؒۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12200e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f24500e = 0;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ Object f24501e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f24502e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f24503e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Object f24504e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f24505e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ long f24506e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f24507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12200e(C0243e c0243e, C0904e c0904e, InterfaceC13547e interfaceC13547e, long j, InterfaceC10500e interfaceC10500e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f24505e = c0243e;
        this.f24502e = c0904e;
        this.f24504e = interfaceC13547e;
        this.f24506e = j;
        this.f24501e = interfaceC10500e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12200e(InterfaceC3358e interfaceC3358e, String str, long j, C12347e c12347e, C15860e c15860e, InterfaceC6256e interfaceC6256e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f24503e = interfaceC3358e;
        this.f24505e = str;
        this.f24506e = j;
        this.f24502e = c12347e;
        this.f24504e = c15860e;
        this.f24501e = interfaceC6256e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f24500e) {
            case 0:
                C12200e c12200e = new C12200e((C0243e) this.f24505e, (C0904e) this.f24502e, (InterfaceC13547e) this.f24504e, this.f24506e, (InterfaceC10500e) this.f24501e, interfaceC5083e);
                c12200e.f24503e = obj;
                return c12200e;
            default:
                return new C12200e((InterfaceC3358e) this.f24503e, (String) this.f24505e, this.f24506e, (C12347e) this.f24502e, (C15860e) this.f24504e, (InterfaceC6256e) this.f24501e, interfaceC5083e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24500e) {
            case 0:
                return ((C12200e) advert((InterfaceC5083e) obj2, (C3593e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C12200e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f24500e) {
            case 0:
                InterfaceC13547e interfaceC13547e = (InterfaceC13547e) this.f24504e;
                C0904e c0904e = (C0904e) this.f24502e;
                C0243e c0243e = (C0243e) this.f24505e;
                int i = this.f24507e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C3593e c3593e = (C3593e) this.f24503e;
                    c0243e.appmetrica = C0904e.m411e(c0904e, interfaceC13547e, this.f24506e);
                    Cthrows cthrows = new Cthrows(c0904e, c0243e, (InterfaceC10500e) this.f24501e, c3593e);
                    Csynchronized csynchronized = new Csynchronized(5, c0904e, c0243e, interfaceC13547e);
                    this.f24507e = 1;
                    Object ad = c0243e.ad(cthrows, csynchronized, this);
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
                InterfaceC6256e interfaceC6256e = (InterfaceC6256e) this.f24501e;
                String str = (String) this.f24505e;
                C15860e c15860e = (C15860e) this.f24504e;
                int i2 = this.f24507e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC3358e interfaceC3358e = (InterfaceC3358e) this.f24503e;
                    this.f24507e = 1;
                    obj = ((C13189e) interfaceC3358e).appmetrica(str, this.f24506e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (obj == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                C12347e c12347e = (C12347e) obj;
                if (c12347e == null) {
                    return Unit.INSTANCE;
                }
                long j = c12347e.ad;
                long metrica = AbstractC9262e.metrica(interfaceC6256e.license((int) (j >> 32)), interfaceC6256e.license((int) (j & 4294967295L)));
                if (!C12347e.vip(metrica, (C12347e) this.f24502e) && AbstractC7890e.billing(c15860e.amazon().ad.f20850e, str) && interfaceC6256e == c15860e.vip) {
                    c15860e.metrica.invoke(C15860e.appmetrica(c15860e.amazon().ad, metrica));
                    c15860e.tapsense = new C12347e(metrica);
                }
                return Unit.INSTANCE;
        }
    }
}
