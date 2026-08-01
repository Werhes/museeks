package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3426e extends AbstractC15023e implements Serializable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC15023e f7661e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC8223e f7662e;

    public C3426e(InterfaceC8223e interfaceC8223e, AbstractC15023e abstractC15023e) {
        this.f7662e = interfaceC8223e;
        this.f7661e = abstractC15023e;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC8223e interfaceC8223e = this.f7662e;
        return this.f7661e.compare(interfaceC8223e.apply(obj), interfaceC8223e.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3426e) {
            C3426e c3426e = (C3426e) obj;
            if (this.f7662e.equals(c3426e.f7662e) && this.f7661e.equals(c3426e.f7661e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7662e, this.f7661e});
    }

    public final String toString() {
        return this.f7661e + ".onResultOf(" + this.f7662e + ")";
    }
}
