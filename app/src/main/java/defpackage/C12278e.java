package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12278e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4602e f24614e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24615e;

    public /* synthetic */ C12278e(C4602e c4602e, int i) {
        this.f24615e = i;
        this.f24614e = c4602e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f24615e) {
            case 0:
                this.f24614e.license();
                return Unit.INSTANCE;
            case 1:
                try {
                    this.f24614e.license();
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            default:
                this.f24614e.license();
                return Unit.INSTANCE;
        }
    }
}
