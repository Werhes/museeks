package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8568e extends AbstractC7185e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f17387e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2869e f17388e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f17389e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C14995e f17390e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ C1295e f17391e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ C5624e f17392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8568e(C14995e c14995e, InterfaceC2869e interfaceC2869e, InterfaceC5083e interfaceC5083e) {
        super(4, interfaceC5083e);
        this.f17390e = c14995e;
        this.f17388e = interfaceC2869e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C8568e c8568e = new C8568e(this.f17390e, this.f17388e, (InterfaceC5083e) obj4);
        c8568e.f17392e = (C5624e) obj;
        c8568e.f17391e = (C1295e) obj2;
        c8568e.f17389e = obj3;
        return c8568e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f17387e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C5624e c5624e = this.f17392e;
            C1295e c1295e = this.f17391e;
            Object obj2 = this.f17389e;
            C14995e c14995e = this.f17390e;
            float purchase = ((C2616e) c14995e.adcel).purchase();
            this.f17392e = null;
            this.f17391e = null;
            this.f17387e = 1;
            Object vip = AbstractC11750e.vip(c14995e, purchase, c5624e, c1295e, obj2, this.f17388e, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (vip == enumC2821e) {
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
