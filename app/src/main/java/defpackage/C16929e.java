package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16929e extends AbstractC10347e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C5363e f33157e;

    public C16929e() {
        super(0);
        this.f33157e = new C5363e(new C10479e(12, this));
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(-1071663333);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        int i3 = 1;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C5958e ad = AbstractC9083e.ad(c13770e);
            InterfaceC8018e interfaceC8018e = (InterfaceC8018e) this.f33157e.getValue();
            C8312e c8312e = C8312e.f16989e;
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new C15985e(3, i3, (InterfaceC5083e) null);
                c13770e.m3682throws(m3681throw);
            }
            Function3 function3 = (Function3) m3681throw;
            C1158e c1158e = C1158e.f3743e;
            C0764e purchase = AbstractC16982e.purchase(interfaceC8018e, c8312e, function3, C1158e.ad(), c13770e, 0);
            InterfaceC16132e interfaceC16132e = purchase.f3119e;
            InterfaceC16132e interfaceC16132e2 = purchase.f3119e;
            boolean license = c13770e.license(((C5267e) interfaceC16132e.getValue()).f11349e);
            Object m3681throw2 = c13770e.m3681throw();
            if (license || m3681throw2 == c5170e) {
                m3681throw2 = new C2616e(((C5267e) interfaceC16132e2.getValue()).f11349e);
                c13770e.m3682throws(m3681throw2);
            }
            C2616e c2616e = (C2616e) m3681throw2;
            boolean license2 = c13770e.license(((C5267e) interfaceC16132e2.getValue()).f11348e);
            Object m3681throw3 = c13770e.m3681throw();
            if (license2 || m3681throw3 == c5170e) {
                m3681throw3 = new C2616e(((C5267e) interfaceC16132e2.getValue()).f11348e);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC13348e.ad(null, AbstractC16653e.license(1354742999, new C1743e(ad, this, 17), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(-1061722900, new C0026e(ad, purchase, this, purchase, c2616e, (C2616e) m3681throw3), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3627e(this, i);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m4228strictfp(Function1 function1, Function0 function0, int i, C14056e c14056e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i2) {
        int i3;
        InterfaceC12864e interfaceC12864e2;
        c13770e.m3671package(-511832515);
        if ((i2 & 6) == 0) {
            i3 = (c13770e.yandex(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c13770e.yandex(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c13770e.license(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c13770e.yandex(c14056e) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            interfaceC12864e2 = interfaceC12864e;
            i3 |= c13770e.purchase(interfaceC12864e2) ? 16384 : 8192;
        } else {
            interfaceC12864e2 = interfaceC12864e;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 9363) != 9362)) {
            AbstractC0865e.ad(interfaceC12864e2, null, null, null, null, AbstractC16653e.license(-1663702517, new C2329e(c14056e, function1, i, function0), c13770e), c13770e, ((i3 >> 12) & 14) | 196608, 30);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11150e(this, function1, function0, i, c14056e, interfaceC12864e, i2);
        }
    }
}
