package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11173e implements InterfaceC17050e {
    public final int vip;

    public C11173e(int i) {
        this.vip = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC17050e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC17050e)) {
            return false;
        }
        if (this.vip != ((C11173e) ((InterfaceC17050e) obj)).vip) {
            return false;
        }
        Object obj2 = EnumC17952e.f35198e;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.vip ^ 14552422) + (EnumC17952e.f35198e.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.vip + "intEncoding=" + EnumC17952e.f35198e + ')';
    }
}
