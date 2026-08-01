package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16134e extends AbstractC5884e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC15813e f31717e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f31718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16134e(InterfaceC15813e interfaceC15813e, int i) {
        super(1);
        this.f31718e = i;
        this.f31717e = interfaceC15813e;
    }

    @Override // defpackage.AbstractC5884e
    public final void yandex(String[] strArr) {
        switch (this.f31718e) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ((C4756e) ((C7988e) this.f31717e).f16176e).f10183e = strArr;
                return;
            case 1:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ((C4756e) ((C7988e) this.f31717e).f16176e).f10179e = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((C4756e) ((C16089e) this.f31717e).f31681e).f10182e = strArr;
                return;
        }
    }
}
