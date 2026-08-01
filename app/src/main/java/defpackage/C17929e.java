package defpackage;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17929e implements InterfaceC11801e, Serializable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f35171e;

    public C17929e(List list) {
        this.f35171e = list;
    }

    @Override // defpackage.InterfaceC11801e
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f35171e;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC11801e) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17929e) {
            return this.f35171e.equals(((C17929e) obj).f35171e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35171e.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f35171e) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
