package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ۠ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10570e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f20862e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f20863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10570e(int i, Object obj) {
        super(1);
        this.f20863e = i;
        this.f20862e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10570e(C4017e c4017e, C0763e c0763e, C7589e c7589e) {
        super(1);
        this.f20863e = 3;
        this.f20862e = c4017e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20863e) {
            case 0:
                AbstractC14594e.billing((InterfaceC15671e) obj, (String) this.f20862e);
                return Unit.INSTANCE;
            case 1:
                ((List) obj).add((Float) ((C13607e) this.f20862e).invoke());
                return true;
            case 2:
                C10122e c10122e = (C10122e) obj;
                C7151e c7151e = (C7151e) this.f20862e;
                c10122e.amazon(c10122e.vip() * c7151e.f14635e);
                c10122e.loadAd(c7151e.f14633e);
                c10122e.appmetrica(c7151e.f14632e);
                c10122e.license(c7151e.f14634e);
                c10122e.Signature(c7151e.f14631e);
                return Unit.INSTANCE;
            case 3:
                ((C4017e) this.f20862e).ad();
                return Unit.INSTANCE;
            case 4:
                C10122e c10122e2 = (C10122e) obj;
                C14095e c14095e = (C14095e) this.f20862e;
                c10122e2.advert(c14095e.f27867e);
                c10122e2.smaato(c14095e.f27868e);
                c10122e2.metrica(c14095e.f27866e);
                c10122e2.pro(0.0f);
                c10122e2.signatures(0.0f);
                c10122e2.amazon(c14095e.f27865e);
                c10122e2.billing(0.0f);
                c10122e2.startapp(0.0f);
                c10122e2.adcel(c14095e.f27874e);
                float f = c14095e.f27877e;
                if (c10122e2.f19992e != f) {
                    c10122e2.f20009e |= 2048;
                    c10122e2.f19992e = f;
                }
                c10122e2.admob(c14095e.f27864e);
                c10122e2.loadAd(c14095e.f27872e);
                c10122e2.appmetrica(c14095e.f27875e);
                c10122e2.license(c14095e.f27876e);
                c10122e2.Signature(c14095e.f27871e);
                c10122e2.purchase(c14095e.f27869e);
                int i = c14095e.f27870e;
                if (c10122e2.f19996e != i) {
                    c10122e2.f20009e |= 524288;
                    c10122e2.f19996e = i;
                }
                return Unit.INSTANCE;
            default:
                Throwable th = (Throwable) obj;
                C14718e c14718e = (C14718e) this.f20862e;
                C13578e c13578e = c14718e.f29125e;
                if (c13578e != null) {
                    c13578e.ad(th);
                }
                c14718e.f29125e = null;
                return Unit.INSTANCE;
        }
    }
}
