package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٞٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17170e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f33660e = 1;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13742e f33661e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ boolean f33662e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7765e f33663e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f33664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17170e(C7765e c7765e, InterfaceC13742e interfaceC13742e, boolean z, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f33663e = c7765e;
        this.f33661e = interfaceC13742e;
        this.f33662e = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17170e(InterfaceC13742e interfaceC13742e, C7765e c7765e, boolean z, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f33661e = interfaceC13742e;
        this.f33663e = c7765e;
        this.f33662e = z;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f33660e) {
            case 0:
                return new C17170e(this.f33661e, this.f33663e, this.f33662e, interfaceC5083e);
            default:
                return new C17170e(this.f33663e, this.f33661e, this.f33662e, interfaceC5083e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f33660e) {
            case 0:
                return ((C17170e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C17170e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f33660e) {
            case 0:
                int i = this.f33664e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    boolean z = this.f33662e;
                    C7765e c7765e = this.f33663e;
                    C16722e c16722e = new C16722e(c7765e, z, 12);
                    C18486e c18486e = new C18486e(c7765e, 6);
                    this.f33664e = 1;
                    Object metrica = AbstractC13406e.metrica(this.f33661e, new C18042e(c16722e, c18486e, (InterfaceC5083e) null, 3), this);
                    Object obj2 = EnumC2821e.f6782e;
                    if (metrica != obj2) {
                        metrica = Unit.INSTANCE;
                    }
                    if (metrica == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i2 = this.f33664e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f33664e = 1;
                    Object vip = C7765e.vip(this.f33663e, this.f33661e, this.f33662e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (vip == enumC2821e) {
                        return enumC2821e;
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
