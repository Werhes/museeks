package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؑؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0121e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f1279e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C8252e f1280e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ AbstractC11424e f1281e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f1282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0121e(C8252e c8252e, InterfaceC5083e interfaceC5083e, int i) {
        super(3, interfaceC5083e);
        this.f1279e = i;
        this.f1280e = c8252e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC11424e abstractC11424e = (AbstractC11424e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj3;
        switch (this.f1279e) {
            case 0:
                C0121e c0121e = new C0121e(this.f1280e, interfaceC5083e, 0);
                c0121e.f1281e = abstractC11424e;
                return c0121e.loadAd(Unit.INSTANCE);
            default:
                C0121e c0121e2 = new C0121e(this.f1280e, interfaceC5083e, 1);
                c0121e2.f1281e = abstractC11424e;
                return c0121e2.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f1279e) {
            case 0:
                AbstractC11424e abstractC11424e = this.f1281e;
                int i = this.f1282e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C10263e c10263e = (C10263e) abstractC11424e.f22964e;
                    this.f1281e = null;
                    this.f1282e = 1;
                    Object ad = this.f1280e.ad(c10263e, this);
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
                AbstractC11424e abstractC11424e2 = this.f1281e;
                int i2 = this.f1282e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C10263e c10263e2 = (C10263e) abstractC11424e2.f22964e;
                    this.f1281e = null;
                    this.f1282e = 1;
                    Object advert = this.f1280e.advert(c10263e2, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (advert == enumC2821e2) {
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
