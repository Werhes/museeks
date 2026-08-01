package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5701e {
    public static final C9684e metrica = new C9684e();
    public final ArrayList ad;
    public final ArrayList vip;

    public C5701e(long j, InterfaceC11806e interfaceC11806e) {
        float f = ((float) j) * 0.03f;
        int i = (int) f;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(interfaceC11806e.appmetrica(Float.valueOf(i2 / f)));
        }
        this.ad = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            PointF pointF = ((C16465e) this.ad.get(i3)).ad;
            arrayList2.add(new C16465e(new PointF(pointF.x, pointF.y)));
        }
        this.vip = arrayList2;
    }

    public final void ad(InterfaceC11938e... interfaceC11938eArr) {
        Iterator it = this.ad.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            C16465e c16465e = (C16465e) it.next();
            C16465e c16465e2 = (C16465e) this.vip.get(i);
            PointF pointF = c16465e2.ad;
            PointF pointF2 = c16465e.ad;
            pointF.x = pointF2.x;
            pointF.y = pointF2.y;
            for (InterfaceC11938e interfaceC11938e : interfaceC11938eArr) {
                interfaceC11938e.vip(c16465e2);
            }
            i = i2;
        }
    }
}
