package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٛۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14825e extends AbstractC5884e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C13935e f29357e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f29358e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14825e(C13935e c13935e, int i) {
        super(1);
        this.f29358e = i;
        this.f29357e = c13935e;
    }

    @Override // defpackage.AbstractC5884e
    public final void yandex(String[] strArr) {
        switch (this.f29358e) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                ((C4756e) this.f29357e.f27641e).f10183e = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                ((C4756e) this.f29357e.f27641e).f10179e = strArr;
                return;
        }
    }
}
