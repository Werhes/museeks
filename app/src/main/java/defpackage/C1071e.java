package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1071e extends AbstractC10347e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C0576e f3604e;

    public C1071e() {
        super(0);
        C15959e c15959e = C15959e.ad;
        this.f3604e = AbstractC14533e.startapp(C15959e.vip());
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(-1726512290);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                C11212e c11212e = new C11212e(0, this, C1071e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 20);
                c13770e.m3682throws(c11212e);
                m3681throw = c11212e;
            }
            Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw);
            boolean yandex2 = c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C17955e(28, this);
                c13770e.m3682throws(m3681throw2);
            }
            c13770e2 = c13770e;
            AbstractC11575e.ad(AbstractC1513e.ad, function0, null, (Function1) m3681throw2, c13770e2, 6, 4);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C17585e(this, i);
        }
    }
}
