package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۦؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5280e extends AbstractC10731e implements InterfaceC6034e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC8850e f11367e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public InterfaceC5083e f11368e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC6034e f11369e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public InterfaceC8850e f11370e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f11371e;

    public C5280e(InterfaceC6034e interfaceC6034e, InterfaceC8850e interfaceC8850e) {
        super(C3966e.f8849e, C2693e.f6576e);
        this.f11369e = interfaceC6034e;
        this.f11367e = interfaceC8850e;
        this.f11371e = ((Number) interfaceC8850e.mo395e(0, new C17706e(19))).intValue();
    }

    @Override // defpackage.AbstractC10731e, defpackage.InterfaceC5083e
    public final InterfaceC8850e admob() {
        InterfaceC8850e interfaceC8850e = this.f11370e;
        return interfaceC8850e == null ? C2693e.f6576e : interfaceC8850e;
    }

    @Override // defpackage.AbstractC9049e
    public final StackTraceElement amazon() {
        return null;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Throwable ad = C13523e.ad(obj);
        if (ad != null) {
            this.f11370e = new C0692e(admob(), ad);
        }
        InterfaceC5083e interfaceC5083e = this.f11368e;
        if (interfaceC5083e != null) {
            interfaceC5083e.billing(obj);
        }
        return EnumC2821e.f6782e;
    }

    @Override // defpackage.InterfaceC6034e
    public final Object startapp(Object obj, InterfaceC5083e interfaceC5083e) {
        try {
            Object subscription = subscription(interfaceC5083e, obj);
            return subscription == EnumC2821e.f6782e ? subscription : Unit.INSTANCE;
        } catch (Throwable th) {
            this.f11370e = new C0692e(interfaceC5083e.admob(), th);
            throw th;
        }
    }

    public final Object subscription(InterfaceC5083e interfaceC5083e, Object obj) {
        InterfaceC8850e admob = interfaceC5083e.admob();
        AbstractC6629e.yandex(admob);
        InterfaceC8850e interfaceC8850e = this.f11370e;
        if (interfaceC8850e != admob) {
            if (interfaceC8850e instanceof C0692e) {
                throw new IllegalStateException(AbstractC17540e.license("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C0692e) interfaceC8850e).f2982e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) admob.mo395e(0, new C17689e(25, this))).intValue() != this.f11371e) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f11367e + ",\n\t\tbut emission happened in " + admob + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f11370e = admob;
        }
        this.f11368e = interfaceC5083e;
        Object invoke = AbstractC7380e.ad.invoke(this.f11369e, obj, this);
        if (!AbstractC7890e.billing(invoke, EnumC2821e.f6782e)) {
            this.f11368e = null;
        }
        return invoke;
    }

    @Override // defpackage.AbstractC9049e, defpackage.InterfaceC18430e
    public final InterfaceC18430e vip() {
        InterfaceC5083e interfaceC5083e = this.f11368e;
        if (interfaceC5083e instanceof InterfaceC18430e) {
            return (InterfaceC18430e) interfaceC5083e;
        }
        return null;
    }
}
