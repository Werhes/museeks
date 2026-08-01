package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۡؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14298e implements InterfaceC15690e {
    public final int vip;

    public C14298e(int i) {
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return C14298e.class.equals(obj != null ? obj.getClass() : null) && this.vip == ((C14298e) obj).vip;
    }

    public final int hashCode() {
        return this.vip;
    }

    public final String toString() {
        return AbstractC1786e.pro(new StringBuilder("AndroidPointerIcon(type="), this.vip, ')');
    }
}
