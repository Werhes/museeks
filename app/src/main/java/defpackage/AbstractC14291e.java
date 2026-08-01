package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۠ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14291e {
    public static final C5581e license = new Object();
    public final AbstractC14291e ad;
    public boolean metrica = false;
    public final C17519e vip;

    public /* synthetic */ AbstractC14291e(AbstractC14291e abstractC14291e, C17519e c17519e) {
        if (abstractC14291e != null) {
            AbstractC2301e.billing(abstractC14291e.metrica);
        }
        this.ad = abstractC14291e;
        this.vip = c17519e;
    }

    public static AbstractC14291e ad(AbstractC14291e abstractC14291e, AbstractC14291e abstractC14291e2) {
        abstractC14291e.getClass();
        AbstractC14291e abstractC14291e3 = C10832e.appmetrica;
        if (abstractC14291e == abstractC14291e3) {
            return abstractC14291e2;
        }
        abstractC14291e2.getClass();
        if (abstractC14291e2 == abstractC14291e3) {
            return abstractC14291e;
        }
        AbstractC12614e<AbstractC14291e> Signature = AbstractC12614e.Signature(2, abstractC14291e, abstractC14291e2);
        if (Signature.isEmpty()) {
            return abstractC14291e3;
        }
        if (Signature.size() == 1) {
            return (AbstractC14291e) Signature.iterator().next();
        }
        int i = 0;
        for (AbstractC14291e abstractC14291e4 : Signature) {
            do {
                i += abstractC14291e4.vip.f34352e;
                abstractC14291e4 = abstractC14291e4.ad;
            } while (abstractC14291e4 != null);
        }
        if (i == 0) {
            return C10832e.appmetrica;
        }
        C17519e c17519e = new C17519e(i);
        for (AbstractC14291e abstractC14291e5 : Signature) {
            do {
                int i2 = 0;
                while (true) {
                    C17519e c17519e2 = abstractC14291e5.vip;
                    if (i2 >= c17519e2.f34352e) {
                        break;
                    }
                    AbstractC2301e.startapp(c17519e.put((C5581e) c17519e2.purchase(i2), c17519e2.startapp(i2)) == null, "Duplicate bindings: %s", c17519e2.purchase(i2));
                    i2++;
                }
                abstractC14291e5 = abstractC14291e5.ad;
            } while (abstractC14291e5 != null);
        }
        return new AbstractC14291e(null, c17519e).vip();
    }

    public final boolean metrica() {
        if (this.vip.containsKey(license)) {
            return true;
        }
        AbstractC14291e abstractC14291e = this.ad;
        return abstractC14291e != null && abstractC14291e.metrica();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (AbstractC14291e abstractC14291e = this; abstractC14291e != null; abstractC14291e = abstractC14291e.ad) {
            for (int i = 0; i < abstractC14291e.vip.f34352e; i++) {
                sb.append("[");
                sb.append(this.vip.startapp(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }

    public final AbstractC14291e vip() {
        if (this.metrica) {
            throw new IllegalStateException("Already frozen");
        }
        this.metrica = true;
        AbstractC14291e abstractC14291e = this.ad;
        return (abstractC14291e == null || !this.vip.isEmpty()) ? this : abstractC14291e;
    }
}
