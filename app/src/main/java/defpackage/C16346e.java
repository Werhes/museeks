package defpackage;

import androidx.car.app.model.Alert;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16346e extends AbstractC13616e implements InterfaceC17303e, InterfaceC17453e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C9137e f32117e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f32118e;

    @Override // defpackage.InterfaceC17303e
    public final int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        if (this.f32118e) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return interfaceC16719e.loadAd(i);
    }

    @Override // defpackage.InterfaceC17453e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
        AbstractC14594e.Signature(interfaceC15671e);
        final int i = 0;
        final int i2 = 1;
        C9585e c9585e = new C9585e(new Function0(this) { // from class: eٍّۜ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C16346e f18777e;

            {
                this.f18777e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int purchase;
                switch (i) {
                    case 0:
                        purchase = this.f18777e.f32117e.ad.purchase();
                        break;
                    default:
                        purchase = this.f18777e.f32117e.appmetrica.purchase();
                        break;
                }
                return Float.valueOf(purchase);
            }
        }, new Function0(this) { // from class: eٍّۜ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C16346e f18777e;

            {
                this.f18777e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int purchase;
                switch (i2) {
                    case 0:
                        purchase = this.f18777e.f32117e.ad.purchase();
                        break;
                    default:
                        purchase = this.f18777e.f32117e.appmetrica.purchase();
                        break;
                }
                return Float.valueOf(purchase);
            }
        });
        if (this.f32118e) {
            C16591e c16591e = AbstractC9058e.isVip;
            InterfaceC8614e interfaceC8614e = AbstractC14594e.ad[13];
            interfaceC15671e.appmetrica(c16591e, c9585e);
        } else {
            C16591e c16591e2 = AbstractC9058e.tapsense;
            InterfaceC8614e interfaceC8614e2 = AbstractC14594e.ad[12];
            interfaceC15671e.appmetrica(c16591e2, c9585e);
        }
    }

    @Override // defpackage.InterfaceC17303e
    public final int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        if (!this.f32118e) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return interfaceC16719e.mo2529while(i);
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: break */
    public final /* synthetic */ boolean mo358break() {
        return false;
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: eؒۖۗ */
    public final /* synthetic */ boolean mo359e() {
        return false;
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        AbstractC11203e.vip(j, this.f32118e ? EnumC17426e.f34146e : EnumC17426e.f34145e);
        boolean z = this.f32118e;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        int billing = z ? Integer.MAX_VALUE : C5602e.billing(j);
        if (this.f32118e) {
            i = C5602e.yandex(j);
        }
        AbstractC2832e admob = interfaceC16719e.admob(C5602e.ad(0, i, 0, billing, 5, j));
        int i2 = admob.f6806e;
        int yandex = C5602e.yandex(j);
        if (i2 > yandex) {
            i2 = yandex;
        }
        int i3 = admob.f6804e;
        int billing2 = C5602e.billing(j);
        if (i3 > billing2) {
            i3 = billing2;
        }
        int i4 = admob.f6804e - i3;
        int i5 = admob.f6806e - i2;
        if (!this.f32118e) {
            i4 = i5;
        }
        this.f32117e.purchase(i4);
        this.f32117e.vip.startapp(this.f32118e ? i3 : i2);
        this.f32117e.metrica.startapp(this.f32118e ? admob.f6804e : admob.f6806e);
        return interfaceC13158e.ads(i2, i3, C9139e.f18290e, new C16202e(this, i4, admob, 5));
    }

    @Override // defpackage.InterfaceC17303e
    public final int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        if (!this.f32118e) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return interfaceC16719e.metrica(i);
    }

    @Override // defpackage.InterfaceC17453e
    public final /* synthetic */ boolean smaato() {
        return true;
    }

    @Override // defpackage.InterfaceC17303e
    public final int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        if (this.f32118e) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return interfaceC16719e.smaato(i);
    }
}
