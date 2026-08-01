package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16889e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3566e f33101e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33102e;

    public /* synthetic */ C16889e(C3566e c3566e, int i) {
        this.f33102e = i;
        this.f33101e = c3566e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33102e) {
            case 0:
                ((Boolean) obj).getClass();
                this.f33101e.f8042e.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                return Unit.INSTANCE;
            default:
                new C18128e((List) obj).signatures(this.f33101e.f10582e);
                return Unit.INSTANCE;
        }
    }
}
