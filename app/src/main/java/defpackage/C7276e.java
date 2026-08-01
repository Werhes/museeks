package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٛؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7276e implements InterfaceC6823e, Serializable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public volatile transient boolean f14883e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC6823e f14884e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public transient Object f14885e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final transient Object f14886e = new Object();

    public C7276e(InterfaceC6823e interfaceC6823e) {
        interfaceC6823e.getClass();
        this.f14884e = interfaceC6823e;
    }

    @Override // defpackage.InterfaceC6823e
    public final Object get() {
        if (!this.f14883e) {
            synchronized (this.f14886e) {
                try {
                    if (!this.f14883e) {
                        Object obj = this.f14884e.get();
                        this.f14885e = obj;
                        this.f14883e = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f14885e;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f14883e) {
            obj = "<supplier that returned " + this.f14885e + ">";
        } else {
            obj = this.f14884e;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
