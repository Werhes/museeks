package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٜۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12929e extends AbstractC3004e {
    public final C13993e ad;
    public final Integer metrica;
    public final C15768e vip;

    public C12929e(C13993e c13993e, C15768e c15768e, Integer num) {
        this.ad = c13993e;
        this.vip = c15768e;
        this.metrica = num;
    }

    public static C12929e smaato(C13993e c13993e, Integer num) {
        C15768e vip;
        C6140e c6140e = c13993e.ad;
        if (c6140e == C6140e.f12911e) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            vip = AbstractC16176e.ad;
        } else {
            if (c6140e != C6140e.f12910e) {
                throw new GeneralSecurityException("Unknown Variant: " + c6140e);
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            vip = AbstractC16176e.vip(num.intValue());
        }
        return new C12929e(c13993e, vip, num);
    }

    @Override // defpackage.AbstractC3004e
    public final C15768e advert() {
        return this.vip;
    }

    @Override // defpackage.AbstractC14783e
    public final AbstractC12699e metrica() {
        return this.ad;
    }

    @Override // defpackage.AbstractC14783e
    public final Integer vip() {
        return this.metrica;
    }
}
