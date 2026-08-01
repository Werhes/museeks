package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5938e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16161e f12524e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12525e;

    public /* synthetic */ C5938e(C16161e c16161e, int i) {
        this.f12525e = i;
        this.f12524e = c16161e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f12525e) {
            case 0:
                this.f12524e.m4137strictfp(!((Boolean) r0.f31741e.getValue()).booleanValue());
                return Unit.INSTANCE;
            case 1:
                this.f12524e.f31741e.setValue(Boolean.TRUE);
                C15409e.ad.ad(true);
                return Unit.INSTANCE;
            case 2:
                this.f12524e.f31741e.setValue(Boolean.FALSE);
                C15409e.ad.ad(false);
                return Unit.INSTANCE;
            default:
                this.f12524e.f31741e.setValue(Boolean.FALSE);
                C15409e.ad.ad(false);
                return Unit.INSTANCE;
        }
    }
}
