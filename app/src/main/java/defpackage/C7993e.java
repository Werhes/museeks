package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7993e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f16181e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ long f16182e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C12236e f16183e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ List f16184e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ C6510e f16185e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ List f16186e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ List f16187e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C15062e f16188e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7993e(C15062e c15062e, InterfaceC5083e interfaceC5083e, List list, List list2, List list3, C12236e c12236e, C6510e c6510e, long j) {
        super(2, interfaceC5083e);
        this.f16188e = c15062e;
        this.f16187e = list;
        this.f16184e = list2;
        this.f16186e = list3;
        this.f16183e = c12236e;
        this.f16185e = c6510e;
        this.f16182e = j;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C7993e(this.f16188e, interfaceC5083e, this.f16187e, this.f16184e, this.f16186e, this.f16183e, this.f16185e, this.f16182e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7993e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f16181e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
            return obj;
        }
        AbstractC2003e.purchase(obj);
        InterfaceC1908e ad = C15062e.advert(this.f16188e).ad(this.f16187e, this.f16184e, this.f16186e, this.f16183e, this.f16185e, this.f16182e);
        this.f16181e = 1;
        Object tapsense = ((C8823e) ad).tapsense(this);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        return tapsense == enumC2821e ? enumC2821e : tapsense;
    }
}
