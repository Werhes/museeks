package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٞٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1985e implements InterfaceC14230e {
    public final InterfaceC2786e ad;
    public final C5363e appmetrica;
    public InterfaceC7865e billing;
    public final C5363e license;
    public final float metrica;
    public boolean purchase;
    public final float vip;
    public C8823e yandex;

    public C1985e(InterfaceC2786e interfaceC2786e) {
        this.ad = interfaceC2786e;
        this.vip = interfaceC2786e.license();
        this.metrica = interfaceC2786e.ad();
        final int i = 0;
        this.license = new C5363e(new Function0(this) { // from class: eَؔؕ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C1985e f6329e;

            {
                this.f6329e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        C1985e c1985e = this.f6329e;
                        return new C11608e(1.0f, c1985e.vip, c1985e.metrica);
                    default:
                        return new AbstractC9790e((C11608e) this.f6329e.license.getValue());
                }
            }
        });
        final int i2 = 1;
        this.appmetrica = new C5363e(new Function0(this) { // from class: eَؔؕ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C1985e f6329e;

            {
                this.f6329e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        C1985e c1985e = this.f6329e;
                        return new C11608e(1.0f, c1985e.vip, c1985e.metrica);
                    default:
                        return new AbstractC9790e((C11608e) this.f6329e.license.getValue());
                }
            }
        });
    }

    public final ListenableFuture ad(C11608e c11608e, boolean z, boolean z2) {
        C8823e c8823e = new C8823e();
        C8823e c8823e2 = this.yandex;
        if (c8823e2 != null) {
            if (z) {
                AbstractC17861e.isPro("Cancelled due to another zoom value being set.", c8823e2);
            } else {
                AbstractC16398e.metrica(c8823e, c8823e2);
            }
        }
        this.yandex = c8823e;
        boolean purchase = AbstractC13062e.purchase();
        C5363e c5363e = this.appmetrica;
        if (purchase) {
            ((C1326e) c5363e.getValue()).startapp(c11608e);
        } else {
            ((C1326e) c5363e.getValue()).adcel(c11608e);
        }
        InterfaceC7865e interfaceC7865e = this.billing;
        if (interfaceC7865e != null) {
            float ad = c11608e.ad();
            InterfaceC2786e interfaceC2786e = this.ad;
            AbstractC16398e.metrica(z2 ? interfaceC2786e.smaato(ad, interfaceC7865e) : interfaceC2786e.advert(interfaceC7865e), c8823e);
        } else {
            AbstractC17861e.isPro("Camera is not active.", c8823e);
        }
        return AbstractC15792e.smaato(AbstractC5750e.purchase(new C0211e(18, c8823e)));
    }

    @Override // defpackage.InterfaceC14230e
    public final void reset() {
        ad((C11608e) this.license.getValue(), true, true);
    }

    @Override // defpackage.InterfaceC14230e
    public final void vip(InterfaceC7865e interfaceC7865e) {
        this.billing = interfaceC7865e;
        C11608e c11608e = (C11608e) ((C1326e) this.appmetrica.getValue()).license();
        if (c11608e == null) {
            c11608e = (C11608e) this.license.getValue();
        }
        ad(c11608e, false, this.purchase || c11608e.ad() != 1.0f);
        this.purchase = true;
    }
}
