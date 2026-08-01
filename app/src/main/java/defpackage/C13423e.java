package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13423e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f26682e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ float f26683e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ float f26684e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ float f26685e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f26686e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13423e(float f, float f2, float f3, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f26685e = f;
        this.f26683e = f2;
        this.f26684e = f3;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C13423e c13423e = new C13423e(this.f26685e, this.f26683e, this.f26684e, interfaceC5083e);
        c13423e.f26686e = obj;
        return c13423e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C13423e) advert((InterfaceC5083e) obj2, (C16822e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eٔۦْ] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f26682e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C16822e c16822e = (C16822e) this.f26686e;
            ?? obj2 = new Object();
            float f = this.f26685e;
            obj2.f29883e = f;
            C7558e ad = AbstractC7111e.ad(f);
            Float f2 = new Float(this.f26683e);
            C12870e c12870e = AbstractC8741e.billing;
            Float f3 = new Float(this.f26684e);
            C6538e c6538e = new C6538e(c16822e, obj2, 16);
            this.f26682e = 1;
            Object license = ad.license();
            C11139e c11139e = AbstractC9546e.ad;
            Object ad2 = C18298e.ad(ad.purchase, new C1297e(ad, f3, new C9260e(c12870e, c11139e, license, f2, (AbstractC3424e) c11139e.ad.invoke(f3)), ad.metrica.f32836e, c6538e, null), this);
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
    }
}
