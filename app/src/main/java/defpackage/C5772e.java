package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٝۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5772e extends AbstractC7185e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f12206e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f12207e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ C16007e f12208e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f12209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5772e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(4, interfaceC5083e);
        this.f12206e = i;
        this.f12207e = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f12206e;
        C16007e c16007e = (C16007e) obj2;
        ((Boolean) obj3).getClass();
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj4;
        switch (i) {
            case 0:
                C5772e c5772e = new C5772e((Bundle) this.f12207e, interfaceC5083e, 0);
                c5772e.f12208e = c16007e;
                return c5772e.loadAd(Unit.INSTANCE);
            default:
                C5772e c5772e2 = new C5772e((String) this.f12207e, interfaceC5083e, 1);
                c5772e2.f12208e = c16007e;
                return c5772e2.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f12206e) {
            case 0:
                int i = this.f12209e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C16007e c16007e = this.f12208e;
                    Bundle bundle = (Bundle) this.f12207e;
                    this.f12209e = 1;
                    c16007e.getClass();
                    Object purchase = c16007e.purchase(new C16440e(bundle), this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (purchase != enumC2821e) {
                        purchase = Unit.INSTANCE;
                    }
                    if (purchase == enumC2821e) {
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
                int i2 = this.f12209e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C16007e c16007e2 = this.f12208e;
                    String str = (String) this.f12207e;
                    this.f12209e = 1;
                    c16007e2.getClass();
                    Object purchase2 = c16007e2.purchase(new C4015e(str), this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (purchase2 != enumC2821e2) {
                        purchase2 = Unit.INSTANCE;
                    }
                    if (purchase2 == enumC2821e2) {
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
