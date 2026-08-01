package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17695e extends AbstractC2803e implements InterfaceC1012e {
    public final String metrica;
    public final String vip;

    public C17695e(String str, String str2) {
        this.vip = str;
        this.metrica = str2;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == '/') {
                throw new IllegalArgumentException("Multisegment prefix is not supported");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17695e)) {
            return false;
        }
        C17695e c17695e = (C17695e) obj;
        return AbstractC7890e.billing(this.vip, c17695e.vip) && AbstractC7890e.billing(this.metrica, c17695e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (this.vip.hashCode() * 31);
    }

    public final String toString() {
        return "{...}";
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.AbstractC2803e
    public final AbstractC9510e yandex(C1740e c1740e, int i) {
        InterfaceC11129e c8976e;
        String str;
        ?? r8 = c1740e.f4739e;
        String str2 = this.metrica;
        int i2 = 0;
        if (str2.length() > 0 && ((str = (String) AbstractC13480e.m3592native(i, r8)) == null || !AbstractC6507e.pro(str, str2, false))) {
            return AbstractC9510e.ad;
        }
        String str3 = this.vip;
        if (str3.length() == 0) {
            InterfaceC11129e.vip.getClass();
            c8976e = C2991e.metrica;
        } else {
            List subs = AbstractC13480e.subs(i, (List) r8);
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(subs, 10));
            for (Object obj : subs) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC6874e.Signature();
                    throw null;
                }
                String str4 = (String) obj;
                if (i2 == 0) {
                    str4 = AbstractC5304e.applovin(str2.length(), str4);
                }
                arrayList.add(str4);
                i2 = i3;
            }
            c8976e = new C8976e(str3, arrayList);
        }
        return new C2545e(i < r8.size() ? 0.1d : 0.2d, c8976e, r8.size() - i);
    }
}
