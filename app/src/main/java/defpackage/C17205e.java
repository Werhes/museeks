package defpackage;

import android.os.Build;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17205e extends AbstractC7185e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f33728e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ View f33729e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0888e f33730e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f33731e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f33732e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ C3225e f33733e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ C3225e f33734e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17205e(InterfaceC0888e interfaceC0888e, Function2 function2, View view, InterfaceC16132e interfaceC16132e, InterfaceC5083e interfaceC5083e) {
        super(4, interfaceC5083e);
        this.f33730e = interfaceC0888e;
        this.f33732e = function2;
        this.f33729e = view;
        this.f33731e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        View view = this.f33729e;
        InterfaceC16132e interfaceC16132e = this.f33731e;
        C17205e c17205e = new C17205e(this.f33730e, this.f33732e, view, interfaceC16132e, (InterfaceC5083e) obj4);
        c17205e.f33734e = (C3225e) obj2;
        c17205e.f33733e = (C3225e) obj3;
        return c17205e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C3225e c3225e = this.f33734e;
        C3225e c3225e2 = this.f33733e;
        int i = this.f33728e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            InterfaceC0888e interfaceC0888e = this.f33730e;
            interfaceC0888e.yandex();
            this.f33732e.invoke(new Integer(c3225e.ad - 1), new Integer(c3225e2.ad - 1));
            this.f33734e = null;
            this.f33733e = null;
            this.f33728e = 1;
            Object mopub = interfaceC0888e.mopub(this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (mopub == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        View view = this.f33729e;
        if (AbstractC7640e.vip(view.getContext()) && !((C10876e) this.f33731e.getValue()).f21540e) {
            if (Build.VERSION.SDK_INT >= 34) {
                view.performHapticFeedback(27);
            } else {
                view.performHapticFeedback(4);
            }
        }
        return Unit.INSTANCE;
    }
}
