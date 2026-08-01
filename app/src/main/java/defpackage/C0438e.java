package defpackage;

import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438e implements InterfaceC16180e {
    public final View ad;
    public Runnable adcel;
    public final Function0 metrica;
    public RunnableC4904e startapp;
    public final Function1 vip;
    public ActionMode yandex;
    public final C10684e license = new C10684e();
    public final C13128e appmetrica = new C13128e(new C17161e(this, 0));
    public final C17161e purchase = new C17161e(this, 1);
    public final C17161e billing = new C17161e(this, 2);

    public C0438e(View view, Function1 function1, Function0 function0) {
        this.ad = view;
        this.vip = function1;
        this.metrica = function0;
    }

    @Override // defpackage.InterfaceC16180e
    public final Object ad(InterfaceC1403e interfaceC1403e, AbstractC7185e abstractC7185e) {
        C17212e c17212e = new C17212e(this, interfaceC1403e, null, 1);
        C10684e c10684e = this.license;
        c10684e.getClass();
        Object appmetrica = AbstractC9743e.appmetrica(new C6365e(EnumC6955e.f14256e, c10684e, c17212e, null), abstractC7185e);
        return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
    }
}
