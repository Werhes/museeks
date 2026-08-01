package defpackage;

import j$.time.DateTimeException;
import j$.time.YearMonth;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۦۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15854e extends AbstractC14780e {
    public final C9710e ad;

    public C15854e(C9710e c9710e) {
        this.ad = c9710e;
    }

    @Override // defpackage.AbstractC14780e
    public final C9710e ad() {
        return this.ad;
    }

    @Override // defpackage.AbstractC14780e
    public final Object license(InterfaceC5374e interfaceC5374e) {
        C11054e c11054e = (C11054e) interfaceC5374e;
        Integer num = c11054e.ad;
        AbstractC10763e.ad(num, "year");
        int intValue = num.intValue();
        Integer num2 = c11054e.vip;
        AbstractC10763e.ad(num2, "monthNumber");
        try {
            return new C11060e(YearMonth.of(intValue, num2.intValue()));
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.AbstractC14780e
    public final InterfaceC5374e vip() {
        return AbstractC10763e.ad;
    }
}
