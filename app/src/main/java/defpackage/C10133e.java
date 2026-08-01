package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10133e extends C1117e {
    public C10133e(InterfaceC15498e interfaceC15498e, C10133e c10133e, int i, boolean z) {
        super(interfaceC15498e, c10133e, C4590e.f9885e, AbstractC15930e.billing, i, InterfaceC3054e.f7112e);
        this.f29658e = true;
        this.f29670e = z;
        this.f29673e = false;
    }

    @Override // defpackage.C1117e, defpackage.AbstractC14957e
    /* renamed from: eّؑۛ */
    public final AbstractC14957e mo361e(int i, InterfaceC2460e interfaceC2460e, InterfaceC15498e interfaceC15498e, InterfaceC16528e interfaceC16528e, C0520e c0520e, InterfaceC3054e interfaceC3054e) {
        return new C10133e(interfaceC15498e, (C10133e) interfaceC16528e, i, this.f29670e);
    }

    @Override // defpackage.AbstractC14957e
    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final AbstractC14957e mo2772e(C15704e c15704e) {
        C0520e c0520e;
        C10133e c10133e = (C10133e) super.mo2772e(c15704e);
        if (c10133e == null) {
            return null;
        }
        List mo330e = c10133e.mo330e();
        if (mo330e.isEmpty()) {
            return c10133e;
        }
        Iterator it = mo330e.iterator();
        while (it.hasNext()) {
            if (AbstractC16155e.billing(((C13043e) it.next()).ad()) != null) {
                List mo330e2 = c10133e.mo330e();
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(mo330e2, 10));
                Iterator it2 = mo330e2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(AbstractC16155e.billing(((C13043e) it2.next()).ad()));
                }
                int size = c10133e.mo330e().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    ArrayList m3579e = AbstractC13480e.m3579e(c10133e.mo330e(), arrayList);
                    if (m3579e.isEmpty()) {
                        return c10133e;
                    }
                    Iterator it3 = m3579e.iterator();
                    while (it3.hasNext()) {
                        C6571e c6571e = (C6571e) it3.next();
                        if (!AbstractC7890e.billing((C0520e) c6571e.f13544e, ((C13043e) c6571e.f13543e).getName())) {
                        }
                    }
                    return c10133e;
                }
                List<C13043e> mo330e3 = c10133e.mo330e();
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(mo330e3, 10));
                for (C13043e c13043e : mo330e3) {
                    C0520e name = c13043e.getName();
                    int i = c13043e.f25973e;
                    int i2 = i - size;
                    if (i2 >= 0 && (c0520e = (C0520e) arrayList.get(i2)) != null) {
                        name = c0520e;
                    }
                    arrayList2.add(c13043e.mo2439e(c10133e, name, i));
                }
                C15704e m3897e = c10133e.m3897e(C4542e.vip);
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((C0520e) it4.next()) == null) {
                            break;
                        }
                    }
                }
                z = false;
                m3897e.f30938e = Boolean.valueOf(z);
                m3897e.f30945e = arrayList2;
                m3897e.f30924e = c10133e.vip();
                return super.mo2772e(m3897e);
            }
        }
        return c10133e;
    }

    @Override // defpackage.AbstractC14957e, defpackage.InterfaceC16528e
    /* renamed from: eؘۗٚ */
    public final boolean mo464e() {
        return false;
    }

    @Override // defpackage.AbstractC14957e, defpackage.InterfaceC17577e
    /* renamed from: eْٗۚ */
    public final boolean mo466e() {
        return false;
    }

    @Override // defpackage.AbstractC14957e, defpackage.InterfaceC16528e
    public final boolean yandex() {
        return false;
    }
}
