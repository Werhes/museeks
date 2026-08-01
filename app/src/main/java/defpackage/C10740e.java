package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10740e extends View.DragShadowBuilder {
    public final C11315e ad;
    public final Function1 metrica;
    public final long vip;

    public C10740e(C11315e c11315e, long j, Function1 function1) {
        this.ad = c11315e;
        this.vip = j;
        this.metrica = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C14434e c14434e = new C14434e();
        Canvas canvas2 = AbstractC16863e.ad;
        C11648e c11648e = new C11648e();
        c11648e.ad = canvas;
        C17539e c17539e = c14434e.f28539e;
        InterfaceC14388e interfaceC14388e = c17539e.ad;
        EnumC7792e enumC7792e = c17539e.vip;
        InterfaceC14576e interfaceC14576e = c17539e.metrica;
        long j = c17539e.license;
        c17539e.ad = this.ad;
        c17539e.vip = EnumC7792e.f15794e;
        c17539e.metrica = c11648e;
        c17539e.license = this.vip;
        c11648e.billing();
        this.metrica.invoke(c14434e);
        c11648e.admob();
        c17539e.ad = interfaceC14388e;
        c17539e.vip = enumC7792e;
        c17539e.metrica = interfaceC14576e;
        c17539e.license = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.vip;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        C11315e c11315e = this.ad;
        point.set(AbstractC4653e.ad(c11315e, intBitsToFloat / c11315e.vip()), AbstractC4653e.ad(c11315e, Float.intBitsToFloat((int) (j & 4294967295L)) / c11315e.vip()));
        point2.set(point.x / 2, point.y / 2);
    }
}
