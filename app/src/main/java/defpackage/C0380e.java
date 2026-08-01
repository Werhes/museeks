package defpackage;

import java.net.SocketAddress;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٙٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0380e extends AbstractC10075e {
    public final SocketAddress vip;

    static {
        try {
            Class.forName("java.net.UnixDomainSocketAddress");
        } catch (ClassNotFoundException unused) {
        }
    }

    public C0380e(SocketAddress socketAddress) {
        this.vip = socketAddress;
        if (!socketAddress.getClass().getName().equals("java.net.UnixDomainSocketAddress")) {
            throw new IllegalStateException("address should be java.net.UnixDomainSocketAddress");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C0380e.class.equals(obj != null ? obj.getClass() : null)) {
            return AbstractC7890e.billing(this.vip, ((C0380e) obj).vip);
        }
        return false;
    }

    public final int hashCode() {
        return this.vip.hashCode();
    }

    @Override // defpackage.AbstractC10075e
    public final SocketAddress purchase() {
        return this.vip;
    }

    public final String toString() {
        return this.vip.toString();
    }
}
