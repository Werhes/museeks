package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۦۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9910e implements InterfaceC10455e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f19546e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f19547e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC8850e f19548e;

    public AbstractC9910e(InterfaceC8850e interfaceC8850e, int i, int i2) {
        this.f19548e = interfaceC8850e;
        this.f19547e = i;
        this.f19546e = i2;
    }

    @Override // defpackage.InterfaceC1108e
    public Object ad(InterfaceC6034e interfaceC6034e, InterfaceC5083e interfaceC5083e) {
        Object appmetrica = AbstractC9743e.appmetrica(new C14869e(interfaceC6034e, this, (InterfaceC5083e) null, 20), interfaceC5083e);
        return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
    }

    public abstract Object appmetrica(InterfaceC9543e interfaceC9543e, InterfaceC5083e interfaceC5083e);

    public abstract AbstractC9910e billing(InterfaceC8850e interfaceC8850e, int i, int i2);

    public String metrica() {
        return null;
    }

    public InterfaceC10441e startapp(InterfaceC18435e interfaceC18435e) {
        int i = this.f19547e;
        if (i == -3) {
            i = -2;
        }
        Function2 c1853e = new C1853e(this, (InterfaceC5083e) null, 20);
        C2448e c2448e = new C2448e(AbstractC6494e.loadAd(interfaceC18435e, this.f19548e), AbstractC12501e.ad(i, this.f19546e, null, 4));
        c2448e.m4472e(3, c2448e, c1853e);
        return c2448e;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String metrica = metrica();
        if (metrica != null) {
            arrayList.add(metrica);
        }
        C2693e c2693e = C2693e.f6576e;
        InterfaceC8850e interfaceC8850e = this.f19548e;
        if (interfaceC8850e != c2693e) {
            arrayList.add("context=" + interfaceC8850e);
        }
        int i = this.f19547e;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.f19546e;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(AbstractC10257e.applovin(i2)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return AbstractC4653e.applovin(sb, AbstractC13480e.m3608try(arrayList, ", ", null, null, null, 62), ']');
    }

    @Override // defpackage.InterfaceC10455e
    public final InterfaceC1108e vip(InterfaceC8850e interfaceC8850e, int i, int i2) {
        InterfaceC8850e interfaceC8850e2 = this.f19548e;
        InterfaceC8850e mo394const = interfaceC8850e.mo394const(interfaceC8850e2);
        int i3 = this.f19546e;
        int i4 = this.f19547e;
        if (i2 == 1) {
            if (i4 != -3) {
                if (i != -3) {
                    if (i4 != -2) {
                        if (i != -2) {
                            i += i4;
                            if (i < 0) {
                                i = Alert.DURATION_SHOW_INDEFINITELY;
                            }
                        }
                    }
                }
                i = i4;
            }
            i2 = i3;
        }
        return (AbstractC7890e.billing(mo394const, interfaceC8850e2) && i == i4 && i2 == i3) ? this : billing(mo394const, i, i2);
    }

    public InterfaceC1108e yandex() {
        return null;
    }
}
