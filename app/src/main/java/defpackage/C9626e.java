package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٞؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9626e extends AbstractC7919e {
    public final ArrayList adcel() {
        InterfaceC2209e interfaceC2209e = (InterfaceC2209e) this.f16034e;
        if (interfaceC2209e instanceof AbstractC5918e) {
            return ((AbstractC5918e) interfaceC2209e).vip;
        }
        throw new IllegalStateException("Current node cannot accept children");
    }

    @Override // defpackage.InterfaceC11305e
    public final void amazon(int i, Object obj) {
        InterfaceC2209e interfaceC2209e = (InterfaceC2209e) obj;
        int i2 = ((AbstractC5918e) this.f16034e).ad;
        if (i2 <= 0) {
            throw new IllegalArgumentException(("Too many embedded views for the current surface. The maximum depth is: " + ((AbstractC5918e) this.f16035e).ad).toString());
        }
        if (interfaceC2209e instanceof AbstractC5918e) {
            ((AbstractC5918e) interfaceC2209e).ad = i2 - 1;
        }
        adcel().add(i, interfaceC2209e);
    }

    @Override // defpackage.InterfaceC11305e
    public final /* bridge */ /* synthetic */ void license(int i, Object obj) {
    }

    @Override // defpackage.AbstractC7919e
    public final void purchase() {
        ((AbstractC5918e) this.f16035e).vip.clear();
    }

    @Override // defpackage.InterfaceC11305e
    public final void startapp(int i, int i2) {
        ArrayList adcel = adcel();
        if (i2 == 1) {
            adcel.remove(i);
        } else {
            adcel.subList(i, i2 + i).clear();
        }
    }

    @Override // defpackage.InterfaceC11305e
    public final void yandex(int i, int i2, int i3) {
        ArrayList adcel = adcel();
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List subList = adcel.subList(i, i3 + i);
            ArrayList arrayList = new ArrayList(subList);
            subList.clear();
            adcel.addAll(i4, arrayList);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            adcel.set(i, adcel.set(i2, adcel.get(i)));
        } else {
            adcel.add(i4, adcel.remove(i));
        }
    }
}
