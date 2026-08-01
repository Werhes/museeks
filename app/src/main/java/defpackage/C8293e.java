package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۢۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8293e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C0110e f16969e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16446e f16970e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16971e;

    public /* synthetic */ C8293e(C16446e c16446e, C0110e c0110e, int i) {
        this.f16971e = i;
        this.f16970e = c16446e;
        this.f16969e = c0110e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C7558e c7558e = (C7558e) obj;
        switch (this.f16971e) {
            case 0:
                this.f16970e.purchase(((Number) c7558e.license()).floatValue());
                this.f16969e.metrica.invoke();
                return Unit.INSTANCE;
            default:
                this.f16970e.purchase(((Number) c7558e.license()).floatValue());
                this.f16969e.metrica.invoke();
                return Unit.INSTANCE;
        }
    }
}
