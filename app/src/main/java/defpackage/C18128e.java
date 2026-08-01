package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۥٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18128e extends AbstractC16634e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final List f35536e;

    public C18128e(List list) {
        this.f35536e = list;
    }

    public C18128e(AudioTrack audioTrack) {
        this(Collections.singletonList(audioTrack));
    }

    public final void inmobi(C13770e c13770e, int i) {
        c13770e.m3671package(-28814386);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        int i3 = 1;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            float f = AbstractC11992e.ad;
            C15492e c15492e = AbstractC11785e.ad;
            C8872e ad = AbstractC11992e.ad(0L, ((C7019e) c13770e.adcel(c15492e)).ad.ad, ((C7019e) c13770e.adcel(c15492e)).ad.ad, 0L, c13770e, 505);
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C14515e(2, this);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC5400e.appmetrica, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, AbstractC5400e.purchase, null, ad, 0.0f, 0.0f, c13770e, 24582, 428);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11213e(this, i, i3);
        }
    }

    public final void isPro(C1925e c1925e, C13770e c13770e, int i) {
        c13770e.m3671package(1410426926);
        int i2 = (c13770e.purchase(c1925e) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC3314e vip = AbstractC3265e.vip(c1925e.purchase, c13770e, 0);
            AbstractC13348e.ad(null, AbstractC16653e.license(162200042, new C14284e(c1925e, AbstractC3265e.vip(c1925e.yandex, c13770e, 0), 1), c13770e), null, null, null, 0, 0L, 0L, AbstractC15842e.billing(0.0f, 0.0f, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).ad(c13770e), 7), AbstractC16653e.license(1327559423, new C1701e(this, AbstractC3265e.vip(c1925e.startapp, c13770e, 0), c1925e, AbstractC3265e.vip(c1925e.billing, c13770e, 0), vip), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6949e(this, c1925e, i, 4);
        }
    }

    @Override // defpackage.AbstractC16634e
    public final Object isVip(C5435e c5435e) {
        return new C1925e(c5435e, true, new C8035e(1, this), new Cvolatile(0, this, C18128e.class, "dismiss", "dismiss()V", 0, 0, 19));
    }

    @Override // defpackage.AbstractC16634e
    public final /* bridge */ /* synthetic */ void tapsense(Object obj, C13770e c13770e) {
        isPro((C1925e) obj, c13770e, 0);
    }
}
