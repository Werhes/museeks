package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؐۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1511e {
    public final C18464e ad;
    public boolean adcel;
    public boolean appmetrica;
    public long billing = 5000;
    public final C7755e license;
    public final C12490e metrica;
    public final C13377e mopub;
    public boolean purchase;
    public boolean startapp;
    public final C12490e vip;
    public final ValueAnimator yandex;

    public C1511e(C18464e c18464e, C12490e c12490e, C12490e c12490e2, C11689e c11689e, C7755e c7755e) {
        this.ad = c18464e;
        this.vip = c12490e;
        this.metrica = c12490e2;
        this.license = c7755e;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(0);
        this.yandex = ofFloat;
        this.mopub = new C13377e(this);
    }

    public final C12490e ad() {
        return this.appmetrica ? this.metrica : this.vip;
    }

    public final void vip(Function1 function1) {
        function1.invoke((InterfaceC12406e) ((InterfaceC16843e) this.vip.f22047e));
        function1.invoke((InterfaceC12406e) ((InterfaceC16843e) this.metrica.f22047e));
    }
}
