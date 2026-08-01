package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16123e extends AbstractC10075e {
    public final InetSocketAddress vip;

    public C16123e(InetSocketAddress inetSocketAddress) {
        this.vip = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C16123e.class.equals(obj != null ? obj.getClass() : null)) {
            return AbstractC7890e.billing(this.vip, ((C16123e) obj).vip);
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
