package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۢ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1411e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f4225e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4226e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4227e;

    public /* synthetic */ C1411e(boolean z, Function0 function0, int i) {
        this.f4227e = i;
        this.f4226e = z;
        this.f4225e = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4227e) {
            case 0:
                if (this.f4226e) {
                    this.f4225e.invoke();
                }
                return Unit.INSTANCE;
            default:
                if (!this.f4226e) {
                    this.f4225e.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
