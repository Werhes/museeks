package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ۠ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11314e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f22702e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C15274e f22703e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C7765e f22704e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ long f22705e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ C14307e f22706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11314e(C15274e c15274e, C7765e c7765e, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f22703e = c15274e;
        this.f22704e = c7765e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C2152e) obj2).ad;
        C11314e c11314e = new C11314e(this.f22703e, this.f22704e, (InterfaceC5083e) obj3);
        c11314e.f22706e = (C14307e) obj;
        c11314e.f22705e = j;
        return c11314e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f22702e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C14307e c14307e = this.f22706e;
            long j = this.f22705e;
            C15274e c15274e = this.f22703e;
            if (c15274e != null) {
                C14749e c14749e = new C14749e(c14307e, this.f22704e, j, c15274e, (InterfaceC5083e) null);
                this.f22702e = 1;
                Object appmetrica = AbstractC9743e.appmetrica(c14749e, this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (appmetrica == enumC2821e) {
                    return enumC2821e;
                }
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
