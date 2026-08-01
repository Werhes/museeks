package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۡٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10593e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1902e f20904e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20905e;

    public /* synthetic */ C10593e(C1902e c1902e, int i) {
        this.f20905e = i;
        this.f20904e = c1902e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20905e) {
            case 0:
                C1902e c1902e = this.f20904e;
                AbstractC5336e.purchase(c1902e.m3623e(), null, 0, new C18238e(c1902e, null, 1), 3);
                return Boolean.TRUE;
            case 1:
                C15492e c15492e = AbstractC11473e.signatures;
                C1902e c1902e2 = this.f20904e;
                c1902e2.f5065e = (InterfaceC3075e) AbstractC10432e.vip(c1902e2, c15492e);
                c1902e2.f5077e.license = c1902e2.m717e();
                InterfaceC5083e interfaceC5083e = null;
                if (c1902e2.m717e() && c1902e2.f5078e == null) {
                    c1902e2.f5078e = AbstractC5336e.purchase(c1902e2.m3623e(), null, 0, new C18238e(c1902e2, interfaceC5083e, 4), 3);
                } else if (!c1902e2.m717e()) {
                    C8419e c8419e = c1902e2.f5078e;
                    if (c8419e != null) {
                        c8419e.Signature(null);
                    }
                    c1902e2.f5078e = null;
                }
                return Unit.INSTANCE;
            case 2:
                AbstractC5851e.billing(this.f20904e);
                return Unit.INSTANCE;
            case 3:
                AbstractC5851e.billing(this.f20904e);
                return Unit.INSTANCE;
            case 4:
                AbstractC5679e.license(this.f20904e);
                return null;
            case 5:
                AbstractC5679e.license(this.f20904e);
                return AbstractC10262e.ad;
            case 6:
                C1902e c1902e3 = this.f20904e;
                AbstractC5336e.purchase(c1902e3.m3623e(), null, 0, new C18238e(c1902e3, null, 2), 3);
                return Boolean.TRUE;
            case 7:
                return this.f20904e.f5067e.ad.vip().f33322e.toString();
            case 8:
                C1902e c1902e4 = this.f20904e;
                if (c1902e4.m717e()) {
                    ((C3112e) c1902e4.m712e()).vip();
                } else {
                    C15108e c15108e = c1902e4.f5076e;
                    if (c15108e.f27016e) {
                        c15108e.f29889e.m3237e(7);
                    }
                }
                return Boolean.TRUE;
            case 9:
                C1902e c1902e5 = this.f20904e;
                if (!c1902e5.m717e()) {
                    C15108e c15108e2 = c1902e5.f5076e;
                    if (c15108e2.f27016e) {
                        c15108e2.f29889e.m3237e(7);
                    }
                }
                c1902e5.f5077e.inmobi(EnumC5022e.f10704e);
                return Boolean.TRUE;
            case 10:
                C1902e c1902e6 = this.f20904e;
                AbstractC5336e.purchase(c1902e6.m3623e(), null, 0, new C18238e(c1902e6, null, 0), 3);
                return Boolean.TRUE;
            case 11:
                C1902e c1902e7 = this.f20904e;
                if (c1902e7.f5083e != null) {
                    ((C3112e) c1902e7.m712e()).vip();
                } else {
                    c1902e7.m715e(true);
                }
                return Unit.INSTANCE;
            default:
                this.f20904e.f5077e.inmobi(EnumC5022e.f10704e);
                return Unit.INSTANCE;
        }
    }
}
