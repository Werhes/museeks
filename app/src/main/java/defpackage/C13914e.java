package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13914e extends Cpackage {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC16946e f27578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13914e(InterfaceC6647e interfaceC6647e, AbstractC1186e abstractC1186e) {
        super(abstractC1186e);
        if (abstractC1186e == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f27578e = (AbstractC16946e) interfaceC6647e;
    }

    public final String toString() {
        return ad() + ": Ext {" + this.f27578e + "}";
    }
}
