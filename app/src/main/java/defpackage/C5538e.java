package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5538e {
    public static final C5538e metrica = new C5538e(0, null);
    public final int ad;
    public final InterfaceC13984e vip;

    public C5538e(int i, InterfaceC13984e interfaceC13984e) {
        String str;
        this.ad = i;
        this.vip = interfaceC13984e;
        if ((i == 0) == (interfaceC13984e == null)) {
            return;
        }
        if (i != 0) {
            StringBuilder sb = new StringBuilder("The projection variance ");
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "OUT" : "IN" : "INVARIANT");
            sb.append(" requires type to be specified.");
            str = sb.toString();
        } else {
            str = "Star projection must have no type specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5538e)) {
            return false;
        }
        C5538e c5538e = (C5538e) obj;
        return this.ad == c5538e.ad && AbstractC7890e.billing(this.vip, c5538e.vip);
    }

    public final int hashCode() {
        int i = this.ad;
        int m2467class = (i == 0 ? 0 : AbstractC8703e.m2467class(i)) * 31;
        InterfaceC13984e interfaceC13984e = this.vip;
        return m2467class + (interfaceC13984e != null ? interfaceC13984e.hashCode() : 0);
    }

    public final String toString() {
        int i = this.ad;
        int i2 = i == 0 ? -1 : AbstractC10906e.ad[AbstractC8703e.m2467class(i)];
        if (i2 == -1) {
            return "*";
        }
        InterfaceC13984e interfaceC13984e = this.vip;
        if (i2 == 1) {
            return String.valueOf(interfaceC13984e);
        }
        if (i2 == 2) {
            return "in " + interfaceC13984e;
        }
        if (i2 != 3) {
            throw new C14803e(10);
        }
        return "out " + interfaceC13984e;
    }
}
