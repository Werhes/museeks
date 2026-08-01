package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11042e extends AbstractC13616e implements InterfaceC8501e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C2245e f21874e;

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11042e) && AbstractC7890e.billing(this.f21874e, ((C11042e) obj).f21874e);
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        ArrayList arrayList = (ArrayList) this.f21874e.adcel;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0110e c0110e = (C0110e) arrayList.get(i);
            C16446e c16446e = c0110e.amazon;
            if (c16446e != null) {
                long j = c0110e.smaato;
                long j2 = c16446e.pro;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                C14434e c14434e = c4017e.f8940e;
                ((C5389e) c14434e.f28537e.f36228e).m1898this(f, f2);
                try {
                    C17138e.metrica(c4017e, c16446e);
                } finally {
                    ((C5389e) c14434e.f28537e.f36228e).m1898this(-f, -f2);
                }
            }
        }
        c4017e.ad();
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        C2245e c2245e = this.f21874e;
        c2245e.purchase();
        c2245e.license = null;
        c2245e.vip = -1;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        this.f21874e.mopub = this;
    }

    public final int hashCode() {
        return this.f21874e.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f21874e + ')';
    }
}
