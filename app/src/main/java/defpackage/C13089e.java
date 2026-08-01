package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13089e extends AbstractC16858e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C3168e f26035e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f26036e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ String f26037e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13089e(boolean z, C3168e c3168e, String str) {
        super(0);
        this.f26036e = z;
        this.f26035e = c3168e;
        this.f26037e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f26036e) {
            C3168e c3168e = this.f26035e;
            String str = this.f26037e;
            C3560e c3560e = (C3560e) c3168e.f7271e;
            synchronized (((C10215e) c3560e.purchase)) {
            }
        }
        return Unit.INSTANCE;
    }
}
