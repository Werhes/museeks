package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٚۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4207e implements InterfaceC10332e {
    public final int vip;

    public C4207e(int i) {
        this.vip = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC10332e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC10332e)) {
            return false;
        }
        if (this.vip != ((C4207e) ((InterfaceC10332e) obj)).vip) {
            return false;
        }
        Object obj2 = EnumC15814e.f31187e;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.vip) + (EnumC15814e.f31187e.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.vip + "intEncoding=" + EnumC15814e.f31187e + ')';
    }
}
