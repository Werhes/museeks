package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0496e implements InterfaceC4024e {
    public final AbstractC17230e ad = AbstractC0898e.ad;
    public final Integer vip = 4;
    public final Integer metrica = null;
    public final Integer license = 4;
    public final int appmetrica = 2;

    /* JADX WARN: Type inference failed for: r0v0, types: [eّٓۥ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [eّٓۥ, java.lang.Object] */
    @Override // defpackage.InterfaceC4024e
    public final C12469e ad() {
        this.ad.ad();
        Integer num = this.vip;
        int intValue = num != null ? num.intValue() : 0;
        ?? obj = new Object();
        if (intValue < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("The minimum number of digits (", intValue, ") is negative").toString());
        }
        if (intValue <= 9) {
            return this.metrica != null ? new Object() : obj;
        }
        throw new IllegalArgumentException(AbstractC1634e.smaato("The minimum number of digits (", intValue, ") exceeds the length of an Int").toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0496e) {
            return this.appmetrica == ((C0496e) obj).appmetrica;
        }
        return false;
    }

    public final int hashCode() {
        return (AbstractC8703e.m2467class(this.appmetrica) * 31) + 1237;
    }

    @Override // defpackage.InterfaceC4024e
    public final AbstractC17230e metrica() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC4024e
    public final C6195e vip() {
        AbstractC17230e abstractC17230e = this.ad;
        C17681e ad = abstractC17230e.ad();
        String metrica = abstractC17230e.metrica();
        Integer num = this.vip;
        Integer num2 = this.metrica;
        ArrayList mopub = AbstractC6874e.mopub(AbstractC11575e.license(num, null, num2, ad, metrica, true));
        Integer num3 = this.license;
        C13664e c13664e = C13664e.f27089e;
        if (num3 != null) {
            mopub.add(AbstractC11575e.license(num, num3, num2, ad, metrica, false));
            mopub.add(new C6195e(AbstractC6874e.startapp(new C6162e("+"), new C13259e(Collections.singletonList(new C17889e(Integer.valueOf(num3.intValue() + 1), null, ad, metrica, false)))), c13664e));
        } else {
            mopub.add(AbstractC11575e.license(num, null, num2, ad, metrica, false));
        }
        return new C6195e(c13664e, mopub);
    }
}
