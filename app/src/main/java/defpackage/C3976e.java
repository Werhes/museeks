package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3976e implements InterfaceC3058e {
    public final int vip;

    public C3976e(int i) {
        this.vip = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC3058e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC3058e)) {
            return false;
        }
        if (this.vip != ((C3976e) ((InterfaceC3058e) obj)).vip) {
            return false;
        }
        Object obj2 = EnumC15299e.f30231e;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.vip ^ 14552422) + (EnumC15299e.f30231e.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.vip + "intEncoding=" + EnumC15299e.f30231e + ')';
    }
}
