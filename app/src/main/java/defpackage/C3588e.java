package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۘۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3588e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC4619e f8111e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ Object f8112e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ C7256e f8113e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f8114e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ boolean f8115e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final /* synthetic */ C2119e f8116e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C2119e f8117e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f8118e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f8119e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C7256e f8120e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f8121e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3588e(C7256e c7256e, Object obj, boolean z, C2119e c2119e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f8113e = c7256e;
        this.f8112e = obj;
        this.f8115e = z;
        this.f8116e = c2119e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C3588e(this.f8113e, this.f8112e, this.f8115e, this.f8116e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3588e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [eؚؗؔ] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object obj2;
        C2119e c2119e;
        int i;
        C7256e c7256e;
        C17651e c17651e;
        boolean z;
        InterfaceC4619e interfaceC4619e;
        Throwable th;
        Object obj3;
        C7256e c7256e2;
        Object obj4;
        int i2 = this.f8118e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        try {
            if (i2 == 0) {
                AbstractC2003e.purchase(obj);
                C7256e c7256e3 = this.f8113e;
                C17651e c17651e2 = c7256e3.vip;
                this.f8111e = c17651e2;
                obj2 = this.f8112e;
                this.f8121e = obj2;
                this.f8120e = c7256e3;
                c2119e = this.f8116e;
                this.f8117e = c2119e;
                boolean z2 = this.f8115e;
                this.f8119e = z2;
                i = 0;
                this.f8114e = 0;
                this.f8118e = 1;
                if (c17651e2.appmetrica(this) != enumC2821e) {
                    c7256e = c7256e3;
                    c17651e = c17651e2;
                    z = z2;
                }
                return enumC2821e;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c7256e = this.f8120e;
                c7256e2 = (C7256e) this.f8121e;
                interfaceC4619e = this.f8111e;
                try {
                    AbstractC2003e.purchase(obj);
                    c7256e.value = obj;
                    c7256e = c7256e2;
                    obj4 = c7256e.value;
                    ((C17651e) interfaceC4619e).billing(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    ((C17651e) interfaceC4619e).billing(null);
                    throw th;
                }
            }
            int i3 = this.f8114e;
            z = this.f8119e;
            c2119e = this.f8117e;
            C7256e c7256e4 = this.f8120e;
            obj2 = this.f8121e;
            ?? r8 = this.f8111e;
            AbstractC2003e.purchase(obj);
            c17651e = r8;
            i = i3;
            c7256e = c7256e4;
            obj3 = c7256e.value;
            if (!AbstractC7890e.billing(obj2, obj3) && !z) {
                interfaceC4619e = c17651e;
                obj4 = c7256e.value;
                ((C17651e) interfaceC4619e).billing(null);
                return obj4;
            }
            this.f8111e = c17651e;
            this.f8121e = c7256e;
            this.f8120e = c7256e;
            this.f8117e = null;
            this.f8114e = i;
            this.f8118e = 2;
            Object invoke = c2119e.invoke(this);
            if (invoke != enumC2821e) {
                interfaceC4619e = c17651e;
                obj = invoke;
                c7256e2 = c7256e;
                c7256e.value = obj;
                c7256e = c7256e2;
                obj4 = c7256e.value;
                ((C17651e) interfaceC4619e).billing(null);
                return obj4;
            }
            return enumC2821e;
        } catch (Throwable th3) {
            interfaceC4619e = c17651e;
            th = th3;
            ((C17651e) interfaceC4619e).billing(null);
            throw th;
        }
    }
}
