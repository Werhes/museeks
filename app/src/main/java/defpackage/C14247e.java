package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14247e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f28168e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28169e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7765e f28170e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f28171e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28172e;

    public /* synthetic */ C14247e(C7765e c7765e, boolean z, C2892e c2892e, int i, int i2) {
        this.f28172e = i2;
        this.f28170e = c7765e;
        this.f28169e = z;
        this.f28171e = c2892e;
        this.f28168e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f28172e;
        C13770e c13770e = (C13770e) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC12511e.metrica(this.f28170e, this.f28169e, this.f28171e, c13770e, AbstractC5190e.advert(this.f28168e | 1));
                return Unit.INSTANCE;
            default:
                AbstractC6190e.metrica(this.f28170e, this.f28169e, this.f28171e, c13770e, AbstractC5190e.advert(this.f28168e | 1));
                return Unit.INSTANCE;
        }
    }
}
