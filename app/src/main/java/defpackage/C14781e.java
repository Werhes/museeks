package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔ٘ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14781e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Bitmap f29308e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9326e f29309e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C12761e f29310e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29311e;

    public /* synthetic */ C14781e(C9326e c9326e, Bitmap bitmap, C12761e c12761e, int i, int i2) {
        this.f29311e = i2;
        this.f29309e = c9326e;
        this.f29308e = bitmap;
        this.f29310e = c12761e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f29311e;
        C13770e c13770e = (C13770e) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                this.f29309e.adcel(this.f29308e, this.f29310e, c13770e, AbstractC5190e.advert(513));
                return Unit.INSTANCE;
            default:
                this.f29309e.startapp(this.f29308e, this.f29310e, c13770e, AbstractC5190e.advert(513));
                return Unit.INSTANCE;
        }
    }
}
