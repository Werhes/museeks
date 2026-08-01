package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2404e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10279e f6140e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6141e;

    public /* synthetic */ C2404e(C10279e c10279e, int i) {
        this.f6141e = i;
        this.f6140e = c10279e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6141e) {
            case 0:
                this.f6140e.license(C14411e.f28494e);
                return Unit.INSTANCE;
            case 1:
                this.f6140e.ad.recreate();
                return Unit.INSTANCE;
            default:
                this.f6140e.license(C2576e.f6436e);
                return Unit.INSTANCE;
        }
    }
}
