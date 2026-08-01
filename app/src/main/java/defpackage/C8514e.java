package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8514e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17322e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C0073e f17323e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f17324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8514e(C0073e c0073e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f17322e = i;
        this.f17323e = c0073e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f17322e) {
            case 0:
                return new C8514e(this.f17323e, interfaceC5083e, 0);
            case 1:
                return new C8514e(this.f17323e, interfaceC5083e, 1);
            default:
                return new C8514e(this.f17323e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17322e) {
            case 0:
                return ((C8514e) advert((InterfaceC5083e) obj2, (String) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C8514e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C8514e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f17322e) {
            case 0:
                int i = this.f17324e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C0073e c0073e = this.f17323e;
                    c0073e.yandex.subscription(C10327e.f20377e);
                    this.f17324e = 1;
                    Object ad = c0073e.ad(this);
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
            case 1:
                int i2 = this.f17324e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C0073e c0073e2 = this.f17323e;
                    InterfaceC1108e yandex = AbstractC7535e.yandex(AbstractC7535e.billing(new C12593e(c0073e2.billing), 300L));
                    C8514e c8514e = new C8514e(c0073e2, null, 0);
                    this.f17324e = 1;
                    Object appmetrica = AbstractC7535e.appmetrica(yandex, c8514e, this);
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
            default:
                int i3 = this.f17324e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C0073e c0073e3 = this.f17323e;
                    if (((Boolean) c0073e3.appmetrica.startapp()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    this.f17324e = 1;
                    Object ad2 = c0073e3.ad(this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (ad2 == enumC2821e3) {
                        return enumC2821e3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
