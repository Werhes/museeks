package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17719e {
    public final C12431e ad = new C12431e(0, new C4298e[16]);
    public final C0576e vip = AbstractC14533e.startapp(Boolean.FALSE);
    public long metrica = Long.MIN_VALUE;
    public final C0576e license = AbstractC14533e.startapp(Boolean.TRUE);

    public final void ad(C13770e c13770e, int i) {
        c13770e.m3671package(-318043801);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Object m3681throw = c13770e.m3681throw();
            InterfaceC5083e interfaceC5083e = null;
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = AbstractC14533e.startapp(null);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
            if (((Boolean) this.license.getValue()).booleanValue() || ((Boolean) this.vip.getValue()).booleanValue()) {
                c13770e.m3676strictfp(-144841960);
                boolean yandex = c13770e.yandex(this);
                Object m3681throw2 = c13770e.m3681throw();
                if (yandex || m3681throw2 == c5170e) {
                    m3681throw2 = new C1247e(interfaceC3314e, this, interfaceC5083e, 21);
                    c13770e.m3682throws(m3681throw2);
                }
                AbstractC17680e.license(c13770e, this, (Function2) m3681throw2);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-143455237);
                c13770e.Signature(false);
            }
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11213e(this, i, 28);
        }
    }
}
