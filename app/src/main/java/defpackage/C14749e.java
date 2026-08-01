package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14749e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f29170e = 0;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f29171e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ long f29172e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Object f29173e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f29174e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f29175e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f29176e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14749e(C0904e c0904e, C0243e c0243e, InterfaceC13547e interfaceC13547e, long j, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f29174e = c0904e;
        this.f29171e = c0243e;
        this.f29173e = interfaceC13547e;
        this.f29172e = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14749e(C14307e c14307e, C7765e c7765e, long j, C15274e c15274e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f29174e = c14307e;
        this.f29171e = c7765e;
        this.f29172e = j;
        this.f29173e = c15274e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f29170e) {
            case 0:
                C14749e c14749e = new C14749e((C0904e) this.f29174e, (C0243e) this.f29171e, (InterfaceC13547e) this.f29173e, this.f29172e, interfaceC5083e);
                c14749e.f29175e = obj;
                return c14749e;
            default:
                C14749e c14749e2 = new C14749e((C14307e) this.f29174e, (C7765e) this.f29171e, this.f29172e, (C15274e) this.f29173e, interfaceC5083e);
                c14749e2.f29175e = obj;
                return c14749e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f29170e) {
            case 0:
                return ((C14749e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C14749e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f29170e) {
            case 0:
                C0904e c0904e = (C0904e) this.f29174e;
                C5389e c5389e = c0904e.f3311e;
                int i = this.f29176e;
                try {
                    try {
                        if (i == 0) {
                            AbstractC2003e.purchase(obj);
                            InterfaceC10500e startapp = AbstractC6629e.startapp(((InterfaceC18435e) this.f29175e).advert());
                            c0904e.f3310e = true;
                            C11950e c11950e = c0904e.f3307e;
                            EnumC6955e enumC6955e = EnumC6955e.f14256e;
                            C12200e c12200e = new C12200e((C0243e) this.f29171e, c0904e, (InterfaceC13547e) this.f29173e, this.f29172e, startapp, null);
                            this.f29176e = 1;
                            Object purchase = c11950e.purchase(enumC6955e, c12200e, this);
                            EnumC2821e enumC2821e = EnumC2821e.f6782e;
                            if (purchase == enumC2821e) {
                                return enumC2821e;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC2003e.purchase(obj);
                        }
                        c5389e.subs();
                        c0904e.f3310e = false;
                        c5389e.license(null);
                        c0904e.f3303e = false;
                        return Unit.INSTANCE;
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    c0904e.f3310e = false;
                    c5389e.license(null);
                    c0904e.f3303e = false;
                    throw th;
                }
            default:
                C7765e c7765e = (C7765e) this.f29171e;
                int i2 = this.f29176e;
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    AbstractC5336e.purchase((InterfaceC18435e) this.f29175e, null, 0, new C5840e((C7765e) this.f29171e, this.f29172e, (C15274e) this.f29173e, (InterfaceC5083e) null, 9), 3);
                    C14307e c14307e = (C14307e) this.f29174e;
                    this.f29176e = 1;
                    obj = c14307e.purchase(this);
                    if (obj == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        c7765e.inmobi = null;
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C17612e c17612e = c7765e.inmobi;
                if (c17612e != null) {
                    C15274e c15274e = (C15274e) this.f29173e;
                    InterfaceC13352e c3103e = booleanValue ? new C3103e(c17612e) : new C1867e(c17612e);
                    this.f29176e = 2;
                    if (c15274e.ad(c3103e, this) == enumC2821e2) {
                        return enumC2821e2;
                    }
                }
                c7765e.inmobi = null;
                return Unit.INSTANCE;
        }
    }
}
