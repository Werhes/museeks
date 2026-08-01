package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0233e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f1474e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f1475e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13621e f1476e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f1477e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1478e;

    public /* synthetic */ C0233e(C13621e c13621e, C2892e c2892e, InterfaceC12864e interfaceC12864e, int i, int i2) {
        this.f1478e = i2;
        this.f1476e = c13621e;
        this.f1475e = c2892e;
        this.f1477e = interfaceC12864e;
        this.f1474e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1478e;
        C13770e c13770e = (C13770e) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                this.f1476e.yandex(AbstractC5190e.advert(this.f1474e | 1), this.f1475e, c13770e, this.f1477e);
                return Unit.INSTANCE;
            default:
                this.f1476e.billing(AbstractC5190e.advert(this.f1474e | 1), this.f1475e, c13770e, this.f1477e);
                return Unit.INSTANCE;
        }
    }
}
