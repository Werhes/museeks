package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۤ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13610e implements InterfaceC11905e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC0043e f26999e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC18435e f27001e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC11905e f27004e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public InterfaceC0043e f27006e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0576e f27000e = AbstractC14533e.startapp(Boolean.FALSE);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C17073e f27003e = new C17073e(16, this);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C12742e f27005e = new C12742e();

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C11952e f27002e = new C11952e();

    public C13610e(InterfaceC11905e interfaceC11905e, InterfaceC18435e interfaceC18435e) {
        this.f27004e = interfaceC11905e;
        this.f27001e = interfaceC18435e;
    }

    @Override // defpackage.InterfaceC11905e
    public final InterfaceC0043e ad(InterfaceC0043e interfaceC0043e) {
        return this.f27004e.ad(interfaceC0043e);
    }

    public final void appmetrica() {
        Collection<C7589e> values = ((AbstractC15582e) this.f27002e.metrica().metrica).values();
        boolean z = false;
        for (C7589e c7589e : values) {
            z = z || (c7589e.ad() && c7589e.license());
            c7589e.appmetrica();
        }
        if (z != vip()) {
            this.f27000e.setValue(Boolean.valueOf(z));
            if (z) {
                return;
            }
            for (C7589e c7589e2 : values) {
                if (c7589e2.metrica().size() > 1) {
                    List metrica = c7589e2.metrica();
                    int i = AbstractC6068e.ad;
                    int size = metrica.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((C16223e) metrica.get(i2)).license().vip()) {
                            break;
                        }
                    }
                }
                C11224e c11224e = c7589e2.metrica;
                c11224e.vip = 1;
                c11224e.ad = ((C16330e) c11224e.purchase).purchase();
                ((C0576e) c11224e.appmetrica).setValue(C4471e.ad);
            }
        }
    }

    public final C9185e license(String str, C13770e c13770e) {
        c13770e.m3676strictfp(800730162);
        c13770e.m3676strictfp(-148945892);
        boolean purchase = c13770e.purchase(str);
        Object m3681throw = c13770e.m3681throw();
        if (purchase || m3681throw == C2987e.ad) {
            m3681throw = new C9185e(str);
            c13770e.m3682throws(m3681throw);
        }
        C9185e c9185e = (C9185e) m3681throw;
        c9185e.vip.setValue(C8009e.ad);
        c13770e.Signature(false);
        c13770e.Signature(false);
        return c9185e;
    }

    @Override // defpackage.InterfaceC11905e
    public final long metrica(InterfaceC0043e interfaceC0043e, InterfaceC0043e interfaceC0043e2) {
        return this.f27004e.metrica(interfaceC0043e, interfaceC0043e2);
    }

    public final boolean vip() {
        return ((Boolean) this.f27000e.getValue()).booleanValue();
    }
}
