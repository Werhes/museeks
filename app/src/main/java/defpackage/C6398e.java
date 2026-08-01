package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6398e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C6563e f13256e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C12340e f13257e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C6828e f13258e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ boolean f13259e;

    public C6398e(boolean z, C12340e c12340e, C6563e c6563e, C6828e c6828e) {
        this.f13259e = z;
        this.f13257e = c12340e;
        this.f13256e = c6563e;
        this.f13258e = c6828e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = this.f13259e;
        C6563e c6563e = this.f13256e;
        C12340e c12340e = this.f13257e;
        if (z) {
            c12340e.f24735e.remove(c6563e.ad);
        } else {
            c12340e.f24735e.put(c6563e.ad, this.f13258e.ad);
        }
        return Unit.INSTANCE;
    }
}
