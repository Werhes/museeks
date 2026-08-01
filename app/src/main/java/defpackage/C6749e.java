package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6749e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f13947e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13817e f13948e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13949e;

    public /* synthetic */ C6749e(C13817e c13817e, int i, int i2) {
        this.f13949e = i2;
        this.f13948e = c13817e;
        this.f13947e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f13949e;
        C13770e c13770e = (C13770e) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                this.f13948e.startapp(c13770e, AbstractC5190e.advert(this.f13947e | 1));
                return Unit.INSTANCE;
            case 1:
                this.f13948e.adcel(c13770e, AbstractC5190e.advert(this.f13947e | 1));
                return Unit.INSTANCE;
            default:
                this.f13948e.yandex(c13770e, AbstractC5190e.advert(this.f13947e | 1));
                return Unit.INSTANCE;
        }
    }
}
