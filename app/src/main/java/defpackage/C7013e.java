package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7013e extends AbstractC14780e {
    public final C9710e ad;

    public C7013e(C9710e c9710e) {
        this.ad = c9710e;
    }

    @Override // defpackage.AbstractC14780e
    public final C9710e ad() {
        return this.ad;
    }

    @Override // defpackage.AbstractC14780e
    public final Object license(InterfaceC5374e interfaceC5374e) {
        C9956e c9956e = (C9956e) interfaceC5374e;
        int i = AbstractC7890e.billing(c9956e.ad, Boolean.TRUE) ? -1 : 1;
        Integer num = c9956e.vip;
        Integer valueOf = num != null ? Integer.valueOf(num.intValue() * i) : null;
        Integer num2 = c9956e.metrica;
        Integer valueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i) : null;
        Integer num3 = c9956e.license;
        Integer valueOf3 = num3 != null ? Integer.valueOf(num3.intValue() * i) : null;
        C5363e c5363e = AbstractC15810e.ad;
        try {
            if (valueOf != null) {
                return new C8885e(ZoneOffset.ofHoursMinutesSeconds(valueOf.intValue(), valueOf2 != null ? valueOf2.intValue() : 0, valueOf3 != null ? valueOf3.intValue() : 0));
            }
            if (valueOf2 != null) {
                return new C8885e(ZoneOffset.ofHoursMinutesSeconds(valueOf2.intValue() / 60, valueOf2.intValue() % 60, valueOf3 != null ? valueOf3.intValue() : 0));
            }
            return new C8885e(ZoneOffset.ofTotalSeconds(valueOf3 != null ? valueOf3.intValue() : 0));
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.AbstractC14780e
    public final InterfaceC5374e vip() {
        return AbstractC13223e.license;
    }
}
